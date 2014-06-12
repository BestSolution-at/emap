/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.internal;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import at.bestsolution.persistence.Callback;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.PersistParticipant;
import at.bestsolution.persistence.PersistanceException;
import at.bestsolution.persistence.Registration;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;
import at.bestsolution.persistence.java.AfterTxRunnable;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JDBCConnectionProvider;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.JavaSession;
import at.bestsolution.persistence.java.JavaSession.ChangeDescription;
import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import at.bestsolution.persistence.java.ObjectMapperFactory.NamedQuery;
import at.bestsolution.persistence.java.ProxyFactory;
import at.bestsolution.persistence.java.RelationSQL;
import at.bestsolution.persistence.java.SessionCache;
import at.bestsolution.persistence.java.SessionCacheFactory;
import at.bestsolution.persistence.model.LazyEObject;

import com.google.common.base.Objects;

public class JavaSessionFactory implements SessionFactory {
	JDBCConnectionProvider connectionProvider;
	ProxyFactory proxyFactory;
	SessionCacheFactory cacheFactory;
	Map<String, ObjectMapperFactory<?,?>> factories = new HashMap<String, ObjectMapperFactory<?,?>>();
	Map<String,DatabaseSupport> databaseSupports = new HashMap<String,DatabaseSupport>();
	private static final Logger LOGGER = Logger.getLogger(JavaSessionFactory.class);
	EventAdmin eventAdmin;
	String factoryId;

	public void registerConfiguration(JDBCConnectionProvider connectionProvider) {
		this.connectionProvider = connectionProvider;
	}

	public void unregisterConfiguration(JDBCConnectionProvider connectionProvider) {
		this.connectionProvider = null;
	}

	public void registerMapperFactoriesProvider(ObjectMapperFactoriesProvider provider) {
		for( Entry<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?, ?>> e : provider.getMapperFactories().entrySet() ) {
			factories.put(e.getKey().getName(), e.getValue());
		}
	}

	public void unregisterMapperFactoriesProvider(ObjectMapperFactoriesProvider provider) {
		factories.keySet().removeAll(provider.getMapperFactories().keySet());
	}

	public void registerProxyFactory(ProxyFactory proxyFactory) {
		this.proxyFactory = proxyFactory;
	}

	public void unregisterProxyFactory(ProxyFactory proxyFactory) {
		this.proxyFactory = null;
	}

	public void registerSessionCacheFactory(SessionCacheFactory cacheFactory) {
		this.cacheFactory = cacheFactory;
	}

	public void unregisterSessionCacheFactory(SessionCacheFactory cacheFactory) {
		this.cacheFactory = null;
	}

	public void registerDatabaseSupport(DatabaseSupport databaseSupport) {
		databaseSupports.put(databaseSupport.getDatabaseType(), databaseSupport);
	}

	public void unregisterDatabaseSupport(DatabaseSupport databaseSupport) {
		databaseSupports.remove(databaseSupport.getDatabaseType());
	}

	public void registerEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = eventAdmin;
	}

	public void unregisterEventAdmin(EventAdmin eventAdmin) {
		this.eventAdmin = null;
	}

	@Override
	public Session createSession() {
		return new JavaSessionImpl(cacheFactory.createCache());
	}

	@Override
	public String getFactoryId() {
		if( factoryId == null ) {
			factoryId = UUID.randomUUID().toString();
		}
		return factoryId;
	}

	static final boolean isNewObject(Object idValue) {
		return idValue == null || (idValue instanceof Number && ((Number)idValue).longValue() == 0);
	}

	@Override
	public Blob createBlob() {
		return new LocalBlob();
	}

	class JavaSessionImpl implements JavaSession {
		private String id = UUID.randomUUID().toString();
		private Map<Class<?>, ObjectMapper<?>> mapperInstances = new HashMap<Class<?>, ObjectMapper<?>>();
		private Stack<Connection> transactionConnectionQueue;
		private Stack<Transaction> transactionQueue;
		private SessionCache sessionCache;
		private int changeTrackingCount = 0;
		private Map<Transaction, List<RelationSQL>> relationSQLStorage = new HashMap<Session.Transaction, List<RelationSQL>>();

		private Map<Transaction, Set<AfterTxRunnable>> afterTransaction = new HashMap<Session.Transaction, Set<AfterTxRunnable>>();
		private Map<Transaction, Map<Object, Object>> transactionPrimaryKeyCache = new HashMap<Session.Transaction, Map<Object, Object>>();
		private Map<Transaction, Map<Object,Map<EAttribute,Object>>> transactionData = new HashMap<Session.Transaction, Map<Object,Map<EAttribute,Object>>>();
		private List<PersistParticipant> participants = new ArrayList<PersistParticipant>();
		private Map<Transaction, Set<String>> insertedObjects = new HashMap<Session.Transaction, Set<String>>();
		private Map<Transaction, Set<String>> updatedObjects = new HashMap<Session.Transaction, Set<String>>();
		private Map<Transaction, Set<String>> deletedObjects = new HashMap<Session.Transaction, Set<String>>();
		private Map<Transaction, Set<String>> deletedManyObjects = new HashMap<Session.Transaction, Set<String>>();

		private Adapter objectAdapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				handleNotify(msg);
			}
		};

		private Map<EObject, List<FeatureChange>> changeStorage = new HashMap<EObject, List<FeatureChange>>();

		public JavaSessionImpl(SessionCache sessionCache) {
			this.sessionCache = sessionCache;
		}

		@Override
		public String getId() {
			return id;
		}

		@Override
		public DatabaseSupport getDatabaseSupport() {
			return databaseSupports.get(getDatabaseType());
		}

		@Override
		public Registration registerPersistParticipant(
				final PersistParticipant participant) {
			participants.add(participant);
			return new Registration() {

				@Override
				public void dispose() {
					participants.remove(participant);
				}
			};
		}

		@Override
		@SuppressWarnings("unchecked")
		public <M extends ObjectMapper<?>> M createMapper(Class<M> mapper) {
			M m = (M) mapperInstances.get(mapper);
			if( m == null ) {
				ObjectMapperFactory<?, ?> factory = factories.get(mapper.getName());
				if (factory == null) {
					throw new RuntimeException("no factory for " + mapper + " found! Double check your bundle.emap");
				}
				m = (M) factory.createMapper(this);
				mapperInstances.put(mapper, m);
			}
			return m;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O> List<O> queryForList(String fqnMapper, String queryName,
				Object... parameters) {
			ObjectMapperFactory<?, ?> factory = factories.get(fqnMapper);
			if( factory != null ) {
				NamedQuery<O> q = (NamedQuery<O>) factory.createNamedQuery(this, queryName);
				String[] params = q.getParameterNames();
				if( params.length != parameters.length ) {
					throw new IllegalArgumentException("The query does not accept parameters. Use Session#mappedQuery to build a dynamic query!");
				}
				return q.queryForList(parameters);
			}
			throw new IllegalArgumentException("The mapper '"+fqnMapper+"' is not known.");
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O> List<O> queryForList(String fqnMapper, String queryName,
				Map<String, Object> parameterMap) {
			ObjectMapperFactory<?, ?> factory = factories.get(fqnMapper);
			if( factory != null ) {
				NamedQuery<O> q = (NamedQuery<O>) factory.createNamedQuery(this, queryName);
				String[] params = q.getParameterNames();
				if( params.length == 0 && parameterMap.size() > 0 ) {
					throw new IllegalArgumentException("The query does not accept parameters. Use Session#mappedQuery to build a dynamic query!");
				}
				Object[] objs = new Object[params.length];
				for( int i = 0; i < params.length; i++ ) {
					objs[i] = parameterMap.get(params[i]);
				}

				return q.queryForList(objs);
			}
			throw new IllegalArgumentException("The mapper '"+fqnMapper+"' is not known.");
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O> O queryForOne(String fqnMapper, String queryName,
				Object... parameters) {
			NamedQuery<O> q = (NamedQuery<O>) factories.get(fqnMapper).createNamedQuery(this, queryName);
			String[] params = q.getParameterNames();
			if( params.length != parameters.length ) {
				throw new IllegalArgumentException("The query does not accept parameters. Use Session#mappedQuery to build a dynamic query!");
			}
			return q.queryForOne(parameters);
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O> O queryForOne(String fqnMapper, String queryName,
				Map<String, Object> parameterMap) {
			ObjectMapperFactory<?, ?> factory = factories.get(fqnMapper);
			if( factory != null ) {
				NamedQuery<O> q = (NamedQuery<O>) factory.createNamedQuery(this, queryName);
				String[] params = q.getParameterNames();
				if( params.length == 0 && parameterMap.size() > 0 ) {
					throw new IllegalArgumentException("The query does not accept parameters. Use Session#mappedQuery to build a dynamic query!");
				}
				Object[] objs = new Object[params.length];
				for( int i = 0; i < params.length; i++ ) {
					objs[i] = parameterMap.get(params[i]);
				}

				return q.queryForOne(objs);
			}
			throw new IllegalArgumentException("The mapper '"+fqnMapper+"' is not known.");
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O> MappedQuery<O> mappedQuery(String fqnMapper, String queryName) {
			return (MappedQuery<O>) factories.get(fqnMapper).mappedQuery(this, queryName);
		}

		@Override
		public <O> void preExecuteInsert(ObjectMapper<O> mapper, O object) {
			if( ! participants.isEmpty() ) {
				for( PersistParticipant p : participants ) {
					Map<String, Object> participate = p.participate(this, at.bestsolution.persistence.PersistParticipant.Type.INSERT, (EObject) object);
					if( participate != null ) {
						for( Entry<String, Object> e : participate.entrySet() ) {
							EStructuralFeature attribute = ((EObject)object).eClass().getEStructuralFeature(e.getKey());
							setTransactionAttribute(object, (EAttribute)attribute, e.getValue());
						}
					}
				}
			}

			Transaction transaction = getTransaction();
			Set<String> set = insertedObjects.get(transaction);
			if( set == null ) {
				set = new HashSet<String>();
				insertedObjects.put(transaction, set);
			}
			set.add(toString(mapper,object));
		}

		@Override
		public <O> void preExecuteUpdate(ObjectMapper<O> mapper, O object) {
			if( ! participants.isEmpty() ) {
				for( PersistParticipant p : participants ) {
					Map<String, Object> participate = p.participate(this, at.bestsolution.persistence.PersistParticipant.Type.UPDATE, (EObject) object);
					if( participate != null ) {
						for( Entry<String, Object> e : participate.entrySet() ) {
							EStructuralFeature attribute = ((EObject)object).eClass().getEStructuralFeature(e.getKey());
							setTransactionAttribute(object, (EAttribute)attribute, e.getValue());
						}
					}
				}
			}

			Transaction transaction = getTransaction();
			Set<String> set = updatedObjects.get(transaction);
			if( set == null ) {
				set = new HashSet<String>();
				updatedObjects.put(transaction, set);
			}
			set.add(toString(mapper,object));
		}

		@Override
		public <O> void preExecuteDelete(ObjectMapper<O> mapper, O object) {
			Transaction transaction = getTransaction();
			Set<String> set = deletedObjects.get(transaction);
			if( set == null ) {
				set = new HashSet<String>();
				deletedObjects.put(transaction, set);
			}
			set.add(toString(mapper,object));
		}

		@Override
		public <P> void preExecuteDeleteById(EClass eClass, Collection<P> keys) {
			Transaction transaction = getTransaction();
			Set<String> set = deletedObjects.get(transaction);
			if( set == null ) {
				set = new HashSet<String>();
				deletedObjects.put(transaction, set);
			}
			for( P k : keys ) {
				set.add(eClass.getName()+"#"+k);
			}
		}

		@Override
		public void preExecuteDeleteMany(EClass eClass) {
			Transaction transaction = getTransaction();
			Set<String> set = deletedManyObjects.get(transaction);
			if( set == null ) {
				set = new HashSet<String>();
				deletedManyObjects.put(transaction, set);
			}
			set.add(eClass.getName());
		}

		private <O> String toString(ObjectMapper<O> mapper, O object) {
			return ((EObject)object).eClass().getName()+"#"+getPrimaryKey(mapper, object);
		}

		@Override
		public <O, P> void registerPrimaryKey(O object, P key) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("registerPrimaryKey " + object + " => " + key);
			}

			final Transaction transaction = getTransaction();
			if( transaction == null ) {
				throw new PersistanceException("Unable to schedule after tx callback without a transaction");
			}
			Map<Object, Object> map = transactionPrimaryKeyCache.get(transaction);
			if (map == null) {
				map = new HashMap<Object, Object>();
				transactionPrimaryKeyCache.put(transaction, map);
			}
			map.put(object, key);
		}

		@SuppressWarnings("unchecked")
		private <O,P> P getPrimaryKeyFromTransactionCache(O object) {
			Transaction transaction = getTransaction();
			if (transaction == null) {
				return null;
			}
			final Map<Object, Object> map = transactionPrimaryKeyCache.get(transaction);
			if (map != null) {
				return (P) map.get(object);
			}
			return null;
		}

		@Override
		public <O,P> P getPrimaryKey(ObjectMapper<O> mapper, O object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("getPrimaryKey " + object);
			}

			P key = getPrimaryKeyFromTransactionCache(object);

			if (key != null) {
				if( isDebug ) {
					LOGGER.debug(" found key in tx cache => " + key);
				}
				return key;
			}

			key = mapper.getPrimaryKeyValue(object);
			if( isDebug ) {
				LOGGER.debug(" got key from object => " + key);
			}
			return key;
		}

		@SuppressWarnings("unchecked")
		@Override
		public <O, P> P getTransactionAttribute(O object, EAttribute attribute) {
			final Transaction transaction = getTransaction();
			if( transaction == null ) {
				return (P) ((EObject)object).eGet(attribute);
			}

			Map<Object, Map<EAttribute, Object>> map = transactionData.get(transaction);
			if( map == null ) {
				return (P) ((EObject)object).eGet(attribute);
			}

			Map<EAttribute, Object> data = map.get(object);
			if( data == null || ! data.containsKey(attribute) ) {
				return (P) ((EObject)object).eGet(attribute);
			}

			return (P) data.get(attribute);
		}

		private <O, P> void setTransactionAttribute(O object,
				EAttribute attribute, P value) {
			final Transaction transaction = getTransaction();
			if( transaction == null ) {
				throw new PersistanceException("Unable store the information without a transaction");
			}

			Map<Object, Map<EAttribute, Object>> map = transactionData.get(transaction);
			if( map == null ) {
				map = new HashMap<Object, Map<EAttribute,Object>>();
				transactionData.put(transaction, map);
			}

			Map<EAttribute, Object> data = map.get(object);
			if( data == null ) {
				data = new HashMap<EAttribute, Object>();
				map.put(object, data);
			}

			data.put(attribute, value);
		}

		@Override
		public boolean isTransaction() {
			return transactionConnectionQueue != null;
		}

		@Override
		public void runInTransaction(Transaction transaction) {
			String transactionId = UUID.randomUUID().toString();
			boolean isDebug = LOGGER.isDebugEnabled();

			if( isDebug ) {
				LOGGER.debug("Started transaction '"+transactionId+"'");
			}

			Connection connection = connectionProvider.checkoutConnection();
			try {
				connection.setAutoCommit(false);
			} catch (SQLException e2) {
				LOGGER.error("Failed to turn off auto commit", e2);
				throw new PersistanceException(e2);
			}

			if( eventAdmin != null ) {
				Map<String, Object> properties = new HashMap<String, Object>();
				properties.put(DATA_SESSION_ID, getId());
				eventAdmin.sendEvent(new Event(TOPIC_TRANSACTION_START, properties));
			}

			if( transactionConnectionQueue == null ) {
				transactionConnectionQueue = new Stack<Connection>();
			}
			if( transactionQueue == null ) {
				transactionQueue = new Stack<Session.Transaction>();
			}

			transactionQueue.add(transaction);
			transactionConnectionQueue.add(connection);
			try {
				if( isDebug ) {
					LOGGER.debug("Executing transaction");
				}
				if( transaction.execute() ) {
					if( isDebug ) {
						LOGGER.debug("Successfully executed the transaction");
					}
					try {
						List<RelationSQL> list = relationSQLStorage.get(transaction);
						if( list != null ) {
							if( isDebug ) {
								LOGGER.debug("Executing relation sqls: " + list.size());
							}
							RelationSQL[] tmpList = list.toArray(new RelationSQL[0]);
							for( RelationSQL s : tmpList ) {
								s.execute();
							}
							if( isDebug ) {
								LOGGER.debug("Finished relational sqls");
							}
						}
						connection.commit();

						flushTransactionData(transaction);

						// exectue after-tx callbacks
						if( isDebug ) {
							LOGGER.debug("Executing After-Tx callbacks");
						}
						int counter = 0;
						final Set<AfterTxRunnable> set = afterTransaction.get(transaction);
						if (set != null) {
							for (AfterTxRunnable r : set) {
								r.runAfterTx(this);
								counter++;
							}
						}
						if( isDebug ) {
							LOGGER.debug("Done executing " + counter + " After-Tx callbacks");
						}


						if( eventAdmin != null ) {
							Map<String, Object> properties = new HashMap<String, Object>();
							properties.put(DATA_SESSION_ID, getId());
							properties.put(DATA_STATUS, VALUE_COMMIT);

							properties.put(DATA_INSERTED_OBJECTS, notNull(insertedObjects.get(transaction)));
							properties.put(DATA_UPDATED_OBJECTS, notNull(updatedObjects.get(transaction)));
							properties.put(DATA_DELETED_OBJECTS, notNull(deletedObjects.get(transaction)));
							properties.put(DATA_DELETED_MANY, notNull(deletedManyObjects.get(transaction)));

							eventAdmin.sendEvent(new Event(TOPIC_TRANSACTION_END, properties));
						}
					} catch( SQLException e ) {
						LOGGER.error("Failed to commit transaction",e);
						throw new PersistanceException(e);
					}
				} else {
					try {
						connection.rollback();
						if( eventAdmin != null ) {
							Map<String, Object> properties = new HashMap<String, Object>();
							properties.put(DATA_SESSION_ID, getId());
							properties.put(DATA_STATUS, VALUE_ROLLBACK);
							eventAdmin.sendEvent(new Event(TOPIC_TRANSACTION_END, properties));
						}
					} catch( SQLException e ) {
						LOGGER.error("Failed to rollback transaction",e);
						throw new PersistanceException(e);
					}
				}
			} catch (Throwable e) {
				LOGGER.error("Error while executing transactional code", e);
				try {
					connection.rollback();
					if( eventAdmin != null ) {
						Map<String, Object> properties = new HashMap<String, Object>();
						properties.put(DATA_SESSION_ID, getId());
						properties.put(DATA_STATUS, VALUE_ROLLBACK);
						eventAdmin.sendEvent(new Event(TOPIC_TRANSACTION_END, properties));
					}
				} catch (SQLException e1) {
					LOGGER.error("Failed to rollback transaction. Swallowing and rethrowing original connection.",e1);
				}
				throw e instanceof RuntimeException ? (RuntimeException)e : new RuntimeException(e);
			} finally {
				// clear after-tx
				afterTransaction.remove(transaction);
				// clear relationSQL
				relationSQLStorage.remove(transaction);
				// clear transaction primary key cache
				transactionPrimaryKeyCache.remove(transaction);
				transactionData.remove(transaction);
				insertedObjects.remove(transaction);
				updatedObjects.remove(transaction);
				deletedObjects.remove(transaction);
				deletedManyObjects.remove(transaction);

				try {
					connection.setAutoCommit(true);
				} catch (SQLException e) {
					LOGGER.error("Failed to set back auto commit", e);
					throw new PersistanceException(e);
				}
				connectionProvider.returnConnection(transactionConnectionQueue.pop());
				if( transactionConnectionQueue.isEmpty() ) {
					transactionConnectionQueue = null;
				}

				transactionQueue.pop();
				if( transactionQueue.isEmpty() ) {
					transactionQueue = null;
				}
			}

			if( isDebug ) {
				LOGGER.debug("Finished transaction '"+transactionId+"'");
			}
		}

		private Set<String> notNull(Set<String> set) {
			if( set == null ) {
				return Collections.emptySet();
			} else {
				return Collections.unmodifiableSet(set);
			}
		}

		private void flushTransactionData(Transaction transaction) {
			Map<Object, Map<EAttribute, Object>> map = transactionData.get(transaction);
			if( map == null ) {
				return;
			}

			for( Entry<Object, Map<EAttribute,Object>> e : map.entrySet() ) {
				EObject eo = (EObject) e.getKey();
				for( Entry<EAttribute, Object> e2 : e.getValue().entrySet() ) {
					try {
						eo.eSet(e2.getKey(), e2.getValue());
					} catch(Throwable t) {
						LOGGER.error("Unable to sync transaction value into the model", t);
					}
				}
			}
		}

		@Override
		public Transaction getTransaction() {
			return transactionQueue == null ? null : transactionQueue.peek();
		}

		@Override
		public void scheduleAfterTransaction(AfterTxRunnable r) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("schedule After-Tx callback: " + r);
			}

			final Transaction transaction = getTransaction();
			if( transaction == null ) {
				throw new PersistanceException("Unable to schedule after tx callback without a transaction");
			}

			Set<AfterTxRunnable> set = afterTransaction.get(transaction);
			if (set == null) {
				// we use a linked hash set to avoid duplicates while preserving the order
				set = new LinkedHashSet<AfterTxRunnable>();
				afterTransaction.put(transaction, set);
			}

			if (!set.add(r)) {
				if( isDebug ) {
					LOGGER.debug("! After-Tx callback was not scheduled -> duplicate!");
				}
			}
		}

		@Override
		public void scheduleRelationSQL(RelationSQL sql) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Trying to register: " + sql);
			}

			Transaction transaction = getTransaction();

			if( transaction == null ) {
				throw new PersistanceException("Unable to schedule relation sql without a transaction");
			}

			List<RelationSQL> list = relationSQLStorage.get(transaction);
			if( list == null ) {
				list = new ArrayList<RelationSQL>();
				relationSQLStorage.put(transaction, list);
			}

			// Check that we are not adding duplicate inserts for relations
			for( RelationSQL r : list ) {
				if( r.getAction() == sql.getAction() && r.getTableName().equals(sql.getTableName()) ) {
					if( r.getSelf() == sql.getSelf() &&
						r.getOpposite() == r.getOpposite()	) {
						if( isDebug ) {
							LOGGER.debug("Skiping registration because same is already registered");
						}
						return;
					} else if( r.getSelf() == sql.getOpposite() &&
							r.getOpposite() == sql.getSelf() ) {
						if( isDebug ) {
							LOGGER.debug("Skiping registration because opposite is already registered");
						}
						return;
					}
				}
			}

			if( isDebug ) {
				LOGGER.debug("Register RelationSQL");
			}
			list.add(sql);
		}

		@Override
		public void close() {
			mapperInstances.clear();
			sessionCache.release();
			changeStorage.clear();
			transactionPrimaryKeyCache.clear();
			transactionData.clear();
			if( transactionConnectionQueue != null ) {
				for( Connection c : transactionConnectionQueue ) {
					try {
						c.rollback();
					} catch (SQLException e) {
						LOGGER.error("Unable to rollback connection", e);
					}
					connectionProvider.returnConnection(c);
				}
				transactionConnectionQueue = null;
			}
			participants.clear();
		}

		@Override
		public void clear() {
			sessionCache.clear();
			changeStorage.clear();
		}

		@Override
		public Connection checkoutConnection() {
			if( transactionConnectionQueue != null ) {
				return transactionConnectionQueue.peek();
			}
			return connectionProvider.checkoutConnection();
		}

		@Override
		public void returnConnection(Connection connection) {
			if( transactionConnectionQueue != null ) {
				return;
			}
			connectionProvider.returnConnection(connection);
		}

		@Override
		public String getDatabaseType() {
			return connectionProvider.getDatabaseType();
		}

		@Override
		public SessionCache getCache() {
			return sessionCache;
		}

		@Override
		public ProxyFactory getProxyFactory() {
			return proxyFactory;
		}

		@Override
		public Object convertType(Class<?> targetType, Object value) {
			if( targetType == Boolean.class ) {
				if( value instanceof Number ) {
					return ((Number)value).intValue() != 0;
				}
			} else if( targetType.isEnum() ) {
				if( value != null ) {
					Class<Enum<?>> c = (Class<Enum<?>>) targetType;
					for( Enum<?> e : c.getEnumConstants() ) {
						if( e.name().equals(value.toString())) {
							return e;
						}
					}
				}
			} else if( value instanceof Enum<?> ) {
				return ((Enum<?>)value).name();
			}
			return value;
		}

		@Override
		public Blob handleBlob(String tableName, String blobColumnName,
				String idColumnName, ResultSet set) throws SQLException {
			return new LazyBlob(this, tableName, blobColumnName, idColumnName, set.getObject(idColumnName));
		}

		@Override
		public void delete(Object... entities) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Start deleting of " + entities.length + " entities");
			}

			for( Object e : entities ) {
				if( isDebug ) {
					LOGGER.debug("Deleteing " + e);
				}
//				if( e instanceof EObject ) {
//				EObject eo = (EObject) e;
//				ObjectMapperFactory<?, ?> f = factories.get(eo.eClass().getInstanceClassName()+"Mapper");
//				if( f == null ) {
//					throw new IllegalStateException("There's no mapper known for '"+eo.eClass().getInstanceClassName()+"'");
//				}
//				ObjectMapper<Object> m = (ObjectMapper<Object>) f.createMapper(this);
//				m.delete(e);
//			} else {
//				throw new IllegalStateException("'"+e.getClass().getName()+"' is not an EObject");
//			}
				final ObjectMapper<Object> m = createMapperForObject(e);
				m.delete(e);

			}

			if( isDebug ) {
				LOGGER.debug("Ended deleting entities");
			}
		}

		@SuppressWarnings("unchecked")
		private <O> ObjectMapper<O> createMapperForObject(O object) {
			if( object instanceof EObject ) {
				EObject eo = (EObject) object;
				ObjectMapperFactory<?, ?> f = factories.get(eo.eClass().getInstanceClassName()+"Mapper");
				if( f == null ) {
					throw new IllegalStateException("There's no mapper known for '"+eo.eClass().getInstanceClassName()+"'");
				}
				return (ObjectMapper<O>) f.createMapper(this);

			} else {
				throw new IllegalStateException("'"+object.getClass().getName()+"' is not an EObject");
			}
		}

		@Override
		public void persist(Object... entities) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Start persisting of " + entities.length + " entities");
			}

			List<EObject> savePlan = new ArrayList<EObject>();
			for( Object e : entities ) {
				if( e instanceof EObject ) {
					savePlan.addAll(buildSavePlan((EObject) e));
				} else {
					throw new IllegalStateException("'"+e.getClass().getName()+"' is not an EObject");
				}
			}

			Set<Object> processed = new HashSet<Object>();
			for( EObject e : savePlan ) {
				if( processed.contains(e) ) {
					continue;
				}

				processed.add(e);

				if( isDebug ) {
					LOGGER.debug("Persisting of " + e);
				}

//				final EObject eo = (EObject) e;
//				final ObjectMapperFactory<?, ?> f = factories.get(eo.eClass().getInstanceClassName()+"Mapper");
//				if( f == null ) {
//					throw new IllegalStateException("There's no mapper known for '"+eo.eClass().getInstanceClassName()+"'");
//				}
//				final ObjectMapper<Object> m = (ObjectMapper<Object>) f.createMapper(this);
				final ObjectMapper<EObject> m = createMapperForObject(e);

//				final Object l = m.getPrimaryKeyValue(e);
				// WE NEED TO GET THE KEY FROM THE CACHE!
				final Object txKey = getPrimaryKeyFromTransactionCache(e);
				if (txKey == null) {
					final Object l = getPrimaryKey(m, e);
					if( isNewObject(l) ) {
						LOGGER.debug("New object insert");
						m.insert(e);
					} else {
						LOGGER.debug("Existing object update");
						m.update(e);
					}
				}
				else {
					LOGGER.debug("skipping, was already inserted in this tx");
				}
			}

			if( isDebug ) {
				LOGGER.debug("Finished persisting of entities");
			}
		}

		private List<EObject> buildSavePlan(EObject sourceObject) {
			List<EObject> list = new ArrayList<EObject>();
			list.add(sourceObject);

			//TODO Move the META stuff to the factory so that we don't need to create an instance
			final ObjectMapper<EObject> m = createMapperForObject(sourceObject);

//			final ObjectMapperFactory<?, ?> f = factories.get(sourceObject.eClass().getInstanceClassName()+"Mapper");
//			if( f == null ) {
//				throw new IllegalStateException("There's no mapper known for '"+sourceObject.eClass().getInstanceClassName()+"'");
//			}
//			//TODO Move the META stuff to the factory so that we don't need to create an instance
//			final ObjectMapper<Object> m = (ObjectMapper<Object>) f.createMapper(this);

			for( EStructuralFeature rf : ((JavaObjectMapper<?>)m).getReferenceFeatures() ) {
				EReference r = (EReference) rf;

				if( ! (sourceObject instanceof LazyEObject) || ((LazyEObject)sourceObject).isResolved(r) ) {
					EObject refInstance = (EObject) sourceObject.eGet(rf);
					if( refInstance != null ) {
						ObjectMapperFactory<?, ?> tmpFactory = factories.get(refInstance.eClass().getInstanceClassName()+"Mapper");
						if( tmpFactory == null ) {
							throw new IllegalStateException("There's no mapper known for '"+refInstance.eClass().getInstanceClassName()+"'");
						}
						ObjectMapper<Object> tmpMapper = (ObjectMapper<Object>) tmpFactory.createMapper(this);
						Object tmpValue = tmpMapper.getPrimaryKeyValue(refInstance);

						if( isNewObject(tmpValue) ) {
							if( LOGGER.isDebugEnabled() ) {
								LOGGER.debug("Found reference who not yet has assigned a primary key: "+tmpValue+"");
								LOGGER.debug("Saving reference first.");
							}

							list.addAll(0,buildSavePlan(refInstance));
						}
					}
				}
			}
			return list;
		}

		void handleNotify(Notification notification) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if(changeTrackingCount > 0 ){
				if( isDebug ) {
					LOGGER.debug("Skip change tracking for '"+notification.getFeature()+"' of '"+notification.getNotifier()+"'" );
				}
				return;
			}

			if( isDebug ) {
				if (notification.getEventType() == Notification.REMOVING_ADAPTER) {
					LOGGER.debug("Adapter removed ("+notification.getNotifier()+")");
				}
				else {
					LOGGER.debug("Attribute '"+notification.getFeature()+"' of '"+notification.getNotifier()+"' is modified");
				}
			}

			if( notification.getEventType() == Notification.SET ) {
				if( isDebug ) {
					LOGGER.debug("Single valued attribute is to set from '"+notification.getOldValue()+"' to '"+notification.getNewValue()+"'");
				}
				FeatureChange c = new FeatureChange();
				c.feature = (EStructuralFeature) notification.getFeature();
				c.type = Type.SET;
				c.newValue = notification.getNewValue();
				c.oldValue = notification.getOldValue();
				List<FeatureChange> list = changeStorage.get(notification.getNotifier());
				list.add(c);
			} else if(
					notification.getEventType() == Notification.ADD ||
					notification.getEventType() == Notification.ADD_MANY) {
				if( isDebug ) {
					LOGGER.debug("Addition on multi value attribute");
				}
				List<FeatureChange> list = changeStorage.get(notification.getNotifier());
				if( notification.getNewValue() instanceof List<?> ) {
					for( Object o : (List<Object>)notification.getNewValue() ) {
						FeatureChange c = new FeatureChange();
						c.feature = (EStructuralFeature) notification.getFeature();
						c.type = Type.ADD;
						c.newValue = o;
						list.add(c);

						if( isDebug ) {
							LOGGER.debug("The value '"+c.newValue+"' is added");
						}
					}
				} else {
					FeatureChange c = new FeatureChange();
					c.feature = (EStructuralFeature) notification.getFeature();
					c.type = Type.ADD;
					c.newValue = notification.getNewValue();
					if( isDebug ) {
						LOGGER.debug("The value '"+c.newValue+"' is added");
					}
					list.add(c);
				}
			} else if( notification.getEventType() == Notification.REMOVE ||
					notification.getEventType() == Notification.REMOVE_MANY	) {
				if( isDebug ) {
					LOGGER.debug("Removal on multi value attribute");
				}
				List<FeatureChange> list = changeStorage.get(notification.getNotifier());
				if( notification.getOldValue() instanceof List<?> ) {
					for( Object o : (List<Object>)notification.getOldValue() ) {
						FeatureChange c = new FeatureChange();
						c.feature = (EStructuralFeature) notification.getFeature();
						c.type = Type.REMOVE;
						c.oldValue = o;
						list.add(c);
						if( isDebug ) {
							LOGGER.debug("The value '"+c.oldValue+"' is removed");
						}
					}
				} else {
					FeatureChange c = new FeatureChange();
					c.feature = (EStructuralFeature) notification.getFeature();
					c.type = Type.REMOVE;
					c.oldValue = notification.getOldValue();
					if( isDebug ) {
						LOGGER.debug("The value '"+c.oldValue+"' is removed");
					}
					list.add(c);
				}
			}
		}

		@Override
		public boolean isAttached(Object o) {
			return getCache().isCached((EObject) o);
		}

		@Override
		public void registerObject(Object object, Object id, long version) {
			EObject eo = (EObject) object;
			if( ! changeStorage.containsKey(eo) ) {
				changeStorage.put(eo, new ArrayList<FeatureChange>());
				eo.eAdapters().add(objectAdapter);
				getCache().putObject(eo,id, version);
			}
		}

		@Override
		public void updateVersion(Object object, Object id, long version) {
			if( ! getCache().updateVersion((EObject) object, id, version) ) {
				throw new IllegalStateException("Unable to update version of Object '"+object+"'");
			}
		}

		@Override
		public void unregisterObject(Object object, Object id) {
			EObject eo = (EObject) object;
			if( changeStorage.remove(eo) != null ) {
				eo.eAdapters().remove(objectAdapter);
				getCache().evitObject(eo);
			}
		}

		@Override
		public void unregisterObject(EClass eClass, Object id) {
			EObject object = getCache().getObject(eClass, id);
			if (object != null) {
				// we need to remove it from our changeStorage
				if (changeStorage.remove(object) != null) {
					object.eAdapters().remove(objectAdapter);
				}
			}
			getCache().evictObject(eClass, id);
		}

		@Override
		public void unregisterAllObjects(EClass eClass) {
			// we need to clean up the changeStorage too
			Iterator<EObject> iterator = changeStorage.keySet().iterator();
			while (iterator.hasNext()) {
				final EObject x = iterator.next();
				if (x.eClass() == eClass) {
					iterator.remove();
				}
			}
 			getCache().evictObjects(eClass);
		}

		@Override
		public void clearChangeDescription(Object object) {
			List<FeatureChange> list = changeStorage.get(object);
			if( list != null ) {
				list.clear();
			}
		}

		@Override
		public List<ChangeDescription> getChangeDescription(Object object) {
			List<FeatureChange> list = changeStorage.get(object);

			if( list != null ) {
				Map<EStructuralFeature, ChangeDescriptionImpl> description = new HashMap<EStructuralFeature, ChangeDescriptionImpl>();
				for( FeatureChange c : list ) {
					ChangeDescriptionImpl d = description.get( c.feature);
					if( d == null ) {
						d = new ChangeDescriptionImpl(c.feature);
						description.put(c.feature, d);

						if( ! c.feature.isMany() ) {
							d.oldValue = c.oldValue;
						}
					}

					if( c.feature.isMany() ) {
						if( c.type == Type.ADD ) {
							if( ! d.removals.remove(c.newValue) ) {
								d.additions.add(c.newValue);
							}
						} else if( c.type == Type.REMOVE ) {
							if( ! d.additions.remove(c.oldValue) ) {
								d.removals.add(c.oldValue);
							}
						}
					} else {
						d.newValue = c.newValue;
					}
				}

				Iterator<ChangeDescriptionImpl> iterator = description.values().iterator();
				while( iterator.hasNext() ) {
					ChangeDescriptionImpl desc = iterator.next();
					if( desc.feature.isMany() ) {
						if( desc.removals.isEmpty() && desc.additions.isEmpty() ) {
							iterator.remove();
						}
					} else {
						if( Objects.equal(desc.newValue, desc.oldValue) ) {
							iterator.remove();
						}
					}
				}
				return Collections.unmodifiableList(new ArrayList<JavaSession.ChangeDescription>(description.values()));
			}

			return Collections.emptyList();
		}

		@Override
		public Boolean runWithoutChangeTracking(Callback<Boolean> runnable) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Pauseing change tracking: " + changeTrackingCount);
			}
			changeTrackingCount++;
			try {
				return runnable.call();
			} finally {
				changeTrackingCount--;
				if( isDebug ) {
					LOGGER.debug("Release change tracking: " + changeTrackingCount);
				}
			}
		}

		/* (non-Javadoc)
		 * @see at.bestsolution.persistence.Session#getMemoryObjectVersion(java.lang.Object)
		 */
		@Override
		public long getMemoryObjectVersion(Object object) {
			final ObjectMapper<Object> mapper = createMapperForObject(object);
			return sessionCache.getVersion((EObject)object, getPrimaryKey(mapper, object));
		}

		/* (non-Javadoc)
		 * @see at.bestsolution.persistence.Session#getPersistedObjectVersion(java.lang.Object)
		 */
		@Override
		public long getPersistedObjectVersion(Object object) {
			final ObjectMapper<Object> mapper = createMapperForObject(object);
			return mapper.selectVersion(getPrimaryKey(mapper, object));
		}
	}

	public static class ChangeDescriptionImpl implements ChangeDescription {
		public final EStructuralFeature feature;
		public List<Object> additions;
		public List<Object> removals;
		public Object oldValue;
		public Object newValue;

		public ChangeDescriptionImpl(EStructuralFeature feature) {
			this.feature = feature;
			this.additions = new ArrayList<Object>();
			this.removals = new ArrayList<Object>();
		}

		@Override
		public EStructuralFeature getFeature() {
			return feature;
		}

		@Override
		public List<Object> getAdditions() {
			return additions;
		}

		@Override
		public List<Object> getRemovals() {
			return removals;
		}

		@Override
		public Object getNewValue() {
			return newValue;
		}

		@Override
		public Object geOldValue() {
			return oldValue;
		}
	}

	static class FeatureChange {
		EStructuralFeature feature;
		Object newValue;
		Object oldValue;
		Type type;
	}

	enum Type {
		ADD,
		REMOVE,
		SET
	}
}