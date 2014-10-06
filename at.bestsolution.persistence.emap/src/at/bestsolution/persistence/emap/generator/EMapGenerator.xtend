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

import at.bestsolution.persistence.emap.eMap.EMapping
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.bestsolution.persistence.emap.eMap.EMappingBundle
import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.java.RegistryGenerator
import at.bestsolution.persistence.emap.generator.java.CustomSQLQueryGenerator
import at.bestsolution.persistence.emap.generator.java.JavaInterfaceGenerator
import at.bestsolution.persistence.emap.eMap.ETypeDef
import org.eclipse.core.runtime.ILog
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.IStatus
import at.bestsolution.persistence.emap.generator.java.TypeDefGenerator
import org.eclipse.xtext.validation.ValidationMessageAcceptor
import org.osgi.framework.FrameworkUtil
import at.bestsolution.persistence.emap.EMapGeneratorParticipant
import at.bestsolution.persistence.emap.EMapGeneratorParticipant.FileType
import java.util.List
import java.util.concurrent.atomic.AtomicReference

/**
 * Generates code from your model files on save.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class EMapGenerator implements IGenerator {

	@Inject
	var ILog log;

	@Inject extension
	var UtilCollection util;

	@Inject
	var DDLGenerator ddlGenerator;

	@Inject
	var JavaObjectMapperGenerator javaObjectMapperGenerator;

	@Inject
	var RegistryGenerator javaRegistryGenerator;

	@Inject
	var CustomSQLQueryGenerator customSQLQueryGenerator;

	@Inject
	var JavaInterfaceGenerator javaInterfaceGenerator;

	@Inject
	var TypeDefGenerator typeDefGenerator;

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		try {
			val participants = getEMapGeneratorParticipants
			
//			println("Generating " + resource)
			val root = resource.contents.head as EMapping
			if( root.root instanceof EMappingEntityDef ) {

				val edef = root.root as EMappingEntityDef

				fsa.generateFile(edef.package.name.replace('.','/')+"/"+edef.entity.name + "Mapper.java", javaInterfaceGenerator.generateJavaMapper(edef, edef.entity.etype.lookupEClass).processOutput(root,EMapGeneratorParticipant.FileType.JAVA_INTERFACE,null,participants))

				if( edef.entity.allAttributes.findFirst[pk] == null ) {
					return;
				}
	//			println("Generating MapperFactory")

				val path = edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "MapperFactory.java"
				val content = javaObjectMapperGenerator.generateJava(edef, edef.lookupEClass)
	//			println(" path = " + path)
	//			println(" content.length = " + content.length)
				fsa.generateFile(path, content.processOutput(root,EMapGeneratorParticipant.FileType.JAVA_IMPL,null,participants));

	//			println("Generating named queries")
				for( namedQuery : edef.entity.namedQueries ) {
					for( query : namedQuery.queries ) {
						fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_" + query.dbType +".sql", javaObjectMapperGenerator.generateSQL(namedQuery,query).processOutput(root,EMapGeneratorParticipant.FileType.MAPPED_SELECT,query.dbType,participants));
						if( namedQuery.parameters.empty ) {
							fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_criteria_" + query.dbType +".sql", javaObjectMapperGenerator.generateCriteriaSQL(namedQuery,query).processOutput(root,EMapGeneratorParticipant.FileType.MAPPED_SELECT,query.dbType,participants));
							if( query.where != null ) {
								fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_criteria_where_" + query.dbType +".sql", query.where.processOutput(root,EMapGeneratorParticipant.FileType.MAPPED_SELECT,query.dbType,participants));
							}
							if( query.groupBy != null ) {
								fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_criteria_groupBy_" + query.dbType +".sql", query.groupBy.processOutput(root,EMapGeneratorParticipant.FileType.MAPPED_SELECT,query.dbType,participants));
							}
						}
					}
				}

	//			println("Generating named custom queries")
				for( namedQuery : edef.entity.namedCustomQueries ) {
					for( query : namedQuery.queries ) {
						fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_" + query.dbType +".sql", customSQLQueryGenerator.generate(namedQuery,query).processOutput(root,EMapGeneratorParticipant.FileType.CUSTOM_SELECT,query.dbType,participants));
						if( namedQuery.parameters.empty ) {
							fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_criteria_" + query.dbType +".sql", customSQLQueryGenerator.generateCriteriaSQL(namedQuery,query).processOutput(root,EMapGeneratorParticipant.FileType.CUSTOM_SELECT,query.dbType,participants));
							if( query.where != null ) {
								fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_criteria_where_" + query.dbType +".sql", query.where.processOutput(root,EMapGeneratorParticipant.FileType.CUSTOM_SELECT,query.dbType,participants));
							}
							if( query.groupBy != null ) {
								fsa.generateFile(edef.package.name.replace('.','/')+"/java/"+edef.entity.name + "_" + namedQuery.name + "_criteria_groupBy_" + query.dbType +".sql", query.groupBy.processOutput(root,EMapGeneratorParticipant.FileType.CUSTOM_SELECT,query.dbType,participants));
							}
						}
					}
					if( namedQuery.returnType instanceof ETypeDef ) {
						val t = namedQuery.returnType as ETypeDef
						if( t.name.indexOf('.') == -1 ) {
							fsa.generateFile( edef.package.name.replace('.','/') + "/" + t.name + ".java",  typeDefGenerator.generate(resource, edef,t).processOutput(root,EMapGeneratorParticipant.FileType.JAVA_TYPEDEF,null,participants));
						}
					}
				}

				val projectName = resource.URI.segment(0)


	//			println("Generating " + edef.entity.name+"Mapper.xml");
	//			fsa.generateFile("mappers/"+edef.entity.name+"Mapper.xml", generateMappingXML(edef, javaHelper.getEClass(edef.entity.etype)))
			} else {
				val bundleDef = root.root as EMappingBundle
	//			fsa.generateFile("mappings/"+bundleDef.name+"MappingUnitProvider.java", generateBundleContribution(bundleDef));
	//			fsa.generateFile("mappings/"+bundleDef.name+"SqlMetaDataProvider.java", generateSqlMetaDataProvider(bundleDef));
				fsa.generateFile("mappings/"+bundleDef.name+"ObjectMapperFactoriesProvider.java",javaRegistryGenerator.generateMapperRegistry(bundleDef).processOutput(root,EMapGeneratorParticipant.FileType.JAVA_SERVICE_COMPONENT,null,participants))
				for( d : bundleDef.databases ) {
					fsa.generateFile("ddls/create_"+d+".sql",ddlGenerator.generatedDDL(bundleDef,getDatabaseSupport(d)).processOutput(root,EMapGeneratorParticipant.FileType.CREATE_DDL,null,participants));
					fsa.generateFile("ddls/drop_"+d+".sql",ddlGenerator.generatedDropDDL(bundleDef,getDatabaseSupport(d)).processOutput(root,EMapGeneratorParticipant.FileType.DROP_DDL,null,participants));
				}
			}

		}
		catch (Exception e) {
			e.printStackTrace
			try {
				log.log(new Status(IStatus.ERROR, "at.bestsolution.persistence.emap", "Error during Generator Execution for " + resource.URI, e));
			}
			catch (Exception e1) {
				e1.printStackTrace
			}
		}
	}
	
	def getEMapGeneratorParticipants() {
		val ctx = FrameworkUtil.getBundle(EMapGenerator).bundleContext;
		return ctx.getServiceReferences(EMapGeneratorParticipant,null).map[ctx.getService(it)].toList
	}
	
	def processOutput(CharSequence seq, EMapping root, FileType type, String databaseType, List<EMapGeneratorParticipant> participants) {
		val ref = new AtomicReference(seq)
		participants.forEach[ref.set(it.postProcess(root,type,databaseType,ref.get()))]
		return ref.get();
	}

	def generateSqlMetaDataProvider(EMappingBundle bundleDef) '''
	package mappings;

	import at.bestsolution.persistence.mybatis.SqlMetaDataProvider;

	import java.util.Collections;
	import java.util.HashSet;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Set;

	@SuppressWarnings("restriction")
	public class «bundleDef.name»SqlMetaDataProvider implements SqlMetaDataProvider {
		private Set<Table> tableSet = new HashSet<Table>();
		public «bundleDef.name»SqlMetaDataProvider() {
			«FOR e : bundleDef.entities.map[entity]»
			{
				Set<Column> colSet = new HashSet<Column>();
				«val pk = e.collectDerivedAttributes.values.findFirst[pk]»
				«FOR a : e.collectDerivedAttributes.values»
					«IF a.columnName != null»
						colSet.add(new Column(«a.pk»,"«a.columnName»"));
					«ELSEIF a.parameters.size == 1 && a.parameters.head != pk.columnName»
						colSet.add(new Column(false,"«a.parameters.head»"));
					«ENDIF»
				«ENDFOR»
				tableSet.add(new Table("«e.calcTableName»",colSet));
			}
			«ENDFOR»
		}

		public Set<Table> getTables() {
			return Collections.unmodifiableSet(tableSet);
		}
	}
	'''

	def generateBundleContribution(EMappingBundle bundleDef) '''
		package mappings;

		import at.bestsolution.persistence.mybatis.MappingProvider;
		import at.bestsolution.persistence.mybatis.mapper.URLMappingUnit;

		import java.util.List;
		import java.util.ArrayList;
		import java.util.Collections;

		@SuppressWarnings("restriction")
		public class «bundleDef.name»MappingUnitProvider implements MappingProvider {
			private List<MappingUnit> units;

			public «bundleDef.name»MappingUnitProvider() {
				units = new ArrayList<MappingUnit>();
				«FOR e : bundleDef.entities.map[entity]»
					«var eClass = e.lookupEClass»
					units.add(new URLMappingUnit("mappers/«e.name»Mapper.xml",
						«eClass.instanceClassName».class,
						«eClass.instanceClassName»Mapper.class,
						«eClass.packageName».«eClass.EPackage.name.toFirstUpper»Package.eINSTANCE.get«eClass.name»(),getClass().getClassLoader().getResource("mappers/«e.name»Mapper.xml")));
				«ENDFOR»
			}

			public List<MappingUnit> getMappingUnits() {
				return Collections.unmodifiableList(units);
			}
		}
	'''

//
//
//	def generateMappingXML(EMappingEntityDef entityDef, EClass eClass) '''
//<?xml version="1.0" encoding="UTF-8" ?>
//<!DOCTYPE mapper
//  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
//  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
//<mapper namespace="«eClass.instanceClassName»Mapper">
//	«FOR query : entityDef.entity.namedQueries»
//		<select id="«query.name»"
//			«IF ! query.parameters.empty»parameterType="«IF query.parameters.size > 1»HashMap«ELSE»«query.parameters.head.type»«ENDIF»"«ENDIF»
//			«IF query.queries.head.mapping.attributes.empty && entityDef.entity.descriminationColumn == null»resultMap="Default_«eClass.name»Map"«ELSE»resultMap="«query.name»_«eClass.name»Map"«ENDIF»>
//			SELECT
//				«IF query.queries.head.mapping.attributes.empty»
//					*
//				«ELSE»
//					«query.queries.head.mapping.mapColumns»
//				«ENDIF»
//			FROM
//				«query.queries.head.from.replaceParameters(query.parameters)»
//			«IF query.queries.head.where != null»WHERE
//				«query.queries.head.where.replaceParameters(query.parameters)»«ENDIF»
//			«IF query.queries.head.groupBy != null»GROUP BY
//				«query.queries.head.groupBy.replaceParameters(query.parameters)»«ENDIF»
//			«IF query.queries.head.orderby != null»ORDER BY
//				«query.queries.head.orderby.replaceParameters(query.parameters)»«ENDIF»
//		</select>
//		«IF !query.queries.head.mapping.attributes.empty»
//		<resultMap id="«query.name»_«eClass.name»Map" type="«eClass.instanceClassName»">
//			«query.queries.head.mapping.objectSectionMap»
//		</resultMap>
//		«ELSEIF entityDef.entity.descriminationColumn != null»
//		<resultMap id="«query.name»_«eClass.name»Map" type="«eClass.instanceClassName»">
//			«attrib_resultMapContent(entityDef.entity.allAttributes, eClass, "")»
//			<discriminator javaType="java.lang.String" column="«entityDef.entity.descriminationColumn»">
//				«FOR d : query.queries.head.mapping.descriminatedTypes»
//				<case value="«d.name»" resultMap="«d.fqn».Default_«d.name»Map" />
//				«ENDFOR»
//			</discriminator>
//		</resultMap>
//		«ENDIF»
//	«ENDFOR»
//	<resultMap id="Default_«eClass.name»Map" type="«eClass.instanceClassName»">
//		«attrib_resultMapContent(entityDef.entity.allAttributes, eClass, "")»
//	</resultMap>
//	«val pkAttribute = entityDef.entity.collectDerivedAttributes.values.findFirst[pk]»
//	«IF pkAttribute == null || entityDef.entity.extensionType == "extends"»
//		«generateInsert(entityDef,eClass,null,null)»
//	«ELSE»
//		«val dbSupport = pkAttribute.findDatabaseSupport»
//		«IF dbSupport != null»
//			«FOR d : dbSupport»
//				«generateInsert(entityDef,eClass,pkAttribute,d)»
//			«ENDFOR»
//		«ENDIF»
//	«ENDIF»
//
//	<update id="update">
//		UPDATE
//			«entityDef.tableName»
//		<set>
//			«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
//					if( pk ) {
//						return false;
//					} if(eClass.getEStructuralFeature(name) instanceof EReference) {
//						val r = eClass.getEStructuralFeature(name) as EReference;
//						if( r.containment ) {
//							return false;
//						}
//						return true;
//					} else {
//						return true;
//					}
//				].sort([a,b|return sortAttributes(eClass,a,b)])»
//				«IF a.columnName != null»
//					«a.columnName» = #{«a.name»},
//				«ELSEIF a.isSingle(eClass)»
//					<if test="_isResolved_«a.name»">«a.parameters.head» = #{«a.name».«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name»},</if>
//				«ENDIF»
//			«ENDFOR»
//		</set>
//		WHERE
//			«entityDef.entity.allAttributes.findFirst[pk].columnName» = #{«entityDef.entity.allAttributes.findFirst[pk].name»}
//	</update>
//</mapper>
//	'''
//
//	def generateInsert(EMappingEntityDef entityDef, EClass eClass, EAttribute pkAttribute, DatabaseSupport dbSupport) '''
//	<insert id="insert" parameterType="«eClass.instanceClassName»"
//		«IF dbSupport != null»databaseId="«dbSupport.databaseId»" «IF dbSupport.supportsGeneratedKeys»useGeneratedKeys="true" keyProperty="«pkAttribute.name»"«ENDIF»«ENDIF»>
//		«IF dbSupport != null»
//			«dbSupport.processInsert(pkAttribute,insertSQL(entityDef,eClass,pkAttribute,dbSupport).toString)»
//		«ELSE»
//			«insertSQL(entityDef,eClass,pkAttribute,dbSupport)»
//		«ENDIF»
//	</insert>
//	'''
//
//	def insertSQL(EMappingEntityDef entityDef, EClass eClass, EAttribute pkAttribute, DatabaseSupport dbSupport) '''
//	«val gen = if(pkAttribute == null) null else pkAttribute.valueGenerators.findFirst[dbType==dbSupport.databaseId]»
//	INSERT INTO «entityDef.tableName»
//	(
//		<trim suffixOverrides=','>
//			«IF pkAttribute != null && gen.sequence != null»
//				«pkAttribute.columnName»,
//			«ENDIF»
//			«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[
//					if( pk && entityDef.entity.extensionType != "extends" ) {
//						return false;
//					} if(eClass.getEStructuralFeature(name) instanceof EReference) {
//						val r = eClass.getEStructuralFeature(name) as EReference;
//						if( r.containment ) {
//							return false;
//						}
//						return true;
//					} else {
//						return true;
//					}
//			].sort([a,b|return sortAttributes(eClass,a,b)])»
//				«IF a.columnName != null»
//				«a.columnName»,
//				«ELSEIF a.isSingle(eClass)»
//				«a.parameters.head»,
//				«ENDIF»
//			«ENDFOR»
//			«IF entityDef.entity.descriminationColumn != null»
//				«entityDef.entity.descriminationColumn»
//			«ENDIF»
//		</trim>
//	)
//	VALUES
//	(
//		<trim suffixOverrides=','>
//			«IF pkAttribute != null»
//				«IF gen.sequence != null»
//					«dbSupport.getSequenceStatement(pkAttribute)»,
//				«ENDIF»
//			«ELSEIF entityDef.entity.extensionType == "extends"»
//				#{«entityDef.entity.attributes.findFirst[pk].name»},
//			«ENDIF»
//			«FOR a : entityDef.entity.collectDerivedAttributes.values.filter[if( pk ) {
//						return false;
//					} if(eClass.getEStructuralFeature(name) instanceof EReference) {
//						val r = eClass.getEStructuralFeature(name) as EReference;
//						if( r.containment ) {
//							return false;
//						}
//						return true;
//					} else {
//						return true;
//					}
//				].sort([a,b|return sortAttributes(eClass,a,b)])»
//				«IF a.columnName != null»
//					#{«a.name»},
//				«ELSEIF a.isSingle(eClass)»
//					#{«a.name».«(a.query.eContainer as EMappingEntity).allAttributes.findFirst[pk].name»},
//				«ENDIF»
//			«ENDFOR»
//			«IF entityDef.entity.descriminationColumn != null»
//				#{_classname}
//			«ENDIF»
//		</trim>
//	)
//	'''
//
//	def attrib_resultMapContent(Iterable<EAttribute> attributes, EClass eClass, String columnPrefix) '''
//	<!-- Default mapping -->
//	«FOR a : attributes.sort([a,b|
//		val iA = a.sortValue(eClass)
//		val iB = b.sortValue(eClass)
//		if(iA < iB) {
//			return -1
//		}
//		else if(iA == iB) {
//			return 0
//		} else {
//			return 1;
//		}
//	])»
//		«IF a.pk»
//			<id property="«a.name»" column="«columnPrefix»«a.columnName»" />
//		«ELSE»
//			«IF a.resolved»
//				«IF a.isSingle(eClass)»
//					<association property="«a.name»" column="«columnPrefix»«a.parameters.head»" select="«a.query.fqn»"/>
//				«ELSE»
//					<collection property="«a.name»" column="«columnPrefix»«attributes.head.columnName»" select="«a.query.fqn»" />
//				«ENDIF»
//			«ELSE»
//				<result property="«a.name»" column="«columnPrefix»«a.columnName»" />
//			«ENDIF»
//		«ENDIF»
//	«ENDFOR»
//	'''
//
//	def mappedattrib_resultMapContent(Iterable<EMappingAttribute> attributes, EClass eClass, String columnPrefix) '''
//	<!-- MAPPED -->
//	«FOR a : attributes»
//		«IF a.pk»
//			<id property="«a.property»" column="«a.columnName»" />
//		«ELSE»
//			«IF a.resolved»
//				«IF a.isSingle(eClass)»
//					<association property="«a.property»" column="«a.parameters.head»" select="«a.query.fqn»"/>
//				«ELSE»
//					<collection property="«a.property»" select="«a.query.fqn»" />
//				«ENDIF»
//			«ELSEIF a.mapped»
//				«IF a.isSingle(eClass)»
//					<association property="«a.property»" javaType="«a.map.entity.lookupEClass.instanceClassName»">
//						«a.map.objectSectionMap»
//					</association>
//				«ELSE»
//					<collection property="«a.property»" ofType="«a.map.entity.lookupEClass.instanceClassName»">
//						«a.map.objectSectionMap»
//					</collection>
//				«ENDIF»
//			«ELSE»
//				<result property="«a.property»" column="«a.columnName»" />
//			«ENDIF»
//		«ENDIF»
//	«ENDFOR»
//	'''
//
//	def CharSequence objectSectionMap(EObjectSection section) '''
//	«attrib_resultMapContent(section.entity.allAttributes.filter[a|section.attributes.findFirst[ma|ma.property == a.name] == null], section.entity.lookupEClass, section.prefix+"_")»
//	«mappedattrib_resultMapContent(section.attributes, section.entity.lookupEClass,section.prefix+"_")»
//	'''
//	{
//		val attrs = section.entity.collectAttributes
//		for( attr : section.attributes ) {
//			attrs.remove(attrs.findFirst[a|a.property == attr.property])
//		}
//
//
//
//		return "";
//	}
//
//	def replaceParameters(String v, List<EParameter> parameters) {
//		if( parameters.empty ){
//			return v;
//		} else if( parameters.size == 1 ) {
//			if( parameters.head.type.isPrimitive ) {
//				return v.replace("${"+parameters.head.name+"}","#{id}");
//			}
//			return v.replace("${"+parameters.head.name+".","#{");
//		} else {
//			return v.replace("${","#{");
//		}
//	}
//


}
