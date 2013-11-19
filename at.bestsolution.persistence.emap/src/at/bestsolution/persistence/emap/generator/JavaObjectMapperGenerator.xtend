package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.ReturnType
import at.bestsolution.persistence.emap.eMap.EQuery
import static extension at.bestsolution.persistence.emap.generator.EMapGenerator.*
import at.bestsolution.persistence.emap.eMap.ENamedQuery
import at.bestsolution.persistence.emap.eMap.EParameter
import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EMapping
import at.bestsolution.persistence.emap.eMap.EObjectSection
import java.util.List
import java.util.ArrayList
import at.bestsolution.persistence.emap.eMap.EMappingAttribute
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import java.util.HashSet
import at.bestsolution.persistence.emap.eMap.EMappingBundle
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature

class JavaObjectMapperGenerator {

	static def generateMapperRegistry(EMappingBundle bundleDef) '''
	package mappings;

	import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
	import at.bestsolution.persistence.ObjectMapper;
	import at.bestsolution.persistence.java.ObjectMapperFactory;
	import java.util.HashMap;
	import java.util.Map;

	public final class «bundleDef.name»ObjectMapperFactoriesProvider implements ObjectMapperFactoriesProvider {
		private Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?>> factories = new HashMap<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?>>();
		public «bundleDef.name»ObjectMapperFactoriesProvider() {
			«FOR e : bundleDef.entities»
				factories.put(«JavaHelper::getEClass(e.etype).instanceClassName»Mapper.class, new «JavaHelper::getEClass(e.etype).mapperName»());
			«ENDFOR»
		}

		public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?>> getMapperFactories() {
			return factories;
		}
	}
	'''

	static def mapperName(EClass eClass) {
		return
			eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf('.'))
			+ ".java"+eClass.instanceClassName.substring(eClass.instanceClassName.lastIndexOf('.'))+"MapperFactory"
	}

	static def generateJava(EMappingEntityDef entityDef, EClass eClass) '''
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
	import «JavaHelper::getEClass(entityDef.entity.etype).packageName».«eClass.EPackage.name.toFirstUpper»Factory;
	import «eClass.instanceClassName»;
	import at.bestsolution.persistence.model.ResolveDelegate;
	import at.bestsolution.persistence.model.LazyEObject;
	import org.eclipse.emf.ecore.EStructuralFeature;
	import org.eclipse.emf.ecore.EObject;
	import org.eclipse.emf.ecore.EClass;
	import java.util.Set;
	import java.util.HashSet;
	import java.util.Map;
	import java.util.HashMap;
	import at.bestsolution.persistence.java.Util;
	import at.bestsolution.persistence.java.DatabaseSupport.QueryBuilder;

	public final class «entityDef.entity.name»MapperFactory implements ObjectMapperFactory<«entityDef.package.name».«entityDef.entity.name»Mapper> {
		@Override
		public «entityDef.package.name».«entityDef.entity.name»Mapper createMapper(JavaSession session) {
			return new «entityDef.entity.name»MapperImpl(session);
		}

		final static class «entityDef.entity.name»MapperImpl implements «entityDef.entity.name»Mapper, ResolveDelegate {
			private final JavaSession session;
			private boolean inAutoResolve;

			public «entityDef.entity.name»MapperImpl(JavaSession session) {
				this.session = session;
			}

			«FOR query : entityDef.entity.namedQueries»
				@Override
				public «IF query.returnType == ReturnType.LIST»java.util.List<«ENDIF»«eClass.instanceClassName»«IF query.returnType == ReturnType::LIST»>«ENDIF» «query.name»(«query.parameters.join(",",[p|p.type + " " + p.name])») {
					String query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_"+session.getDatabaseType()+".sql");
					if( query == null ) {
						query = Util.loadFile(getClass(), "«entityDef.entity.name»_«query.name»_default.sql");
					}
					Connection connection = session.checkoutConnection();
					try {

						«IF ! query.parameters.empty»
							final ProcessedSQL processedSQL = Util.processSQL(query);
							final PreparedStatement pStmt = connection.prepareStatement(processedSQL.sql);

							for(int i = 0; i < processedSQL.dynamicParameterNames.size(); i++) {
								if( "«query.parameters.head.name»".equals(processedSQL.dynamicParameterNames.get(i)) ) {
									pStmt.«query.parameters.head.pstmtMethod»(i+1,«query.parameters.head.name»);
								}
								«FOR p : query.parameters.filter[it!=query.parameters.head]»
								else if("«p.name»".equals(processedSQL.dynamicParameterNames.get(i))) {
									pStmt.«p.pstmtMethod»(i+1,«p.name»);
								}
								«ENDFOR»
							}
						«ELSE»
							final PreparedStatement pStmt = connection.prepareStatement(query);
						«ENDIF»

						ResultSet set = pStmt.executeQuery();

						«IF query.returnType == ReturnType.LIST»
							final List<«eClass.name»> rv = new ArrayList<«eClass.name»>();
							«IF query.queries.head.mapping.attributes.empty»
								while(set.next()) {
									rv.add(map_default_«eClass.name»(set));
								}
							«ELSE»
								try {
									inAutoResolve = true;
									Set<«eClass.name»> rootSet = new HashSet<«eClass.name»>();
									«eClass.name» current_«eClass.name»;
									«FOR section : query.queries.head.mapping.attributes.collectMappings»
										«JavaHelper::getEClass(section.entity.etype).instanceClassName» current_«JavaHelper::getEClass(section.entity.etype).name»;
									«ENDFOR»
									while(set.next()) {
										current_«eClass.name» = map_«query.name»_«eClass.name»(set);
										((EObject)current_«eClass.name»).eSetDeliver(false);
										«FOR section : query.queries.head.mapping.attributes.collectMappings»
											current_«JavaHelper::getEClass(section.entity.etype).name» = map_«query.name»_«JavaHelper::getEClass(section.entity.etype).name»(set);

											if( current_«JavaHelper::getEClass(section.entity.etype).name» != null )
											{
												((EObject)current_«JavaHelper::getEClass(section.entity.etype).name»).eSetDeliver(false);
												«IF section.submapOwner.getEStructuralFeature((section.eContainer as EMappingAttribute).property).many»
												current_«section.submapOwner.name».get«(section.eContainer as EMappingAttribute).property.toFirstUpper»().add(current_«JavaHelper::getEClass(section.entity.etype).name»);
												«ELSE»
												current_«section.submapOwner.name».set«(section.eContainer as EMappingAttribute).property.toFirstUpper»(current_«JavaHelper::getEClass(section.entity.etype).name»);
												«ENDIF»
											}
										«ENDFOR»
										«FOR section : query.queries.head.mapping.attributes.collectMappings»
											if( current_«JavaHelper::getEClass(section.entity.etype).name» != null )
											{
												((EObject)current_«JavaHelper::getEClass(section.entity.etype).name»).eSetDeliver(true);
											}
										«ENDFOR»

										((EObject)current_«eClass.name»).eSetDeliver(true);

										// fill final list
										if(!rootSet.contains(current_«eClass.name»)) {
											rv.add(current_«eClass.name»);
											rootSet.add(current_«eClass.name»);
										}
									}
								} finally {
									inAutoResolve = false;
								}
							«ENDIF»
						«ELSE»
							final «eClass.name» rv;
							«IF query.queries.head.mapping.attributes.empty»
								if( set.next() ) {
									rv = map_default_«eClass.name»(set);
								} else {
									rv = null;
								}
							«ENDIF»
						«ENDIF»

						return rv;
					} catch(SQLException e) {
						throw new PersistanceException(e);
					} finally {
						session.returnConnection(connection);
					}
				}
				«IF !query.queries.head.mapping.attributes.empty»
					public «eClass.name» map_«query.name»_«eClass.name»(ResultSet set) throws SQLException {
						Object id = set.getObject("«query.queries.head.mapping.prefix+"_"»«entityDef.entity.collectAttributes.findFirst[pk].columnName»");
						EClass eClass = «eClass.packageName».«eClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«eClass.name.toFirstUpper»();
						«eClass.name» rv = session.getCache().getObject(eClass,id);
						if( rv != null ) {
							return rv;
						}
						rv = session.getProxyFactory().createProxy(eClass);
						((EObject)rv).eSetDeliver(false);
						«attrib_resultMapContent("rv",query.queries.head.mapping,JavaHelper::getEClass(query.queries.head.mapping.entity.etype),query.queries.head.mapping.prefix+"_")»
						((EObject)rv).eSetDeliver(true);
						session.getCache().putObject((EObject)rv,id);
						return rv;
					}
					«FOR section : query.queries.head.mapping.attributes.collectMappings»
					public «JavaHelper::getEClass(section.entity.etype).instanceClassName» map_«query.name»_«JavaHelper::getEClass(section.entity.etype).name»(ResultSet set) throws SQLException {
						Object id = set.getObject("«section.prefix+"_"»«section.entity.collectAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.property] == null].findFirst[pk].columnName»");
						if( id == null ) {
							return null;
						}
						EClass eClass = «JavaHelper::getEClass(section.entity.etype).packageName».«JavaHelper::getEClass(section.entity.etype).EPackage.name.toFirstUpper»Package.eINSTANCE.get«JavaHelper::getEClass(section.entity.etype).name.toFirstUpper»();
						«JavaHelper::getEClass(section.entity.etype).instanceClassName» rv = session.getCache().getObject(eClass,id);
						if( rv != null) {
							return rv;
						}
						rv = session.getProxyFactory().createProxy(eClass);
						((EObject)rv).eSetDeliver(false);
						«attrib_resultMapContent("rv",section,JavaHelper::getEClass(section.entity.etype),section.prefix+"_")»
						((EObject)rv).eSetDeliver(true);
						session.getCache().putObject((EObject)rv,id);
						return rv;
					}
					«ENDFOR»
				«ENDIF»

			«ENDFOR»

			public «eClass.name» map_default_«eClass.name»(ResultSet set) throws SQLException {
				Object id = set.getObject("«entityDef.entity.collectAttributes.findFirst[pk].columnName»");
				EClass eClass = «eClass.packageName».«eClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«eClass.name.toFirstUpper»();
				«eClass.name» rv = session.getCache().getObject(eClass,id);
				if( rv != null ) {
					return rv;
				}
				rv = session.getProxyFactory().createProxy(eClass);
				«attrib_resultMapContent("rv",entityDef.entity.collectAttributes, eClass, "")»
				session.getCache().putObject((EObject)rv,id);
				return rv;
			}

			@Override
			public void update(«eClass.name» object) {
				QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»");
				final LazyEObject leo = object instanceof LazyEObject ? (LazyEObject)object : null;
				«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
					if( pk ) {
						return false;
					} if(eClass.getEStructuralFeature(property) instanceof EReference) {
						val r = eClass.getEStructuralFeature(property) as EReference;
						if( r.containment ) {
							return false;
						}
						return true;
					} else {
						return true;
					}
				].sort([a,b|return sortAttributes(eClass,a,b)])»
					«IF a.columnName != null»
						b.addColumn("«a.columnName»", "«a.property»");
					«ELSEIF a.isSingle(eClass)»
						«val ownerClass = eClass.getEStructuralFeature(a.property).EContainingClass»
						if( leo == null || leo.isResolved(«ownerClass.packageName».«ownerClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«ownerClass.name»_«a.property.toFirstUpper»()) ) {
							b.addColumn("«a.parameters.head»","«a.property».«(a.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property»");
						}
					«ENDIF»
				«ENDFOR»
				ProcessedSQL psql = b.buildUpdate("«entityDef.entity.collectAttributes.findFirst[pk].columnName»","«entityDef.entity.collectAttributes.findFirst[pk].property»");
				Connection connection = session.checkoutConnection();
				try {
					PreparedStatement pstmt = connection.prepareStatement(psql.sql);
					for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
						«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
								if( pk ) {
									return false;
								} if(eClass.getEStructuralFeature(property) instanceof EReference) {
									val r = eClass.getEStructuralFeature(property) as EReference;
									if( r.containment ) {
										return false;
									}
									return true;
								} else {
									return true;
								}
							].sort([a,b|return sortAttributes(eClass,a,b)])»
							«IF a.columnName != null»
								if("«a.property»".equals(psql.dynamicParameterNames.get(i))) {
									pstmt.«a.pstmtMethod(eClass)»(i+1,object.get«a.property.toFirstUpper»());
								}
							«ELSEIF a.isSingle(eClass)»
								if("«a.property».«(a.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property»".equals(psql.dynamicParameterNames.get(i))) {
									if( object.get«a.property.toFirstUpper»() == null ) {
										pstmt.setObject(i+1,null);
									} else {
										pstmt.«a.pstmtMethod(eClass)»(i+1,object.get«a.property.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property.toFirstUpper»());
									}
								}
							«ENDIF»
						«ENDFOR»
					}
					pstmt.execute();
				} catch(SQLException e) {
					throw new PersistanceException(e);
				} finally {
					session.returnConnection(connection);
				}
			}

			@Override
			public void insert(«eClass.name» object) {
				«val pkAttribute = entityDef.entity.collectDerivedAttributes.values.findFirst[pk]»
				«IF pkAttribute == null || entityDef.entity.extensionType == "extends"»
					// TODO WHAT TO GENERATE
				«ELSE»
					QueryBuilder b = session.getDatabaseSupport().createQueryBuilder("«entityDef.tableName»");
					«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
						if( pk ) {
							return false;
						} if(eClass.getEStructuralFeature(property) instanceof EReference) {
							val r = eClass.getEStructuralFeature(property) as EReference;
							if( r.containment ) {
								return false;
							}
							return true;
						} else {
							return true;
						}
					].sort([a,b|return sortAttributes(eClass,a,b)])»
						«IF a.columnName != null»
							b.addColumn("«a.columnName»", "«a.property»");
						«ELSEIF a.isSingle(eClass)»
							b.addColumn("«a.parameters.head»","«a.property».«(a.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property»");
						«ENDIF»
					«ENDFOR»
					b.addColumn("e_version","##e_version##");
					«val dbSupport = pkAttribute.findDatabaseSupport»
					ProcessedSQL psql = null;
					«IF dbSupport != null»
						«FOR d : dbSupport»
							if( "«d.databaseId»".equals(session.getDatabaseType()) ) {
								psql = b.buildInsert("«pkAttribute.columnName»","«d.getSequenceStatement(pkAttribute)»");
							}
						«ENDFOR»
					«ELSE»
					ProcessedSQL psql = b.buildInsert("«pkAttribute.columnName»","");
					«ENDIF»

					Connection connection = session.checkoutConnection();
					try {
						PreparedStatement pstmt = connection.prepareStatement(psql.sql);
						for( int i = 0; i < psql.dynamicParameterNames.size(); i++ ) {
							if( "##e_version##".equals(psql.dynamicParameterNames.get(i)) ) {
								pstmt.setLong(i+1,0);
							}
							«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
								if( pk ) {
									return false;
								} if(eClass.getEStructuralFeature(property) instanceof EReference) {
									val r = eClass.getEStructuralFeature(property) as EReference;
									if( r.containment ) {
										return false;
									}
									return true;
								} else {
									return true;
								}
							].sort([a,b|return sortAttributes(eClass,a,b)])»
							«IF a.columnName != null»
								else if("«a.property»".equals(psql.dynamicParameterNames.get(i))) {
									pstmt.«a.pstmtMethod(eClass)»(i+1,object.get«a.property.toFirstUpper»());
								}
							«ELSEIF a.isSingle(eClass)»
								else if("«a.property».«(a.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property»".equals(psql.dynamicParameterNames.get(i))) {
									if( object.get«a.property.toFirstUpper»() == null ) {
										pstmt.setObject(i+1,null);
									} else {
										pstmt.«a.pstmtMethod(eClass)»(i+1,object.get«a.property.toFirstUpper»().get«(a.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property.toFirstUpper»());
									}
								}
							«ENDIF»
						«ENDFOR»
						}
						«IF dbSupport != null»
							«FOR d : dbSupport»
								if( "«d.databaseId»".equals(session.getDatabaseType()) ) {
									«IF d.supportsGeneratedKeys»
										ResultSet set = pstmt.executeQuery();
										if( set.next() ) {
											//TODO We need to get the correct type
											object.set«pkAttribute.property.toFirstUpper»(set.getLong(1));
										} else {
											//TODO Throw exception
«««											throw new PersitenceException();
										}
									«ENDIF»
								}
							«ENDFOR»
						«ENDIF»
					} catch(SQLException e) {
						throw new PersistanceException(e);
					} finally {
						session.returnConnection(connection);
					}
				«ENDIF»
			}

			public boolean resolve(LazyEObject eo, Object proxyData, EStructuralFeature f) {
				if( inAutoResolve ) {
					return true;
				}

				if(eo instanceof «eClass.name») {
					«resolve(entityDef.entity,eClass)»
				}
				«FOR e : entityDef.entity.collectEnities»
				else if(eo instanceof «JavaHelper::getEClass(e.etype).instanceClassName») {
					«resolve(e,JavaHelper::getEClass(e.etype))»
				}
				«ENDFOR»
				return false;
			}
		}

		«createProxyData(entityDef.entity,eClass)»
		«FOR e : entityDef.entity.collectEnities»
		«createProxyData(e,JavaHelper::getEClass(e.etype))»
		«ENDFOR»
	}
	'''

	def static generateJavaInsert(EMappingEntityDef entityDef, EClass eClass, EAttribute pkAttribute, DatabaseSupport dbSupport) '''

	'''

	static def submapName(EObjectSection section) {
		return section.submapOwner + "_" + (section.eContainer as EMappingAttribute).property
	}

	static def submapOwner(EObjectSection section) {
		return JavaHelper::getEClass((section.eContainer.eContainer as EObjectSection).entity.etype);
	}

	static def resolve(EMappingEntity entity, EClass eClass) '''
		«eClass.instanceClassName» target = («eClass.instanceClassName»)eo;
		«val first = entity.collectAttributes.sort([a,b|
			val iA = a.sortValue(eClass)
			val iB = b.sortValue(eClass)
			return Integer.compare(iA,iB)
		]).findFirst[resolved]»
		«IF first != null»
			switch(f.getFeatureID()) {
				«val pk = entity.collectAttributes.findFirst[pk]»
				case «eClass.getEStructuralFeature(first.property).featureID»: {
					«first.createResolveText(eClass,pk)»
					return true;
				}
				«FOR a : entity.collectAttributes.sort([a,b|
					val iA = a.sortValue(eClass)
					val iB = b.sortValue(eClass)
					return Integer.compare(iA,iB)
				]).filter[resolved && it != first]»
					case «eClass.getEStructuralFeature(a.property).featureID»: {
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

	static def createProxyData(EMappingEntity entity, EClass eClass) '''
	«IF entity.collectAttributes.findFirst[resolved && isSingle(eClass)] != null»
		final static class ProxyData_«eClass.name» {
			«FOR a : entity.collectAttributes.filter[resolved && isSingle(eClass)]»
				public final «a.query.parameters.head.type» «a.property»;
			«ENDFOR»
			public ProxyData_«eClass.name»(«entity.collectAttributes.filter[resolved && isSingle(eClass)].map[ query.parameters.head.type + " " + property].join(",")») {
				«FOR a : entity.collectAttributes.filter[resolved && isSingle(eClass)]»
				this.«a.property» = «a.property»;
				«ENDFOR»
			}
		}
	«ENDIF»
	'''

	static def collectMappings(Iterable<EMappingAttribute> attributeList) {
		val l = new ArrayList<EObjectSection>;
		attributeList.forEach[it.map.collectMappingsRec(l)]
		return l;
	}

	static def void collectMappingsRec(EObjectSection section, List<EObjectSection> list) {
		list.add(section);
		section.attributes.forEach[it.map.collectMappingsRec(list)]
	}

	static def collectEnities(EMappingEntity rootEntity) {
		val entities = new HashSet<EMappingEntity>;
		rootEntity.namedQueries.forEach[entities.addAll(it.queries.head.mapping.attributes.collectMappings.map[it.entity])]
		return entities;
	}

	static def createResolveText(EAttribute attribute, EClass eClass, EAttribute pkAttribute) '''
	«IF attribute.isSingle(eClass)»
		target.set«attribute.property.toFirstUpper»(session.createMapper(«((attribute.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class).«attribute.query.name»(((ProxyData_«eClass.name»)proxyData).«attribute.property»));
	«ELSE»
		target.get«attribute.property.toFirstUpper»().addAll(session.createMapper(«((attribute.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».class).«attribute.query.name»(target.get«pkAttribute.property.toFirstUpper»()));
	«ENDIF»
	'''

	static def attrib_resultMapContent(String varName, EObjectSection section, EClass eClass, String columnPrefix) '''
		«FOR a : section.entity.collectAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.property] == null].sort([a,b|
			val iA = a.sortValue(eClass)
			val iB = b.sortValue(eClass)
			return Integer.compare(iA,iB)
		]).filter[!resolved]»
			«varName».set«a.property.toFirstUpper»(«a.resultMethod("set",eClass,columnPrefix+a.columnName,columnPrefix)»);
		«ENDFOR»
		«IF section.entity.collectAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.property] == null].findFirst[resolved] != null»
			«IF section.entity.collectAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.property] == null].findFirst[resolved && isSingle(eClass)] != null»
				((LazyEObject)rv).setProxyData(new ProxyData_«eClass.name»(«section.entity.collectAttributes.filter[resolved && isSingle(eClass)].map['set.'+query.parameters.head.resultMethodType+'("'+columnPrefix+parameters.head+'")'].join(",")»));
			«ENDIF»
			((LazyEObject)rv).setProxyDelegate(this);
		«ENDIF»
	'''

	static def attrib_resultMapContent(String varName, Iterable<EAttribute> attributes, EClass eClass, String columnPrefix) '''
		«FOR a : attributes.sort([a,b|
			val iA = a.sortValue(eClass)
			val iB = b.sortValue(eClass)
			return Integer.compare(iA,iB)
		]).filter[!resolved]»
			«varName».set«a.property.toFirstUpper»(«a.resultMethod("set",eClass,columnPrefix+a.columnName,columnPrefix)»);
		«ENDFOR»
		«IF attributes.findFirst[resolved] != null»
			«IF attributes.findFirst[resolved && isSingle(eClass)] != null»
				((LazyEObject)rv).setProxyData(new ProxyData_«eClass.name»(«attributes.filter[resolved && isSingle(eClass)].map['set.'+query.parameters.head.resultMethodType+'("'+columnPrefix+parameters.head+'")'].join(",")»));
			«ENDIF»
			((LazyEObject)rv).setProxyDelegate(this);
		«ENDIF»
	'''

	static def pstmtMethod(EParameter p) {
		if( p.type == "String" ) {
			return "setString";
		} else if( p.type == "long" ) {
			return "setLong";
		} else if( p.type == "int" ) {
			return "setInt";
		} else if( p.type == "boolean" ) {
			return "setBoolean";
		} else {
			return "setObject";
		}
	}

	static def pstmtMethod(EAttribute p, EClass eClass) {
		val f = eClass.getEStructuralFeature(p.property);
		if( f instanceof org.eclipse.emf.ecore.EAttribute ) {
			return (f as org.eclipse.emf.ecore.EAttribute).pstmtMethod
		} else {
			val c = (f as EReference).EType as EClass
			return (c.getEStructuralFeature((p.query.eContainer as EMappingEntity).collectAttributes.findFirst[pk].property) as org.eclipse.emf.ecore.EAttribute).pstmtMethod;
		}
	}

	static def pstmtMethod(org.eclipse.emf.ecore.EAttribute f) {
		if( f.EType.instanceClassName == "java.lang.String" ) {
			return "setString";
		} else if( f.EType.instanceClassName == "long" ) {
			return "setLong";
		} else if( f.EType.instanceClassName == "int" ) {
			return "setInt";
		} else if( f.EType.instanceClassName == "boolean" ) {
			return "setBoolean";
		} else {
			return "setObject";
		}
	}

	static def resultMethod(EAttribute attribute, String varName, EClass eClass, String keyName, String prefix) {
		val f = eClass.getEStructuralFeature(attribute.property)
		if( "java.lang.String" == f.EType.instanceClassName ) {
			return varName + '.getString("'+keyName+'")'
		} else if( "long" == f.EType.instanceClassName ) {
			return varName + '.getLong("'+keyName+'")'
		} else if( "int" == f.EType.instanceClassName ) {
			return varName + '.getInt("'+keyName+'")'
		} else if( "boolean" == f.EType.instanceClassName ) {
			return varName + '.getBoolean("'+keyName+'")'
		} else if( "java.sql.Blob" == f.EType.instanceClassName ) {
			return 'session.handleBlob("'+(attribute.eContainer as EMappingEntity).calcTableName+'","'+keyName+'","'+prefix+(attribute.eContainer as EMappingEntity).collectAllAttributes.findFirst[pk].columnName+'",' +varName +')'
		} else {
			return "("+f.EType.instanceClassName+") session.convertType("+f.EType.instanceClassName+".class, " + varName + '.getObject("'+keyName+'"))'
		}
	}

	static def resultMethodType(EParameter p) {
		if( "String" == p.type ) {
			return "getString"
		} else if( "long" == p.type ) {
			return "getLong"
		} else if( "int" == p.type ) {
			return "getInt"
		} else {
			return "getObject"
		}
	}

	static def generateSQL(ENamedQuery namedQuery, EQuery query) '''
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

	def static replaceSqlParameters(String v, List<EParameter> parameters) {
		if( parameters.empty ){
			return v;
		} else {
			return v.replace("${","#{");
		}
	}
}