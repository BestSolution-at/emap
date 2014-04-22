package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.ChangeSetMapper;
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
import at.bestsolution.persistence.tasktracker.ChangeSet;
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

public final class ChangeSetMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.ChangeSetMapper,ChangeSet> {
  @Override
  public at.bestsolution.persistence.tasktracker.ChangeSetMapper createMapper(JavaSession session) {
    return new ChangeSetMapperImpl(session);
  }

  final static class ChangeSetMapperImpl implements ChangeSetMapper, at.bestsolution.persistence.java.JavaObjectMapper<ChangeSet>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(ChangeSetMapperImpl.class);

    public ChangeSetMapperImpl(JavaSession session) {
      this.session = session;
    }

    @Override
    public final at.bestsolution.persistence.tasktracker.ChangeSet selectById(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectById");

      String query = Util.loadFile(getClass(), "ChangeSet_selectById_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "ChangeSet_selectById_default.sql");
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
        final ChangeSet rv;
        if( set.next() ) {
          rv = map_default_ChangeSet(connection,set);
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.ChangeSet> selectAll() {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "ChangeSet_selectAll_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "ChangeSet_selectAll_default.sql");
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

        final List<ChangeSet> rv = new ArrayList<ChangeSet>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_ChangeSet(connection, set));
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
    public final ChangeSetMappedQuery selectAllMappedQuery() {
      MappedQuery<ChangeSet> dbQuery = session.getDatabaseSupport().createMappedQuery(
        this, null,
        new ListDelegate<ChangeSet>() { public List<ChangeSet> list(MappedQuery<ChangeSet> criteria) { return selectAll((MappedQueryImpl<ChangeSet>)criteria); } }
      );
      return new ChangeSetMappedQueryImpl(dbQuery);
    }

    final List<ChangeSet> selectAll(MappedQueryImpl<ChangeSet> criteria) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "ChangeSet_selectAll_criteria_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "ChangeSet_selectAll_criteria_default.sql");
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
        List<ChangeSet> rv = new ArrayList<ChangeSet>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_ChangeSet(connection, set));
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.ChangeSet> selectAllForTask(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAllForTask");

      String query = Util.loadFile(getClass(), "ChangeSet_selectAllForTask_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "ChangeSet_selectAllForTask_default.sql");
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

        final List<ChangeSet> rv = new ArrayList<ChangeSet>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_ChangeSet(connection, set));
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

    public final ChangeSet map_default_ChangeSet(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_CHANGE_SET");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getChangeSet();
      ChangeSet rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_CHANGE_SET"));
      rv.setComment(set.getString("COMMENT"));
      rv.setId(set.getString("ID"));
      ((LazyEObject)rv).setProxyData(new ProxyData_ChangeSet(set.getLong("FK_PERSON"),set.getLong("FK_SOURCE_REPOSITORY"),set.getLong("FK_TASK")));
      ((LazyEObject)rv).setProxyDelegate(this);
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }



    @Override
    public final void update(ChangeSet object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("CHANGE_SET").createUpdateStatement("SID_CHANGE_SET", getLockColumn());
if( object.getComment() != null ) {
	stmt.addString("COMMENT", object.getComment());
} else {
	stmt.addNull("COMMENT",getJDBCType("comment"));
}
if( object.getId() != null ) {
	stmt.addString("ID", object.getId());
} else {
	stmt.addNull("ID",getJDBCType("id"));
}
if( object.getPerson() != null ) {
	stmt.addLong("FK_PERSON",object.getPerson().getSid());
} else {
	stmt.addNull("FK_PERSON",getJDBCType("person"));
}
if( object.getSourceRepository() != null ) {
	stmt.addLong("FK_SOURCE_REPOSITORY",object.getSourceRepository().getSid());
} else {
	stmt.addNull("FK_SOURCE_REPOSITORY",getJDBCType("sourceRepository"));
}
if( object.getTask() != null ) {
	stmt.addLong("FK_TASK",object.getTask().getSid());
} else {
	stmt.addNull("FK_TASK",getJDBCType("task"));
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
    public final void insert(ChangeSet object) {
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
    		sequenceExpression = "NEXT VALUE FOR SEQ_SID_CHANGE_SET";
    	}
    	at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("CHANGE_SET").createInsertStatement("SID_CHANGE_SET", sequenceExpression, getLockColumn());
    	if( object.getComment() != null ) {
    		stmt.addString("COMMENT", object.getComment());
    	}
    	if( object.getId() != null ) {
    		stmt.addString("ID", object.getId());
    	}
    	if( object.getPerson() != null ) { 
    		stmt.addLong("FK_PERSON",object.getPerson().getSid());
    	}
    	if( object.getSourceRepository() != null ) { 
    		stmt.addLong("FK_SOURCE_REPOSITORY",object.getSourceRepository().getSid());
    	}
    	if( object.getTask() != null ) { 
    		stmt.addLong("FK_TASK",object.getTask().getSid());
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
      String sql = "DELETE FROM CHANGE_SET WHERE SID_CHANGE_SET IN ("+b+")";
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

    public final void delete(ChangeSet object) {
      delete(new ChangeSet[] { object });
    }

    public final void delete(ChangeSet... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(ChangeSet o : object) {
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

        String sql = "DELETE FROM CHANGE_SET";
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
      if(eo instanceof ChangeSet) {
        at.bestsolution.persistence.tasktracker.ChangeSet target = (at.bestsolution.persistence.tasktracker.ChangeSet)eo;
        switch(f.getFeatureID()) {
          case 5: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getPerson();
              at.bestsolution.persistence.tasktracker.Person o = session.getCache().getObject(eClass, ((ProxyData_ChangeSet)proxyData).person);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.PersonMapper.class).selectById(((ProxyData_ChangeSet)proxyData).person);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setPerson(o);
            }
            return true;
          }
          case 3: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getSourceRepository();
              at.bestsolution.persistence.tasktracker.SourceRepository o = session.getCache().getObject(eClass, ((ProxyData_ChangeSet)proxyData).sourceRepository);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.SourceRepositoryMapper.class).selectById(((ProxyData_ChangeSet)proxyData).sourceRepository);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setSourceRepository(o);
            }
            return true;
          }
          case 1: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask();
              at.bestsolution.persistence.tasktracker.Task o = session.getCache().getObject(eClass, ((ProxyData_ChangeSet)proxyData).task);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.TaskMapper.class).selectById(((ProxyData_ChangeSet)proxyData).task);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setTask(o);
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
      return "CHANGE_SET";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_CHANGE_SET");
      PROPERTY_COL_MAPPING.put("comment","COMMENT");
      PROPERTY_COL_MAPPING.put("id","ID");
      PROPERTY_COL_MAPPING.put("person","FK_PERSON");
      PROPERTY_COL_MAPPING.put("sourceRepository","FK_SOURCE_REPOSITORY");
      PROPERTY_COL_MAPPING.put("task","FK_TASK");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("comment",JDBCType.STRING);
      TYPE_MAPPING.put("id",JDBCType.STRING);
      TYPE_MAPPING.put("person",JDBCType.LONG);
      TYPE_MAPPING.put("sourceRepository",JDBCType.LONG);
      TYPE_MAPPING.put("task",JDBCType.LONG);

      REF_ID_FEATURES.put("person",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REF_ID_FEATURES.put("sourceRepository",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REF_ID_FEATURES.put("task",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getChangeSet_Person());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getChangeSet_SourceRepository());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getChangeSet_Task());
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

    public final <P> P getPrimaryKeyValue(ChangeSet o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.ChangeSet> createNamedQuery(final JavaSession session, String name) {
    if( "selectById".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.ChangeSet>() {
        public final List<at.bestsolution.persistence.tasktracker.ChangeSet> queryForList(Object... parameters) {
          throw new UnsupportedOperationException("This is a single value query");
        }

        public final at.bestsolution.persistence.tasktracker.ChangeSet queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.ChangeSet>() {
        public final List<at.bestsolution.persistence.tasktracker.ChangeSet> queryForList(Object... parameters) {
          return createMapper(session).selectAll();
        }

        public final at.bestsolution.persistence.tasktracker.ChangeSet queryForOne(Object... parameters) {
          throw new UnsupportedOperationException("This is a list value query");
        }

        public final String[] getParameterNames() {
          String[] rv = new String[0];
          int i = 0;
          return rv;
        }
      };
    }
    if( "selectAllForTask".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.ChangeSet>() {
        public final List<at.bestsolution.persistence.tasktracker.ChangeSet> queryForList(Object... parameters) {
          return createMapper(session).selectAllForTask(((Long)parameters[0]).longValue());
        }

        public final at.bestsolution.persistence.tasktracker.ChangeSet queryForOne(Object... parameters) {
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

  public final MappedQuery<ChangeSet> mappedQuery(JavaSession session, String name) {
    if("selectAll".equals(name)) {
      return createMapper(session).selectAllMappedQuery();
    }
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

  final static class ProxyData_ChangeSet {
    public final long person;
    public final long sourceRepository;
    public final long task;
    public ProxyData_ChangeSet(long person,long sourceRepository,long task) {
      this.person = person;
      this.sourceRepository = sourceRepository;
      this.task = task;
    }
  }
  static final class ChangeSetMappedQueryImpl extends ChangeSetMapper.ChangeSetMappedQuery {
    private final MappedQuery<ChangeSet> dbQuery;

    ChangeSetMappedQueryImpl(MappedQuery<ChangeSet> dbQuery) {
      this.dbQuery = dbQuery;
    }

    public final ChangeSet unique() {
      return dbQuery.unique();
    }

    public final ChangeSetMapper.ChangeSetMappedQuery where(at.bestsolution.persistence.expr.Expression<ChangeSet> expression) {
      dbQuery.where(expression);
      return this;
    }

    public final List<ChangeSet> list() {
      return dbQuery.list();
    }

    public final ChangeSetMapper.ChangeSetMappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<ChangeSet>... columns) {
    	dbQuery.orderBy(columns);
    	return this;
    }
  }
}
