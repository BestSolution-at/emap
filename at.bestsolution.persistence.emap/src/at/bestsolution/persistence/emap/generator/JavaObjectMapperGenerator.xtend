package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EMapping
import at.bestsolution.persistence.emap.eMap.EMappingAttribute
import at.bestsolution.persistence.emap.eMap.EMappingBundle
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import at.bestsolution.persistence.emap.eMap.ENamedQuery
import at.bestsolution.persistence.emap.eMap.EObjectSection
import at.bestsolution.persistence.emap.eMap.EParameter
import at.bestsolution.persistence.emap.eMap.EQuery
import at.bestsolution.persistence.emap.eMap.ReturnType
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference

import com.google.inject.Inject

class JavaObjectMapperGenerator {

  @Inject extension
  var UtilCollection util;

  def generateMapperRegistry(EMappingBundle bundleDef) '''
  package mappings;

  import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
  import at.bestsolution.persistence.ObjectMapper;
  import at.bestsolution.persistence.java.ObjectMapperFactory;
  import java.util.HashMap;
  import java.util.Map;

  public final class «bundleDef.name»ObjectMapperFactoriesProvider implements ObjectMapperFactoriesProvider {
    private Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> factories = new HashMap<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>>();
    public «bundleDef.name»ObjectMapperFactoriesProvider() {
      «FOR e : bundleDef.entities»
        factories.put(«e.lookupEClass.instanceClassName»Mapper.class, new «e.lookupEClass.mapperName»());
      «ENDFOR»
    }

    public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> getMapperFactories() {
      return factories;
    }
  }
  '''

  def mapperName(EClass eClass) {
    return
      eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf('.'))
      + ".java"+eClass.instanceClassName.substring(eClass.instanceClassName.lastIndexOf('.'))+"MapperFactory"
  }

  def generateJava(EMappingEntityDef entityDef, EClass eClass) '''
  package «entityDef.package.name».java;

  import «entityDef.package.name».«entityDef.entity.name»Mapper;
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
  import «entityDef.lookupEClass.packageName».«eClass.EPackage.name.toFirstUpper»Factory;
  import «eClass.instanceClassName»;
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

  public final class «entityDef.entity.name»MapperFactory implements ObjectMapperFactory<«entityDef.package.name».«entityDef.entity.name»Mapper,«eClass.name»> {
    @Override
    public «entityDef.package.name».«entityDef.entity.name»Mapper createMapper(JavaSession session) {
      return new «entityDef.entity.name»MapperImpl(session);
    }

    final static class «entityDef.entity.name»MapperImpl implements «entityDef.entity.name»Mapper, at.bestsolution.persistence.java.JavaObjectMapper<«eClass.name»>, ResolveDelegate {
      private final JavaSession session;
      private boolean inAutoResolve;
      private static final Logger LOGGER = Logger.getLogger(«entityDef.entity.name»MapperImpl.class);

      public «entityDef.entity.name»MapperImpl(JavaSession session) {
        this.session = session;
      }

      «FOR query : entityDef.entity.namedQueries»
        @Override
        public final «IF query.returnType == ReturnType.LIST»java.util.List<«ENDIF»«eClass.instanceClassName»«IF query.returnType == ReturnType::LIST»>«ENDIF» «query.name»(«query.parameters.join(",",[p|p.type + " " + p.name])») {
          final boolean isDebug = LOGGER.isDebugEnabled();
          if( isDebug ) LOGGER.debug("Executing «query.name»");

          String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
          if( query == null ) {
            query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
          }

          if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

          Connection connection = session.checkoutConnection();
          try {

            «IF ! query.parameters.empty»
              final ProcessedSQL processedSQL = Util.processSQL(query);
              if( isDebug ) {
                LOGGER.debug("	Processed-Query: " + processedSQL.sql);
              }

              if( isDebug ) LOGGER.debug("Preparing query");
              final PreparedStatement pStmt = connection.prepareStatement(processedSQL.sql);

              List<String> debugParams = new ArrayList<String>();
              for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
                if( "«query.parameters.head.name»".equals(processedSQL.dynamicParameterNames.get(i)) ) {
                  if( isDebug ) {
                    debugParams.add("«query.parameters.head.name» = " + «query.parameters.head.name»);
                  }
                  pStmt.«query.parameters.head.pstmtMethod»(i+1,«query.parameters.head.name»);
                }
                «FOR p : query.parameters.filter[it!=query.parameters.head]»
                else if("«p.name»".equals(processedSQL.dynamicParameterNames.get(i))) {
                  if( isDebug ) {
                    debugParams.add("«p.name» = " + «p.name»);
                  }
                  pStmt.«p.pstmtMethod»(i+1,«p.name»);
                }
                «ENDFOR»
              }
              if( isDebug ) {
                LOGGER.debug(" Dynamic-Parameters: " + debugParams);
              }
            «ELSE»
              if( isDebug ) LOGGER.debug("Preparing query");
              final PreparedStatement pStmt = connection.prepareStatement(query);
            «ENDIF»
            if( isDebug ) LOGGER.debug("Executing query");
            ResultSet set = pStmt.executeQuery();

            «IF query.returnType == ReturnType.LIST»
              final List<«eClass.name»> rv = new ArrayList<«eClass.name»>();
              «resultMapCode(query,eClass)»
            «ELSE»
              if( isDebug ) LOGGER.debug("Mapping result started");
              final «eClass.name» rv;
              «IF query.queries.head.mapping.attributes.empty»
                if( set.next() ) {
                  rv = map_default_«eClass.name»(connection,set);
                } else {
                  if( isDebug ) LOGGER.debug("No result for query");
                  rv = null;
                }
              «ENDIF»
            «ENDIF»
            set.close();
            pStmt.close();
            if( isDebug ) LOGGER.debug("Mapping result ended");
            return rv;
          } catch(SQLException e) {
            throw new PersistanceException(e);
          } finally {
            session.returnConnection(connection);
          }
        }
        «IF !query.queries.head.mapping.attributes.empty»
          public final «eClass.name» map_«query.name»_«eClass.name»(Connection connection, ResultSet set) throws SQLException {
            Object id = set.getObject("«query.queries.head.mapping.prefix+"_"»«entityDef.entity.allAttributes.findFirst[pk].columnName»");
            EClass eClass = «eClass.packageName».«eClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«eClass.name.toFirstUpper»();
            «eClass.name» rv = session.getCache().getObject(eClass,id);
            if( rv != null ) {
              if( LOGGER.isDebugEnabled() ) {
                LOGGER.debug("Using cached version");
              }
              return rv;
            }
            rv = session.getProxyFactory().createProxy(eClass);
            ((EObject)rv).eSetDeliver(false);
            «attrib_resultMapContent("rv",query.queries.head.mapping,query.queries.head.mapping.entity.lookupEClass,query.queries.head.mapping.prefix+"_")»
            ((EObject)rv).eSetDeliver(true);
            session.registerObject(rv,getPrimaryKeyValue(rv));
            return rv;
          }

          «FOR section : query.queries.head.mapping.attributes.collectMappings»
          «var entityEClass = section.entity.lookupEClass»
          public final «entityEClass.instanceClassName» map_«query.name»_«entityEClass.name»(Connection connection, ResultSet set) throws SQLException {
            Object id = set.getObject("«section.prefix+"_"»«section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[pk].columnName»");
            if( id == null ) {
              return null;
            }
            EClass eClass = «entityEClass.packageName».«entityEClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«entityEClass.name.toFirstUpper»();
            «entityEClass.instanceClassName» rv = session.getCache().getObject(eClass,id);
            if( rv != null) {
              if( LOGGER.isDebugEnabled() ) {
                LOGGER.debug("Using cached version");
              }
              return rv;
            }
            rv = session.getProxyFactory().createProxy(eClass);
            ((EObject)rv).eSetDeliver(false);
            «attrib_resultMapContent("rv", section, entityEClass, section.prefix+"_")»
            ((EObject)rv).eSetDeliver(true);
            session.registerObject(rv, id);
            return rv;
          }
          «ENDFOR»
        «ENDIF»
        «IF query.parameters.empty»
        public final «eClass.name»MappedQuery «query.name»MappedQuery() {
          MappedQuery<«eClass.name»> dbQuery = session.getDatabaseSupport().createMappedQuery(
            this, «IF query.queries.head.mapping.prefix != null»"«query.queries.head.mapping.prefix»"«ELSE»null«ENDIF»,
            new ListDelegate<«eClass.name»>() { public List<«eClass.name»> list(MappedQuery<«eClass.name»> criteria) { return «query.name»((MappedQueryImpl<«eClass.name»>)criteria); } }
          );
          return new «eClass.name»MappedQueryImpl(dbQuery);
        }

        final List<«eClass.name»> «query.name»(MappedQueryImpl<«eClass.name»> criteria) {
          final boolean isDebug = LOGGER.isDebugEnabled();
          if( isDebug ) LOGGER.debug("Executing «query.name»");

          String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_"+session.getDatabaseType()+".sql");
          if( query == null ) {
            query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_criteria_default.sql");
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
            List<«eClass.name»> rv = new ArrayList<«eClass.name»>();
            «resultMapCode(query,eClass)»
            return rv;
          } catch(SQLException e) {
            throw new PersistanceException(e);
          } finally {
            session.returnConnection(connection);
          }
        }
        «ENDIF»
      «ENDFOR»

      public final «eClass.name» map_default_«eClass.name»(Connection connection, ResultSet set) throws SQLException {
        Object id = set.getObject("«entityDef.entity.allAttributes.findFirst[pk].columnName»");
        EClass eClass = «eClass.packageName».«eClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«eClass.name.toFirstUpper»();
        «eClass.name» rv = session.getCache().getObject(eClass,id);
        if( rv != null ) {
          if( LOGGER.isDebugEnabled() ) {
            LOGGER.debug("Using cached version");
          }
          return rv;
        }
        rv = session.getProxyFactory().createProxy(eClass);
        ((EObject)rv).eSetDeliver(false);
        «attrib_resultMapContent("rv",entityDef.entity.allAttributes, eClass, "")»
        ((EObject)rv).eSetDeliver(true);
        session.registerObject(rv,getPrimaryKeyValue(rv));
        return rv;
      }

      «FOR a : entityDef.entity.collectAllAttributes.filter[!resolved && eClass.getEStructuralFeature(name).many]»
      private final Collection<«(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»> load_«eClass.name»_«a.name»(Connection connection, Object sid) throws SQLException {
        boolean isDebug = LOGGER.isDebugEnabled();
        if( isDebug ) {
        	LOGGER.debug("Loading primitive multi valued feature «eClass.name»#«a.name» for parent id '"+sid+"'");
        }

        if(!session.getDatabaseSupport().isNestedResultSetsSupported()) {
        	if( isDebug ) {
        		LOGGER.debug("Database does not support nested result sets - opening 2nd connection");
        		connection = session.checkoutConnection();
        	}
        }

        PreparedStatement stmt = null;
        ResultSet s = null;
        try {
        	String sql = "SELECT * FROM «eClass.name.toUpperCase»_«a.name.toUpperCase» WHERE FK_«eClass.name.toUpperCase»_«a.name.toUpperCase» = ?";
        	if( isDebug ) {
        		LOGGER.debug("Preparing query: '"+sql+"'");
        	}
        	stmt = connection.prepareStatement(sql);
        	stmt.setObject(1,sid);
        	s = stmt.executeQuery();
        	List<«(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»> rv = new ArrayList<«(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»>();
        	while( s.next() ) {
        		rv.add(«a.resultMethod("s",eClass,"ELT","")»);
        	}
        	if( isDebug ) {
        		LOGGER.debug("Loaded primitive values are: " + rv);
        	}
        	return rv;
        } finally {
        	try {
        		if( s != null ) {
        			s.close();
        		}

        		if( stmt != null ) {
        			stmt.close();
        		}
        	} catch(SQLException e) {
        		LOGGER.fatal("Failed to clean up resources", e);
        	} finally {
        		if(!session.getDatabaseSupport().isNestedResultSetsSupported()) {
        			session.returnConnection(connection);
        		}
        	}
        }
      }

      private final void clear_«eClass.name»_«a.name»(Connection connection, Object sid) throws SQLException {
      	boolean isDebug = LOGGER.isDebugEnabled();
      	if( isDebug ) {
      		LOGGER.debug("Removing all primitive multi values «eClass.name»#«a.name» for parent id '"+sid+"'");
      	}
        PreparedStatement stmt = null;
        try {
        	String sql = "DELETE FROM «eClass.name.toUpperCase»_«a.name.toUpperCase» WHERE FK_«eClass.name.toUpperCase»_«a.name.toUpperCase» = ?";
        	if( isDebug ) {
        		LOGGER.debug("Preparing statement: " + sql);
        	}
        	stmt = connection.prepareStatement(sql);
          	stmt.setObject(1,sid);
          	stmt.execute();
          	if( isDebug ) {
          		LOGGER.debug("Finished clearing items");
          	}
        } finally {
          	if( stmt != null ) {
            	stmt.close();
          	}
        }
      }

      private final void insert_«eClass.name»_«a.name»(Connection connection, Object sid, Collection<«(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType»> data) throws SQLException {
        boolean isDebug = LOGGER.isDebugEnabled();
        if( isDebug ) {
        	LOGGER.debug("Inserting primitive multi values «eClass.name»#«a.name» for parent id "+sid+" : " + data);
        }
        PreparedStatement stmt = null;
        try {
        	String sql = "INSERT INTO «eClass.name.toUpperCase»_«a.name.toUpperCase» (FK_«eClass.name.toUpperCase»_«a.name.toUpperCase»,ELT) VALUES (?,?)";
        	if( isDebug ) {
        		LOGGER.debug("Preparing statement " + sql);
        	}
        	stmt = connection.prepareStatement(sql);
        	stmt.setObject(1,sid);
        	for( «(eClass.getEStructuralFeature(a.name) as org.eclipse.emf.ecore.EAttribute).objectType» o : data ) {
        		stmt.setObject(2, o);
        		stmt.execute();
        	}
        	if( isDebug ) {
        		LOGGER.debug("Finished storing items");
        	}
        } finally {
        	if( stmt != null ) {
        		stmt.close();
        	}
        }
      }
      «ENDFOR»

      @Override
      public final void update(«eClass.name» object) {
        final boolean isDebug = LOGGER.isDebugEnabled();
        if( isDebug ) {
          LOGGER.debug("Starting update of '"+object+"'");
        }

        if( session.getTransaction() == null ) {
          throw new PersistanceException("You can only modify data while in a transaction");
        }

        QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»");
        if( isDebug ) {
          LOGGER.debug("The query builder is '"+b+"'");
        }
        final LazyEObject leo = object instanceof LazyEObject ? (LazyEObject)object : null;
        «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
          if( pk ) {
            return false;
          } if(eClass.getEStructuralFeature(name) instanceof EReference) {
            val r = eClass.getEStructuralFeature(name) as EReference;
            if( r.containment ) {
              return false;
            }
            return true;
          } else {
            return true;
          }
        ].sort([a,b|return sortAttributes(eClass,a,b)])»
          «IF a.columnName != null»
            «IF eClass.getEStructuralFeature(a.name).many»
              if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
                b.addColumn("«a.columnName»", "«a.name»");
              }
            «ELSE»
              b.addColumn("«a.columnName»", "«a.name»");
            «ENDIF»
          «ELSEIF a.isSingle(eClass)»
            «val ownerClass = eClass.getEStructuralFeature(a.name).EContainingClass»
            if( leo == null || leo.isResolved(«ownerClass.packageName».«ownerClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«ownerClass.name»_«a.name.toFirstUpper»()) ) {
              b.addColumn("«a.parameters.head»","«a.name».«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name»");
            }
          «ENDIF»
        «ENDFOR»
        ProcessedSQL psql = b.buildUpdate("«entityDef.entity.allAttributes.findFirst[pk].columnName»","«entityDef.entity.allAttributes.findFirst[pk].name»");
        if( isDebug ) {
          LOGGER.debug("The processed SQL: " + psql.sql);
        }
        Connection connection = session.checkoutConnection();
        try {
          List<String> debugParams = new ArrayList<String>();
          PreparedStatement pstmt = connection.prepareStatement(psql.sql);
          for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
            «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
                if(eClass.getEStructuralFeature(name) instanceof EReference) {
                  val r = eClass.getEStructuralFeature(name) as EReference;
                  if( r.containment ) {
                    return false;
                  }
                  return true;
                } else {
                  return true;
                }
              ].sort([a,b|return sortAttributes(eClass,a,b)])»
              «IF a.columnName != null»
                «IF eClass.getEStructuralFeature(a.name).many»
                  if("«a.name»".equals(psql.dynamicParameterNames.get(i))) {
                    if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
                      // TODO CONVERT TO ARRAY AND STORE
                    }
                  }
                «ELSE»
                  if("«a.name»".equals(psql.dynamicParameterNames.get(i))) {
                    pstmt.«a.pstmtMethodCall(eClass,"object")»;
                    if( isDebug ) {
                      debugParams.add("«a.columnName» = " + object.«IF a.isBoolean(eClass)»is«ELSE»get«ENDIF»«a.name.toFirstUpper»());
                    }
                  }
                «ENDIF»
              «ELSEIF a.isSingle(eClass)»
                if("«a.name».«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name»".equals(psql.dynamicParameterNames.get(i))) {
                  if( object.get«a.name.toFirstUpper»() == null ) {
                    pstmt.setObject(i+1,null);
                    if( isDebug ) {
                      debugParams.add("«a.parameters.head» = NULL");
                    }
                  } else {
                    pstmt.«a.pstmtMethod(eClass)»(i+1,object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
                    if( isDebug ) {
                      debugParams.add("«a.parameters.head» = " + object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
                    }
                  }
                }
              «ENDIF»
            «ENDFOR»
          }
          if( isDebug ) {
            LOGGER.debug(" Dynamic-Parameters: " + debugParams);
          }
          pstmt.executeUpdate();
          pstmt.close();
          «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
                if(eClass.getEStructuralFeature(name) instanceof EReference) {
                  val r = eClass.getEStructuralFeature(name) as EReference;
                  if( r.containment ) {
                    return false;
                  }
                  return true;
                } else {
                  return true;
                }
              ].sort([a,b|return sortAttributes(eClass,a,b)])»
              «IF a.columnName != null»
                «IF eClass.getEStructuralFeature(a.name).many»
                if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
                	if( Util.isModified(session,object,"«a.name»") ) {
                		clear_«eClass.name»_«a.name»(connection,getPrimaryKeyValue(object));
                		insert_«eClass.name»_«a.name»(connection,getPrimaryKeyValue(object),object.get«a.name.toFirstUpper»());
                	}
                }
				«ENDIF»
              «ENDIF»
          «ENDFOR»
          session.clearChangeDescription(object);
        } catch(SQLException e) {
          throw new PersistanceException(e);
        } finally {
          if( isDebug ) {
            LOGGER.debug("Finished update");
          }
          session.returnConnection(connection);
        }
      }

      @Override
      public final void insert(«eClass.name» object) {
        final boolean isDebug = LOGGER.isDebugEnabled();
        if( isDebug ) {
          LOGGER.debug("Starting insert of '"+object+"'");
        }

        if( session.getTransaction() == null ) {
          throw new PersistanceException("You can only modify data while in a transaction");
        }

        «val pkAttribute = entityDef.entity.collectDerivedAttributes.values.findFirst[pk]»
        «IF pkAttribute == null || entityDef.entity.extensionType == "extends"»
          // TODO WHAT TO GENERATE
        «ELSE»
          QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»");
          «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
            if( pk ) {
              return false;
            } if(eClass.getEStructuralFeature(name) instanceof EReference) {
              val r = eClass.getEStructuralFeature(name) as EReference;
              if( r.containment ) {
                return false;
              }
              return true;
            } else {
              return true;
            }
          ].sort([a,b|return sortAttributes(eClass,a,b)])»
            «IF a.columnName != null»
              «IF eClass.getEStructuralFeature(a.name).many»
                if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
                  b.addColumn("«a.columnName»", "«a.name»");
                }
              «ELSE»
                b.addColumn("«a.columnName»", "«a.name»");
              «ENDIF»
            «ELSEIF a.isSingle(eClass)»
              b.addColumn("«a.parameters.head»","«a.name».«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name»");
            «ENDIF»
          «ENDFOR»
          b.addColumn("e_version","##e_version##");
          «val dbSupport = pkAttribute.findDatabaseSupport»
          ProcessedSQL psql = null;
          «IF dbSupport != null»
            «FOR d : dbSupport»
              if( "«d.databaseId»".equals(session.getDatabaseType()) ) {
                psql = b.buildInsert("«pkAttribute.columnName»",«IF d.getSequenceStatement(pkAttribute)!=null»"«d.getSequenceStatement(pkAttribute)»"«ELSE»null«ENDIF»);
              }
            «ENDFOR»
          «ELSE»
          psql = b.buildInsert("«pkAttribute.columnName»",null);
          «ENDIF»
          if( isDebug ) {
            LOGGER.debug("The query: " + psql.sql);
          }

          Connection connection = session.checkoutConnection();
          try {
            PreparedStatement pstmt = connection.prepareStatement(psql.sql);
            List<String> debugParams = new ArrayList<String>();
            for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
              if( "##e_version##".equals(psql.dynamicParameterNames.get(i)) ) {
                pstmt.setLong(i+1,0);
                if( isDebug ) {
                  debugParams.add("e_version = 0");
                }
              }
              «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
                if( pk ) {
                  return false;
                } if(eClass.getEStructuralFeature(name) instanceof EReference) {
                  val r = eClass.getEStructuralFeature(name) as EReference;
                  if( r.containment ) {
                    return false;
                  }
                  return true;
                } else {
                  return true;
                }
              ].sort([a,b|return sortAttributes(eClass,a,b)])»
              «IF a.columnName != null»
                «IF eClass.getEStructuralFeature(a.name).many»
                  if("«a.name»".equals(psql.dynamicParameterNames.get(i))) {
                    if( session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
                      // TODO CONVERT TO ARRAY AND STORE
                    }
                  }
                «ELSE»
                  else if("«a.name»".equals(psql.dynamicParameterNames.get(i))) {
                    pstmt.«a.pstmtMethodCall(eClass,"object")»;
                    if( isDebug ) {
                      debugParams.add("«a.columnName» = " + object.«IF a.isBoolean(eClass)»is«ELSE»get«ENDIF»«a.name.toFirstUpper»());
                    }
                  }
                «ENDIF»
              «ELSEIF a.isSingle(eClass)»
                else if("«a.name».«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name»".equals(psql.dynamicParameterNames.get(i))) {
                  if( object.get«a.name.toFirstUpper»() == null ) {
                    pstmt.setObject(i+1,null);
                    if( isDebug ) {
                      debugParams.add("«a.parameters.head» = NULL");
                    }
                  } else {
                    pstmt.«a.pstmtMethod(eClass)»(i+1,object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
                    if( isDebug ) {
                      debugParams.add("«a.parameters.head» = " + object.get«a.name.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name.toFirstUpper»());
                    }
                  }
                }
              «ENDIF»
            «ENDFOR»
            }
            if( isDebug ) {
              LOGGER.debug("The parameters: " + debugParams);
            }

            if( isDebug ) {
              LOGGER.debug("Reading back primary key from database.");
            }
            «IF dbSupport != null»
              «FOR d : dbSupport»
                if( "«d.databaseId»".equals(session.getDatabaseType()) ) {
                  «IF d.supportsGeneratedKeys»
                    if( isDebug ) {
                      LOGGER.debug("Useing a generated key for primary key retrieval");
                    }
                    pstmt.executeUpdate();
                    ResultSet set = pstmt.getGeneratedKeys();
                    if( set.next() ) {
                      //TODO We need to get the correct type
                      if( isDebug ) {
                        LOGGER.debug("The generated key is '"+set.getLong(1)+"'");
                      }
                      object.set«pkAttribute.name.toFirstUpper»(set.getLong(1));
                    } else {
                      //TODO Throw exception
«««											throw new PersitenceException();
                    }
                    set.close();
                  «ELSEIF d.supportsGeneratedKeyAsResultSet»
                    if( isDebug ) {
                      LOGGER.debug("Useing a generated key with result-set");
                    }
                    ResultSet set = pstmt.executeQuery();
                    if( set.next() ) {
                      //TODO We need to get the correct type
                      if( isDebug ) {
                        LOGGER.debug("The generated key is '"+set.getLong(1)+"'");
                      }
                      object.set«pkAttribute.name.toFirstUpper»(set.getLong(1));
                    } else {
                      //TODO Throw exception
                    }
                  «ENDIF»
                }
              «ENDFOR»
            «ENDIF»
            pstmt.close();
            «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
                if( pk ) {
                  return false;
                } if(eClass.getEStructuralFeature(name) instanceof EReference) {
                  val r = eClass.getEStructuralFeature(name) as EReference;
                  if( r.containment ) {
                    return false;
                  }
                  return true;
                } else {
                  return true;
                }
              ].sort([a,b|return sortAttributes(eClass,a,b)])»
             «IF a.columnName != null»
             	«IF eClass.getEStructuralFeature(a.name).many»
             		if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
             			insert_«eClass.name»_«a.name»(connection,object.get«pkAttribute.name.toFirstUpper»(),object.get«a.name.toFirstUpper»());
             		}
             	«ENDIF»
            «ENDIF»
            «ENDFOR»
            «IF entityDef.entity.collectAllAttributes.findFirst[!isSingle(eClass) && resolved && opposite != null && opposite.opposite == it && relationTable != null ] != null»
              «FOR e : entityDef.entity.collectAllAttributes.filter[!isSingle(eClass) && resolved && opposite != null && opposite.opposite == it && relationTable != null ]»
              for(«e.getOpposite(eClass).EContainingClass.instanceClassName» e : object.get«e.name.toFirstUpper»()) {
                session.scheduleRelationSQL(createInsertRelationSQL_«e.name»(connection,object,e));
              }
              «ENDFOR»
            «ENDIF»
            session.registerObject(object,getPrimaryKeyValue(object));
          } catch(SQLException e) {
            throw new PersistanceException(e);
          } finally {
            if( isDebug ) {
              LOGGER.debug("Finished insert");
            }
            session.returnConnection(connection);
          }
        «ENDIF»
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
«««	TODO We should create more clever SQL e.g. using ranges
        String sql = "DELETE FROM «entityDef.tableName» WHERE «entityDef.entity.collectDerivedAttributes.values.findFirst[pk].columnName» IN ("+b+")";
        Connection connection = session.checkoutConnection();

        try {
          «FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
                if(eClass.getEStructuralFeature(name) instanceof EReference) {
                  val r = eClass.getEStructuralFeature(name) as EReference;
                  if( r.containment ) {
                    return false;
                  }
                  return true;
                } else {
                  return true;
                }
              ].sort([a,b|return sortAttributes(eClass,a,b)])»
              «IF a.columnName != null»
                «IF eClass.getEStructuralFeature(a.name).many»
                if( ! session.getDatabaseSupport().isArrayStoreSupported(«eClass.getEStructuralFeature(a.name).EType.instanceClassName».class) ) {
                	for( Object i : id ) {
                		clear_«eClass.name»_«a.name»(connection,i);
                	}
                }
				«ENDIF»
              «ENDIF»
          «ENDFOR»

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

      public final void delete(«eClass.name» object) {
        delete(new «eClass.name»[] { object });
      }

      public final void delete(«eClass.name»... object) {
        final boolean isDebug = LOGGER.isDebugEnabled();

        if( isDebug ) {
          LOGGER.debug("Started delete the following objects '"+Arrays.toString(object)+"'");
        }

        if( session.getTransaction() == null ) {
          throw new PersistanceException("You can only modify data while in a transaction");
        }

        List<Object> l = new ArrayList<Object>(object.length);
        for(«eClass.name» o : object) {
          l.add(o.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
          session.unregisterObject(o,getPrimaryKeyValue(o));
        }
        deleteById(false, l.toArray());
        if( isDebug ) {
          LOGGER.debug("Finished delete");
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
        if(eo instanceof «eClass.name») {
          «resolve(entityDef.entity,eClass)»
        }
        «FOR e : entityDef.entity.collectEnities»
        else if(eo instanceof «e.lookupEClass.instanceClassName») {
          «resolve(e,e.lookupEClass)»
        }
        «ENDFOR»
        return false;
      }

      public final String getTableName() {
        return "«entityDef.tableName»";
      }

      private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
      private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
      private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
      private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();

      static {
        «FOR a : entityDef.entity.collectAllAttributes.filter[isSingle(eClass)]»
          «IF a.resolved»
            PROPERTY_COL_MAPPING.put("«a.name»","«a.parameters.head»");
          «ELSE»
            PROPERTY_COL_MAPPING.put("«a.name»","«a.columnName»");
          «ENDIF»
        «ENDFOR»

        «FOR a : entityDef.entity.collectAllAttributes.filter[isSingle(eClass)]»
          TYPE_MAPPING.put("«a.name»",JDBCType.«a.jdbcType(eClass)»);
        «ENDFOR»

        «FOR a : entityDef.entity.collectAllAttributes.filter[isSingle(eClass) && resolved]»
          «val att = a.getEAttribute(eClass)»
          REF_ID_FEATURES.put("«a.name»",«att.EContainingClass.packageName».«att.EContainingClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«att.EContainingClass.name»_«att.name.toFirstUpper»());
        «ENDFOR»
        «val primaryKey = entityDef.entity.collectAllAttributes.findFirst[pk].columnName»
        «FOR a : entityDef.entity.collectAllAttributes.filter[isSingle(eClass) && resolved && parameters.head != primaryKey]»
          «val ref = eClass.getEStructuralFeature(a.name) as EReference»
          REFERENCE_FEATURES.add(«ref.EContainingClass.packageName».«ref.EContainingClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«ref.EContainingClass.name»_«a.name.toFirstUpper»());
        «ENDFOR»
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

      public final <P> P getPrimaryKeyValue(«eClass.name» o) {
        return (P)(Object)o.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»();
      }

      «IF entityDef.entity.collectAllAttributes.findFirst[!isSingle(eClass) && resolved && opposite != null && opposite.opposite == it && relationTable != null ] != null»
        «FOR e : entityDef.entity.collectAllAttributes.filter[!isSingle(eClass) && resolved && opposite != null && opposite.opposite == it && relationTable != null ]»
        «val relEntity = e.opposite.getEntity»
        public final RelationSQL createInsertRelationSQL_«e.name»(final Connection c, final «eClass.name» self, final «e.getOpposite(eClass).EContainingClass.instanceClassName» opposite) {
          final String sql = "INSERT INTO «e.relationTable» (\"«e.parameters.head»\",\"«e.opposite.parameters.head»\") VALUES (?,?)";
          return new RelationSQL() {
            public EObject getSelf() {
              return (EObject)self;
            }

            public EObject getOpposite() {
              return (EObject)opposite;
            }

            public String getTableName() {
              return "«e.relationTable»";
            }

            public void execute() throws PersistanceException {
              boolean isDebug = LOGGER.isDebugEnabled();
              if( isDebug ) {
                LOGGER.debug("Started creating relation");
                LOGGER.debug("Executing Relation Insert SQL: " + sql);
                LOGGER.debug("Parameter: " + self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»()+ "," + opposite.get«relEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
              }
              PreparedStatement pstmt = null;
              try {
                pstmt = c.prepareStatement(sql);
                //TODO setLong Needs to be calculated
                pstmt.setLong(1, self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
                pstmt.setLong(2, opposite.get«relEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
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

        public final RelationSQL createRemoveRelationSQL_«e.name»(final Connection c, final «eClass.name» self, final «e.getOpposite(eClass).EContainingClass.instanceClassName» opposite) {
          final String sql = "DELETE FROM «e.relationTable» WHERE \"«e.parameters.head»\" = ? AND \"«e.opposite.parameters.head»\" = ?";
          return new RelationSQL() {
            public EObject getSelf() {
              return (EObject)self;
            }

            public String getTableName() {
              return "«e.relationTable»";
            }

            public EObject getOpposite() {
              return (EObject)opposite;
            }

            public void execute() throws PersistanceException {
              boolean isDebug = LOGGER.isDebugEnabled();
              if( isDebug ) {
                LOGGER.debug("Started deleteing relation");
                LOGGER.debug("Executing Relation SQL: " + sql);
                LOGGER.debug("Parameter: " + self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»()+ "," + opposite.get«relEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
              }

              PreparedStatement pstmt = null;
              try {
                pstmt = c.prepareStatement(sql);
                //TODO setLong Needs to be calculated
                pstmt.setLong(1, self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
                pstmt.setLong(2, opposite.get«relEntity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
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

        public final RelationSQL createClearRelationSQL_«e.name»(final Connection c, final «eClass.name» self) {
          final String sql = "DELETE FROM «e.relationTable» WHERE \"«e.parameters.head»\" = ?";
          return new RelationSQL() {
            public EObject getSelf() {
              return (EObject)self;
            }

            public EObject getOpposite() {
              return null;
            }

            public String getTableName() {
              return "«e.relationTable»";
            }

            public void execute() throws PersistanceException {
              boolean isDebug = LOGGER.isDebugEnabled();
              if( isDebug ) {
                LOGGER.debug("Started clearing relation");
                LOGGER.debug("Executing Relation SQL: " + sql);
                LOGGER.debug("Parameter: " + self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
              }

              PreparedStatement pstmt = null;
              try {
                pstmt = c.prepareStatement(sql);
                //TODO setLong Needs to be calculated
                pstmt.setLong(1, self.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»());
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
        «ENDFOR»
      «ENDIF»
    }

    public final NamedQuery<«eClass.instanceClassName»> createNamedQuery(final JavaSession session, String name) {
      «FOR query : entityDef.entity.namedQueries»
      if( "«query.name»".equals(name) ) {
        return new NamedQuery<«eClass.instanceClassName»>() {
          public final List<«eClass.instanceClassName»> queryForList(Object... parameters) {
            «IF query.returnType == ReturnType.LIST»
              return createMapper(session).«query.name»(«IF !query.parameters.empty»«query.parameters.map[it.parameterConversion("parameters["+query.parameters.indexOf(it)+"]")].join(",")»«ENDIF»);
            «ELSE»
              throw new UnsupportedOperationException("This is a single value query");
            «ENDIF»
          }

          public final «eClass.instanceClassName» queryForOne(Object... parameters) {
            «IF query.returnType == ReturnType.LIST»
              throw new UnsupportedOperationException("This is a list value query");
            «ELSE»
              return createMapper(session).«query.name»(«IF !query.parameters.empty»«query.parameters.map[it.parameterConversion("parameters["+query.parameters.indexOf(it)+"]")].join(",")»«ENDIF»);
            «ENDIF»
          }

          public final String[] getParameterNames() {
            String[] rv = new String[«query.parameters.size»];
            int i = 0;
            «FOR p : query.parameters»
            rv[i++] = "«p.name»";
            «ENDFOR»
            return rv;
          }
        };
      }
      «ENDFOR»
      throw new UnsupportedOperationException("Unknown query '"+getClass().getSimpleName()+"."+name+"'");
    }

    public final MappedQuery<«eClass.name»> mappedQuery(JavaSession session, String name) {
      «FOR query : entityDef.entity.namedQueries.filter[parameters.empty]»
      if("«query.name»".equals(name)) {
        return createMapper(session).«query.name»MappedQuery();
      }
      «ENDFOR»
      throw new UnsupportedOperationException("Unknown criteria query '"+getClass().getSimpleName()+"."+name+"'");
    }

    «createProxyData(entityDef.entity,eClass)»
    «FOR e : entityDef.entity.collectEnities»
    «createProxyData(e, e.lookupEClass)»
    «ENDFOR»
    «IF entityDef.entity.namedQueries.findFirst[parameters.empty] != null»
    static final class «eClass.name»MappedQueryImpl extends «eClass.name»Mapper.«eClass.name»MappedQuery {
      private final MappedQuery<«eClass.name»> dbQuery;

      «eClass.name»MappedQueryImpl(MappedQuery<«eClass.name»> dbQuery) {
        this.dbQuery = dbQuery;
      }

      public final «eClass.name» unique() {
        return dbQuery.unique();
      }

      public final «eClass.name»Mapper.«eClass.name»MappedQuery where(at.bestsolution.persistence.expr.Expression<«eClass.name»> expression) {
        dbQuery.where(expression);
        return this;
      }

      public final List<«eClass.name»> list() {
        return dbQuery.list();
      }
    }
    «ENDIF»
  }
  '''

  def resultMapCode(ENamedQuery query, EClass eClass) '''
    «IF query.queries.head.mapping.attributes.empty»
      if( isDebug ) LOGGER.debug("Mapping results started");
      while(set.next()) {
        rv.add(map_default_«eClass.name»(connection, set));
      }
      if( isDebug ) LOGGER.debug("Mapping results ended. Mapped '"+rv.size()+"' objects.");
    «ELSE»
      try {
        inAutoResolve = true;
        Set<«eClass.name»> rootSet = new HashSet<«eClass.name»>();
        «eClass.name» current_«eClass.name»;
        «FOR section : query.queries.head.mapping.attributes.collectMappings»
          «section.entity.lookupEClass.instanceClassName» current_«section.entity.lookupEClass.name»;
        «ENDFOR»
        if( isDebug ) LOGGER.debug("Mapping with nested results started");
        while(set.next()) {
          current_«eClass.name» = map_«query.name»_«eClass.name»(connection,set);
          ((EObject)current_«eClass.name»).eSetDeliver(false);
          «FOR section : query.queries.head.mapping.attributes.collectMappings»
            «var entityEClass = section.entity.lookupEClass»
            current_«entityEClass.name» = map_«query.name»_«entityEClass.name»(connection, set);

            if( current_«entityEClass.name» != null )
            {
              ((EObject)current_«entityEClass.name»).eSetDeliver(false);
              «IF section.submapOwner.getEStructuralFeature((section.eContainer as EMappingAttribute).property).many»
              current_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»().add(current_«entityEClass.name»);
              «ELSE»
              current_«section.submapOwner.name».set«(section.eContainer as EMappingAttribute).property.toFirstUpper»(current_«entityEClass.name»);
              «ENDIF»
            }
          «ENDFOR»
          «FOR section : query.queries.head.mapping.attributes.collectMappings»
            «var entityEClass = section.entity.lookupEClass»
            if( current_«entityEClass.name» != null )
            {
              ((EObject)current_«entityEClass.name»).eSetDeliver(true);
            }
          «ENDFOR»

          ((EObject)current_«eClass.name»).eSetDeliver(true);

          // fill final list
          if(!rootSet.contains(current_«eClass.name»)) {
            rv.add(current_«eClass.name»);
            rootSet.add(current_«eClass.name»);
          }
        }
        if( isDebug ) LOGGER.debug("Mapping with nested results ended. Mapped '"+rv.size()+"' objects.");
      } finally {
        inAutoResolve = false;
      }
    «ENDIF»
  '''

  def submapName(EObjectSection section) {
    return section.submapOwner + "_" + (section.eContainer as EMappingAttribute).property
  }

  def submapOwner(EObjectSection section) {
    return (section.eContainer.eContainer as EObjectSection).entity.lookupEClass;
  }

  def resolve(EMappingEntity entity, EClass eClass) '''
    «eClass.instanceClassName» target = («eClass.instanceClassName»)eo;
    «val first = entity.allAttributes.sort([a,b|
      val iA = a.sortValue(eClass)
      val iB = b.sortValue(eClass)
      return compare(iA,iB);
    ]).findFirst[resolved]»
    «IF first != null»
      switch(f.getFeatureID()) {
        «val pk = entity.allAttributes.findFirst[pk]»
        case «eClass.getEStructuralFeature(first.name).featureID»: {
          «first.createResolveText(eClass,pk)»
          return true;
        }
        «FOR a : entity.allAttributes.sort([a,b|
          val iA = a.sortValue(eClass)
          val iB = b.sortValue(eClass)
          return compare(iA,iB);
        ]).filter[resolved && it != first]»
          case «eClass.getEStructuralFeature(a.name).featureID»: {
            «a.createResolveText(eClass,pk)»
            return true;
          }
        «ENDFOR»
        default : {
          return false;
        }
      }
    «ENDIF»
  '''

  def createProxyData(EMappingEntity entity, EClass eClass) '''
  «IF entity.allAttributes.findFirst[resolved && isSingle(eClass)] != null»
    final static class ProxyData_«eClass.name» {
      «FOR a : entity.allAttributes.filter[resolved && isSingle(eClass)]»
        public final «a.query.parameters.head.type» «a.name»;
      «ENDFOR»
      public ProxyData_«eClass.name»(«entity.allAttributes.filter[resolved && isSingle(eClass)].map[ query.parameters.head.type + " " + name].join(",")») {
        «FOR a : entity.allAttributes.filter[resolved && isSingle(eClass)]»
        this.«a.name» = «a.name»;
        «ENDFOR»
      }
    }
  «ENDIF»
  '''

  def createResolveText(EAttribute attribute, EClass eClass, EAttribute pkAttribute) '''
  «IF attribute.isSingle(eClass)»
    {
      «val attributeClass = eClass.getEStructuralFeature(attribute.name).EType as EClass»
      EClass eClass = «attributeClass.packageName».«attributeClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«attributeClass.name.toFirstUpper»();
      «attributeClass.instanceClassName» o = session.getCache().getObject(eClass, ((ProxyData_«eClass.name»)proxyData).«attribute.name»);
      if( o == null ) {
        o = session.createMapper(«((attribute.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class).«attribute.query.name»(((ProxyData_«eClass.name»)proxyData).«attribute.name»);
      } else {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
      }
      target.set«attribute.name.toFirstUpper»(o);
    }
  «ELSE»
    target.get«attribute.name.toFirstUpper»().addAll(session.createMapper(«((attribute.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class).«attribute.query.name»(target.get«pkAttribute.name.toFirstUpper»()));
  «ENDIF»
  '''

  def attrib_resultMapContent(String varName, EObjectSection section, EClass eClass, String columnPrefix) '''
    «FOR a : section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].sort([a,b|
      val iA = a.sortValue(eClass)
      val iB = b.sortValue(eClass)
      return compare(iA,iB);
    ]).filter[!resolved]»
      «IF eClass.getEStructuralFeature(a.name).many»
        //TODO Should this be done lazily?
        «varName».get«a.name.toFirstUpper»().addAll(load_«eClass.name»_«a.name»(connection,set.getObject("«columnPrefix»«section.entity.allAttributes.findFirst[pk].columnName»)"));
      «ELSE»
        «varName».set«a.name.toFirstUpper»(«a.resultMethod("set",eClass,columnPrefix+a.columnName,columnPrefix)»);
      «ENDIF»
    «ENDFOR»
    «IF section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[resolved] != null»
      «IF section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[resolved && isSingle(eClass)] != null»
        ((LazyEObject)rv).setProxyData(new ProxyData_«eClass.name»(«section.entity.allAttributes.filter[resolved && isSingle(eClass)].map['set.'+query.parameters.head.resultMethodType+'("'+columnPrefix+parameters.head+'")'].join(",")»));
      «ENDIF»
      ((LazyEObject)rv).setProxyDelegate(this);
    «ENDIF»
  '''

  def attrib_resultMapContent(String varName, Iterable<EAttribute> attributes, EClass eClass, String columnPrefix) '''
    «FOR a : attributes.sort([a,b|
      val iA = a.sortValue(eClass)
      val iB = b.sortValue(eClass)
      return compare(iA,iB);
    ]).filter[!resolved]»
      «IF eClass.getEStructuralFeature(a.name).many»
        //TODO Should this be done lazily?
        «varName».get«a.name.toFirstUpper»().addAll(load_«eClass.name»_«a.name»(connection,set.getObject("«columnPrefix»«attributes.findFirst[pk].columnName»")));
      «ELSE»
        «varName».set«a.name.toFirstUpper»(«a.resultMethod("set",eClass,columnPrefix+a.columnName,columnPrefix)»);
      «ENDIF»
    «ENDFOR»
    «IF attributes.findFirst[resolved] != null»
      «IF attributes.findFirst[resolved && isSingle(eClass)] != null»
        ((LazyEObject)rv).setProxyData(new ProxyData_«eClass.name»(«attributes.filter[resolved && isSingle(eClass)].map['set.'+query.parameters.head.resultMethodType+'("'+columnPrefix+parameters.head+'")'].join(",")»));
      «ENDIF»
      ((LazyEObject)rv).setProxyDelegate(this);
    «ENDIF»
  '''

  def generateSQL(ENamedQuery namedQuery, EQuery query) '''
  SELECT
    «IF query.mapping.attributes.empty»
      *
    «ELSE»
      «query.mapping.mapColumns»
    «ENDIF»
  FROM
    «query.from.replaceSqlParameters(namedQuery.parameters)»
    «IF query.where != null»WHERE
      «query.where.replaceSqlParameters(namedQuery.parameters)»«ENDIF»
    «IF query.groupBy != null»GROUP BY
      «query.groupBy.replaceSqlParameters(namedQuery.parameters)»«ENDIF»
    «IF query.orderby != null»ORDER BY
      «query.orderby.replaceSqlParameters(namedQuery.parameters)»«ENDIF»
  '''

  def generateCriteriaSQL(ENamedQuery namedQuery, EQuery query) '''
  SELECT
    «IF query.mapping.attributes.empty»
      *
    «ELSE»
      «query.mapping.mapColumns»
    «ENDIF»
  FROM
    «query.from.replaceSqlParameters(namedQuery.parameters)»
    «IF query.groupBy != null»GROUP BY
      «query.groupBy.replaceSqlParameters(namedQuery.parameters)»«ENDIF»
  '''

  def replaceSqlParameters(String v, List<EParameter> parameters) {
    if( parameters.empty ){
      return v;
    } else {
      return v.replace("${","#{");
    }
  }
}
