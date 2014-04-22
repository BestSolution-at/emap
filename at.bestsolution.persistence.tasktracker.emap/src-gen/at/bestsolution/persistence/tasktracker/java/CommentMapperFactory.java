package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.CommentMapper;
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
import at.bestsolution.persistence.tasktracker.Comment;
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

public final class CommentMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.CommentMapper,Comment> {
  @Override
  public at.bestsolution.persistence.tasktracker.CommentMapper createMapper(JavaSession session) {
    return new CommentMapperImpl(session);
  }

  final static class CommentMapperImpl implements CommentMapper, at.bestsolution.persistence.java.JavaObjectMapper<Comment>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(CommentMapperImpl.class);

    public CommentMapperImpl(JavaSession session) {
      this.session = session;
    }

    @Override
    public final at.bestsolution.persistence.tasktracker.Comment selectById(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectById");

      String query = Util.loadFile(getClass(), "Comment_selectById_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Comment_selectById_default.sql");
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
        final Comment rv;
        if( set.next() ) {
          rv = map_default_Comment(connection,set);
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.Comment> selectAll() {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Comment_selectAll_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Comment_selectAll_default.sql");
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

        final List<Comment> rv = new ArrayList<Comment>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Comment(connection, set));
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
    public final CommentMappedQuery selectAllMappedQuery() {
      MappedQuery<Comment> dbQuery = session.getDatabaseSupport().createMappedQuery(
        this, null,
        new ListDelegate<Comment>() { public List<Comment> list(MappedQuery<Comment> criteria) { return selectAll((MappedQueryImpl<Comment>)criteria); } }
      );
      return new CommentMappedQueryImpl(dbQuery);
    }

    final List<Comment> selectAll(MappedQueryImpl<Comment> criteria) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Comment_selectAll_criteria_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Comment_selectAll_criteria_default.sql");
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
        List<Comment> rv = new ArrayList<Comment>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Comment(connection, set));
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.Comment> selectAllForTask(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAllForTask");

      String query = Util.loadFile(getClass(), "Comment_selectAllForTask_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Comment_selectAllForTask_default.sql");
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

        final List<Comment> rv = new ArrayList<Comment>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Comment(connection, set));
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

    public final Comment map_default_Comment(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_COMMENT");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getComment();
      Comment rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_COMMENT"));
      rv.setDescription(set.getString("DESCRIPTION"));
      rv.setTitle(set.getString("TITLE"));
      ((LazyEObject)rv).setProxyData(new ProxyData_Comment(set.getLong("FK_TASK")));
      ((LazyEObject)rv).setProxyDelegate(this);
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }



    @Override
    public final void update(Comment object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("COMMENT").createUpdateStatement("SID_COMMENT", getLockColumn());
if( object.getDescription() != null ) {
	stmt.addString("DESCRIPTION", object.getDescription());
} else {
	stmt.addNull("DESCRIPTION",getJDBCType("description"));
}
if( object.getTitle() != null ) {
	stmt.addString("TITLE", object.getTitle());
} else {
	stmt.addNull("TITLE",getJDBCType("title"));
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
    public final void insert(Comment object) {
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
    		sequenceExpression = "NEXT VALUE FOR SEQ_SID_COMMENT";
    	}
    	at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("COMMENT").createInsertStatement("SID_COMMENT", sequenceExpression, getLockColumn());
    	if( object.getDescription() != null ) {
    		stmt.addString("DESCRIPTION", object.getDescription());
    	}
    	if( object.getTitle() != null ) {
    		stmt.addString("TITLE", object.getTitle());
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
      String sql = "DELETE FROM COMMENT WHERE SID_COMMENT IN ("+b+")";
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

    public final void delete(Comment object) {
      delete(new Comment[] { object });
    }

    public final void delete(Comment... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(Comment o : object) {
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

        String sql = "DELETE FROM COMMENT";
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
      if(eo instanceof Comment) {
        at.bestsolution.persistence.tasktracker.Comment target = (at.bestsolution.persistence.tasktracker.Comment)eo;
        switch(f.getFeatureID()) {
          case 1: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTask();
              at.bestsolution.persistence.tasktracker.Task o = session.getCache().getObject(eClass, ((ProxyData_Comment)proxyData).task);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.TaskMapper.class).selectById(((ProxyData_Comment)proxyData).task);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setTask(o);
            }
            return true;
          }
          case 4: {
            target.getAttachmentList().addAll(session.createMapper(at.bestsolution.persistence.tasktracker.CommentAttachmentMapper.class).selectAllForComment(target.getSid()));
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
      return "COMMENT";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_COMMENT");
      PROPERTY_COL_MAPPING.put("description","DESCRIPTION");
      PROPERTY_COL_MAPPING.put("title","TITLE");
      PROPERTY_COL_MAPPING.put("task","FK_TASK");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("description",JDBCType.STRING);
      TYPE_MAPPING.put("title",JDBCType.STRING);
      TYPE_MAPPING.put("task",JDBCType.LONG);

      REF_ID_FEATURES.put("task",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getComment_Task());
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

    public final <P> P getPrimaryKeyValue(Comment o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.Comment> createNamedQuery(final JavaSession session, String name) {
    if( "selectById".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Comment>() {
        public final List<at.bestsolution.persistence.tasktracker.Comment> queryForList(Object... parameters) {
          throw new UnsupportedOperationException("This is a single value query");
        }

        public final at.bestsolution.persistence.tasktracker.Comment queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Comment>() {
        public final List<at.bestsolution.persistence.tasktracker.Comment> queryForList(Object... parameters) {
          return createMapper(session).selectAll();
        }

        public final at.bestsolution.persistence.tasktracker.Comment queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Comment>() {
        public final List<at.bestsolution.persistence.tasktracker.Comment> queryForList(Object... parameters) {
          return createMapper(session).selectAllForTask(((Long)parameters[0]).longValue());
        }

        public final at.bestsolution.persistence.tasktracker.Comment queryForOne(Object... parameters) {
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

  public final MappedQuery<Comment> mappedQuery(JavaSession session, String name) {
    if("selectAll".equals(name)) {
      return createMapper(session).selectAllMappedQuery();
    }
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

  final static class ProxyData_Comment {
    public final long task;
    public ProxyData_Comment(long task) {
      this.task = task;
    }
  }
  static final class CommentMappedQueryImpl extends CommentMapper.CommentMappedQuery {
    private final MappedQuery<Comment> dbQuery;

    CommentMappedQueryImpl(MappedQuery<Comment> dbQuery) {
      this.dbQuery = dbQuery;
    }

    public final Comment unique() {
      return dbQuery.unique();
    }

    public final CommentMapper.CommentMappedQuery where(at.bestsolution.persistence.expr.Expression<Comment> expression) {
      dbQuery.where(expression);
      return this;
    }

    public final List<Comment> list() {
      return dbQuery.list();
    }

    public final CommentMapper.CommentMappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<Comment>... columns) {
    	dbQuery.orderBy(columns);
    	return this;
    }
  }
}
