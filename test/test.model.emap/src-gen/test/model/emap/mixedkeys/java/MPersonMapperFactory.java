package test.model.emap.mixedkeys.java;

import test.model.emap.mixedkeys.MPersonMapper;
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
import test.model.mixedkeys.Person;
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
public final class MPersonMapperFactory implements ObjectMapperFactory<test.model.emap.mixedkeys.MPersonMapper,Person> {
	
	@Override
	public Class<Person> getEntityType() {
		return Person.class;
	}

	@Override
	public Class<test.model.emap.mixedkeys.MPersonMapper> getMapperType() {
		return test.model.emap.mixedkeys.MPersonMapper.class;
	}

	@Override
	public test.model.emap.mixedkeys.MPersonMapper createMapper(JavaSession session) {
		return new MPersonMapperImpl(session);
	}

	final static class MPersonMapperImpl implements MPersonMapper, at.bestsolution.persistence.java.JavaObjectMapper<Person>,at.bestsolution.persistence.java.RefreshableObjectMapper<Person>, ResolveDelegate {
		private final JavaSession session;
		private boolean inAutoResolve;
		private static final Logger LOGGER = Logger.getLogger(MPersonMapperImpl.class);
		private static MetaData META_DATA;

		public MPersonMapperImpl(JavaSession session) {
			this.session = session;
		}

		@Override
		public Class<Person> getEntityType() {
			return Person.class;
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
		public <K extends at.bestsolution.persistence.Key<Person>> long selectVersion(K id) {
			final Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				try {
					if( session.getDatabaseSupport().isDefaultLowerCase() ) {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"mperson\" WHERE \"(\"id\" = ?)");
					} else {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"MPERSON\" WHERE \"(\"ID\" = ?)");
					}
					pStmt.setString(1, (String) id.getValue("id"));

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
		public final at.bestsolution.persistence.MappedUpdateQuery<Person> deleteAllMappedQuery() {
			MappedUpdateQuery<Person> deleteQuery = session.getDatabaseSupport().createMappedUpdateQuery(this, null,
				new UpdateDelegate<Person>() { public int execute(MappedUpdateQuery<Person> criteria) { return deleteAll((InternalQueryCriteria)criteria); } }
			);
			return deleteQuery;
		}

		// by JavaObjectMapperGenerator
		public final Person map_default_Person(Connection connection, ResultSet set) throws SQLException {
			Key id = Util.extractKey(PKLayout, set);
			final EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson();
			Person rv = session.getCache().getObject(eClass,id);
			if( rv != null ) {
				if( LOGGER.isDebugEnabled() ) {
					LOGGER.debug("Using cached version");
				}
				return rv;
			}
			rv = session.getProxyFactory().createProxy(eClass);
			((EObject)rv).eSetDeliver(false);
			rv.setId(set.getString("ID"));
			rv.setName(set.getString("NAME"));
			((LazyEObject)rv).setProxyDelegate(this);
			((EObject)rv).eSetDeliver(true);
			session.registerObject(rv, getPrimaryKey(rv), getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
			return rv;
		}
		
		// by JavaObjectMapperGenerator
		private final void map_default_Person_data_refresh(Person rv, Connection connection, ResultSet set) throws SQLException {
			rv.setId(set.getString("ID"));
			rv.setName(set.getString("NAME"));
		}

		// by JavaObjectMapperGenerator
		private final void map_default_Person_complete_refresh(Person rv, Connection connection, ResultSet set, Set<Object> refreshedObjects) throws SQLException {
			rv.setId(set.getString("ID"));
			rv.setName(set.getString("NAME"));
			((LazyEObject)rv).setProxyDelegate(this);
			{
				EObject eo = (EObject)rv;
				EReference r = (EReference)eo.eClass().getEStructuralFeature("addresses");
				if( ((LazyEObject)rv).isResolved(r) ) {
					test.model.emap.mixedkeys.MAddressMapper m = session.createMapper(test.model.emap.mixedkeys.MAddressMapper.class);
					RefreshableObjectMapper<test.model.mixedkeys.Address> mr = (RefreshableObjectMapper<test.model.mixedkeys.Address>)m;
					List<test.model.mixedkeys.Address> list = m.selectAllForPerson((String)getPrimaryKey(rv).getValue("id"));
					Util.syncLists(rv.getAddresses(), list);
					for( test.model.mixedkeys.Address e : rv.getAddresses() ) {
						if( ! refreshedObjects.contains(e) ) {
							mr.refreshWithReferences(e,refreshedObjects);
						}
					}
				}
			}
			{
				EObject eo = (EObject)rv;
				EReference r = (EReference)eo.eClass().getEStructuralFeature("likes");
				if( ((LazyEObject)rv).isResolved(r) ) {
					test.model.emap.mixedkeys.MPlaceMapper m = session.createMapper(test.model.emap.mixedkeys.MPlaceMapper.class);
					RefreshableObjectMapper<test.model.mixedkeys.Place> mr = (RefreshableObjectMapper<test.model.mixedkeys.Place>)m;
					List<test.model.mixedkeys.Place> list = m.selectAllForPerson((String)getPrimaryKey(rv).getValue("id"));
					Util.syncLists(rv.getLikes(), list);
					for( test.model.mixedkeys.Place e : rv.getLikes() ) {
						if( ! refreshedObjects.contains(e) ) {
							mr.refreshWithReferences(e,refreshedObjects);
						}
					}
				}
			}
		}

			// Utilities
			
			private List<Key> extractObjectIds(Person... object) {
				List<Key> objectIds = new ArrayList<>();
				for (Person o : object) {
					objectIds.add((Key) getPrimaryKeyForTx(o));
				}
				return objectIds;
			}
			
			// Utility Methods
			
			
			// helpers for many to many relations
			private final void clearManyToMany_Likes(Connection connection, Person... object) throws SQLException {
				clearManyToManyById_Likes(connection, extractObjectIds(object));
			}
			
			private final void clearManyToManyById_Likes(Connection connection, List<Key> objectIds) throws SQLException {
				final boolean isDebug = LOGGER.isDebugEnabled();
				if( isDebug ) {
					LOGGER.debug("clear many to many Likes for "+objectIds);
				}
			
				if (objectIds.isEmpty()) {
					if( isDebug ) {
						LOGGER.debug("nothing to clear.");
					}
					return;
				}
			
				final StringBuilder b = new StringBuilder();
				Iterator<Key> it = objectIds.iterator();
				while (it.hasNext()) {
					it.next();
					b.append("?");
					if (it.hasNext()) {
						b.append(", ");
					}
				}
				
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"mlikes_person_place\" WHERE \"fk_person\" IN ("+b.toString()+")";
				} else {
					sql = "DELETE FROM \"MLIKES_PERSON_PLACE\" WHERE \"FK_PERSON\" IN ("+b.toString()+")";
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
						final Key obj = it.next();
						if (isDebug) {
							LOGGER.debug(" With Parameter " + idx + ": " + obj);
						}
						stmt.setString(idx, obj.id());
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
			private final void clearManyToMany_Likes_ForAll(Connection connection) throws SQLException {
				final boolean isDebug = LOGGER.isDebugEnabled();
				if( isDebug ) {
					LOGGER.debug("clear many to many Likes for all");
				}
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"mlikes_person_place\"";
				} else {
					sql = "DELETE FROM \"MLIKES_PERSON_PLACE\"";
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
			private final RelationSQL createDeleteManyToManyRelationSQL_likes(final JavaSession session, final Connection c, final Person self, final test.model.mixedkeys.Place opposite) {
				final String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"mlikes_person_place\" WHERE \"fk_person\" = ? AND \"fk_place\" = ?";
				} else {
					sql = "DELETE FROM \"MLIKES_PERSON_PLACE\" WHERE \"FK_PERSON\" = ? AND \"FK_PLACE\" = ?";
				}
					return new RelationSQL() {
						public EObject getSelf() {
							return (EObject)self;
						}
			
						public String getTableName() {
							return "MLIKES_PERSON_PLACE";
						}
			
						public EObject getOpposite() {
							return (EObject)opposite;
						}
			
						public void execute() throws PersistanceException {
							boolean isDebug = LOGGER.isDebugEnabled();
							final test.model.emap.mixedkeys.MPersonMapper selfMapper = session.createMapper(test.model.emap.mixedkeys.MPersonMapper.class);
							final test.model.emap.mixedkeys.MPlaceMapper oppositeMapper = session.createMapper(test.model.emap.mixedkeys.MPlaceMapper.class);
							final test.model.emap.mixedkeys.MPersonMapper.Key selfId = session.getPrimaryKey(selfMapper, self);
							final test.model.emap.mixedkeys.MPlaceMapper.Key oppositeId = session.getPrimaryKey(oppositeMapper, opposite);
							if( isDebug ) {
								LOGGER.debug("Started deleteing relation");
								LOGGER.debug("Executing Relation SQL: " + sql);
								LOGGER.debug("Parameter: " + selfId + ", " + oppositeId);
							}
			
							PreparedStatement pstmt = null;
							try {
								pstmt = c.prepareStatement(sql);
								pstmt.setString(1, selfId.id());
								pstmt.setLong(2, oppositeId.id());
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
			private final RelationSQL createInsertManyToManyRelationSQL_likes(final JavaSession session, final Connection c, final Person self, final test.model.mixedkeys.Place opposite) {
				final String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "INSERT INTO \"mlikes_person_place\" (\"fk_person\",\"fk_place\") VALUES (?,?)";
				} else {
					sql = "INSERT INTO \"MLIKES_PERSON_PLACE\" (\"FK_PERSON\",\"FK_PLACE\") VALUES (?,?)";
				}
					return new RelationSQL() {
						public EObject getSelf() {
							return (EObject)self;
						}
			
						public EObject getOpposite() {
							return (EObject)opposite;
						}
			
						public String getTableName() {
							return "MLIKES_PERSON_PLACE";
						}
			
						public void execute() throws PersistanceException {
							boolean isDebug = LOGGER.isDebugEnabled();
							final test.model.emap.mixedkeys.MPersonMapper selfMapper = session.createMapper(test.model.emap.mixedkeys.MPersonMapper.class);
							final test.model.emap.mixedkeys.MPlaceMapper oppositeMapper = session.createMapper(test.model.emap.mixedkeys.MPlaceMapper.class);
							final test.model.emap.mixedkeys.MPersonMapper.Key selfId = session.getPrimaryKey(selfMapper, self);
							final test.model.emap.mixedkeys.MPlaceMapper.Key oppositeId = session.getPrimaryKey(oppositeMapper, opposite);
							if( isDebug ) {
								LOGGER.debug("Started creating relation");
								LOGGER.debug("Executing Relation Insert SQL: " + sql);
								LOGGER.debug("Parameter: " + selfId + ", " + oppositeId);
							}
							PreparedStatement pstmt = null;
							try {
								pstmt = c.prepareStatement(sql);
								pstmt.setString(1, selfId.id());
								pstmt.setLong(2, oppositeId.id());
			
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
			private final RelationSQL createClearManyToManyRelationSQL_likes(final JavaSession session, final Connection c, final Person self) {
				final String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"mlikes_person_place\" WHERE \"fk_person\" = ?";
				} else {
					sql = "DELETE FROM \"MLIKES_PERSON_PLACE\" WHERE \"FK_PERSON\" = ?";
				}
				
				return new RelationSQL() {
					public EObject getSelf() {
						return (EObject)self;
					}
			
					public EObject getOpposite() {
						return null;
					}
			
					public String getTableName() {
						return "MLIKES_PERSON_PLACE";
					}
			
					public void execute() throws PersistanceException {
						boolean isDebug = LOGGER.isDebugEnabled();
						final test.model.emap.mixedkeys.MPersonMapper selfMapper = session.createMapper(test.model.emap.mixedkeys.MPersonMapper.class);
						final test.model.emap.mixedkeys.MPersonMapper.Key selfId = session.getPrimaryKey(selfMapper, self);
						if( isDebug ) {
							LOGGER.debug("Started clearing relation");
							LOGGER.debug("Executing Relation SQL: " + sql);
							LOGGER.debug("Parameter: " + selfId );
						}
			
						PreparedStatement pstmt = null;
						try {
							pstmt = c.prepareStatement(sql);
							pstmt.setString(1, selfId.id());
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
		public final test.model.mixedkeys.Person selectById(final String id) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Check id cache for object");
			{
				final EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson();
				final Key key = PKLayout.create(Collections.singletonMap("id", (Object) id));
				
				final Person rv = session.getCache().getObject(eClass, key);
				if( rv != null ) {
					if( isDebug ) LOGGER.debug("Using cached object");
					return rv;
				}
			}
			if( isDebug ) LOGGER.debug("Executing selectById");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MPerson_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MPerson_selectById_default.sql");
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
					
						pStmt.setString(paramIndex++,id);
						
						//final Key key = PKLayout.create(Collections.singletonMap("id", (Object) id));
						//Util.setKeyValue(pStmt, paramIndex++, PKLayout, key, "id");
				}
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
			if( isDebug ) LOGGER.debug("Executing query");
			set = pStmt.executeQuery();
		
			final Person rv;
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping result started");
			if( set.next() ) {
				rv = map_default_Person(connection,set);
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
		public final java.util.List<test.model.mixedkeys.Person> selectAllForPlace(final long placeId) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) LOGGER.debug("Executing selectAllForPlace");
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MPerson_selectAllForPlace_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MPerson_selectAllForPlace_default.sql");
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
				if( "placeId".equals(processedSQL.dynamicParameterNames.get(i)) ) {
					if( isDebug ) {
						debugParams.add("placeId = " + placeId);
					}
						// DAMN THIS ONE
					
						pStmt.setLong(paramIndex++,placeId);
						
						//final Key key = PKLayout.create(Collections.singletonMap("placeId", (Object) placeId));
						//Util.setKeyValue(pStmt, paramIndex++, PKLayout, key, "placeId");
				}
			}
			if( isDebug ) {
				LOGGER.debug(" Dynamic-Parameters: " + debugParams);
			}
			if( isDebug ) LOGGER.debug("Executing query");
			set = pStmt.executeQuery();
		
			final List<Person> rv = new ArrayList<Person>();
			// by QueryGenerator
			if( isDebug ) LOGGER.debug("Mapping results started");
			while(set.next()) {
				rv.add(map_default_Person(connection, set));
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
		public final void refresh(final Person object, final at.bestsolution.persistence.Session.RefreshType refreshType) {
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
		
		public final void refreshWithReferences(final Person object, Set<Object> refreshedObjects) {
			if( ! (object instanceof LazyEObject) ) {
				LOGGER.error("Unable to refresh object '"+object+"' not loaded from database");
				return;
			}
		
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MPerson_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MPerson_selectById_default.sql");
				}
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				final Key key = getPrimaryKey(object);
				pStmt.setString(1, key.id());
				set = pStmt.executeQuery();
				if( set.next() ) {
					refreshedObjects.add(object);
					map_default_Person_complete_refresh(object,connection,set,refreshedObjects);
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
		
		private final void refreshDataOnly(final Person object, boolean updateVersion) {
			String query;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					query = Util.loadFile(getClass(), "MPerson_selectById_default_lc.sql");
				} else {
					query = Util.loadFile(getClass(), "MPerson_selectById_default.sql");
				}
		
			Connection connection = session.checkoutConnection();
			PreparedStatement pStmt = null;
			ResultSet set = null;
			try {
				final ProcessedSQL processedSQL = Util.processSQL(query);
				pStmt = connection.prepareStatement(processedSQL.sql);
				final Key key = getPrimaryKey(object);
				pStmt.setString(1, key.id());
				set = pStmt.executeQuery();
				if( set.next() ) {
					map_default_Person_data_refresh(object,connection,set);
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
		public final void update(final Person object) {
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
			at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"MPERSON").createUpdateStatement(PKLayout, getLockColumn());
			// NEW:
			// simple direct mapped attributes
			// * name
			stmt.addString("NAME", (java.lang.String)session.getTransactionAttribute(object,test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson_Name()));
		
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
		
		
				// update many to many references
				// * likes
				{
					JavaSession.ChangeDescription delta = null;
					List<JavaSession.ChangeDescription> changes = session.getChangeDescription(object);
					for (JavaSession.ChangeDescription change : changes) {
						if (change.getFeature() == test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson_Likes()) {
							delta = change;
							break;
						}
					}
		
					if (delta != null) {
						final test.model.emap.mixedkeys.MPlaceMapper oppositeMapper = session.createMapper(test.model.emap.mixedkeys.MPlaceMapper.class);
						if (isDebug) {
							LOGGER.debug("delta: additions=" + delta.getAdditions().size() + " and removals=" + delta.getRemovals().size());
							LOGGER.trace("additions: " + delta.getAdditions());
							LOGGER.trace("removals: " + delta.getRemovals());
						}
		
						for (Object addition : delta.getAdditions()) {
							final test.model.emap.mixedkeys.MPlaceMapper.Key oppositePK = oppositeMapper.getPrimaryKey((test.model.mixedkeys.Place)addition);
							//final Object oppositePK = oppositeMapper.getPrimaryKeyValue((test.model.mixedkeys.Place)addition);
							// TODO test for new object?
							session.scheduleRelationSQL(createInsertManyToManyRelationSQL_likes(session, connection, object, (test.model.mixedkeys.Place)addition));
						}
		
						for (Object removal : delta.getRemovals()) {
							final test.model.emap.mixedkeys.MPlaceMapper.Key oppositePK = oppositeMapper.getPrimaryKey((test.model.mixedkeys.Place)removal);
							//final Object oppositePK = oppositeMapper.getPrimaryKeyValue((test.model.mixedkeys.Place)removal);
							// TODO test for new object?
							session.scheduleRelationSQL(createDeleteManyToManyRelationSQL_likes(session, connection, object, (test.model.mixedkeys.Place)removal));
						}
		
					}
					else {
						if (isDebug) {
							LOGGER.debug("no delta recorded => nothing to update for likes");
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
		// by JavaInsertUpdateGenerator
		@Override
		public final void insert(final Person object) {
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
				sequenceExpressions.put("ID","NEXT VALUE FOR SEQ_MPERSON_ID");
			}
			if( "Postgres".equals(session.getDatabaseType()) ) {
			}
			// Build the SQL
			at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder(this,"MPERSON").createInsertStatement(PKLayout, sequenceExpressions, getLockColumn());
		
		
			// handle simple direct mapped attributes
			// * name
			{
				Object o = session.getTransactionAttribute(object,test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson_Name());
				if( o != null ) {
					stmt.addString("NAME", (java.lang.String)o);
				}
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
		
		
				// handle many to many references
				// likes
				for(test.model.mixedkeys.Place e : object.getLikes()) {
					session.scheduleRelationSQL(createInsertManyToManyRelationSQL_likes(session, connection, object, e));
				}
		
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
		public final void delete(Person object) {
			delete(new Person[] { object });
		}
		
		final int deleteAll(InternalQueryCriteria criteria) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if (isDebug) LOGGER.debug("Executing deleteAll");
		
			final String criteriaStr = criteria.getCriteria();
			session.preExecuteDeleteMany(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson());
		
			// build delete query
			String deleteQuery;
			if( session.getDatabaseSupport().isDefaultLowerCase() ) {
				deleteQuery = "DELETE FROM \"mperson\"";
			} else {
				deleteQuery = "DELETE FROM \"MPERSON\"";
			}
		
			if (isDebug) LOGGER.debug("Plain delete query: " + deleteQuery);
			if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
				deleteQuery += " WHERE " + criteriaStr;
			}
			if (isDebug) LOGGER.debug("Final delete query: " + deleteQuery);
		
			Connection connection = session.checkoutConnection();
			try {
				// build select query
				String selectQuery = "SELECT ID FROM \"MPERSON\"";
				if (isDebug) LOGGER.debug("Plain Select query: " + selectQuery);
				if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
					selectQuery += " WHERE " + criteriaStr;
				}
				if (isDebug) LOGGER.debug("Final select query: " + selectQuery);
		
				// execute select
				List<Key> objectIds = new ArrayList<>();
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
						objectIds.add(Util.extractKey(PKLayout, resultSetSelect));
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
				clearManyToManyById_Likes(connection, objectIds);
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
		
			session.preExecuteDeleteMany(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson());
		
			// we need to clean up the session
			session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterAllObjectsAfterTx(test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson()));
		
			final Connection connection = session.checkoutConnection();
			try {
		
				// find all object ids
				String objectIdSQL;
		
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					objectIdSQL = "SELECT \"id\" FROM \"mperson\"";
				} else {
					objectIdSQL = "SELECT \"ID\" FROM \"MPERSON\"";
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
		
		
				clearManyToMany_Likes_ForAll(connection);
		
				String sql;
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sql = "DELETE FROM \"mperson\"";
				} else {
					sql = "DELETE FROM \"MPERSON\"";
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
		public <K extends at.bestsolution.persistence.Key<Person>> void deleteById(K... keys) {
			final List<Key> keyz= new ArrayList<Key>();
			for (at.bestsolution.persistence.Key<Person> key : keys) {
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
			final EClass eClass = test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson();
			session.preExecuteDeleteById(eClass,objectIds);
		
			for(Key id : objectIds) {
				session.scheduleAfterTransaction(new at.bestsolution.persistence.java.UnregisterObjectByIdAfterTx(eClass, id));
			}
		
			final Connection connection = session.checkoutConnection();
			try {
		
				// handle many to many attributes
				clearManyToManyById_Likes(connection, objectIds);
		
				// building query begin
				final StringBuilder sqlBuilder = new StringBuilder();
				if( session.getDatabaseSupport().isDefaultLowerCase() ) {
					sqlBuilder.append("DELETE FROM \"mperson\" WHERE \"id\" IN (");
				} else {
					sqlBuilder.append("DELETE FROM \"MPERSON\" WHERE \"ID\" IN (");
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
							Util.setKeyValue(stmt, sqlobjectIdsIdx, test.model.emap.mixedkeys.MPersonMapper.PKLayout, obj, "id");
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
		public final void delete(Person... object) {
			final boolean isDebug = LOGGER.isDebugEnabled();
			if( isDebug ) {
				LOGGER.debug("delete("+Arrays.toString(object)+")");
			}
		
			List<at.bestsolution.persistence.Key<Person>> keyList = new ArrayList<>();
			for (Person o : object) {
				keyList.add(getPrimaryKey(o));
			}
			
			deleteById(keyList.toArray(new at.bestsolution.persistence.Key[] {}));
		
			//List<Object> ids = new ArrayList<Object>();
			//for (Person o : object) {
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
			if(eo instanceof Person) {
				test.model.mixedkeys.Person target = (test.model.mixedkeys.Person)eo;
				switch(f.getFeatureID()) {
				  // addresses
				  case test.model.mixedkeys.MixedkeysPackage.PERSON__ADDRESSES: {
				    target.getAddresses().addAll(session.createMapper(test.model.emap.mixedkeys.MAddressMapper.class).selectAllForPerson((String)getPrimaryKey(target).getValue("id")));
				    return true;
				  }
				  // likes
				  case test.model.mixedkeys.MixedkeysPackage.PERSON__LIKES: {
				    target.getLikes().addAll(session.createMapper(test.model.emap.mixedkeys.MPlaceMapper.class).selectAllForPerson((String)getPrimaryKey(target).getValue("id")));
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
			return "MPERSON";
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
			TYPE_MAPPING.put("id",JDBCType.STRING);
			TYPE_MAPPING.put("name",JDBCType.STRING);
			REFERENCE_MAPPER.put("addresses",test.model.emap.mixedkeys.MAddressMapper.class);
			REFERENCE_MAPPER.put("likes",test.model.emap.mixedkeys.MPlaceMapper.class);
		}

		// by JavaObjectMapperGenerator
		public EClass getEClass() {
			return test.model.mixedkeys.MixedkeysPackage.eINSTANCE.getPerson();
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
		public final Key getPrimaryKey(Person o) {
			final Map<String, Object> values = new HashMap<>();
			values.put("id", o.getId());
			return PKLayout.create(values);
		}

		// by JavaObjectMapperGenerator
		protected final Key getPrimaryKeyForTx(Person o) {
			return session.getPrimaryKey(this, o);
		}

		// by JavaObjectMapperGenerator
		protected final long getVersionForTx(Person o) {
			return session.getVersion(this, o);
		}
		
		// by JavaObjectMapperGenerator
		private Map<String, Object> parseFKValuesForAddresses(ResultSet set) throws SQLException {
			final Map<String, Object> result = new HashMap<>();
			result.put("id", set.getString("ID"));
			return result;
		}
		// by JavaObjectMapperGenerator
		private Map<String, Object> parseFKValuesForLikes(ResultSet set) throws SQLException {
			final Map<String, Object> result = new HashMap<>();
			result.put("id", set.getString("ID"));
			return result;
		}
	}

	// by JavaObjectMapperGenerator
	public final NamedQuery<test.model.mixedkeys.Person> createNamedQuery(final JavaSession session, String name) {
			if( "selectById".equals(name) ) {
				return new NamedQuery<test.model.mixedkeys.Person>() {
					public final List<test.model.mixedkeys.Person> queryForList(Object... parameters) {
						throw new UnsupportedOperationException("This is a single value query");
					}

					public final test.model.mixedkeys.Person queryForOne(Object... parameters) {
						return createMapper(session).selectById((String)parameters[0]);
					}

					public final String[] getParameterNames() {
						String[] rv = new String[1];
						int i = 0;
						rv[i++] = "id";
						return rv;
					}
				};
			}
			if( "selectAllForPlace".equals(name) ) {
				return new NamedQuery<test.model.mixedkeys.Person>() {
					public final List<test.model.mixedkeys.Person> queryForList(Object... parameters) {
						return createMapper(session).selectAllForPlace(((Long)parameters[0]).longValue());
					}

					public final test.model.mixedkeys.Person queryForOne(Object... parameters) {
						throw new UnsupportedOperationException("This is a list value query");
					}

					public final String[] getParameterNames() {
						String[] rv = new String[1];
						int i = 0;
						rv[i++] = "placeId";
						return rv;
					}
				};
			}
		throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
	}

	// by JavaObjectMapperGenerator
	public final MappedQuery<Person> mappedQuery(JavaSession session, String name) {
		throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
	}

																											}
