package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.TaskMapper;
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
import at.bestsolution.persistence.tasktracker.Task;
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

public final class TaskMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.TaskMapper,Task> {
  @Override
  public at.bestsolution.persistence.tasktracker.TaskMapper createMapper(JavaSession session) {
    return new TaskMapperImpl(session);
  }

  final static class TaskMapperImpl implements TaskMapper, at.bestsolution.persistence.java.JavaObjectMapper<Task>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(TaskMapperImpl.class);

    public TaskMapperImpl(JavaSession session) {
      this.session = session;
    }

    @Override
    public final at.bestsolution.persistence.tasktracker.Task selectById(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectById");

      String query = Util.loadFile(getClass(), "Task_selectById_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Task_selectById_default.sql");
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
        final Task rv;
        if( set.next() ) {
          rv = map_default_Task(connection,set);
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.Task> selectAll() {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Task_selectAll_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Task_selectAll_default.sql");
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

        final List<Task> rv = new ArrayList<Task>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Task(connection, set));
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
    public final TaskMappedQuery selectAllMappedQuery() {
      MappedQuery<Task> dbQuery = session.getDatabaseSupport().createMappedQuery(
        this, null,
        new ListDelegate<Task>() { public List<Task> list(MappedQuery<Task> criteria) { return selectAll((MappedQueryImpl<Task>)criteria); } }
      );
      return new TaskMappedQueryImpl(dbQuery);
    }

    final List<Task> selectAll(MappedQueryImpl<Task> criteria) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Task_selectAll_criteria_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Task_selectAll_criteria_default.sql");
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
        List<Task> rv = new ArrayList<Task>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Task(connection, set));
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.Task> selectAllForTaskRepository(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAllForTaskRepository");

      String query = Util.loadFile(getClass(), "Task_selectAllForTaskRepository_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Task_selectAllForTaskRepository_default.sql");
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

        final List<Task> rv = new ArrayList<Task>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Task(connection, set));
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

    public final Task map_default_Task(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_TASK");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask();
      Task rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_TASK"));
      rv.setDescription(set.getString("DESCRIPTION"));
      rv.setTitle(set.getString("TITLE"));
      rv.setState((at.bestsolution.persistence.tasktracker.TaskState) session.convertType(at.bestsolution.persistence.tasktracker.TaskState.class, set.getObject("STATE")));
      ((LazyEObject)rv).setProxyData(new ProxyData_Task(set.getLong("FK_ASSIGNEE"),set.getLong("FK_PRODUCT_VERSION"),set.getLong("FK_REPORTER"),set.getLong("FK_REPOSITORY"),set.getLong("FK_TARGET_VERSION")));
      ((LazyEObject)rv).setProxyDelegate(this);
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }


	  public final long countTasks() {
	  	final boolean isDebug = LOGGER.isDebugEnabled();
	  	if( isDebug ) LOGGER.debug("Started 'countTasks'");
	  	long rv = 0;
	  
	  	Connection connection = session.checkoutConnection();
	  	PreparedStatement pstmt = null;
	  	ResultSet set = null;
	  
	  	String query = Util.loadFile(getClass(), "Task_countTasks_"+session.getDatabaseType()+".sql");
	  	if( query == null ) {
	  		query = Util.loadFile(getClass(), "Task_countTasks_default.sql");
	  	}
	  	if( isDebug ) LOGGER.debug("	Plain-Query: " + query);
	  
	  	try {
	  		if( isDebug ) LOGGER.debug("Preparing query");
	  		pstmt = connection.prepareStatement(query);
	  		if( isDebug ) LOGGER.debug("Executing query");
	  		set = pstmt.executeQuery();
	  
	  		if( set.next() ) {
	  			rv = set.getLong(1);
	  		}
	  		set.close();
	  		set = null;
	  		pstmt.close();
	  		pstmt = null;
	  		if( isDebug ) LOGGER.debug("Finished 'countTasks'");
	  		return rv;
	  	} catch(SQLException e) {
	  		throw new PersistanceException(e);
	  	} finally {
	  		try {
	  			if( set != null ) {
	  				set.close();
	  			}
	  			if( pstmt != null ) {
	  				pstmt.close();
	  			}
	  		} catch(SQLException e) {
	  			LOGGER.fatal("Unable to clean up resources", e);
	  		} finally {
	  			session.returnConnection(connection);
	  		}
	  	}
	  }
	  public final List<at.bestsolution.persistence.tasktracker.TaskAndPerson> selectTaskAndPerson() {
	  	final boolean isDebug = LOGGER.isDebugEnabled();
	  	if( isDebug ) LOGGER.debug("Started 'selectTaskAndPerson'");
	  	List<at.bestsolution.persistence.tasktracker.TaskAndPerson> rv = new ArrayList<at.bestsolution.persistence.tasktracker.TaskAndPerson>();
	  
	  	Connection connection = session.checkoutConnection();
	  	PreparedStatement pstmt = null;
	  	ResultSet set = null;
	  
	  	String query = Util.loadFile(getClass(), "Task_selectTaskAndPerson_"+session.getDatabaseType()+".sql");
	  	if( query == null ) {
	  		query = Util.loadFile(getClass(), "Task_selectTaskAndPerson_default.sql");
	  	}
	  	if( isDebug ) LOGGER.debug("	Plain-Query: " + query);
	  
	  	try {
	  		if( isDebug ) LOGGER.debug("Preparing query");
	  		pstmt = connection.prepareStatement(query);
	  		if( isDebug ) LOGGER.debug("Executing query");
	  		set = pstmt.executeQuery();
	  
	  		while( set.next() ) {
	  			rv.add(new at.bestsolution.persistence.tasktracker.TaskAndPerson(set.getString(1),set.getString(2)));
	  		}
	  		set.close();
	  		set = null;
	  		pstmt.close();
	  		pstmt = null;
	  		if( isDebug ) LOGGER.debug("Finished 'selectTaskAndPerson'");
	  		return rv;
	  	} catch(SQLException e) {
	  		throw new PersistanceException(e);
	  	} finally {
	  		try {
	  			if( set != null ) {
	  				set.close();
	  			}
	  			if( pstmt != null ) {
	  				pstmt.close();
	  			}
	  		} catch(SQLException e) {
	  			LOGGER.fatal("Unable to clean up resources", e);
	  		} finally {
	  			session.returnConnection(connection);
	  		}
	  	}
	  }

    @Override
    public final void update(Task object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("TASK").createUpdateStatement("SID_TASK", getLockColumn());
if( object.getDescription() != null ) {
	stmt.addString("DESCRIPTION", object.getDescription());
} else {
	stmt.addNull("DESCRIPTION",getJDBCType("description"));
}
if( object.getState() != null ) {
	stmt.addEnum("STATE", object.getState());
} else {
	stmt.addNull("STATE",getJDBCType("state"));
}
if( object.getTitle() != null ) {
	stmt.addString("TITLE", object.getTitle());
} else {
	stmt.addNull("TITLE",getJDBCType("title"));
}
if( object.getAssignee() != null ) {
	stmt.addLong("FK_ASSIGNEE",object.getAssignee().getSid());
} else {
	stmt.addNull("FK_ASSIGNEE",getJDBCType("assignee"));
}
if( object.getProductVersion() != null ) {
	stmt.addLong("FK_PRODUCT_VERSION",object.getProductVersion().getSid());
} else {
	stmt.addNull("FK_PRODUCT_VERSION",getJDBCType("productVersion"));
}
if( object.getReporter() != null ) {
	stmt.addLong("FK_REPORTER",object.getReporter().getSid());
} else {
	stmt.addNull("FK_REPORTER",getJDBCType("reporter"));
}
if( object.getRepository() != null ) {
	stmt.addLong("FK_REPOSITORY",object.getRepository().getSid());
} else {
	stmt.addNull("FK_REPOSITORY",getJDBCType("repository"));
}
if( object.getTargetVersion() != null ) {
	stmt.addLong("FK_TARGET_VERSION",object.getTargetVersion().getSid());
} else {
	stmt.addNull("FK_TARGET_VERSION",getJDBCType("targetVersion"));
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
    public final void insert(Task object) {
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
    		sequenceExpression = "NEXT VALUE FOR SEQ_SID_TASK";
    	}
    	at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("TASK").createInsertStatement("SID_TASK", sequenceExpression, getLockColumn());
    	if( object.getDescription() != null ) {
    		stmt.addString("DESCRIPTION", object.getDescription());
    	}
    	if( object.getState() != null ) {
    		stmt.addEnum("STATE", object.getState());
    	}
    	if( object.getTitle() != null ) {
    		stmt.addString("TITLE", object.getTitle());
    	}
    	if( object.getAssignee() != null ) { 
    		stmt.addLong("FK_ASSIGNEE",object.getAssignee().getSid());
    	}
    	if( object.getProductVersion() != null ) { 
    		stmt.addLong("FK_PRODUCT_VERSION",object.getProductVersion().getSid());
    	}
    	if( object.getReporter() != null ) { 
    		stmt.addLong("FK_REPORTER",object.getReporter().getSid());
    	}
    	if( object.getRepository() != null ) { 
    		stmt.addLong("FK_REPOSITORY",object.getRepository().getSid());
    	}
    	if( object.getTargetVersion() != null ) { 
    		stmt.addLong("FK_TARGET_VERSION",object.getTargetVersion().getSid());
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
      String sql = "DELETE FROM TASK WHERE SID_TASK IN ("+b+")";
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

    public final void delete(Task object) {
      delete(new Task[] { object });
    }

    public final void delete(Task... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(Task o : object) {
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

        String sql = "DELETE FROM TASK";
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
      if(eo instanceof Task) {
        at.bestsolution.persistence.tasktracker.Task target = (at.bestsolution.persistence.tasktracker.Task)eo;
        switch(f.getFeatureID()) {
          case 7: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getPerson();
              at.bestsolution.persistence.tasktracker.Person o = session.getCache().getObject(eClass, ((ProxyData_Task)proxyData).assignee);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.PersonMapper.class).selectById(((ProxyData_Task)proxyData).assignee);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setAssignee(o);
            }
            return true;
          }
          case 10: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getVersion();
              at.bestsolution.persistence.tasktracker.Version o = session.getCache().getObject(eClass, ((ProxyData_Task)proxyData).productVersion);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.VersionMapper.class).selectById(((ProxyData_Task)proxyData).productVersion);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setProductVersion(o);
            }
            return true;
          }
          case 6: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getPerson();
              at.bestsolution.persistence.tasktracker.Person o = session.getCache().getObject(eClass, ((ProxyData_Task)proxyData).reporter);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.PersonMapper.class).selectById(((ProxyData_Task)proxyData).reporter);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setReporter(o);
            }
            return true;
          }
          case 1: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTaskRepository();
              at.bestsolution.persistence.tasktracker.TaskRepository o = session.getCache().getObject(eClass, ((ProxyData_Task)proxyData).repository);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.TaskRepositoryMapper.class).selectById(((ProxyData_Task)proxyData).repository);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setRepository(o);
            }
            return true;
          }
          case 9: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getVersion();
              at.bestsolution.persistence.tasktracker.Version o = session.getCache().getObject(eClass, ((ProxyData_Task)proxyData).targetVersion);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.VersionMapper.class).selectById(((ProxyData_Task)proxyData).targetVersion);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setTargetVersion(o);
            }
            return true;
          }
          case 11: {
            target.getAttachmentList().addAll(session.createMapper(at.bestsolution.persistence.tasktracker.TaskAttachmentMapper.class).selectAllForTask(target.getSid()));
            return true;
          }
          case 5: {
            target.getChangeSetList().addAll(session.createMapper(at.bestsolution.persistence.tasktracker.ChangeSetMapper.class).selectAllForTask(target.getSid()));
            return true;
          }
          case 4: {
            target.getCommentList().addAll(session.createMapper(at.bestsolution.persistence.tasktracker.CommentMapper.class).selectAllForTask(target.getSid()));
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
      return "TASK";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_TASK");
      PROPERTY_COL_MAPPING.put("description","DESCRIPTION");
      PROPERTY_COL_MAPPING.put("title","TITLE");
      PROPERTY_COL_MAPPING.put("state","STATE");
      PROPERTY_COL_MAPPING.put("assignee","FK_ASSIGNEE");
      PROPERTY_COL_MAPPING.put("productVersion","FK_PRODUCT_VERSION");
      PROPERTY_COL_MAPPING.put("reporter","FK_REPORTER");
      PROPERTY_COL_MAPPING.put("repository","FK_REPOSITORY");
      PROPERTY_COL_MAPPING.put("targetVersion","FK_TARGET_VERSION");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("description",JDBCType.STRING);
      TYPE_MAPPING.put("title",JDBCType.STRING);
      TYPE_MAPPING.put("state",JDBCType.UNKNOWN);
      TYPE_MAPPING.put("assignee",JDBCType.LONG);
      TYPE_MAPPING.put("productVersion",JDBCType.LONG);
      TYPE_MAPPING.put("reporter",JDBCType.LONG);
      TYPE_MAPPING.put("repository",JDBCType.LONG);
      TYPE_MAPPING.put("targetVersion",JDBCType.LONG);

      REF_ID_FEATURES.put("assignee",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REF_ID_FEATURES.put("productVersion",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REF_ID_FEATURES.put("reporter",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REF_ID_FEATURES.put("repository",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REF_ID_FEATURES.put("targetVersion",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask_Assignee());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask_ProductVersion());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask_Reporter());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask_Repository());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask_TargetVersion());
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

    public final <P> P getPrimaryKeyValue(Task o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.Task> createNamedQuery(final JavaSession session, String name) {
    if( "selectById".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Task>() {
        public final List<at.bestsolution.persistence.tasktracker.Task> queryForList(Object... parameters) {
          throw new UnsupportedOperationException("This is a single value query");
        }

        public final at.bestsolution.persistence.tasktracker.Task queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Task>() {
        public final List<at.bestsolution.persistence.tasktracker.Task> queryForList(Object... parameters) {
          return createMapper(session).selectAll();
        }

        public final at.bestsolution.persistence.tasktracker.Task queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Task>() {
        public final List<at.bestsolution.persistence.tasktracker.Task> queryForList(Object... parameters) {
          return createMapper(session).selectAllForTaskRepository(((Long)parameters[0]).longValue());
        }

        public final at.bestsolution.persistence.tasktracker.Task queryForOne(Object... parameters) {
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

  public final MappedQuery<Task> mappedQuery(JavaSession session, String name) {
    if("selectAll".equals(name)) {
      return createMapper(session).selectAllMappedQuery();
    }
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

  final static class ProxyData_Task {
    public final long assignee;
    public final long productVersion;
    public final long reporter;
    public final long repository;
    public final long targetVersion;
    public ProxyData_Task(long assignee,long productVersion,long reporter,long repository,long targetVersion) {
      this.assignee = assignee;
      this.productVersion = productVersion;
      this.reporter = reporter;
      this.repository = repository;
      this.targetVersion = targetVersion;
    }
  }
  static final class TaskMappedQueryImpl extends TaskMapper.TaskMappedQuery {
    private final MappedQuery<Task> dbQuery;

    TaskMappedQueryImpl(MappedQuery<Task> dbQuery) {
      this.dbQuery = dbQuery;
    }

    public final Task unique() {
      return dbQuery.unique();
    }

    public final TaskMapper.TaskMappedQuery where(at.bestsolution.persistence.expr.Expression<Task> expression) {
      dbQuery.where(expression);
      return this;
    }

    public final List<Task> list() {
      return dbQuery.list();
    }

    public final TaskMapper.TaskMappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<Task>... columns) {
    	dbQuery.orderBy(columns);
    	return this;
    }
  }
}
