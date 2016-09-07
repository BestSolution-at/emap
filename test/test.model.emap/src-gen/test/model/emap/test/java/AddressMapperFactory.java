package test.model.emap.test.java;

import test.model.emap.test.AddressMapper;
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
import test.model.test.TestFactory;
import test.model.test.Address;
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
public final class AddressMapperFactory implements ObjectMapperFactory<test.model.emap.test.AddressMapper,Address> {
	@Override
	public Class<Address> getEntityType() {
		return Address.class;
	}

	@Override
	public Class<test.model.emap.test.AddressMapper> getMapperType() {
		return test.model.emap.test.AddressMapper.class;
	}

	@Override
	public test.model.emap.test.AddressMapper createMapper(JavaSession session) {
		return new AddressMapperImpl(session);
	}

	final static class AddressMapperImpl implements AddressMapper, at.bestsolution.persistence.java.JavaObjectMapper<Address>,at.bestsolution.persistence.java.RefreshableObjectMapper<Address>, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(AddressMapperImpl.class);
		private static MetaData META_DATA;

		public AddressMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public Class<Address> getEntityType() {
			return Address.class;
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
		public long selectVersion(Object id) {
			final Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				try {
					if( session.getDatabaseSupport().isDefaultLowerCase() ) {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"address\" WHERE \"id\" = ?");
					} else {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"ADDRESS\" WHERE \"ID\" = ?");
					}
					pStmt.setLong(1, (Long) id);

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
		public final at.bestsolution.persistence.MappedUpdateQuery<Address> deleteAllMappedQuery() {
			MappedUpdateQuery<Address> deleteQuery = session.getDatabaseSupport().createMappedUpdateQuery(this, null,
				new UpdateDelegate<Address>() { public int execute(MappedUpdateQuery<Address> criteria) { return deleteAll((InternalQueryCriteria)criteria); } }
			);
			return deleteQuery;
		}

		// by JavaObjectMapperGenerator
		public final Address map_default_Address(Connection connection, ResultSet set) throws SQLException {
			Long id = set.getLong("ID");
			final EClass eClass = test.model.test.TestPackage.eINSTANCE.getAddress();
			Address rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				if( LOGGER.isDebugEnabled() ) {
					LOGGER.debug("Using cached version");
				}
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			((EObject)rv).eSetDeliver(false);
			rv.setId(set.getLong("ID"));
			rv.setStreet(set.getString("STREET"));
			ProxyData_Address proxy = new ProxyData_Address(set.getLong("FK_PERSON"));
			((LazyEObject)rv).setProxyData(proxy);
			((LazyEObject)rv).setProxyDelegate(this);
			((EObject)rv).eSetDeliver(true);
			session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
			return rv;
		}

		private final void map_default_Address_data_refresh(Address rv, Connection connection, ResultSet set) throws SQLException {
			rv.setId(set.getLong("ID"));
			rv.setStreet(set.getString("STREET"));
		}

		private final void map_default_Address_complete_refresh(Address rv, Connection connection, ResultSet set, Set<Object> refreshedObjects) throws SQLException {
			rv.setId(set.getLong("ID"));
			rv.setStreet(set.getString("STREET"));
			ProxyData_Address proxy = new ProxyData_Address(set.getLong("FK_PERSON"));
			((LazyEObject)rv).setProxyData(proxy);
			((LazyEObject)rv).setProxyDelegate(this);
			{
				EObject eo = (EObject)rv;
				EReference r = (EReference)eo.eClass().getEStructuralFeature("person");
				if( ((LazyEObject)rv).isResolved(r) ) {
					test.model.test.Person v = rv.getPerson();
					RefreshableObjectMapper<test.model.test.Person> mr = (RefreshableObjectMapper<test.model.test.Person>)session.createMapper(test.model.emap.test.PersonMapper.class);
					if( v != null && ! refreshedObjects.contains(v) ) {
						mr.refreshWithReferences(v,refreshedObjects);
					} else {
						long currentId = v == null ? 0 : ((Number)mr.getPrimaryKeyValue(v)).longValue();
						if( currentId != proxy.person ) {
							EClass eClass = test.model.test.TestPackage.eINSTANCE.getPerson();
							v = session.getCache().getObject(eClass,proxy.person);
							if( v != null ) {
								resolve((LazyEObject)rv,proxy,r);
								if( ! refreshedObjects.contains(v) ) {
									mr.refreshWithReferences(v,refreshedObjects);
								}
							} else {
								resolve((LazyEObject)rv,proxy,r);
								v = rv.getPerson();
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
			
			private List<Object> extractObjectIds(Address... object) {
				List<Object> objectIds = new ArrayList<Object>();
				for (Address o : object) {
					objectIds.add(getPrimaryKeyForTx(o));
				}
				return objectIds;
			}
			
			// Utility Methods
			
			

		// by QueryGenerator
		@Override
		public final test.model.test.Address selectById(final long id) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Check id cache for object");
			{
				final EClass eClass = test.model.test.TestPackage.eINSTANCE.getAddress();
				final Address rv = session.getCache().getObject(eClass,id);
				if( rv != null ) {
					if( isDebug ) LOGGER.debug("Using cached object");
					return rv;
				}
			}
			if( isDebug ) LOGGER.debug("Executing selectById");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Address_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Address_selectById_default.sql");
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
					pStmt.setLong(paramIndex++,id);
				}
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
			if( isDebug ) LOGGER.debug("Executing query");
			set = pStmt.executeQuery();
		
			final Address rv;
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping result started");
			if( set.next() ) {
				rv = map_default_Address(connection,set);
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
		public final java.util.List<test.model.test.Address> selectAllForPerson(final long personId) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Executing selectAllForPerson");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Address_selectAllForPerson_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Address_selectAllForPerson_default.sql");
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
				if( "personId".equals(processedSQL.dynamicParameterNames.get(i)) ) {
					if( isDebug ) {
						debugParams.add("personId = " + personId);
					}
					pStmt.setLong(paramIndex++,personId);
				}
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
			if( isDebug ) LOGGER.debug("Executing query");
			set = pStmt.executeQuery();
		
			final List<Address> rv = new ArrayList<Address>();
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping results started");
			while(set.next()) {
				rv.add(map_default_Address(connection, set));
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
		public final void refresh(final Address object, final at.bestsolution.persistence.Session.RefreshType refreshType) {
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
		
		public final void refreshWithReferences(final Address object, Set<Object> refreshedObjects) {
			if( ! (object instanceof LazyEObject) ) {
				LOGGER.error("Unable to refresh object '"+object+"' not loaded from database");
				return;
			}
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Address_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Address_selectById_default.sql");
				}
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				long id = ((Number)getPrimaryKeyValue(object)).longValue();
				pStmt.setLong(1, id);
				set = pStmt.executeQuery();
				if( set.next() ) {
					refreshedObjects.add(object);
					map_default_Address_complete_refresh(object,connection,set,refreshedObjects);
					if( getLockColumn() != null ) {
						session.getCache().updateVersion((EObject)object,id,set.getLong(getLockColumn()));
					}
				} else {
					throw new PersistanceException("Object with id '"+id+"' not available");
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
		
		private final void refreshDataOnly(final Address object, boolean updateVersion) {
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Address_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Address_selectById_default.sql");
				}
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				long id = ((Number)getPrimaryKeyValue(object)).longValue();
				pStmt.setLong(1, id);
				set = pStmt.executeQuery();
				if( set.next() ) {
					map_default_Address_data_refresh(object,connection,set);
					if( updateVersion && getLockColumn() != null ) {
						session.getCache().updateVersion((EObject)object,id,set.getLong(getLockColumn()));
					}
				} else {
					throw new PersistanceException("Object with id '"+id+"' not available");
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
		@Override
		public final void update(final Address object) {
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
			at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"ADDRESS").createUpdateStatement("ID", getLockColumn());
			// NEW:
			// simple direct mapped attributes
			// * street
			stmt.addString("STREET", (java.lang.String)session.getTransactionAttribute(object,test.model.test.TestPackage.eINSTANCE.getAddress_Street()));
			// one to one references
			// * person
			if( object.getPerson() != null ) {
				final test.model.emap.test.PersonMapper refMapper = session.createMapper(test.model.emap.test.PersonMapper.class);
				final long refKey = session.getPrimaryKey(refMapper, object.getPerson());
				stmt.addLong("FK_PERSON", refKey);
			} else {
				stmt.addNull("FK_PERSON",getJDBCType("person"));
			}
		
			// Execute the query
			Connection connection = session.checkoutConnection();
			try {
				long version = getLockColumn() != null ? getVersionForTx(object) : -1;
				boolean success = stmt.execute(connection, object.getId(),version);
		
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
		@Override
		public final void insert(final Address object) {
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
			String sequenceExpression = null;
			if( "Firebird".equals(session.getDatabaseType()) ) {
				sequenceExpression = "NEXT VALUE FOR SEQ_ADDRESS_ID";
			}
			if( "Postgres".equals(session.getDatabaseType()) ) {
				sequenceExpression = null;
			}
			// Build the SQL
			at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"ADDRESS").createInsertStatement("ID", sequenceExpression, getLockColumn());
		
		
			// handle simple direct mapped attributes
			// * street
			{
				Object o = session.getTransactionAttribute(object,test.model.test.TestPackage.eINSTANCE.getAddress_Street());
				if( o != null ) {
					stmt.addString("STREET", (java.lang.String)o);
				}
			}
		
		
		
			// handle one to one references
			// * person
			if( object.getPerson() != null ) {
				final test.model.emap.test.PersonMapper refMapper = session.createMapper(test.model.emap.test.PersonMapper.class);
				final long refKey = session.getPrimaryKey(refMapper, object.getPerson());
				stmt.addLong("FK_PERSON", refKey);
				//stmt.addLong("FK_PERSON",object.getPerson().getId());
			}
		
			// Execute the query
			final Connection connection = session.checkoutConnection();
			try {
				final long primaryKey = stmt.execute(connection);
				session.registerPrimaryKey(object, primaryKey);
				session.updateVersion(object,0);
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.AfterTxRunnable() {
					@Override
					public void runAfterTx(JavaSession session) {
						object.setId(primaryKey);
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
		@Override
		public final void delete(Address object) {
			delete(new Address[] { object });
		}
		
		final int deleteAll(InternalQueryCriteria criteria) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if (isDebug) LOGGER.debug("Executing deleteAll");
		
			final String criteriaStr = criteria.getCriteria();
			session.preExecuteDeleteMany(test.model.test.TestPackage.eINSTANCE.getAddress());
		
			// build delete query
			String deleteQuery;
			if( session.getDatabaseSupport().isDefaultLowerCase() ) {
				deleteQuery = "DELETE FROM \"address\"";
			} else {
				deleteQuery = "DELETE FROM \"ADDRESS\"";
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
		
		@Override
		public final void deleteAll() {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("deleteAll()");
			}
		
			if( session.getTransaction() == null ) {
				throw new PersistanceException("You can only modify data while in a transaction");
			}
		
			session.preExecuteDeleteMany(test.model.test.TestPackage.eINSTANCE.getAddress());
		
			// we need to clean up the session
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterAllObjectsAfterTx(test.model.test.TestPackage.eINSTANCE.getAddress()));
		
			final Connection connection = session.checkoutConnection();
			try {
		
				// find all object ids
				String objectIdSQL;
		
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					objectIdSQL = "SELECT \"id\" FROM \"address\"";
				} else {
					objectIdSQL = "SELECT \"ID\" FROM \"ADDRESS\"";
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
					sql = "DELETE FROM \"address\"";
				} else {
					sql = "DELETE FROM \"ADDRESS\"";
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
		
		@Override
		public void deleteById(Object... id) {
			deleteById(Arrays.asList(id));
		}
		
		public final void deleteById(List<Object> objectIds) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("deleteById("+objectIds+")");
			}
		
			if( session.getTransaction() == null ) {
				throw new PersistanceException("You can only modify data while in a transaction");
			}
			final EClass eClass = test.model.test.TestPackage.eINSTANCE.getAddress();
			session.preExecuteDeleteById(eClass,objectIds);
		
			for(Object id : objectIds) {
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterObjectByIdAfterTx(eClass, id));
			}
		
			final Connection connection = session.checkoutConnection();
			try {
		
		
				// building query begin
				final StringBuilder sqlBuilder = new StringBuilder();
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sqlBuilder.append("DELETE FROM \"address\" WHERE \"id\" IN (");
				} else {
					sqlBuilder.append("DELETE FROM \"ADDRESS\" WHERE \"ID\" IN (");
				}
				
				Iterator<Object> sqlobjectIdsIterator = objectIds.iterator();
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
						Iterator<Object> stmtParamIt = objectIds.iterator();
								while (stmtParamIt.hasNext()) {
									final Object obj = stmtParamIt.next();
									if (isDebug) {
										LOGGER.debug(" With Parameter " + sqlobjectIdsIdx + ": " + obj);
									}
									stmt.setLong(sqlobjectIdsIdx, (Long)obj);
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
		
		@Override
		public final void delete(Address... object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("delete("+Arrays.toString(object)+")");
			}
		
			List<Object> ids = new ArrayList<Object>();
			for (Address o : object) {
				ids.add(getPrimaryKeyValue(o));
			}
			deleteById(ids);
		
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
			if(eo instanceof Address) {
				test.model.test.Address target = (test.model.test.Address)eo;
				switch(f.getFeatureID()) {
				  // person
				  case test.model.test.TestPackage.ADDRESS__PERSON: {
				    {
				      EClass eClass = test.model.test.TestPackage.eINSTANCE.getPerson();
				      test.model.test.Person o = session.getCache().getObject(eClass, ((ProxyData_Address)proxyData).person);
				      if( o == null ) {
				        o = session.createMapper(test.model.emap.test.PersonMapper.class).selectById(((ProxyData_Address)proxyData).person);
				      } else {
				        if( LOGGER.isDebugEnabled() ) {
				          LOGGER.debug("Using cached version");
				        }
				      }
				    
				      if (o != null) {
				      	target.setPerson(o);
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
			return "ADDRESS";
		}

		private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
		private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
		private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
		private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();
		private static Set<EReference> REFERENCE_FORCEDFK = new HashSet<EReference>();
		private static Map<String,Class<? extends at.bestsolution.persistence.ObjectMapper>> REFERENCE_MAPPER = new HashMap<String,Class<? extends at.bestsolution.persistence.ObjectMapper>>();

		static {
			PROPERTY_COL_MAPPING.put("id","ID");
			PROPERTY_COL_MAPPING.put("street","STREET");
			PROPERTY_COL_MAPPING.put("person","FK_PERSON");
			TYPE_MAPPING.put("id",JDBCType.LONG);
			TYPE_MAPPING.put("street",JDBCType.STRING);
			TYPE_MAPPING.put("person",JDBCType.LONG);
			REF_ID_FEATURES.put("person",test.model.test.TestPackage.eINSTANCE.getPerson_Id());
			REFERENCE_MAPPER.put("person",test.model.emap.test.PersonMapper.class);
			REFERENCE_FEATURES.add(test.model.test.TestPackage.eINSTANCE.getAddress_Person());
		}

		public EClass getEClass() {
			return test.model.test.TestPackage.eINSTANCE.getAddress();
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


		public final String getLockColumn() {
			return session.getDatabaseSupport().isDefaultLowerCase() ? "e_version" : "E_VERSION";
		}

		public final String getColumnName(String propertyName) {
			if( propertyName.contains(".") ) {
				String[] segs = Util.splitOfSegment(propertyName);
				return createMapperForReference(segs[0]).getColumnName(segs[1]);
			}
			return PROPERTY_COL_MAPPING.get(propertyName);
		}

		public final <M extends at.bestsolution.persistence.ObjectMapper<?>> M createMapperForReference(String propertyName) {
			return (M) session.createMapper(REFERENCE_MAPPER.get(propertyName));
		}

		public final JDBCType getJDBCType(String propertyName) {
			if( propertyName.contains(".") ) {
				String[] segs = Util.splitOfSegment(propertyName);
				at.bestsolution.persistence.java.JavaObjectMapper<?> m = createMapperForReference(segs[0]);
				return m.getJDBCType(segs[1]);
			}
			return TYPE_MAPPING.get(propertyName);
		}

		public final EStructuralFeature getReferenceId(String property) {
			return REF_ID_FEATURES.get(property);
		}

		public final Set<EReference> getReferenceFeatures() {
			return Collections.unmodifiableSet(REFERENCE_FEATURES);
		}

		public final <P> P getPrimaryKeyValue(Address o) {
			return (P)(Object)o.getId();
		}

		protected final <P> P getPrimaryKeyForTx(Address o) {
			return session.getPrimaryKey(this, o);
		}

		protected final long getVersionForTx(Address o) {
			return session.getVersion(this, o);
		}
	}

public final NamedQuery<test.model.test.Address> createNamedQuery(final JavaSession session, String name) {
	if( "selectById".equals(name) ) {
		return new NamedQuery<test.model.test.Address>() {
			public final List<test.model.test.Address> queryForList(Object... parameters) {
				throw new UnsupportedOperationException("This is a single value query");
			}

			public final test.model.test.Address queryForOne(Object... parameters) {
				return createMapper(session).selectById(((Long)parameters[0]).longValue());
			}

			public final String[] getParameterNames() {
				String[] rv = new String[1];
				int i = 0;
				rv[i++] = "id";
				return rv;
			}
		};
	}
	if( "selectAllForPerson".equals(name) ) {
		return new NamedQuery<test.model.test.Address>() {
			public final List<test.model.test.Address> queryForList(Object... parameters) {
				return createMapper(session).selectAllForPerson(((Long)parameters[0]).longValue());
			}

			public final test.model.test.Address queryForOne(Object... parameters) {
				throw new UnsupportedOperationException("This is a list value query");
			}

			public final String[] getParameterNames() {
				String[] rv = new String[1];
				int i = 0;
				rv[i++] = "personId";
				return rv;
			}
		};
	}
	throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
}

public final MappedQuery<Address> mappedQuery(JavaSession session, String name) {
	throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
}

final static class ProxyData_Address {
  public final long person;
  public ProxyData_Address(long person) {
    this.person = person;
  }
}
}
