package test.model.emap.mixedkeys.java;

import test.model.emap.mixedkeys.MTagMapper;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import at.bestsolution.persistence.java.JavaSession;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import at.bestsolution.persistence.PersistanceException;
import test.model.mixedkeys.MixedkeysFactory;
import test.model.mixedkeys.Tag;
import at.bestsolution.persistence.model.ResolveDelegate;
import at.bestsolution.persistence.model.LazyEObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.DatabaseSupport.QueryBuilder;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.java.query.MappedQueryImpl;
import at.bestsolution.persistence.java.query.MappedUpdateQueryImpl;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.UpdateDelegate;
import at.bestsolution.persistence.java.query.InternalQueryCriteria;
import at.bestsolution.persistence.java.query.TypedValue;
import at.bestsolution.persistence.java.query.JDBCType;
import org.apache.log4j.Logger;
import java.util.Arrays;
import java.sql.Statement;
import at.bestsolution.persistence.java.RelationSQL;
import at.bestsolution.persistence.java.RelationSQL.Action;
import at.bestsolution.persistence.Callback;
import java.util.Collections;
import java.util.Collection;
import org.eclipse.emf.ecore.util.EcoreUtil;
import at.bestsolution.persistence.java.RefreshableObjectMapper;

// by JavaObjectMapperGenerator
@SuppressWarnings("all")
public final class MTagMapperFactory implements ObjectMapperFactory<test.model.emap.mixedkeys.MTagMapper,Tag> {
	
	@Override
	public Class<Tag> getEntityType() {
		return Tag.class;
	}

	@Override
	public Class<test.model.emap.mixedkeys.MTagMapper> getMapperType() {
		return test.model.emap.mixedkeys.MTagMapper.class;
	}

	@Override
	public test.model.emap.mixedkeys.MTagMapper createMapper(JavaSession session) {
		return new MTagMapperImpl(session);
	}

	final static class MTagMapperImpl implements MTagMapper, at.bestsolution.persistence.java.JavaObjectMapper<Tag>,at.bestsolution.persistence.java.RefreshableObjectMapper<Tag>, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(MTagMapperImpl.class);
		private static MetaData META_DATA;

		public MTagMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public Class<Tag> getEntityType() {
			return Tag.class;
		}

		@Override
		public final JavaSession getSession() {
			return this.session;
		}

		@Override
		public final MetaData metaData() {
			if( META_DATA == null ) {
				META_DATA = new MetaData();
			}
			return META_DATA;
		}

		// by JavaObjectMapperGenerator
		@Override
		public <K extends at.bestsolution.persistence.Key<Tag>> long selectVersion(K id) {
			final Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				try {
					if( session.getDatabaseSupport().isDefaultLowerCase() ) {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"mtag\" WHERE \"(\"id\" = ?)");
					} else {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"MTAG\" WHERE \"(\"ID\" = ?)");
					}

					set = pStmt.executeQuery();

					if (set.next()) {
						return set.getLong(1);
					}
					else {
						return -1;
					}
				}
				finally {
					if (set != null) set.close();
					if (pStmt != null) pStmt.close();
				}
			}
			catch (SQLException e) {
				throw new PersistanceException(e);
			}
			finally {
				session.returnConnection(connection);
			}
		}



		// by JavaObjectMapperGenerator
		@Override
		public final at.bestsolution.persistence.MappedUpdateQuery<Tag> deleteAllMappedQuery() {
			MappedUpdateQuery<Tag> deleteQuery = session.getDatabaseSupport().createMappedUpdateQuery(this, null,
				new UpdateDelegate<Tag>() { public int execute(MappedUpdateQuery<Tag> criteria) { return deleteAll((InternalQueryCriteria)criteria); } }
			);
			return deleteQuery;
		}

		// by JavaObjectMapperGenerator
		public final Tag map_default_Tag(Connection connection, ResultSet set) throws SQLException {
			Key id = Util.extractKey(PKLayout, set);
			final EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag();
			Tag rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				if( LOGGER.isDebugEnabled() ) {
					LOGGER.debug("Using cached version");
				}
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			((EObject)rv).eSetDeliver(false);
			rv.setId(set.getBigDecimal("ID").toBigInteger());
			rv.setEndlessInt(set.getBigDecimal("ENDLESSINT").toBigInteger());
			rv.setValue(set.getString("VAL"));
			ProxyData_Tag proxy = new ProxyData_Tag(Util.extractKey(FKAddressLayout, set));
			((LazyEObject)rv).setProxyData(proxy);
			((LazyEObject)rv).setProxyDelegate(this);
			((EObject)rv).eSetDeliver(true);
			session.registerObject(rv, getPrimaryKey(rv), getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
			return rv;
		}
		
		// by JavaObjectMapperGenerator
		private final void map_default_Tag_data_refresh(Tag rv, Connection connection, ResultSet set) throws SQLException {
			rv.setId(set.getBigDecimal("ID").toBigInteger());
			rv.setEndlessInt(set.getBigDecimal("ENDLESSINT").toBigInteger());
			rv.setValue(set.getString("VAL"));
		}

		// by JavaObjectMapperGenerator
		private final void map_default_Tag_complete_refresh(Tag rv, Connection connection, ResultSet set, Set<Object> refreshedObjects) throws SQLException {
			rv.setId(set.getBigDecimal("ID").toBigInteger());
			rv.setEndlessInt(set.getBigDecimal("ENDLESSINT").toBigInteger());
			rv.setValue(set.getString("VAL"));
			ProxyData_Tag proxy = new ProxyData_Tag(Util.extractKey(FKAddressLayout, set));
			((LazyEObject)rv).setProxyData(proxy);
			((LazyEObject)rv).setProxyDelegate(this);
			{
				EObject eo = (EObject)rv;
				EReference r = (EReference)eo.eClass().getEStructuralFeature("address");
				if( ((LazyEObject)rv).isResolved(r) ) {
						test.model.mixedkeys.Address v = rv.getAddress();
						RefreshableObjectMapper<test.model.mixedkeys.Address> mr = (RefreshableObjectMapper<test.model.mixedkeys.Address>)session.createMapper(test.model.emap.mixedkeys.MAddressMapper.class);
						if( v != null && ! refreshedObjects.contains(v) ) {
							mr.refreshWithReferences(v,refreshedObjects);
						} else {
							at.bestsolution.persistence.Key<test.model.mixedkeys.Address> currentId = v == null ? null : mr.getPrimaryKey(v);
							if( proxy.address.equals(currentId) ) {
								EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getAddress();
								v = session.getCache().getObject(eClass,proxy.address);
								if( v != null ) {
									resolve((LazyEObject)rv,proxy,r);
									if( ! refreshedObjects.contains(v) ) {
										mr.refreshWithReferences(v,refreshedObjects);
									}
								} else {
									resolve((LazyEObject)rv,proxy,r);
									v = rv.getAddress();
									if( v != null ) {
										refreshedObjects.add(v);
									}
								}
							}
						}
				}
			}
		}

			// Utilities
			
			private List<Key> extractObjectIds(Tag... object) {
				List<Key> objectIds = new ArrayList<>();
				for (Tag o : object) {
					objectIds.add((Key) getPrimaryKeyForTx(o));
				}
				return objectIds;
			}
			
			// Utility Methods
			
			

		// by QueryGenerator
		@Override
		public final test.model.mixedkeys.Tag selectById(final java.math.BigInteger id) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Check id cache for object");
			{
				final EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag();
				final Key key = PKLayout.create(Collections.singletonMap("id", (Object) id));
				
				final Tag rv = session.getCache().getObject(eClass, key);
				if( rv != null ) {
					if( isDebug ) LOGGER.debug("Using cached object");
					return rv;
				}
			}
			if( isDebug ) LOGGER.debug("Executing selectById");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MTag_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MTag_selectById_default.sql");
				}
		
			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
			final ProcessedSQL processedSQL = Util.processSQL(query);
		
			if( isDebug ) {
				LOGGER.debug("	Processed-Query: " + processedSQL.sql);
			}
		
			if( isDebug ) LOGGER.debug("Preparing query");
			pStmt = connection.prepareStatement(processedSQL.sql);
		
			List<String> debugParams = new ArrayList<String>();
			int paramIndex = 1;
			for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
				if( "id".equals(processedSQL.dynamicParameterNames.get(i)) ) {
					if( isDebug ) {
						debugParams.add("id = " + id);
					}
						// DAMN THIS ONE
					
						pStmt.setBigDecimal(paramIndex++, new java.math.BigDecimal(id));
						
						//final Key key = PKLayout.create(Collections.singletonMap("id", (Object) id));
						//Util.setKeyValue(pStmt, paramIndex++, PKLayout, key, "id");
				}
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
			if( isDebug ) LOGGER.debug("Executing query");
			set = pStmt.executeQuery();
		
			final Tag rv;
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping result started");
			if( set.next() ) {
				rv = map_default_Tag(connection,set);
			} else {
				if( isDebug ) LOGGER.debug("No result for query");
				rv = null;
			}
			if( isDebug ) LOGGER.debug("Mapping result ended.");
				set.close();
				set = null;
				pStmt.close();
				pStmt = null;
				if( isDebug ) LOGGER.debug("Mapping result ended");
				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				try {
					if( set != null ) {
						set.close();
					}
		
					if( pStmt != null ) {
						pStmt.close();
					}
				} catch(SQLException e) {
					LOGGER.fatal("Unable to clean up resources", e);
				} finally {
					session.returnConnection(connection);
				}
			}
		}
		// by QueryGenerator
		@Override
		public final java.util.List<test.model.mixedkeys.Tag> selectAllForAddress(final java.math.BigInteger addressId) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Executing selectAllForAddress");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MTag_selectAllForAddress_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MTag_selectAllForAddress_default.sql");
				}
		
			if( isDebug ) LOGGER.debug("	Plain-Query: " + query);
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
			final ProcessedSQL processedSQL = Util.processSQL(query);
		
			if( isDebug ) {
				LOGGER.debug("	Processed-Query: " + processedSQL.sql);
			}
		
			if( isDebug ) LOGGER.debug("Preparing query");
			pStmt = connection.prepareStatement(processedSQL.sql);
		
			List<String> debugParams = new ArrayList<String>();
			int paramIndex = 1;
			for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
				if( "addressId".equals(processedSQL.dynamicParameterNames.get(i)) ) {
					if( isDebug ) {
						debugParams.add("addressId = " + addressId);
					}
						// DAMN THIS ONE
					
						pStmt.setBigDecimal(paramIndex++, new java.math.BigDecimal(addressId));
						
						//final Key key = PKLayout.create(Collections.singletonMap("addressId", (Object) addressId));
						//Util.setKeyValue(pStmt, paramIndex++, PKLayout, key, "addressId");
				}
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
			if( isDebug ) LOGGER.debug("Executing query");
			set = pStmt.executeQuery();
		
			final List<Tag> rv = new ArrayList<Tag>();
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping results started");
			while(set.next()) {
				rv.add(map_default_Tag(connection, set));
			}
			if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");
				set.close();
				set = null;
				pStmt.close();
				pStmt = null;
				if( isDebug ) LOGGER.debug("Mapping result ended");
				return rv;
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				try {
					if( set != null ) {
						set.close();
					}
		
					if( pStmt != null ) {
						pStmt.close();
					}
				} catch(SQLException e) {
					LOGGER.fatal("Unable to clean up resources", e);
				} finally {
					session.returnConnection(connection);
				}
			}
		}




		// refresh stuff
		// by QueryGenerator
		public final void refresh(final Tag object, final at.bestsolution.persistence.Session.RefreshType refreshType) {
			switch( refreshType ) {
				case DATA_ONLY:
					refreshDataOnly(object,false);
					break;
				case DATA_ONLY_SYNC_VERSION:
					refreshDataOnly(object,true);
					break;
				case COMPLETE:
					refreshWithReferences(object, new HashSet<Object>());
					break;
			}
		}
		
		public final void refreshWithReferences(final Tag object, Set<Object> refreshedObjects) {
			if( ! (object instanceof LazyEObject) ) {
				LOGGER.error("Unable to refresh object '"+object+"' not loaded from database");
				return;
			}
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MTag_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MTag_selectById_default.sql");
				}
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				final Key key = getPrimaryKey(object);
				pStmt.setObject(1, key.id());
				set = pStmt.executeQuery();
				if( set.next() ) {
					refreshedObjects.add(object);
					map_default_Tag_complete_refresh(object,connection,set,refreshedObjects);
					if( getLockColumn() != null ) {
						session.getCache().updateVersion((EObject)object, key, set.getLong(getLockColumn()));
					}
				} else {
					throw new PersistanceException("Object with id '"+key+"' not available");
				}
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				try {
					if( set != null ) {
						set.close();
					}
					if( pStmt != null ) {
						pStmt.close();
					}
				} catch(SQLException e) {
					LOGGER.fatal("Unable to clean up resources", e);
				} finally {
					session.returnConnection(connection);
				}
			}
		}
		
		private final void refreshDataOnly(final Tag object, boolean updateVersion) {
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MTag_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MTag_selectById_default.sql");
				}
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				final Key key = getPrimaryKey(object);
				pStmt.setObject(1, key.id());
				set = pStmt.executeQuery();
				if( set.next() ) {
					map_default_Tag_data_refresh(object,connection,set);
					if( updateVersion && getLockColumn() != null ) {
						session.getCache().updateVersion((EObject)object, key, set.getLong(getLockColumn()));
					}
				} else {
					throw new PersistanceException("Object with id '"+key+"' not available");
				}
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				try {
					if( set != null ) {
						set.close();
					}
					if( pStmt != null ) {
						pStmt.close();
					}
				} catch(SQLException e) {
					LOGGER.fatal("Unable to clean up resources", e);
				} finally {
					session.returnConnection(connection);
				}
			}
		}

		// update stuff
		// by JavaInsertUpdateGenerator
		@Override
		public final void update(final Tag object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Starting insert of '"+object+"'");
			}
		
			if( session.getTransaction() == null ) {
				throw new PersistanceException("You can only modify data while in a transaction");
			}
		
			// Inform session about the update
			session.preExecuteUpdate(this,object);
		
			// Built the query
			at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"MTAG").createUpdateStatement(PKLayout, getLockColumn());
			// NEW:
			// simple direct mapped attributes
			// * endlessInt
			stmt.addBigInteger("ENDLESSINT", (java.math.BigInteger)session.getTransactionAttribute(object,test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag_EndlessInt()));
			// * value
			stmt.addString("VAL", (java.lang.String)session.getTransactionAttribute(object,test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag_Value()));
			// one to one references
			// * address (Address)
			if( object.getAddress() != null ) {
				final test.model.emap.mixedkeys.MAddressMapper refMapper = session.createMapper(test.model.emap.mixedkeys.MAddressMapper.class);
				final test.model.emap.mixedkeys.MAddressMapper.Key refKey = session.getPrimaryKey(refMapper, object.getAddress());
				stmt.addKey(FKAddressLayout, refKey);
			} else {
				stmt.addNull("FK_ADDRESS",getJDBCType("address"));
			}
		
			// Execute the query
			Connection connection = session.checkoutConnection();
			try {
				final long version = getLockColumn() != null ? getVersionForTx(object) : -1;
				final boolean success = stmt.execute(connection, getPrimaryKey(object), version);
		
				if( getLockColumn() != null && ! success ) {
					throw new PersistanceException("The entity '"+object.getClass().getName()+"' is stale");
				} else if( getLockColumn() != null ) {
					session.updateVersion(object,version+1);
				}
		
		
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.ClearChangeDescriptionAfterTx(object));
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.VersionUpdaterAfterTx(object,getPrimaryKeyForTx(object),getVersionForTx(object)));
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		// insert stuff
		// by JavaInsertUpdateGenerator
		@Override
		public final void insert(final Tag object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Starting insert of '"+object+"'");
			}
		
			if( session.getTransaction() == null ) {
				throw new PersistanceException("You can only modify data while in a transaction");
			}
		
			// Inform session about the insert
			session.preExecuteInsert(this,object);
		
		
			// Handle Expressions
			Map<String, String> sequenceExpressions = new HashMap<String, String>();
			if( "Firebird".equals(session.getDatabaseType()) ) {
				sequenceExpressions.put("ID","NEXT VALUE FOR SEQ_MTAG_ID");
			}
			if( "Postgres".equals(session.getDatabaseType()) ) {
			}
			// Build the SQL
			at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"MTAG").createInsertStatement(PKLayout, sequenceExpressions, getLockColumn());
		
		
			// handle simple direct mapped attributes
			// * endlessInt
			{
				Object o = session.getTransactionAttribute(object,test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag_EndlessInt());
				if( o != null ) {
					stmt.addBigInteger("ENDLESSINT", (java.math.BigInteger)o);
				}
			}
			// * value
			{
				Object o = session.getTransactionAttribute(object,test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag_Value());
				if( o != null ) {
					stmt.addString("VAL", (java.lang.String)o);
				}
			}
		
		
		
			// handle one to one references
			// * address
			if( object.getAddress() != null ) {
				final test.model.emap.mixedkeys.MAddressMapper refMapper = session.createMapper(test.model.emap.mixedkeys.MAddressMapper.class);
				final test.model.emap.mixedkeys.MAddressMapper.Key refKey = session.getPrimaryKey(refMapper, object.getAddress());
				stmt.addKey(FKAddressLayout, refKey);
			}
		
			// Execute the query
			final Connection connection = session.checkoutConnection();
			try {
				final Key primaryKey = stmt.execute(connection);
				session.registerPrimaryKey(object, primaryKey);
				session.updateVersion(object,0);
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.AfterTxRunnable() {
					@Override
					public void runAfterTx(JavaSession session) {
						object.setId(primaryKey.id());
					}
				});
		
		
		
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.RegisterObjectAfterTx(object, primaryKey, getLockColumn() != null ? 0 : -1));
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		// delete stuff
		// by JavaInsertUpdateGenerator
		@Override
		public final void delete(Tag object) {
			delete(new Tag[] { object });
		}
		
		final int deleteAll(InternalQueryCriteria criteria) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if (isDebug) LOGGER.debug("Executing deleteAll");
		
			final String criteriaStr = criteria.getCriteria();
			session.preExecuteDeleteMany(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag());
		
			// build delete query
			String deleteQuery;
			if( session.getDatabaseSupport().isDefaultLowerCase() ) {
				deleteQuery = "DELETE FROM \"mtag\"";
			} else {
				deleteQuery = "DELETE FROM \"MTAG\"";
			}
		
			if (isDebug) LOGGER.debug("Plain delete query: " + deleteQuery);
			if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
				deleteQuery += " WHERE " + criteriaStr;
			}
			if (isDebug) LOGGER.debug("Final delete query: " + deleteQuery);
		
			Connection connection = session.checkoutConnection();
			try {
				// execute delete
				PreparedStatement pstmt = null;
				try {
					pstmt = connection.prepareStatement(deleteQuery);
					int idx = 1;
					for(TypedValue t : criteria.getParameters()) {
						Util.setValue(pstmt, idx++, t);
					}
					final int n = pstmt.executeUpdate();
					if (isDebug) LOGGER.debug("executed query " + n + " records were affected");
					return n;
				}
				finally {
					if (pstmt != null) {
						pstmt.close();
					}
				}
		
		
			}
			catch (SQLException e) {
				throw new PersistanceException(e);
			}
			finally {
				session.returnConnection(connection);
			}
		
		
		}
		
		// by JavaInsertUpdateGenerator
		@Override
		public final void deleteAll() {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("deleteAll()");
			}
		
			if( session.getTransaction() == null ) {
				throw new PersistanceException("You can only modify data while in a transaction");
			}
		
			session.preExecuteDeleteMany(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag());
		
			// we need to clean up the session
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterAllObjectsAfterTx(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag()));
		
			final Connection connection = session.checkoutConnection();
			try {
		
				// find all object ids
				String objectIdSQL;
		
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					objectIdSQL = "SELECT \"id\" FROM \"mtag\"";
				} else {
					objectIdSQL = "SELECT \"ID\" FROM \"MTAG\"";
				}
		
				PreparedStatement objectIdStmt = null;
				ResultSet objectIdResultSet = null;
				List<Object> objectIds = new ArrayList<Object>();
				try {
					objectIdStmt = connection.prepareStatement(objectIdSQL);
					objectIdResultSet = objectIdStmt.executeQuery();
					while (objectIdResultSet.next()) {
						objectIds.add(objectIdResultSet.getLong("ID"));
					}
				}
				finally {
					if (objectIdResultSet != null) {
						objectIdResultSet.close();
					}
					if (objectIdStmt != null) {
						objectIdStmt.close();
					}
				}
		
				// self-recursive: false
		
		
		
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"mtag\"";
				} else {
					sql = "DELETE FROM \"MTAG\"";
				}
		
				// executing query begin
				if (isDebug) {
					LOGGER.debug(" Executing SQL: " + sql);
				}
				PreparedStatement stmt = connection.prepareStatement(sql);
				try {
					stmt.execute();
				}
				finally {
					if (stmt != null) {
						stmt.close();
					}
				}
				// executing query end
		
			} catch(SQLException e) {
				if( isDebug ) {
					LOGGER.debug("deleteAll() failed", e);
				}
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		
			if( isDebug ) {
				LOGGER.debug("deleteAll() done.");
			}
		}
		
		// by JavaInsertUpdateGenerator
		@Override
		public <K extends at.bestsolution.persistence.Key<Tag>> void deleteById(K... keys) {
			final List<Key> keyz= new ArrayList<Key>();
			for (at.bestsolution.persistence.Key<Tag> key : keys) {
				if (key instanceof Key) {
					final Key id = (Key) key;
					if (key.getAttributes().size() > 1) {
						throw new PersistanceException("Multi valued primary keys are not yet supported!!!");
					}
					keyz.add(id);
				}
				else {
					throw new PersistanceException("Wrong Key type: " + key);
				}
			}
			deleteById(keyz);
		}
		
		// by JavaInsertUpdateGenerator
		public final void deleteById(List<Key> objectIds) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("deleteById("+objectIds+")");
			}
		
			if( session.getTransaction() == null ) {
				throw new PersistanceException("You can only modify data while in a transaction");
			}
			final EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag();
			session.preExecuteDeleteById(eClass,objectIds);
		
			for(Key id : objectIds) {
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterObjectByIdAfterTx(eClass, id));
			}
		
			final Connection connection = session.checkoutConnection();
			try {
		
		
				// building query begin
				final StringBuilder sqlBuilder = new StringBuilder();
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sqlBuilder.append("DELETE FROM \"mtag\" WHERE \"id\" IN (");
				} else {
					sqlBuilder.append("DELETE FROM \"MTAG\" WHERE \"ID\" IN (");
				}
				
				Iterator<Key> sqlobjectIdsIterator = objectIds.iterator();
				while (sqlobjectIdsIterator.hasNext()) {
					sqlobjectIdsIterator.next();
					sqlBuilder.append("?");
					if (sqlobjectIdsIterator.hasNext()) {
						sqlBuilder.append(", ");
					}
				}
				sqlBuilder.append(")");
				final String sql = sqlBuilder.toString();
				// building query end
				if (!objectIds.isEmpty()) {
					// executing query begin
					if (isDebug) {
						LOGGER.debug(" Executing SQL: " + sql);
					}
					PreparedStatement stmt = connection.prepareStatement(sql);
					try {
						int sqlobjectIdsIdx = 1;
						Iterator<Key> stmtParamIt = objectIds.iterator();
						while (stmtParamIt.hasNext()) {
							final Key obj = stmtParamIt.next();
							if (isDebug) {
								LOGGER.debug(" With Parameter " + sqlobjectIdsIdx + ": " + obj);
							}
							Util.setKeyValue(stmt, sqlobjectIdsIdx, test.model.emap.mixedkeys.MTagMapper.PKLayout, obj, "id");
							sqlobjectIdsIdx++;
						}
						stmt.execute();
					}
					finally {
						if (stmt != null) {
							stmt.close();
						}
					}
					// executing query end
				}
		
			} catch(SQLException e) {
				if( isDebug ) {
					LOGGER.debug("delete() failed", e);
				}
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		
			if( isDebug ) {
				LOGGER.debug("delete() done");
			}
		}
		
		// by JavaInsertUpdateGenerator
		@Override
		public final void delete(Tag... object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("delete("+Arrays.toString(object)+")");
			}
		
			List<at.bestsolution.persistence.Key<Tag>> keyList = new ArrayList<>();
			for (Tag o : object) {
				keyList.add(getPrimaryKey(o));
			}
			
			deleteById(keyList.toArray(new at.bestsolution.persistence.Key[] {}));
		
			//List<Object> ids = new ArrayList<Object>();
			//for (Tag o : object) {
			//	ids.add(getPrimaryKeyValue(o));
			//}
			//deleteById(ids);
		
		}

		// by JavaObjectMapperGenerator
		public final boolean resolve(final LazyEObject eo, final Object proxyData, final EStructuralFeature f) {
			if( inAutoResolve ) {
				return true;
			}

			return session.runWithoutChangeTracking(new Callback<Boolean>() {
				public Boolean call() {
					return doResolve(eo,proxyData,f);
				}
			}).booleanValue();
		}

		// by JavaObjectMapperGenerator
		final boolean doResolve(LazyEObject eo, Object proxyData, EStructuralFeature f) {
			boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("Lazy resolving " + f + " from " + eo + " using " + proxyData);
			}
			if(eo instanceof Tag) {
				test.model.mixedkeys.Tag target = (test.model.mixedkeys.Tag)eo;
				switch(f.getFeatureID()) {
				  // address
				  case test.model.mixedkeys.MixedkeysPackage.TAG__ADDRESS: {
				    {
				      
				      EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getAddress();
				      test.model.mixedkeys.Address o = session.getCache().getObject(eClass, ((ProxyData_Tag)proxyData).address);
				      if( o == null ) {
				        o = session.createMapper(test.model.emap.mixedkeys.MAddressMapper.class).selectById(((ProxyData_Tag)proxyData).address.id());
				      } else {
				        if( LOGGER.isDebugEnabled() ) {
				          LOGGER.debug("Using cached version");
				        }
				      }
				    
				      if (o != null) {
				      	target.setAddress(o);
				      }
				    }
				    return true;
				  }
				  default : {
				    return false;
				  }
				}
			}
			return false;
		}

		// by JavaObjectMapperGenerator
		public final String getTableName() {
			return "MTAG";
		}

		private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
		private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
		private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
		private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();
		private static Set<EReference> REFERENCE_FORCEDFK = new HashSet<EReference>();
		private static Map<String,Class<? extends at.bestsolution.persistence.ObjectMapper>> REFERENCE_MAPPER = new HashMap<String,Class<? extends at.bestsolution.persistence.ObjectMapper>>();

		static {
			PROPERTY_COL_MAPPING.put("id","ID");
			PROPERTY_COL_MAPPING.put("endlessInt","ENDLESSINT");
			PROPERTY_COL_MAPPING.put("value","VAL");
			PROPERTY_COL_MAPPING.put("address","FK_ADDRESS");
			TYPE_MAPPING.put("id",JDBCType.UNKNOWN);
			TYPE_MAPPING.put("endlessInt",JDBCType.UNKNOWN);
			TYPE_MAPPING.put("value",JDBCType.STRING);
			TYPE_MAPPING.put("address",JDBCType.UNKNOWN);
			REF_ID_FEATURES.put("address",test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getAddress_Id());
			REFERENCE_MAPPER.put("address",test.model.emap.mixedkeys.MAddressMapper.class);
			REFERENCE_FEATURES.add(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag_Address());
		}

		// by JavaObjectMapperGenerator
		public EClass getEClass() {
			return test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getTag();
		}

		// by JavaObjectMapperGenerator
		@Override
		public boolean containsForcedFkFeatures() {
			return !REFERENCE_FORCEDFK.isEmpty();
		}


		// by JavaObjectMapperGenerator
		@Override
		public final boolean isForcedFkFeature(EReference ref) {
			return REFERENCE_FORCEDFK.contains(ref);
		}

		// by JavaObjectMapperGenerator
		public final String getLockColumn() {
			return session.getDatabaseSupport().isDefaultLowerCase() ? "e_version" : "E_VERSION";
		}

		// by JavaObjectMapperGenerator
		public final String getColumnName(String propertyName) {
			if( propertyName.contains(".") ) {
				String[] segs = Util.splitOfSegment(propertyName);
				return createMapperForReference(segs[0]).getColumnName(segs[1]);
			}
			return PROPERTY_COL_MAPPING.get(propertyName);
		}

		// by JavaObjectMapperGenerator
		public final <M extends at.bestsolution.persistence.ObjectMapper<?>> M createMapperForReference(String propertyName) {
			return (M) session.createMapper(REFERENCE_MAPPER.get(propertyName));
		}

		// by JavaObjectMapperGenerator
		public final JDBCType getJDBCType(String propertyName) {
			if( propertyName.contains(".") ) {
				String[] segs = Util.splitOfSegment(propertyName);
				at.bestsolution.persistence.java.JavaObjectMapper<?> m = createMapperForReference(segs[0]);
				return m.getJDBCType(segs[1]);
			}
			return TYPE_MAPPING.get(propertyName);
		}
		
		// by JavaObjectMapperGenerator
		public final EStructuralFeature getReferenceId(String property) {
			return REF_ID_FEATURES.get(property);
		}

		// by JavaObjectMapperGenerator
		public final Set<EReference> getReferenceFeatures() {
			return Collections.unmodifiableSet(REFERENCE_FEATURES);
		}

		// by JavaObjectMapperGenerator
		public final Key getPrimaryKey(Tag o) {
			final Map<String, Object> values = new HashMap<>();
			values.put("id", o.getId());
			return PKLayout.create(values);
		}

		// by JavaObjectMapperGenerator
		protected final Key getPrimaryKeyForTx(Tag o) {
			return session.getPrimaryKey(this, o);
		}

		// by JavaObjectMapperGenerator
		protected final long getVersionForTx(Tag o) {
			return session.getVersion(this, o);
		}
		
		// by JavaObjectMapperGenerator
		private Map<String, Object> parseFKValuesForAddress(ResultSet set) throws SQLException {
			final Map<String, Object> result = new HashMap<>();
			result.put("id", set.getObject("FK_ADDRESS"));
			return result;
		}
	}

	// by JavaObjectMapperGenerator
	public final NamedQuery<test.model.mixedkeys.Tag> createNamedQuery(final JavaSession session, String name) {
			if( "selectById".equals(name) ) {
				return new NamedQuery<test.model.mixedkeys.Tag>() {
					public final List<test.model.mixedkeys.Tag> queryForList(Object... parameters) {
						throw new UnsupportedOperationException("This is a single value query");
					}

					public final test.model.mixedkeys.Tag queryForOne(Object... parameters) {
						return createMapper(session).selectById((java.math.BigInteger)parameters[0]);
					}

					public final String[] getParameterNames() {
						String[] rv = new String[1];
						int i = 0;
						rv[i++] = "id";
						return rv;
					}
				};
			}
			if( "selectAllForAddress".equals(name) ) {
				return new NamedQuery<test.model.mixedkeys.Tag>() {
					public final List<test.model.mixedkeys.Tag> queryForList(Object... parameters) {
						return createMapper(session).selectAllForAddress((java.math.BigInteger)parameters[0]);
					}

					public final test.model.mixedkeys.Tag queryForOne(Object... parameters) {
						throw new UnsupportedOperationException("This is a list value query");
					}

					public final String[] getParameterNames() {
						String[] rv = new String[1];
						int i = 0;
						rv[i++] = "addressId";
						return rv;
					}
				};
			}
		throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
	}

	// by JavaObjectMapperGenerator
	public final MappedQuery<Tag> mappedQuery(JavaSession session, String name) {
		throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
	}

	final static class ProxyData_Tag {
		public final test.model.emap.mixedkeys.MAddressMapper.Key address;
		public ProxyData_Tag(test.model.emap.mixedkeys.MAddressMapper.Key address) {
			this.address = address;
		}
	}
																											}
