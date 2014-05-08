/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EMapping
import at.bestsolution.persistence.emap.eMap.EMappingAttribute
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import at.bestsolution.persistence.emap.eMap.ENamedQuery
import at.bestsolution.persistence.emap.eMap.EObjectSection
import at.bestsolution.persistence.emap.eMap.EQuery
import at.bestsolution.persistence.emap.eMap.ReturnType
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference

import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.java.CustomQueryGenerator
import at.bestsolution.persistence.emap.generator.java.JavaInsertUpdateGenerator
import at.bestsolution.persistence.emap.generator.java.JavaUtilGenerator

class JavaObjectMapperGenerator {

  @Inject extension
  var UtilCollection util;

  @Inject
  var CustomQueryGenerator customQueryGen;

  @Inject
  var JavaInsertUpdateGenerator insertUpdateGen;

  @Inject
  var JavaUtilGenerator utilGen;

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
	import java.util.Iterator;
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
					«IF query.returnType == ReturnType.SINGLE && query.parameters.size == 1 && query.parameters.head.id»
						if( isDebug ) LOGGER.debug("Check id cache for object");
						{
							final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
							final «eClass.name» rv = session.getCache().getObject(eClass,«query.parameters.head.name»);
							if( rv != null ) {
								if( isDebug ) LOGGER.debug("Using cached object");
								return rv;
							}
						}
					«ENDIF»
					if( isDebug ) LOGGER.debug("Executing «query.name»");

					String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
					if( query == null ) {
						query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
					}

					if( isDebug ) LOGGER.debug("	Plain-Query: " + query);

					Connection connection = session.checkoutConnection();
					PreparedStatement pStmt = null;
					ResultSet set = null;
					try {
					«IF !query.parameters.empty»
						final ProcessedSQL processedSQL = Util.processSQL(query);
						if( isDebug ) {
							LOGGER.debug("	Processed-Query: " + processedSQL.sql);
						}

						if( isDebug ) LOGGER.debug("Preparing query");
						pStmt = connection.prepareStatement(processedSQL.sql);

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
						pStmt = connection.prepareStatement(query);
		        	«ENDIF»
					if( isDebug ) LOGGER.debug("Executing query");
					set = pStmt.executeQuery();

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
				«IF !query.queries.head.mapping.attributes.empty»
					public final «eClass.name» map_«query.name»_«eClass.name»(Connection connection, ResultSet set) throws SQLException {
						Object id = set.getObject("«query.queries.head.mapping.prefix+"_"»«entityDef.entity.allAttributes.findFirst[pk].columnName»");
						final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
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
						session.registerObject(rv,getPrimaryKeyValue(rv), getLockColumn() != null ? set.getLong("«query.queries.head.mapping.prefix+"_"»"+getLockColumn()) : -1);
						return rv;
					}

					«FOR section : query.queries.head.mapping.attributes.collectMappings»
						«var entityEClass = section.entity.lookupEClass»
						public final «entityEClass.instanceClassName» map_«query.name»_«entityEClass.name»(Connection connection, ResultSet set) throws SQLException {
							Object id = set.getObject("«section.prefix+"_"»«section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null].findFirst[pk].columnName»");
							if( id == null ) {
								return null;
							}
							final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
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
							session.registerObject(rv, id, getLockColumn() != null ? set.getLong("«section.prefix+"_"»"+getLockColumn()) : -1);
							return rv;
						}
					«ENDFOR»
				«ENDIF»
		        «IF query.parameters.empty»
					public final MappedQuery<«eClass.name»> «query.name»MappedQuery() {
						MappedQuery<«eClass.name»> dbQuery = session.getDatabaseSupport().createMappedQuery(
							this, «IF query.queries.head.mapping.prefix != null»"«query.queries.head.mapping.prefix»"«ELSE»null«ENDIF»,
							new ListDelegate<«eClass.name»>() { public List<«eClass.name»> list(MappedQuery<«eClass.name»> criteria) { return «query.name»((MappedQueryImpl<«eClass.name»>)criteria); } }
						);
						return dbQuery;
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
				final EClass eClass = «eClass.toFullQualifiedJavaEClass»;
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
				session.registerObject(rv,getPrimaryKeyValue(rv),getLockColumn() != null ? set.getLong(getLockColumn()) : -1);
				return rv;
			}

	«««		Generate util methods
			«utilGen.generate(entityDef, eClass)»

			«FOR customQuery : entityDef.entity.namedCustomQueries»
				«customQueryGen.generateCustomQuery(entityDef,customQuery)»
			«ENDFOR»

			// update stuff
			«insertUpdateGen.generateUpdate(entityDef,eClass)»

			// insert stuff
			«insertUpdateGen.generateInsert(entityDef,eClass)»

			// delete stuff
			«insertUpdateGen.generateDelete(entityDef,eClass)»


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
				«FOR e : entityDef.entity.collectEnities.sortBy[it.name]»
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
					«val oppositeEntity = (a.query.eContainer as EMappingEntity)»
					«val oppositeAttribute = oppositeEntity.allAttributes.findFirst[aa|oppositeEntity.lookupEClass.getEStructuralFeature(aa.name) == ref.EOpposite]»
					«IF oppositeAttribute == null || !oppositeAttribute.forcedFk»
						REFERENCE_FEATURES.add(«ref.EContainingClass.packageName».«ref.EContainingClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«ref.EContainingClass.name»_«a.name.toFirstUpper»());
					«ENDIF»
				«ENDFOR»
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

			public final <P> P getPrimaryKeyValue(«eClass.name» o) {
				return (P)(Object)o.get«entityDef.entity.collectDerivedAttributes.values.findFirst[pk].name.toFirstUpper»();
			}

			protected final <P> P getPrimaryKeyForTx(«eClass.name» o) {
				return session.getPrimaryKey(this, o);
			}

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
«««	«IF entityDef.entity.namedQueries.findFirst[parameters.empty] != null»
«««		static final class «eClass.name»MappedQueryImpl extends «eClass.name»Mapper.«eClass.name»MappedQuery {
«««			private final MappedQuery<«eClass.name»> dbQuery;
«««
«««			«eClass.name»MappedQueryImpl(MappedQuery<«eClass.name»> dbQuery) {
«««				this.dbQuery = dbQuery;
«««			}
«««
«««			public final «eClass.name» unique() {
«««				return dbQuery.unique();
«««			}
«««
«««			public final «eClass.name»Mapper.«eClass.name»MappedQuery where(at.bestsolution.persistence.expr.Expression<«eClass.name»> expression) {
«««				dbQuery.where(expression);
«««				return this;
«««			}
«««
«««			public final List<«eClass.name»> list() {
«««				return dbQuery.list();
«««				}
«««
«««			public final «eClass.name»Mapper.«eClass.name»MappedQuery orderBy(at.bestsolution.persistence.order.OrderColumn<«eClass.name»>... columns) {
«««				dbQuery.orderBy(columns);
«««				return this;
«««			}
«««		}
«««	«ENDIF»
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
    «val sorted = entity.allAttributes.sortBy[it.name]»
    «val first = sorted.findFirst[resolved]»
    «IF first != null»
      switch(f.getFeatureID()) {
        «val pk = entity.allAttributes.findFirst[pk]»
        // «first.name»
        case «eClass.getEStructuralFeature(first.name).featureID»: {
          «first.createResolveText(eClass,pk)»
          return true;
        }
        «FOR a : sorted.filter[resolved && it != first]»
          // «a.name»
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
        «varName».get«a.name.toFirstUpper»().addAll(«utilGen.getLoadPrimitiveMultiValueMethodName(eClass, a)»(connection,set.getObject("«columnPrefix»«section.entity.allAttributes.findFirst[pk].columnName»)"));
        // TODO oldcall: «varName».get«a.name.toFirstUpper»().addAll(load_«eClass.name»_«a.name»(connection,set.getObject("«columnPrefix»«section.entity.allAttributes.findFirst[pk].columnName»)"));
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
        «varName».get«a.name.toFirstUpper»().addAll(«utilGen.getLoadPrimitiveMultiValueMethodName(eClass, a)»(connection,set.getObject("«columnPrefix»«attributes.findFirst[pk].columnName»")));
        // TODO oldcall: «varName».get«a.name.toFirstUpper»().addAll(load_«eClass.name»_«a.name»(connection,set.getObject("«columnPrefix»«attributes.findFirst[pk].columnName»")));
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
}
