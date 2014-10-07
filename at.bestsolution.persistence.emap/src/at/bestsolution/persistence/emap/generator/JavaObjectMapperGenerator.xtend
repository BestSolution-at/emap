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
import at.bestsolution.persistence.emap.generator.java.QueryGenerator

class JavaObjectMapperGenerator {

  @Inject extension
  var UtilCollection util;

  @Inject
  var CustomQueryGenerator customQueryGen;

  @Inject
  var QueryGenerator queryGen;

  @Inject
  var JavaInsertUpdateGenerator insertUpdateGen;

  @Inject
  var JavaUtilGenerator utilGen;

  val generatorCredit = "by " + class.simpleName;

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

	// «generatorCredit»
	@SuppressWarnings("all")
	public final class «entityDef.entity.name»MapperFactory implements ObjectMapperFactory<«entityDef.package.name».«entityDef.entity.name»Mapper,«eClass.name»> {
		@Override
		public «entityDef.package.name».«entityDef.entity.name»Mapper createMapper(JavaSession session) {
			return new «entityDef.entity.name»MapperImpl(session);
		}

		final static class «entityDef.entity.name»MapperImpl implements «entityDef.entity.name»Mapper, at.bestsolution.persistence.java.JavaObjectMapper<«eClass.name»>«IF entityDef.refreshableMapper»,at.bestsolution.persistence.java.RefreshableObjectMapper<«eClass.name»>«ENDIF», ResolveDelegate {
			private final JavaSession session;
			private boolean inAutoResolve;
			private static final Logger LOGGER = Logger.getLogger(«entityDef.entity.name»MapperImpl.class);

			public «entityDef.entity.name»MapperImpl(JavaSession session) {
				this.session = session;
			}
			
			@Override
			public final JavaSession getSession() {
				return this.session;
			}

			// «generatorCredit»
			@Override
			public long selectVersion(Object id) {
				final Connection connection = session.checkoutConnection();
				PreparedStatement pStmt = null;
				ResultSet set = null;
				try {
					try {
						pStmt = connection.prepareStatement("SELECT " + getLockColumn() + " FROM \"«entityDef.tableName»\" WHERE «entityDef.entity.PKAttribute.columnName» = ?");
						pStmt.setLong(1, (Long) id);

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


			// «generatorCredit»
			@Override
			public final at.bestsolution.persistence.MappedUpdateQuery<«eClass.name»> deleteAllMappedQuery() {
				MappedUpdateQuery<«eClass.name»> deleteQuery = session.getDatabaseSupport().createMappedUpdateQuery(this, null,
					new UpdateDelegate<«eClass.name»>() { public int execute(MappedUpdateQuery<«eClass.name»> criteria) { return deleteAll((InternalQueryCriteria)criteria); } }
				);
				return deleteQuery;
			}

			// «generatorCredit»
			public final «eClass.name» map_default_«eClass.name»(Connection connection, ResultSet set) throws SQLException {
				Long id = set.getLong("«entityDef.entity.allAttributes.findFirst[pk].columnName»");
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

			private final void map_default_«eClass.name»_data_refresh(«eClass.name» rv, Connection connection, ResultSet set) throws SQLException {
				«attrib_resultMapContent("rv",entityDef.entity.allAttributes, eClass, "",false)»
			}

			private final void map_default_«eClass.name»_complete_refresh(«eClass.name» rv, Connection connection, ResultSet set, Set<Object> refreshedObjects) throws SQLException {
				«var attributes = entityDef.entity.allAttributes»
				«attrib_resultMapContent("rv",attributes, eClass, "")»
				«FOR a : attributes.sort([a,b|
			      val iA = a.sortValue(eClass)
			      val iB = b.sortValue(eClass)
			      return compare(iA,iB);
			    ]).filter[resolved]»
				{
					EObject eo = (EObject)rv;
					EReference r = (EReference)eo.eClass().getEStructuralFeature("«a.name»");
					if( ((LazyEObject)rv).isResolved(r) ) {
						«var f = eClass.getEStructuralFeature(a.name)»
						«IF f.many»
							«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn» m = session.createMapper(«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class);
							RefreshableObjectMapper<«f.EType.instanceClassName»> mr = (RefreshableObjectMapper<«f.EType.instanceClassName»>)m;
							List<«f.EType.instanceClassName»> list = m.«a.query.name»(((Number)getPrimaryKeyValue(rv)).longValue());
							Util.syncLists(rv.get«a.name.javaReservedNameEscape.toFirstUpper»(), list);
							for( «f.EType.instanceClassName» e : rv.get«a.name.javaReservedNameEscape.toFirstUpper»() ) {
								if( ! refreshedObjects.contains(e) ) {
									mr.refreshWithReferences(e,refreshedObjects);
								}
							}
						«ELSE»
							«f.EType.instanceClassName» v = rv.get«a.name.javaReservedNameEscape.toFirstUpper»();
							RefreshableObjectMapper<«f.EType.instanceClassName»> mr = (RefreshableObjectMapper<«f.EType.instanceClassName»>)session.createMapper(«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class);
							if( v != null && ! refreshedObjects.contains(v) ) {
								mr.refreshWithReferences(v,refreshedObjects);
							} else {
								long currentId = v == null ? 0 : ((Number)mr.getPrimaryKeyValue(v)).longValue();
								if( currentId != proxy.«a.name.javaReservedNameEscape» ) {
									«val attributeClass = eClass.getEStructuralFeature(a.name).EType as EClass»
									EClass eClass = «attributeClass.packageName».«attributeClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«attributeClass.name.toFirstUpper»();
									v = session.getCache().getObject(eClass,proxy.«a.name.javaReservedNameEscape»);
									if( v != null ) {
										resolve((LazyEObject)rv,proxy,r);
										if( ! refreshedObjects.contains(v) ) {
											mr.refreshWithReferences(v,refreshedObjects);
										}
									} else {
										resolve((LazyEObject)rv,proxy,r);
										v = rv.get«a.name.javaReservedNameEscape.toFirstUpper»();
										if( v != null ) {
											refreshedObjects.add(v);
										}
									}
								}
							}
						«ENDIF»
					}
				}
			    «ENDFOR»
			}

	«««		Generate util methods
			«utilGen.generate(entityDef, eClass)»

			«FOR query : entityDef.entity.namedQueries»
				«queryGen.generateQuery(entityDef, eClass, query)»
			«ENDFOR»


			«FOR customQuery : entityDef.entity.namedCustomQueries»
				«customQueryGen.generateCustomQuery(entityDef,customQuery)»
			«ENDFOR»

			// refresh stuff
			«queryGen.generateRefreshQuery(entityDef, eClass)»

			// update stuff
			«insertUpdateGen.generateUpdate(entityDef,eClass)»

			// insert stuff
			«insertUpdateGen.generateInsert(entityDef,eClass)»

			// delete stuff
			«insertUpdateGen.generateDelete(entityDef,eClass)»

			// «generatorCredit»
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

			// «generatorCredit»
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

			// «generatorCredit»
			public final String getTableName() {
				return "«entityDef.tableName»";
			}

			private static Map<String,String> PROPERTY_COL_MAPPING = new HashMap<String,String>();
			private static Map<String,JDBCType> TYPE_MAPPING = new HashMap<String,JDBCType>();
			private static Map<String,EStructuralFeature> REF_ID_FEATURES = new HashMap<String,EStructuralFeature>();
			private static Set<EReference> REFERENCE_FEATURES = new HashSet<EReference>();
			private static Set<EReference> REFERENCE_FORCEDFK = new HashSet<EReference>();
			private static Map<String,Class<? extends at.bestsolution.persistence.ObjectMapper>> REFERENCE_MAPPER = new HashMap<String,Class<? extends at.bestsolution.persistence.ObjectMapper>>();

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
				«FOR a : entityDef.entity.collectAllAttributes.filter[resolved]»
					REFERENCE_MAPPER.put("«a.name»",«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class);
				«ENDFOR»
				«val primaryKey = entityDef.entity.collectAllAttributes.findFirst[pk].columnName»
				«FOR a : entityDef.entity.collectAllAttributes.filter[isSingle(eClass) && resolved && parameters.head != primaryKey]»
					«val ref = eClass.getEStructuralFeature(a.name) as EReference»
					«val oppositeEntity = (a.query.eContainer as EMappingEntity)»
					«val oppositeAttribute = oppositeEntity.allAttributes.findFirst[aa|oppositeEntity.lookupEClass.getEStructuralFeature(aa.name) == ref.EOpposite]»
					«IF oppositeAttribute == null || !oppositeAttribute.forcedFk»
						REFERENCE_FEATURES.add(«ref.EContainingClass.packageName».«ref.EContainingClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«ref.EContainingClass.name»_«a.name.toFirstUpper»());
					«ENDIF»
					«IF a.forcedFk»
						REFERENCE_FORCEDFK.add(«ref.EContainingClass.packageName».«ref.EContainingClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«ref.EContainingClass.name»_«a.name.toFirstUpper»());
					«ENDIF»
				«ENDFOR»
			}
			
			public EClass getEClass() {
				return «eClass.toFullQualifiedJavaEClass»;
			}
			
			// «generatorCredit»
			@Override
			public boolean containsForcedFkFeatures() {
				return !REFERENCE_FORCEDFK.isEmpty();
			}
			
			
			// «generatorCredit»
			@Override
			public final boolean isForcedFkFeature(EReference ref) {
				return REFERENCE_FORCEDFK.contains(ref);
			}
			

			public final String getLockColumn() {
				return "E_VERSION";
			}

			public final String getColumnName(String propertyName) {
				if( propertyName.contains(".") ) {
					String[] segs = Util.splitOfSegment(propertyName);
					return createMapperForReference(segs[0]).getColumnName(segs[1]);
				}
				return PROPERTY_COL_MAPPING.get(propertyName);
			}
			
			public final <M extends at.bestsolution.persistence.ObjectMapper<?>> M createMapperForReference(String propertyName) {
				return (M) session.createMapper(REFERENCE_MAPPER.get(propertyName));
			}

			public final JDBCType getJDBCType(String propertyName) {
				if( propertyName.contains(".") ) {
					String[] segs = Util.splitOfSegment(propertyName);
					at.bestsolution.persistence.java.JavaObjectMapper<?> m = createMapperForReference(segs[0]);
					return m.getJDBCType(segs[1]);
				}
				return TYPE_MAPPING.get(propertyName);
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

			protected final long getVersionForTx(«eClass.name» o) {
				return session.getVersion(this, o);
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
	«FOR e : entityDef.entity.collectEnities.filter[e | e != entityDef.entity].sortBy[name]»
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





  def resolve(EMappingEntity entity, EClass eClass) '''
    «eClass.instanceClassName» target = («eClass.instanceClassName»)eo;
    «val sorted = entity.allAttributes.sortBy[it.name]»
    «val first = sorted.findFirst[resolved]»
    «IF first != null»
      switch(f.getFeatureID()) {
        «val pk = entity.allAttributes.findFirst[pk]»
        «val f = eClass.getEStructuralFeature(first.name)»
        // «first.name.javaReservedNameEscape»
        case «f.EContainingClass.packageName».«f.EContainingClass.EPackage.name.toFirstUpper»Package.«f.featureClassifier»: {
          «first.createResolveText(eClass,pk)»
          return true;
        }
        «FOR a : sorted.filter[resolved && it != first]»
          «val ff = eClass.getEStructuralFeature(a.name)»
          // «a.name.javaReservedNameEscape»
          case «ff.EContainingClass.packageName».«ff.EContainingClass.EPackage.name.toFirstUpper»Package.«ff.featureClassifier»: {
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
        public final «a.query.parameters.head.type» «a.name.javaReservedNameEscape»;
      «ENDFOR»
      public ProxyData_«eClass.name»(«entity.allAttributes.filter[resolved && isSingle(eClass)].map[ query.parameters.head.type + " " + name.javaReservedNameEscape].join(",")») {
        «FOR a : entity.allAttributes.filter[resolved && isSingle(eClass)]»
        this.«a.name.javaReservedNameEscape» = «a.name.javaReservedNameEscape»;
        «ENDFOR»
      }
    }
  «ENDIF»
  '''

  def createResolveText(EAttribute attribute, EClass eClass, EAttribute pkAttribute) '''
  «IF attribute.isSingle(eClass)»
    {
      «val attrib = attribute.getEStructuralFeature(eClass)»
      «val containerAttrib = attrib instanceof EReference && (attrib as EReference).container»
      «val attributeClass = eClass.getEStructuralFeature(attribute.name).EType as EClass»
      EClass eClass = «attributeClass.packageName».«attributeClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«attributeClass.name.toFirstUpper»();
      «attributeClass.instanceClassName» o = session.getCache().getObject(eClass, ((ProxyData_«eClass.name»)proxyData).«attribute.name.javaReservedNameEscape»);
      if( o == null ) {
        o = session.createMapper(«((attribute.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class).«attribute.query.name»(((ProxyData_«eClass.name»)proxyData).«attribute.name.javaReservedNameEscape»);
      } else {
        if( LOGGER.isDebugEnabled() ) {
          LOGGER.debug("Using cached version");
        }
      }
     
      «IF containerAttrib»
      if (o != null) {
      «ENDIF»
      	target.set«attribute.name.toFirstUpper»(o);
      «IF containerAttrib»
      }
      «ENDIF»
    }
  «ELSE»
    target.get«attribute.name.toFirstUpper»().addAll(session.createMapper(«((attribute.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class).«attribute.query.name»(target.get«pkAttribute.name.javaReservedNameEscape.toFirstUpper»()));
  «ENDIF»
  '''

  def attrib_resultMapContent(String varName, Iterable<EAttribute> attributes, EClass eClass, String columnPrefix) {
  	attrib_resultMapContent(varName,attributes,eClass,columnPrefix,true)
  }

  def attrib_resultMapContent(String varName, Iterable<EAttribute> attributes, EClass eClass, String columnPrefix, boolean withReferences) '''
    «FOR a : attributes.sort([a,b|
      val iA = a.sortValue(eClass)
      val iB = b.sortValue(eClass)
      return compare(iA,iB);
    ]).filter[!resolved]»
      «IF eClass.getEStructuralFeature(a.name).many»
        //TODO Should this be done lazily?
        «varName».get«a.name.javaReservedNameEscape.toFirstUpper»().addAll(«utilGen.getLoadPrimitiveMultiValueMethodName(eClass, a)»(connection,set.getLong("«columnPrefix»«attributes.findFirst[pk].columnName»")));
      «ELSE»
        «varName».set«a.name.javaReservedNameEscape.toFirstUpper»(«a.resultMethod("set",eClass,columnPrefix+a.columnName,columnPrefix)»);
      «ENDIF»
    «ENDFOR»
    «IF withReferences && attributes.findFirst[resolved] != null»
      «IF attributes.findFirst[resolved && isSingle(eClass)] != null»
      	ProxyData_«eClass.name» proxy = new ProxyData_«eClass.name»(«attributes.filter[resolved && isSingle(eClass)].map['set.'+query.parameters.head.resultMethodType+'("'+columnPrefix+parameters.head+'")'].join(",")»);
      	((LazyEObject)rv).setProxyData(proxy);
      «ENDIF»
      ((LazyEObject)rv).setProxyDelegate(this);
    «ENDIF»
  '''

  def generateSQL(ENamedQuery namedQuery, EQuery query) {
  	return generateSQL(namedQuery,query,false)
  }

  def generateSQL(ENamedQuery namedQuery, EQuery query, boolean removeInsets) '''
  SELECT
    «IF query.mapping.attributes.empty»
      *
    «ELSE»
      «IF removeInsets»«query.mapping.mapColumns.sanitiesString»«ELSE»«query.mapping.mapColumns»«ENDIF»
    «ENDIF»
  FROM
    «IF removeInsets»«query.from.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.from.replaceSqlParameters(namedQuery.parameters)»«ENDIF»
    «IF query.where != null»WHERE
      «IF removeInsets»«query.where.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.where.replaceSqlParameters(namedQuery.parameters)»«ENDIF»«ENDIF»
    «IF query.groupBy != null»GROUP BY
      «IF removeInsets»«query.groupBy.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.groupBy.replaceSqlParameters(namedQuery.parameters)»«ENDIF»«ENDIF»
    «IF query.orderby != null»ORDER BY
      «IF removeInsets»«query.orderby.replaceSqlParameters(namedQuery.parameters).sanitiesString»«ELSE»«query.orderby.replaceSqlParameters(namedQuery.parameters)»«ENDIF»«ENDIF»
  '''


  def generateCriteriaSQL(ENamedQuery namedQuery, EQuery query) '''
  SELECT
    «IF query.mapping.attributes.empty»
      "«(namedQuery.eContainer as EMappingEntity).calcTableName»".*
    «ELSE»
      «query.mapping.mapColumns»
    «ENDIF»
  FROM
    «query.from.replaceSqlParameters(namedQuery.parameters)»
  '''
}
