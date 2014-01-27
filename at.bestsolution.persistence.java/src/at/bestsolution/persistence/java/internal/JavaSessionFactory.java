package at.bestsolution.persistence.java.internal;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.PersistanceException;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JDBCConnectionProvider;
import at.bestsolution.persistence.java.JavaSession;
import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import at.bestsolution.persistence.java.ObjectMapperFactory.NamedQuery;
import at.bestsolution.persistence.java.ProxyFactory;
import at.bestsolution.persistence.java.RelationSQL;
import at.bestsolution.persistence.java.SessionCache;
import at.bestsolution.persistence.java.SessionCacheFactory;

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

	class JavaSessionImpl implements JavaSession {
		private String id = UUID.randomUUID().toString();
		private Map<Class<?>, ObjectMapper<?>> mapperInstances = new HashMap<Class<?>, ObjectMapper<?>>();
		private Stack<Connection> transactionConnectionQueue;
		private Stack<Transaction> transactionQueue;
		private SessionCache sessionCache;
		private Map<Transaction, List<RelationSQL>> relationSQLStorage = new HashMap<Session.Transaction, List<RelationSQL>>();

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
		@SuppressWarnings("unchecked")
		public <M extends ObjectMapper<?>> M createMapper(Class<M> mapper) {
			M m = (M) mapperInstances.get(mapper);
			if( m == null ) {
				m = (M) factories.get(mapper.getName()).createMapper(this);
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
		public boolean isTransaction() {
			return transactionConnectionQueue != null;
		}

		@Override
		public void runInTransaction(Transaction transaction) {
			String transactionId = UUID.randomUUID().toString();

			LOGGER.debug("Started transaction '"+transactionId+"'");

			Connection connection = connectionProvider.checkoutConnection();
			try {
				connection.setAutoCommit(false);
			} catch (SQLException e2) {
				LOGGER.error("Failed to turn off auto commit", e2);
				throw new PersistanceException(e2);
			}

			if( eventAdmin != null ) {
				Map<String, Object> properties = new HashMap<String, Object>();
				properties.put(DATA_SESSION_ID_TOPIC_TRANSACTION_START, transactionId);
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
				if( transaction.execute() ) {
					try {
						List<RelationSQL> list = relationSQLStorage.get(transaction);
						if( list != null ) {
							RelationSQL[] tmpList = list.toArray(new RelationSQL[0]);
							for( RelationSQL s : tmpList ) {
								s.execute();
							}
						}
						connection.commit();
						if( eventAdmin != null ) {
							Map<String, Object> properties = new HashMap<String, Object>();
							properties.put(DATA_SESSION_ID_TOPIC_TRANSACTION_END, transactionId);
							properties.put(DATA_STATUS_TOPIC_TRANSACTION_END, VALUE_COMMIT);
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
							properties.put(DATA_SESSION_ID_TOPIC_TRANSACTION_END, transactionId);
							properties.put(DATA_STATUS_TOPIC_TRANSACTION_END, VALUE_ROLLBACK);
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
						properties.put(DATA_SESSION_ID_TOPIC_TRANSACTION_END, transactionId);
						properties.put(DATA_STATUS_TOPIC_TRANSACTION_END, VALUE_ROLLBACK);
						eventAdmin.sendEvent(new Event(TOPIC_TRANSACTION_END, properties));
					}
				} catch (SQLException e1) {
					LOGGER.error("Failed to rollback transaction. Swallowing and rethrowing original connection.",e1);
				}
				throw e instanceof RuntimeException ? (RuntimeException)e : new RuntimeException(e);
			} finally {
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
			LOGGER.debug("Finished transaction '"+transactionId+"'");
		}

		@Override
		public Transaction getTransaction() {
			return transactionQueue == null ? null : transactionQueue.peek();
		}

		@Override
		public void addRelationSQL(Transaction transaction, RelationSQL sql) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Trying to register: " + sql);
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
		}

		@Override
		public void clear() {
			sessionCache.clear();
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
			for( Object e : entities ) {
				if( e instanceof EObject ) {
					EObject eo = (EObject) e;
					ObjectMapperFactory<?, ?> f = factories.get(eo.eClass().getInstanceClassName()+"Mapper");
					if( f == null ) {
						throw new IllegalStateException("There's no mapper known for '"+eo.eClass().getInstanceClassName()+"'");
					}
					ObjectMapper<Object> m = (ObjectMapper<Object>) f.createMapper(this);
					m.delete(e);
				} else {
					throw new IllegalStateException("'"+e.getClass().getName()+"' is not an EObject");
				}
			}
		}

		@Override
		public void persist(Object... entities) {
			for( Object e : entities ) {
				if( e instanceof EObject ) {
					EObject eo = (EObject) e;
					ObjectMapperFactory<?, ?> f = factories.get(eo.eClass().getInstanceClassName()+"Mapper");
					if( f == null ) {
						throw new IllegalStateException("There's no mapper known for '"+eo.eClass().getInstanceClassName()+"'");
					}
					ObjectMapper<Object> m = (ObjectMapper<Object>) f.createMapper(this);
					Object l = m.getPrimaryKeyValue(e);
					if( l == null || (l instanceof Number && ((Number)l).longValue() == 0) ) {
						m.insert(e);
					} else {
						m.update(e);
					}
				} else {
					throw new IllegalStateException("'"+e.getClass().getName()+"' is not an EObject");
				}
			}
		}
	}
}