package test.model.emap.test.java;

import test.model.emap.test.PlaceMapper;
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
import test.model.test.Place;
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
public final class PlaceMapperFactory implements ObjectMapperFactory<test.model.emap.test.PlaceMapper,Place> {
	@Override
	public Class<Place> getEntityType() {
		return Place.class;
	}

	@Override
	public Class<test.model.emap.test.PlaceMapper> getMapperType() {
		return test.model.emap.test.PlaceMapper.class;
	}

	@Override
	public test.model.emap.test.PlaceMapper createMapper(JavaSession session) {
		return new PlaceMapperImpl(session);
	}

	final static class PlaceMapperImpl implements PlaceMapper, at.bestsolution.persistence.java.JavaObjectMapper<Place>,at.bestsolution.persistence.java.RefreshableObjectMapper<Place>, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(PlaceMapperImpl.class);
		private static MetaData META_DATA;

		public PlaceMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public Class<Place> getEntityType() {
			return Place.class;
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
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"place\" WHERE \"id\" = ?");
					} else {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"PLACE\" WHERE \"ID\" = ?");
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
		public final at.bestsolution.persistence.MappedUpdateQuery<Place> deleteAllMappedQuery() {
			MappedUpdateQuery<Place> deleteQuery = session.getDatabaseSupport().createMappedUpdateQuery(this, null,
				new UpdateDelegate<Place>() { public int execute(MappedUpdateQuery<Place> criteria) { return deleteAll((InternalQueryCriteria)criteria); } }
			);
			return deleteQuery;
		}

		// by JavaObjectMapperGenerator
		public final Place map_default_Place(Connection connection, ResultSet set) throws SQLException {
			Long id = set.getLong("ID");
			final EClass eClass = test.model.test.TestPackage.eINSTANCE.getPlace();
			Place rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				if( LOGGER.isDebugEnabled() ) {
					LOGGER.debug("Using cached version");
				}
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			((EObject)rv).eSetDeliver(false);
			rv.setId(set.getLong("ID"));
			rv.setName(set.getString("NAME"));
			((LazyEObject)rv).setProxyDelegate(this);
			((EObject)rv).eSetDeliver(true);
			session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
			return rv;
		}

		private final void map_default_Place_data_refresh(Place rv, Connection connection, ResultSet set) throws SQLException {
			rv.setId(set.getLong("ID"));
			rv.setName(set.getString("NAME"));
		}

		private final void map_default_Place_complete_refresh(Place rv, Connection connection, ResultSet set, Set<Object> refreshedObjects) throws SQLException {
			rv.setId(set.getLong("ID"));
			rv.setName(set.getString("NAME"));
			((LazyEObject)rv).setProxyDelegate(this);
			{
				EObject eo = (EObject)rv;
				EReference r = (EReference)eo.eClass().getEStructuralFeature("likedBy");
				if( ((LazyEObject)rv).isResolved(r) ) {
					test.model.emap.test.PersonMapper m = session.createMapper(test.model.emap.test.PersonMapper.class);
					RefreshableObjectMapper<test.model.test.Person> mr = (RefreshableObjectMapper<test.model.test.Person>)m;
					List<test.model.test.Person> list = m.selectAllForPlace(((Number)getPrimaryKeyValue(rv)).longValue());
					Util.syncLists(rv.getLikedBy(), list);
					for( test.model.test.Person e : rv.getLikedBy() ) {
						if( ! refreshedObjects.contains(e) ) {
							mr.refreshWithReferences(e,refreshedObjects);
						}
					}
				}
			}
		}

			// Utilities
			
			private List<Object> extractObjectIds(Place... object) {
				List<Object> objectIds = new ArrayList<Object>();
				for (Place o : object) {
					objectIds.add(getPrimaryKeyForTx(o));
				}
				return objectIds;
			}
			
			// Utility Methods
			
			
			// helpers for many to many relations
			private final void clearManyToMany_LikedBy(Connection connection, Place... object) throws SQLException {
				clearManyToManyById_LikedBy(connection, extractObjectIds(object));
			}
			
			private final void clearManyToManyById_LikedBy(Connection connection, List<Object> objectIds) throws SQLException {
				final boolean isDebug = LOGGER.isDebugEnabled();
				if( isDebug ) {
					LOGGER.debug("clear many to many LikedBy for "+objectIds);
				}
			
				if (objectIds.isEmpty()) {
					if( isDebug ) {
						LOGGER.debug("nothing to clear.");
					}
					return;
				}
			
				final StringBuilder b = new StringBuilder();
				Iterator<Object> it = objectIds.iterator();
				while (it.hasNext()) {
					it.next();
					b.append("?");
					if (it.hasNext()) {
						b.append(", ");
					}
				}
				
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"likes_person_place\" WHERE \"fk_place\" IN ("+b.toString()+")";
				} else {
					sql = "DELETE FROM \"LIKES_PERSON_PLACE\" WHERE \"FK_PLACE\" IN ("+b.toString()+")";
				}
			
				if (isDebug) {
					LOGGER.debug("Executing Query: " + sql);
				}
			
				PreparedStatement stmt = null;
				try {
					stmt = connection.prepareStatement(sql);
					int idx = 1;
					it = objectIds.iterator();
					while (it.hasNext()) {
						final Object obj = it.next();
						if (isDebug) {
							LOGGER.debug(" With Parameter " + idx + ": " + obj);
						}
						stmt.setLong(idx, (Long)obj);
						idx++;
					}
					stmt.execute();
				}
				finally {
					if (stmt != null) {
						stmt.close();
					}
				}
			}
			private final void clearManyToMany_LikedBy_ForAll(Connection connection) throws SQLException {
				final boolean isDebug = LOGGER.isDebugEnabled();
				if( isDebug ) {
					LOGGER.debug("clear many to many LikedBy for all");
				}
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"likes_person_place\"";
				} else {
					sql = "DELETE FROM \"LIKES_PERSON_PLACE\"";
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
			}
			private final RelationSQL createDeleteManyToManyRelationSQL_likedBy(final JavaSession session, final Connection c, final Place self, final test.model.test.Person opposite) {
				final String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"likes_person_place\" WHERE \"fk_place\" = ? AND \"fk_person\" = ?";
				} else {
					sql = "DELETE FROM \"LIKES_PERSON_PLACE\" WHERE \"FK_PLACE\" = ? AND \"FK_PERSON\" = ?";
				}
					return new RelationSQL() {
						public EObject getSelf() {
							return (EObject)self;
						}
			
						public String getTableName() {
							return "LIKES_PERSON_PLACE";
						}
			
						public EObject getOpposite() {
							return (EObject)opposite;
						}
			
						public void execute() throws PersistanceException {
							boolean isDebug = LOGGER.isDebugEnabled();
							final test.model.emap.test.PlaceMapper selfMapper = session.createMapper(test.model.emap.test.PlaceMapper.class);
							final test.model.emap.test.PersonMapper oppositeMapper = session.createMapper(test.model.emap.test.PersonMapper.class);
							final Object selfId = session.getPrimaryKey(selfMapper, self);
							final Object oppositeId = session.getPrimaryKey(oppositeMapper, opposite);
							if( isDebug ) {
								LOGGER.debug("Started deleteing relation");
								LOGGER.debug("Executing Relation SQL: " + sql);
								LOGGER.debug("Parameter: " + selfId + ", " + oppositeId);
							}
			
							PreparedStatement pstmt = null;
							try {
								pstmt = c.prepareStatement(sql);
								pstmt.setLong(1, (Long) selfId);
								pstmt.setLong(2, (Long) oppositeId);
								pstmt.execute();
								if( isDebug ) {
									LOGGER.debug("Finished deleteing relation");
								}
								} catch(Exception e) {
									if( pstmt != null ) {
										try {
											pstmt.close();
									} catch(SQLException e1) {
										LOGGER.error("Unable to close prepared statement", e1);
									}
								}
								throw new PersistanceException(e);
							}
						}
			
					public Action getAction() {
						return Action.DELETE;
					}
				};
			}
			private final RelationSQL createInsertManyToManyRelationSQL_likedBy(final JavaSession session, final Connection c, final Place self, final test.model.test.Person opposite) {
				final String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "INSERT INTO \"likes_person_place\" (\"fk_place\",\"fk_person\") VALUES (?,?)";
				} else {
					sql = "INSERT INTO \"LIKES_PERSON_PLACE\" (\"FK_PLACE\",\"FK_PERSON\") VALUES (?,?)";
				}
					return new RelationSQL() {
						public EObject getSelf() {
							return (EObject)self;
						}
			
						public EObject getOpposite() {
							return (EObject)opposite;
						}
			
						public String getTableName() {
							return "LIKES_PERSON_PLACE";
						}
			
						public void execute() throws PersistanceException {
							boolean isDebug = LOGGER.isDebugEnabled();
							final test.model.emap.test.PlaceMapper selfMapper = session.createMapper(test.model.emap.test.PlaceMapper.class);
							final test.model.emap.test.PersonMapper oppositeMapper = session.createMapper(test.model.emap.test.PersonMapper.class);
							final Object selfId = session.getPrimaryKey(selfMapper, self);
							final Object oppositeId = session.getPrimaryKey(oppositeMapper, opposite);
							if( isDebug ) {
								LOGGER.debug("Started creating relation");
								LOGGER.debug("Executing Relation Insert SQL: " + sql);
								LOGGER.debug("Parameter: " + selfId + ", " + oppositeId);
							}
							PreparedStatement pstmt = null;
							try {
								pstmt = c.prepareStatement(sql);
								pstmt.setLong(1, (Long) selfId);
								pstmt.setLong(2, (Long) oppositeId);
			
								pstmt.execute();
								if( isDebug ) {
								LOGGER.debug("Finished creating relation");
								}
							} catch( Exception e ) {
								if( pstmt != null ) {
								try {
									pstmt.close();
								} catch(SQLException e1) {
									LOGGER.error("Unable to close prepared statement", e1);
								}
							}
							throw new PersistanceException(e);
						}
					}
			
					public Action getAction() {
						return Action.INSERT;
					}
				};
			}
			private final RelationSQL createClearManyToManyRelationSQL_likedBy(final JavaSession session, final Connection c, final Place self) {
				final String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"likes_person_place\" WHERE \"fk_place\" = ?";
				} else {
					sql = "DELETE FROM \"LIKES_PERSON_PLACE\" WHERE \"FK_PLACE\" = ?";
				}
				
				return new RelationSQL() {
					public EObject getSelf() {
						return (EObject)self;
					}
			
					public EObject getOpposite() {
						return null;
					}
			
					public String getTableName() {
						return "LIKES_PERSON_PLACE";
					}
			
					public void execute() throws PersistanceException {
						boolean isDebug = LOGGER.isDebugEnabled();
						final test.model.emap.test.PlaceMapper selfMapper = session.createMapper(test.model.emap.test.PlaceMapper.class);
						final Object selfId = session.getPrimaryKey(selfMapper, self);
						if( isDebug ) {
							LOGGER.debug("Started clearing relation");
							LOGGER.debug("Executing Relation SQL: " + sql);
							LOGGER.debug("Parameter: " + selfId );
						}
			
						PreparedStatement pstmt = null;
						try {
							pstmt = c.prepareStatement(sql);
							pstmt.setLong(1, (Long) selfId);
							pstmt.execute();
							if( isDebug ) {
								LOGGER.debug("Finished clearing relation");
							}
						} catch(Exception e) {
							if( pstmt != null ) {
								try {
									pstmt.close();
								} catch(SQLException e1) {
									LOGGER.error("Unable to close prepared statement", e1);
								}
							}
							throw new PersistanceException(e);
						}
					}
			
					public Action getAction() {
						return Action.DELETE_ALL;
					}
				};
			}

		// by QueryGenerator
		@Override
		public final test.model.test.Place selectById(final long id) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Check id cache for object");
			{
				final EClass eClass = test.model.test.TestPackage.eINSTANCE.getPlace();
				final Place rv = session.getCache().getObject(eClass,id);
				if( rv != null ) {
					if( isDebug ) LOGGER.debug("Using cached object");
					return rv;
				}
			}
			if( isDebug ) LOGGER.debug("Executing selectById");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Place_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Place_selectById_default.sql");
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
		
			final Place rv;
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping result started");
			if( set.next() ) {
				rv = map_default_Place(connection,set);
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
		public final java.util.List<test.model.test.Place> selectAllForPerson(final long personId) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Executing selectAllForPerson");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Place_selectAllForPerson_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Place_selectAllForPerson_default.sql");
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
		
			final List<Place> rv = new ArrayList<Place>();
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping results started");
			while(set.next()) {
				rv.add(map_default_Place(connection, set));
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
		public final void refresh(final Place object, final at.bestsolution.persistence.Session.RefreshType refreshType) {
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
		
		public final void refreshWithReferences(final Place object, Set<Object> refreshedObjects) {
			if( ! (object instanceof LazyEObject) ) {
				LOGGER.error("Unable to refresh object '"+object+"' not loaded from database");
				return;
			}
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Place_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Place_selectById_default.sql");
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
					map_default_Place_complete_refresh(object,connection,set,refreshedObjects);
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
		
		private final void refreshDataOnly(final Place object, boolean updateVersion) {
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "Place_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "Place_selectById_default.sql");
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
					map_default_Place_data_refresh(object,connection,set);
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
		public final void update(final Place object) {
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
			at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"PLACE").createUpdateStatement("ID", getLockColumn());
			// NEW:
			// simple direct mapped attributes
			// * name
			stmt.addString("NAME", (java.lang.String)session.getTransactionAttribute(object,test.model.test.TestPackage.eINSTANCE.getPlace_Name()));
		
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
		
		
				// update many to many references
				// * likedBy
				{
					JavaSession.ChangeDescription delta = null;
					List<JavaSession.ChangeDescription> changes = session.getChangeDescription(object);
					for (JavaSession.ChangeDescription change : changes) {
						if (change.getFeature() == test.model.test.TestPackage.eINSTANCE.getPlace_LikedBy()) {
							delta = change;
							break;
						}
					}
		
					if (delta != null) {
						final test.model.emap.test.PersonMapper oppositeMapper = session.createMapper(test.model.emap.test.PersonMapper.class);
						if (isDebug) {
							LOGGER.debug("delta: additions=" + delta.getAdditions().size() + " and removals=" + delta.getRemovals().size());
							LOGGER.trace("additions: " + delta.getAdditions());
							LOGGER.trace("removals: " + delta.getRemovals());
						}
		
						for (Object addition : delta.getAdditions()) {
							final Object oppositePK = oppositeMapper.getPrimaryKeyValue((test.model.test.Person)addition);
							// TODO test for new object?
							session.scheduleRelationSQL(createInsertManyToManyRelationSQL_likedBy(session, connection, object, (test.model.test.Person)addition));
						}
		
						for (Object removal : delta.getRemovals()) {
							final Object oppositePK = oppositeMapper.getPrimaryKeyValue((test.model.test.Person)removal);
							// TODO test for new object?
							session.scheduleRelationSQL(createDeleteManyToManyRelationSQL_likedBy(session, connection, object, (test.model.test.Person)removal));
						}
		
					}
					else {
						if (isDebug) {
							LOGGER.debug("no delta recorded => nothing to update for likedBy");
						}
					}
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
		public final void insert(final Place object) {
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
				sequenceExpression = "NEXT VALUE FOR SEQ_PLACE_ID";
			}
			if( "Postgres".equals(session.getDatabaseType()) ) {
				sequenceExpression = null;
			}
			// Build the SQL
			at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"PLACE").createInsertStatement("ID", sequenceExpression, getLockColumn());
		
		
			// handle simple direct mapped attributes
			// * name
			{
				Object o = session.getTransactionAttribute(object,test.model.test.TestPackage.eINSTANCE.getPlace_Name());
				if( o != null ) {
					stmt.addString("NAME", (java.lang.String)o);
				}
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
		
		
				// handle many to many references
				// likedBy
				for(test.model.test.Person e : object.getLikedBy()) {
					session.scheduleRelationSQL(createInsertManyToManyRelationSQL_likedBy(session, connection, object, e));
				}
		
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.RegisterObjectAfterTx(object, primaryKey, getLockColumn() != null ? 0 : -1));
			} catch(SQLException e) {
				throw new PersistanceException(e);
			} finally {
				session.returnConnection(connection);
			}
		}

		// delete stuff
		@Override
		public final void delete(Place object) {
			delete(new Place[] { object });
		}
		
		final int deleteAll(InternalQueryCriteria criteria) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if (isDebug) LOGGER.debug("Executing deleteAll");
		
			final String criteriaStr = criteria.getCriteria();
			session.preExecuteDeleteMany(test.model.test.TestPackage.eINSTANCE.getPlace());
		
			// build delete query
			String deleteQuery;
			if( session.getDatabaseSupport().isDefaultLowerCase() ) {
				deleteQuery = "DELETE FROM \"place\"";
			} else {
				deleteQuery = "DELETE FROM \"PLACE\"";
			}
		
			if (isDebug) LOGGER.debug("Plain delete query: " + deleteQuery);
			if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
				deleteQuery += " WHERE " + criteriaStr;
			}
			if (isDebug) LOGGER.debug("Final delete query: " + deleteQuery);
		
			Connection connection = session.checkoutConnection();
			try {
				// build select query
				String selectQuery = "SELECT ID FROM \"PLACE\"";
				if (isDebug) LOGGER.debug("Plain Select query: " + selectQuery);
				if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
					selectQuery += " WHERE " + criteriaStr;
				}
				if (isDebug) LOGGER.debug("Final select query: " + selectQuery);
		
				// execute select
				List<Object> objectIds = new ArrayList<Object>();
				PreparedStatement pstmtSelect = null;
				ResultSet resultSetSelect = null;
				try {
					pstmtSelect = connection.prepareStatement(selectQuery);
					int idx = 1;
					for(TypedValue t : criteria.getParameters()) {
						Util.setValue(pstmtSelect, idx++, t);
					}
		
					resultSetSelect = pstmtSelect.executeQuery();
					while (resultSetSelect.next()) {
						objectIds.add(resultSetSelect.getLong("ID"));
					}
				}
				finally {
					if (resultSetSelect != null) {
						resultSetSelect.close();
					}
					if (pstmtSelect != null) {
						pstmtSelect.close();
					}
				}
		
				// execute clear many to many relations
				clearManyToManyById_LikedBy(connection, objectIds);
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
		
			session.preExecuteDeleteMany(test.model.test.TestPackage.eINSTANCE.getPlace());
		
			// we need to clean up the session
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterAllObjectsAfterTx(test.model.test.TestPackage.eINSTANCE.getPlace()));
		
			final Connection connection = session.checkoutConnection();
			try {
		
				// find all object ids
				String objectIdSQL;
		
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					objectIdSQL = "SELECT \"id\" FROM \"place\"";
				} else {
					objectIdSQL = "SELECT \"ID\" FROM \"PLACE\"";
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
		
		
				clearManyToMany_LikedBy_ForAll(connection);
		
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"place\"";
				} else {
					sql = "DELETE FROM \"PLACE\"";
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
			final EClass eClass = test.model.test.TestPackage.eINSTANCE.getPlace();
			session.preExecuteDeleteById(eClass,objectIds);
		
			for(Object id : objectIds) {
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterObjectByIdAfterTx(eClass, id));
			}
		
			final Connection connection = session.checkoutConnection();
			try {
		
				// handle many to many attributes
				clearManyToManyById_LikedBy(connection, objectIds);
		
				// building query begin
				final StringBuilder sqlBuilder = new StringBuilder();
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sqlBuilder.append("DELETE FROM \"place\" WHERE \"id\" IN (");
				} else {
					sqlBuilder.append("DELETE FROM \"PLACE\" WHERE \"ID\" IN (");
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
		public final void delete(Place... object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("delete("+Arrays.toString(object)+")");
			}
		
			List<Object> ids = new ArrayList<Object>();
			for (Place o : object) {
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
			if(eo instanceof Place) {
				test.model.test.Place target = (test.model.test.Place)eo;
				switch(f.getFeatureID()) {
				  // likedBy
				  case test.model.test.TestPackage.PLACE__LIKED_BY: {
				    target.getLikedBy().addAll(session.createMapper(test.model.emap.test.PersonMapper.class).selectAllForPlace(target.getId()));
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
			return "PLACE";
		}

		private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
		private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
		private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
		private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();
		private static Set<EReference> REFERENCE_FORCEDFK = new HashSet<EReference>();
		private static Map<String,Class<? extends at.bestsolution.persistence.ObjectMapper>> REFERENCE_MAPPER = new HashMap<String,Class<? extends at.bestsolution.persistence.ObjectMapper>>();

		static {
			PROPERTY_COL_MAPPING.put("id","ID");
			PROPERTY_COL_MAPPING.put("name","NAME");
			TYPE_MAPPING.put("id",JDBCType.LONG);
			TYPE_MAPPING.put("name",JDBCType.STRING);
			REFERENCE_MAPPER.put("likedBy",test.model.emap.test.PersonMapper.class);
		}

		public EClass getEClass() {
			return test.model.test.TestPackage.eINSTANCE.getPlace();
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

		public final <P> P getPrimaryKeyValue(Place o) {
			return (P)(Object)o.getId();
		}

		protected final <P> P getPrimaryKeyForTx(Place o) {
			return session.getPrimaryKey(this, o);
		}

		protected final long getVersionForTx(Place o) {
			return session.getVersion(this, o);
		}
	}

public final NamedQuery<test.model.test.Place> createNamedQuery(final JavaSession session, String name) {
	if( "selectById".equals(name) ) {
		return new NamedQuery<test.model.test.Place>() {
			public final List<test.model.test.Place> queryForList(Object... parameters) {
				throw new UnsupportedOperationException("This is a single value query");
			}

			public final test.model.test.Place queryForOne(Object... parameters) {
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
		return new NamedQuery<test.model.test.Place>() {
			public final List<test.model.test.Place> queryForList(Object... parameters) {
				return createMapper(session).selectAllForPerson(((Long)parameters[0]).longValue());
			}

			public final test.model.test.Place queryForOne(Object... parameters) {
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

public final MappedQuery<Place> mappedQuery(JavaSession session, String name) {
	throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
}

}
