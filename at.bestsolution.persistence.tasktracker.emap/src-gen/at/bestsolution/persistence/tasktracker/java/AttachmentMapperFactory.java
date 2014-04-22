package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.AttachmentMapper;
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
import at.bestsolution.persistence.tasktracker.Attachment;
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

@SuppressWarnings("all")
public final class AttachmentMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.AttachmentMapper,Attachment> {
  @Override
  public at.bestsolution.persistence.tasktracker.AttachmentMapper createMapper(JavaSession session) {
    return new AttachmentMapperImpl(session);
  }

  final static class AttachmentMapperImpl implements AttachmentMapper, at.bestsolution.persistence.java.JavaObjectMapper<Attachment>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(AttachmentMapperImpl.class);

    public AttachmentMapperImpl(JavaSession session) {
      this.session = session;
    }


    public final Attachment map_default_Attachment(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_ATTACHMENT");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getAttachment();
      Attachment rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_ATTACHMENT"));
      rv.setBinary(session.handleBlob("ATTACHMENT","BINARY","SID_ATTACHMENT",set));
      rv.setDescription(set.getString("DESCRIPTION"));
      rv.setMimetype(set.getString("MIMETYPE"));
      rv.setTitle(set.getString("TITLE"));
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }



	  @Override
	  public final void update(Attachment object) {
	  	final boolean isDebug = LOGGER.isDebugEnabled();
	  	if( isDebug ) {
	  		LOGGER.debug("Starting insert of '"+object+"'");
	  	}
	  
	  	if( session.getTransaction() == null ) {
	  		throw new PersistanceException("You can only modify data while in a transaction");
	  	}
	  	
	  	// Built the query
	  	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("ATTACHMENT").createUpdateStatement("SID_ATTACHMENT", getLockColumn());
	  	if( object.getBinary() != null ) {
	  		if( Util.isModified(session, object, "binary") ) {
	  			stmt.addBlob("BINARY", object.getBinary());
	  		}
	  	} else {
	  		stmt.addNull("BINARY",getJDBCType("binary"));
	  	}
	  	if( object.getDescription() != null ) {
	  		stmt.addString("DESCRIPTION", object.getDescription());
	  	} else {
	  		stmt.addNull("DESCRIPTION",getJDBCType("description"));
	  	}
	  	if( object.getMimetype() != null ) {
	  		stmt.addString("MIMETYPE", object.getMimetype());
	  	} else {
	  		stmt.addNull("MIMETYPE",getJDBCType("mimetype"));
	  	}
	  	if( object.getTitle() != null ) {
	  		stmt.addString("TITLE", object.getTitle());
	  	} else {
	  		stmt.addNull("TITLE",getJDBCType("title"));
	  	}
	  	
	  	// Execute the query
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
	  public final void insert(Attachment object) {
	  	final boolean isDebug = LOGGER.isDebugEnabled();
	  	if( isDebug ) {
	  		LOGGER.debug("Starting insert of '"+object+"'");
	  	}
	  	
	  	if( session.getTransaction() == null ) {
	  		throw new PersistanceException("You can only modify data while in a transaction");
	  	}
	  	
	  	// Handle Expressions
	  	String sequenceExpression = null;
	  	if( "h2".equals(session.getDatabaseType()) ) {
	  		sequenceExpression = null;
	  	}
	  	if( "Firebird".equals(session.getDatabaseType()) ) {
	  		sequenceExpression = "NEXT VALUE FOR SEQ_SID_ATTACHMENT";
	  	}
	  	
	  	// Build the SQL
	  	at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("ATTACHMENT").createInsertStatement("SID_ATTACHMENT", sequenceExpression, getLockColumn());
	  	if( object.getBinary() != null ) {
	  		stmt.addBlob("BINARY", object.getBinary());
	  	}
	  	if( object.getDescription() != null ) {
	  		stmt.addString("DESCRIPTION", object.getDescription());
	  	}
	  	if( object.getMimetype() != null ) {
	  		stmt.addString("MIMETYPE", object.getMimetype());
	  	}
	  	if( object.getTitle() != null ) {
	  		stmt.addString("TITLE", object.getTitle());
	  	}
	  	
	  	// Execute the query
	  	Connection connection = session.checkoutConnection();
	  	try {
	  		object.setSid(stmt.execute(connection));
	  		
	  		
	  		session.registerObject(object,getPrimaryKeyValue(object),getLockColumn() != null ? 0 : -1);
	  	} catch(SQLException e) {
	  		throw new PersistanceException(e);
	  	} finally {
	  		session.returnConnection(connection);
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
      String sql = "DELETE FROM ATTACHMENT WHERE SID_ATTACHMENT IN ("+b+")";
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

    public final void delete(Attachment object) {
      delete(new Attachment[] { object });
    }

    public final void delete(Attachment... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(Attachment o : object) {
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

        String sql = "DELETE FROM ATTACHMENT";
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
      if(eo instanceof Attachment) {
        at.bestsolution.persistence.tasktracker.Attachment target = (at.bestsolution.persistence.tasktracker.Attachment)eo;
      }
      return false;
    }

    public final String getTableName() {
      return "ATTACHMENT";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_ATTACHMENT");
      PROPERTY_COL_MAPPING.put("binary","BINARY");
      PROPERTY_COL_MAPPING.put("description","DESCRIPTION");
      PROPERTY_COL_MAPPING.put("mimetype","MIMETYPE");
      PROPERTY_COL_MAPPING.put("title","TITLE");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("binary",JDBCType.BLOB);
      TYPE_MAPPING.put("description",JDBCType.STRING);
      TYPE_MAPPING.put("mimetype",JDBCType.STRING);
      TYPE_MAPPING.put("title",JDBCType.STRING);

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

    public final <P> P getPrimaryKeyValue(Attachment o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.Attachment> createNamedQuery(final JavaSession session, String name) {
    throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
  }

  public final MappedQuery<Attachment> mappedQuery(JavaSession session, String name) {
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

}
