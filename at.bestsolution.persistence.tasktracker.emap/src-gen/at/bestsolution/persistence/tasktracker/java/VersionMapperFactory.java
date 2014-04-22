package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.VersionMapper;
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
import at.bestsolution.persistence.tasktracker.TasktrackerFactory;
import at.bestsolution.persistence.tasktracker.Version;
import at.bestsolution.persistence.model.ResolveDelegate;
import at.bestsolution.persistence.model.LazyEObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EClass;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.DatabaseSupport.QueryBuilder;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.java.query.MappedQueryImpl;
import at.bestsolution.persistence.java.query.ListDelegate;
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

public final class VersionMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.VersionMapper,Version> {
  @Override
  public at.bestsolution.persistence.tasktracker.VersionMapper createMapper(JavaSession session) {
    return new VersionMapperImpl(session);
  }

  final static class VersionMapperImpl implements VersionMapper, at.bestsolution.persistence.java.JavaObjectMapper<Version>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(VersionMapperImpl.class);

    public VersionMapperImpl(JavaSession session) {
      this.session = session;
    }

    @Override
    public final at.bestsolution.persistence.tasktracker.Version selectById(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectById");

      String query = Util.loadFile(getClass(), "Version_selectById_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Version_selectById_default.sql");
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
        for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
          if( "sid".equals(processedSQL.dynamicParameterNames.get(i)) ) {
            if( isDebug ) {
              debugParams.add("sid = " + sid);
            }
            pStmt.setLong(i+1,sid);
          }
        }
        if( isDebug ) {
          LOGGER.debug(" Dynamic-Parameters: " + debugParams);
        }
        if( isDebug ) LOGGER.debug("Executing query");
        set = pStmt.executeQuery();

        if( isDebug ) LOGGER.debug("Mapping result started");
        final Version rv;
        if( set.next() ) {
          rv = map_default_Version(connection,set);
        } else {
          if( isDebug ) LOGGER.debug("No result for query");
          rv = null;
        }
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
    @Override
    public final java.util.List<at.bestsolution.persistence.tasktracker.Version> selectAll() {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Version_selectAll_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Version_selectAll_default.sql");
      }

      if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

      Connection connection = session.checkoutConnection();
      PreparedStatement pStmt = null;
      ResultSet set = null;
      try {

        if( isDebug ) LOGGER.debug("Preparing query");
        pStmt = connection.prepareStatement(query);
        if( isDebug ) LOGGER.debug("Executing query");
        set = pStmt.executeQuery();

        final List<Version> rv = new ArrayList<Version>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Version(connection, set));
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
    public final VersionMappedQuery selectAllMappedQuery() {
      MappedQuery<Version> dbQuery = session.getDatabaseSupport().createMappedQuery(
        this, null,
        new ListDelegate<Version>() { public List<Version> list(MappedQuery<Version> criteria) { return selectAll((MappedQueryImpl<Version>)criteria); } }
      );
      return new VersionMappedQueryImpl(dbQuery);
    }

    final List<Version> selectAll(MappedQueryImpl<Version> criteria) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Version_selectAll_criteria_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Version_selectAll_criteria_default.sql");
      }

      if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

      String criteriaStr = criteria.getCriteria();
      if( criteriaStr != null && ! criteriaStr.isEmpty() ) {
        query += " WHERE " + criteriaStr;
      }

      if( isDebug ) LOGGER.debug("	Final query: " + query);

      Connection connection = session.checkoutConnection();
      try {
        PreparedStatement pstmt = connection.prepareStatement(query);
        int idx = 1;
        for(TypedValue t : criteria.getParameters()) {
          Util.setValue(pstmt,idx++,t);
        }

        ResultSet set = pstmt.executeQuery();
        List<Version> rv = new ArrayList<Version>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Version(connection, set));
        }
        if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");
        return rv;
      } catch(SQLException e) {
        throw new PersistanceException(e);
      } finally {
        session.returnConnection(connection);
      }
    }
    @Override
    public final java.util.List<at.bestsolution.persistence.tasktracker.Version> selectAllForTaskRepository(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAllForTaskRepository");

      String query = Util.loadFile(getClass(), "Version_selectAllForTaskRepository_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Version_selectAllForTaskRepository_default.sql");
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
        for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
          if( "sid".equals(processedSQL.dynamicParameterNames.get(i)) ) {
            if( isDebug ) {
              debugParams.add("sid = " + sid);
            }
            pStmt.setLong(i+1,sid);
          }
        }
        if( isDebug ) {
          LOGGER.debug(" Dynamic-Parameters: " + debugParams);
        }
        if( isDebug ) LOGGER.debug("Executing query");
        set = pStmt.executeQuery();

        final List<Version> rv = new ArrayList<Version>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Version(connection, set));
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

    public final Version map_default_Version(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_VERSION");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getVersion();
      Version rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_VERSION"));
      rv.setCodename(set.getString("CODENAME"));
      rv.setDate((java.util.Date) session.convertType(java.util.Date.class, set.getObject("DATE")));
      rv.setValue(set.getString("VALUE"));
      ((LazyEObject)rv).setProxyData(new ProxyData_Version(set.getLong("FK_REPOSITORY")));
      ((LazyEObject)rv).setProxyDelegate(this);
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }



    @Override
    public final void update(Version object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("VERSION").createUpdateStatement("SID_VERSION", getLockColumn());
if( object.getCodename() != null ) {
	stmt.addString("CODENAME", object.getCodename());
} else {
	stmt.addNull("CODENAME",getJDBCType("codename"));
}
if( object.getDate() != null ) {
	stmt.addTimestamp("DATE", object.getDate());
} else {
	stmt.addNull("DATE",getJDBCType("date"));
}
if( object.getValue() != null ) {
	stmt.addString("VALUE", object.getValue());
} else {
	stmt.addNull("VALUE",getJDBCType("value"));
}
if( object.getRepository() != null ) {
	stmt.addLong("FK_REPOSITORY",object.getRepository().getSid());
} else {
	stmt.addNull("FK_REPOSITORY",getJDBCType("repository"));
}
		Connection connection = session.checkoutConnection();
		try {
			boolean success = stmt.execute(connection, object.getSid());
			
			if( getLockColumn() != null && ! success ) {
				throw new PersistanceException("The entity '"+object.getClass().getName()+"' is stale");
			}
			
        session.clearChangeDescription(object);

		} catch(SQLException e) {
			throw new PersistanceException(e);
		} finally {
			session.returnConnection(connection);
		}
		
    }
    
    @Override
    public final void insert(Version object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	String sequenceExpression = null;
    	if( "h2".equals(session.getDatabaseType()) ) {
    		sequenceExpression = null;
    	}
    	if( "Firebird".equals(session.getDatabaseType()) ) {
    		sequenceExpression = "NEXT VALUE FOR SEQ_SID_VERSION";
    	}
    	at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("VERSION").createInsertStatement("SID_VERSION", sequenceExpression, getLockColumn());
    	if( object.getCodename() != null ) {
    		stmt.addString("CODENAME", object.getCodename());
    	}
    	if( object.getDate() != null ) {
    		stmt.addTimestamp("DATE", object.getDate());
    	}
    	if( object.getValue() != null ) {
    		stmt.addString("VALUE", object.getValue());
    	}
    	if( object.getRepository() != null ) { 
    		stmt.addLong("FK_REPOSITORY",object.getRepository().getSid());
    	}
    	Connection connection = session.checkoutConnection();
    	try {
    		object.setSid(stmt.execute(connection));
    		
    		session.registerObject(object,getPrimaryKeyValue(object),getLockColumn() != null ? 0 : -1);
    	} catch(SQLException e) {
    		throw new PersistanceException(e);
    	} finally {
    		session.returnConnection(connection);
    	}
    	if( isDebug ) {
    		LOGGER.debug("Finished inserting");
    	}
    }

    public final void deleteById(Object... id) {
      deleteById(true, id);
    }

    private final void deleteById(boolean cacheClearance, Object... id) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started deleteById the following objects '"+Arrays.toString(id)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      StringBuilder b = new StringBuilder();
      for(Object t : id) {
        if(b.length() != 0 ) {
          b.append(",");
        }
        b.append(t);
      }
      String sql = "DELETE FROM VERSION WHERE SID_VERSION IN ("+b+")";
      Connection connection = session.checkoutConnection();

      try {

        Statement stmt = connection.createStatement();
        stmt.execute(sql);
        stmt.close();
        stmt = null;

        if( cacheClearance ) {
          //TODO What can we clear at this point??
        }

      } catch(SQLException e) {
        throw new PersistanceException(e);
      } finally {
        if( isDebug ) {
          LOGGER.debug("Finished deleteById");
        }
        session.returnConnection(connection);
      }
    }

    public final void delete(Version object) {
      delete(new Version[] { object });
    }

    public final void delete(Version... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(Version o : object) {
        l.add(o.getSid());
        session.unregisterObject(o,getPrimaryKeyValue(o));
      }
      deleteById(false, l.toArray());
      if( isDebug ) {
        LOGGER.debug("Finished delete");
      }
    }

    public final void deleteAll() {
        final boolean isDebug = LOGGER.isDebugEnabled();
        if( isDebug ) {
    LOGGER.debug("Started deleting all entities");
        }

        String sql = "DELETE FROM VERSION";
        if( isDebug ) {
          LOGGER.debug("SQL: " + sql);
        }
        Connection connection = session.checkoutConnection();
        Statement stmt = null;
        try {
          stmt = connection.createStatement();
          stmt.execute(sql);
          stmt.close();
          stmt = null;
        } catch(SQLException e) {
          if( stmt != null ) {
            try {
            	stmt.close();
            } catch(SQLException e1) {
            	// skip
            }
          }
          throw new PersistanceException(e);
        } finally {
          LOGGER.debug("Delete all entities finished");
          session.returnConnection(connection);
        }
    }

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

    final boolean doResolve(LazyEObject eo, Object proxyData, EStructuralFeature f) {
      boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) {
        LOGGER.debug("Lazy resolving " + f + " from " + eo + " using " + proxyData);
      }
      if(eo instanceof Version) {
        at.bestsolution.persistence.tasktracker.Version target = (at.bestsolution.persistence.tasktracker.Version)eo;
        switch(f.getFeatureID()) {
          case 4: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTaskRepository();
              at.bestsolution.persistence.tasktracker.TaskRepository o = session.getCache().getObject(eClass, ((ProxyData_Version)proxyData).repository);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.TaskRepositoryMapper.class).selectById(((ProxyData_Version)proxyData).repository);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setRepository(o);
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

    public final String getTableName() {
      return "VERSION";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_VERSION");
      PROPERTY_COL_MAPPING.put("codename","CODENAME");
      PROPERTY_COL_MAPPING.put("date","DATE");
      PROPERTY_COL_MAPPING.put("value","VALUE");
      PROPERTY_COL_MAPPING.put("repository","FK_REPOSITORY");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("codename",JDBCType.STRING);
      TYPE_MAPPING.put("date",JDBCType.UNKNOWN);
      TYPE_MAPPING.put("value",JDBCType.STRING);
      TYPE_MAPPING.put("repository",JDBCType.LONG);

      REF_ID_FEATURES.put("repository",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getVersion_Repository());
    }

    public String getLockColumn() {
      return "E_VERSION";
    }

    public final String getColumnName(String propertyName) {
      return PROPERTY_COL_MAPPING.get(propertyName);
    }

    public final JDBCType getJDBCType(String property) {
      return TYPE_MAPPING.get(property);
    }

    public final EStructuralFeature getReferenceId(String property) {
      return REF_ID_FEATURES.get(property);
    }

    public final Set<EReference> getReferenceFeatures() {
      return Collections.unmodifiableSet(REFERENCE_FEATURES);
    }

    public final <P> P getPrimaryKeyValue(Version o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.Version> createNamedQuery(final JavaSession session, String name) {
    if( "selectById".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Version>() {
        public final List<at.bestsolution.persistence.tasktracker.Version> queryForList(Object... parameters) {
          throw new UnsupportedOperationException("This is a single value query");
        }

        public final at.bestsolution.persistence.tasktracker.Version queryForOne(Object... parameters) {
          return createMapper(session).selectById(((Long)parameters[0]).longValue());
        }

        public final String[] getParameterNames() {
          String[] rv = new String[1];
          int i = 0;
          rv[i++] = "sid";
          return rv;
        }
      };
    }
    if( "selectAll".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Version>() {
        public final List<at.bestsolution.persistence.tasktracker.Version> queryForList(Object... parameters) {
          return createMapper(session).selectAll();
        }

        public final at.bestsolution.persistence.tasktracker.Version queryForOne(Object... parameters) {
          throw new UnsupportedOperationException("This is a list value query");
        }

        public final String[] getParameterNames() {
          String[] rv = new String[0];
          int i = 0;
          return rv;
        }
      };
    }
    if( "selectAllForTaskRepository".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Version>() {
        public final List<at.bestsolution.persistence.tasktracker.Version> queryForList(Object... parameters) {
          return createMapper(session).selectAllForTaskRepository(((Long)parameters[0]).longValue());
        }

        public final at.bestsolution.persistence.tasktracker.Version queryForOne(Object... parameters) {
          throw new UnsupportedOperationException("This is a list value query");
        }

        public final String[] getParameterNames() {
          String[] rv = new String[1];
          int i = 0;
          rv[i++] = "sid";
          return rv;
        }
      };
    }
    throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
  }

  public final MappedQuery<Version> mappedQuery(JavaSession session, String name) {
    if("selectAll".equals(name)) {
      return createMapper(session).selectAllMappedQuery();
    }
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

  final static class ProxyData_Version {
    public final long repository;
    public ProxyData_Version(long repository) {
      this.repository = repository;
    }
  }
  static final class VersionMappedQueryImpl extends VersionMapper.VersionMappedQuery {
    private final MappedQuery<Version> dbQuery;

    VersionMappedQueryImpl(MappedQuery<Version> dbQuery) {
      this.dbQuery = dbQuery;
    }

    public final Version unique() {
      return dbQuery.unique();
    }

    public final VersionMapper.VersionMappedQuery where(at.bestsolution.persistence.expr.Expression<Version> expression) {
      dbQuery.where(expression);
      return this;
    }

    public final List<Version> list() {
      return dbQuery.list();
    }

    public final VersionMapper.VersionMappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<Version>... columns) {
    	dbQuery.orderBy(columns);
    	return this;
    }
  }
}
