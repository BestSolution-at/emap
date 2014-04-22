package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.CommentAttachmentMapper;
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
import at.bestsolution.persistence.tasktracker.CommentAttachment;
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

public final class CommentAttachmentMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.CommentAttachmentMapper,CommentAttachment> {
  @Override
  public at.bestsolution.persistence.tasktracker.CommentAttachmentMapper createMapper(JavaSession session) {
    return new CommentAttachmentMapperImpl(session);
  }

  final static class CommentAttachmentMapperImpl implements CommentAttachmentMapper, at.bestsolution.persistence.java.JavaObjectMapper<CommentAttachment>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(CommentAttachmentMapperImpl.class);

    public CommentAttachmentMapperImpl(JavaSession session) {
      this.session = session;
    }

    @Override
    public final at.bestsolution.persistence.tasktracker.CommentAttachment selectById(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectById");

      String query = Util.loadFile(getClass(), "CommentAttachment_selectById_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "CommentAttachment_selectById_default.sql");
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
        final CommentAttachment rv;
        if( set.next() ) {
          rv = map_default_CommentAttachment(connection,set);
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.CommentAttachment> selectAll() {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "CommentAttachment_selectAll_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "CommentAttachment_selectAll_default.sql");
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

        final List<CommentAttachment> rv = new ArrayList<CommentAttachment>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_CommentAttachment(connection, set));
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
    public final CommentAttachmentMappedQuery selectAllMappedQuery() {
      MappedQuery<CommentAttachment> dbQuery = session.getDatabaseSupport().createMappedQuery(
        this, null,
        new ListDelegate<CommentAttachment>() { public List<CommentAttachment> list(MappedQuery<CommentAttachment> criteria) { return selectAll((MappedQueryImpl<CommentAttachment>)criteria); } }
      );
      return new CommentAttachmentMappedQueryImpl(dbQuery);
    }

    final List<CommentAttachment> selectAll(MappedQueryImpl<CommentAttachment> criteria) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "CommentAttachment_selectAll_criteria_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "CommentAttachment_selectAll_criteria_default.sql");
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
        List<CommentAttachment> rv = new ArrayList<CommentAttachment>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_CommentAttachment(connection, set));
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.CommentAttachment> selectAllForComment(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAllForComment");

      String query = Util.loadFile(getClass(), "CommentAttachment_selectAllForComment_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "CommentAttachment_selectAllForComment_default.sql");
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

        final List<CommentAttachment> rv = new ArrayList<CommentAttachment>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_CommentAttachment(connection, set));
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

    public final CommentAttachment map_default_CommentAttachment(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_COMMENT_ATTACHMENT");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getCommentAttachment();
      CommentAttachment rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_COMMENT_ATTACHMENT"));
      rv.setBinary(session.handleBlob("ATTACHMENT","BINARY","SID_ATTACHMENT",set));
      rv.setDescription(set.getString("DESCRIPTION"));
      rv.setMimetype(set.getString("MIMETYPE"));
      rv.setTitle(set.getString("TITLE"));
      ((LazyEObject)rv).setProxyData(new ProxyData_CommentAttachment(set.getLong("FK_COMMENT")));
      ((LazyEObject)rv).setProxyDelegate(this);
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }



    @Override
    public final void update(CommentAttachment object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("COMMENT_ATTACHMENT").createUpdateStatement("SID_COMMENT_ATTACHMENT", getLockColumn());
if( object.getComment() != null ) {
	stmt.addLong("FK_COMMENT",object.getComment().getSid());
} else {
	stmt.addNull("FK_COMMENT",getJDBCType("comment"));
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
    public final void insert(CommentAttachment object) {
    	final boolean isDebug = LOGGER.isDebugEnabled();
    	if( isDebug ) {
    		LOGGER.debug("Starting insert of '"+object+"'");
    	}
    	
    	if( session.getTransaction() == null ) {
    		throw new PersistanceException("You can only modify data while in a transaction");
    	}
    	
    	// TODO WHAT TO GENERATE
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
      String sql = "DELETE FROM COMMENT_ATTACHMENT WHERE SID_COMMENT_ATTACHMENT IN ("+b+")";
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

    public final void delete(CommentAttachment object) {
      delete(new CommentAttachment[] { object });
    }

    public final void delete(CommentAttachment... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(CommentAttachment o : object) {
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

        String sql = "DELETE FROM COMMENT_ATTACHMENT";
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
      if(eo instanceof CommentAttachment) {
        at.bestsolution.persistence.tasktracker.CommentAttachment target = (at.bestsolution.persistence.tasktracker.CommentAttachment)eo;
        switch(f.getFeatureID()) {
          case 5: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getComment();
              at.bestsolution.persistence.tasktracker.Comment o = session.getCache().getObject(eClass, ((ProxyData_CommentAttachment)proxyData).comment);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.CommentMapper.class).selectById(((ProxyData_CommentAttachment)proxyData).comment);
              } else {
                if( LOGGER.isDebugEnabled() ) {
                  LOGGER.debug("Using cached version");
                }
              }
              target.setComment(o);
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
      return "COMMENT_ATTACHMENT";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_COMMENT_ATTACHMENT");
      PROPERTY_COL_MAPPING.put("comment","FK_COMMENT");
      PROPERTY_COL_MAPPING.put("sid","SID_ATTACHMENT");
      PROPERTY_COL_MAPPING.put("binary","BINARY");
      PROPERTY_COL_MAPPING.put("description","DESCRIPTION");
      PROPERTY_COL_MAPPING.put("mimetype","MIMETYPE");
      PROPERTY_COL_MAPPING.put("title","TITLE");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("comment",JDBCType.LONG);
      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("binary",JDBCType.UNKNOWN);
      TYPE_MAPPING.put("description",JDBCType.STRING);
      TYPE_MAPPING.put("mimetype",JDBCType.STRING);
      TYPE_MAPPING.put("title",JDBCType.STRING);

      REF_ID_FEATURES.put("comment",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getCommentAttachment_Comment());
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

    public final <P> P getPrimaryKeyValue(CommentAttachment o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.CommentAttachment> createNamedQuery(final JavaSession session, String name) {
    if( "selectById".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.CommentAttachment>() {
        public final List<at.bestsolution.persistence.tasktracker.CommentAttachment> queryForList(Object... parameters) {
          throw new UnsupportedOperationException("This is a single value query");
        }

        public final at.bestsolution.persistence.tasktracker.CommentAttachment queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.CommentAttachment>() {
        public final List<at.bestsolution.persistence.tasktracker.CommentAttachment> queryForList(Object... parameters) {
          return createMapper(session).selectAll();
        }

        public final at.bestsolution.persistence.tasktracker.CommentAttachment queryForOne(Object... parameters) {
          throw new UnsupportedOperationException("This is a list value query");
        }

        public final String[] getParameterNames() {
          String[] rv = new String[0];
          int i = 0;
          return rv;
        }
      };
    }
    if( "selectAllForComment".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.CommentAttachment>() {
        public final List<at.bestsolution.persistence.tasktracker.CommentAttachment> queryForList(Object... parameters) {
          return createMapper(session).selectAllForComment(((Long)parameters[0]).longValue());
        }

        public final at.bestsolution.persistence.tasktracker.CommentAttachment queryForOne(Object... parameters) {
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

  public final MappedQuery<CommentAttachment> mappedQuery(JavaSession session, String name) {
    if("selectAll".equals(name)) {
      return createMapper(session).selectAllMappedQuery();
    }
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

  final static class ProxyData_CommentAttachment {
    public final long comment;
    public ProxyData_CommentAttachment(long comment) {
      this.comment = comment;
    }
  }
  static final class CommentAttachmentMappedQueryImpl extends CommentAttachmentMapper.CommentAttachmentMappedQuery {
    private final MappedQuery<CommentAttachment> dbQuery;

    CommentAttachmentMappedQueryImpl(MappedQuery<CommentAttachment> dbQuery) {
      this.dbQuery = dbQuery;
    }

    public final CommentAttachment unique() {
      return dbQuery.unique();
    }

    public final CommentAttachmentMapper.CommentAttachmentMappedQuery where(at.bestsolution.persistence.expr.Expression<CommentAttachment> expression) {
      dbQuery.where(expression);
      return this;
    }

    public final List<CommentAttachment> list() {
      return dbQuery.list();
    }

    public final CommentAttachmentMapper.CommentAttachmentMappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<CommentAttachment>... columns) {
    	dbQuery.orderBy(columns);
    	return this;
    }
  }
}
