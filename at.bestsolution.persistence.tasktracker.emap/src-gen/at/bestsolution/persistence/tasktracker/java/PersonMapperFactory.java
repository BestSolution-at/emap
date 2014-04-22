package at.bestsolution.persistence.tasktracker.java;

import at.bestsolution.persistence.tasktracker.PersonMapper;
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
import at.bestsolution.persistence.tasktracker.Person;
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

public final class PersonMapperFactory implements ObjectMapperFactory<at.bestsolution.persistence.tasktracker.PersonMapper,Person> {
  @Override
  public at.bestsolution.persistence.tasktracker.PersonMapper createMapper(JavaSession session) {
    return new PersonMapperImpl(session);
  }

  final static class PersonMapperImpl implements PersonMapper, at.bestsolution.persistence.java.JavaObjectMapper<Person>, ResolveDelegate {
    private final JavaSession session;
    private boolean inAutoResolve;
    private static final Logger LOGGER = Logger.getLogger(PersonMapperImpl.class);

    public PersonMapperImpl(JavaSession session) {
      this.session = session;
    }

    @Override
    public final at.bestsolution.persistence.tasktracker.Person selectById(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectById");

      String query = Util.loadFile(getClass(), "Person_selectById_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Person_selectById_default.sql");
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
        final Person rv;
        if( set.next() ) {
          rv = map_default_Person(connection,set);
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.Person> selectAll() {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Person_selectAll_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Person_selectAll_default.sql");
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

        final List<Person> rv = new ArrayList<Person>();
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
    public final PersonMappedQuery selectAllMappedQuery() {
      MappedQuery<Person> dbQuery = session.getDatabaseSupport().createMappedQuery(
        this, null,
        new ListDelegate<Person>() { public List<Person> list(MappedQuery<Person> criteria) { return selectAll((MappedQueryImpl<Person>)criteria); } }
      );
      return new PersonMappedQueryImpl(dbQuery);
    }

    final List<Person> selectAll(MappedQueryImpl<Person> criteria) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAll");

      String query = Util.loadFile(getClass(), "Person_selectAll_criteria_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Person_selectAll_criteria_default.sql");
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
        List<Person> rv = new ArrayList<Person>();
        if( isDebug ) LOGGER.debug("Mapping results started");
        while(set.next()) {
          rv.add(map_default_Person(connection, set));
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
    public final java.util.List<at.bestsolution.persistence.tasktracker.Person> selectAllForTaskRepository(long sid) {
      final boolean isDebug = LOGGER.isDebugEnabled();
      if( isDebug ) LOGGER.debug("Executing selectAllForTaskRepository");

      String query = Util.loadFile(getClass(), "Person_selectAllForTaskRepository_"+session.getDatabaseType()+".sql");
      if( query == null ) {
        query = Util.loadFile(getClass(), "Person_selectAllForTaskRepository_default.sql");
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

        final List<Person> rv = new ArrayList<Person>();
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

    public final Person map_default_Person(Connection connection, ResultSet set) throws SQLException {
      Object id = set.getObject("SID_PERSON");
      EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getPerson();
      Person rv = session.getCache().getObject(eClass,id);
      if( rv != null ) {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
        return rv;
      }
      rv = session.getProxyFactory().createProxy(eClass);
      ((EObject)rv).eSetDeliver(false);
      rv.setSid(set.getLong("SID_PERSON"));
      rv.setFirstname(set.getString("FIRSTNAME"));
      rv.setLastname(set.getString("LASTNAME"));
      ((LazyEObject)rv).setProxyData(new ProxyData_Person(set.getLong("FK_REPOSITORY")));
      ((LazyEObject)rv).setProxyDelegate(this);
      ((EObject)rv).eSetDeliver(true);
      session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
      return rv;
    }



	  @Override
	  public final void update(Person object) {
	  	final boolean isDebug = LOGGER.isDebugEnabled();
	  	if( isDebug ) {
	  		LOGGER.debug("Starting insert of '"+object+"'");
	  	}
	  
	  	if( session.getTransaction() == null ) {
	  		throw new PersistanceException("You can only modify data while in a transaction");
	  	}
	  
	  	at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement stmt = session.getDatabaseSupport().createQueryBuilder("PERSON").createUpdateStatement("SID_PERSON", getLockColumn());
	  	if( object.getFirstname() != null ) {
	  		stmt.addString("FIRSTNAME", object.getFirstname());
	  	} else {
	  		stmt.addNull("FIRSTNAME",getJDBCType("firstname"));
	  	}
	  	if( object.getLastname() != null ) {
	  		stmt.addString("LASTNAME", object.getLastname());
	  	} else {
	  		stmt.addNull("LASTNAME",getJDBCType("lastname"));
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
	  public final void insert(Person object) {
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
	  		sequenceExpression = "NEXT VALUE FOR SEQ_SID_PERSON";
	  	}
	  	at.bestsolution.persistence.java.DatabaseSupport.InsertStatement stmt = session.getDatabaseSupport().createQueryBuilder("PERSON").createInsertStatement("SID_PERSON", sequenceExpression, getLockColumn());
	  	if( object.getFirstname() != null ) {
	  		stmt.addString("FIRSTNAME", object.getFirstname());
	  	}
	  	if( object.getLastname() != null ) {
	  		stmt.addString("LASTNAME", object.getLastname());
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
      String sql = "DELETE FROM PERSON WHERE SID_PERSON IN ("+b+")";
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

    public final void delete(Person object) {
      delete(new Person[] { object });
    }

    public final void delete(Person... object) {
      final boolean isDebug = LOGGER.isDebugEnabled();

      if( isDebug ) {
        LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
      }

      if( session.getTransaction() == null ) {
        throw new PersistanceException("You can only modify data while in a transaction");
      }

      List<Object> l = new ArrayList<Object>(object.length);
      for(Person o : object) {
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

        String sql = "DELETE FROM PERSON";
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
      if(eo instanceof Person) {
        at.bestsolution.persistence.tasktracker.Person target = (at.bestsolution.persistence.tasktracker.Person)eo;
        switch(f.getFeatureID()) {
          case 3: {
            {
              EClass eClass = at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getTaskRepository();
              at.bestsolution.persistence.tasktracker.TaskRepository o = session.getCache().getObject(eClass, ((ProxyData_Person)proxyData).repository);
              if( o == null ) {
                o = session.createMapper(at.bestsolution.persistence.tasktracker.TaskRepositoryMapper.class).selectById(((ProxyData_Person)proxyData).repository);
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
      return "PERSON";
    }

    private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
    private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
    private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
    private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

    static {
      PROPERTY_COL_MAPPING.put("sid","SID_PERSON");
      PROPERTY_COL_MAPPING.put("firstname","FIRSTNAME");
      PROPERTY_COL_MAPPING.put("lastname","LASTNAME");
      PROPERTY_COL_MAPPING.put("repository","FK_REPOSITORY");

      TYPE_MAPPING.put("sid",JDBCType.LONG);
      TYPE_MAPPING.put("firstname",JDBCType.STRING);
      TYPE_MAPPING.put("lastname",JDBCType.STRING);
      TYPE_MAPPING.put("repository",JDBCType.LONG);

      REF_ID_FEATURES.put("repository",at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getBaseObject_Sid());
      REFERENCE_FEATURES.add(at.bestsolution.persistence.tasktracker.TasktrackerPackage.eINSTANCE.getPerson_Repository());
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

    public final <P> P getPrimaryKeyValue(Person o) {
      return (P)(Object)o.getSid();
    }

  }

  public final NamedQuery<at.bestsolution.persistence.tasktracker.Person> createNamedQuery(final JavaSession session, String name) {
    if( "selectById".equals(name) ) {
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Person>() {
        public final List<at.bestsolution.persistence.tasktracker.Person> queryForList(Object... parameters) {
          throw new UnsupportedOperationException("This is a single value query");
        }

        public final at.bestsolution.persistence.tasktracker.Person queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Person>() {
        public final List<at.bestsolution.persistence.tasktracker.Person> queryForList(Object... parameters) {
          return createMapper(session).selectAll();
        }

        public final at.bestsolution.persistence.tasktracker.Person queryForOne(Object... parameters) {
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
      return new NamedQuery<at.bestsolution.persistence.tasktracker.Person>() {
        public final List<at.bestsolution.persistence.tasktracker.Person> queryForList(Object... parameters) {
          return createMapper(session).selectAllForTaskRepository(((Long)parameters[0]).longValue());
        }

        public final at.bestsolution.persistence.tasktracker.Person queryForOne(Object... parameters) {
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

  public final MappedQuery<Person> mappedQuery(JavaSession session, String name) {
    if("selectAll".equals(name)) {
      return createMapper(session).selectAllMappedQuery();
    }
    throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
  }

  final static class ProxyData_Person {
    public final long repository;
    public ProxyData_Person(long repository) {
      this.repository = repository;
    }
  }
  static final class PersonMappedQueryImpl extends PersonMapper.PersonMappedQuery {
    private final MappedQuery<Person> dbQuery;

    PersonMappedQueryImpl(MappedQuery<Person> dbQuery) {
      this.dbQuery = dbQuery;
    }

    public final Person unique() {
      return dbQuery.unique();
    }

    public final PersonMapper.PersonMappedQuery where(at.bestsolution.persistence.expr.Expression<Person> expression) {
      dbQuery.where(expression);
      return this;
    }

    public final List<Person> list() {
      return dbQuery.list();
    }

    public final PersonMapper.PersonMappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<Person>... columns) {
    	dbQuery.orderBy(columns);
    	return this;
    }
  }
}
