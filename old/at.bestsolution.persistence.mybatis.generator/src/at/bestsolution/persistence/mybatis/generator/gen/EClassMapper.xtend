package at.bestsolution.persistence.mybatis.generator.gen

import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.mybatis.generator.TableNameProvider
import at.bestsolution.persistence.mybatis.generator.ColumnInfoProvider
import org.eclipse.emf.ecore.EReference
import java.util.UUID

class EClassMapper {
	val EClass eClass
	
	new(EClass eClass) {
		this.eClass = eClass
	}
	
	def generateMapperXML(extension TableNameProvider tableNameProvider, extension ColumnInfoProvider columnNameProvider)'''
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="«eClass.instanceClassName»Mapper">
  <select id="selectById" parameterType="long" resultMap="«eClass.name»Map">
    SELECT * FROM "«eClass.tableName»" WHERE "«eClass.EAllAttributes.filter[!transient].findFirst[e|e.isPrimaryKey(eClass)].getColumnName(eClass)»" = #{id}
  </select>
  <select id="selectAll" resultMap="«eClass.name»Map">
    SELECT * FROM "«eClass.tableName»"
  </select>
  <resultMap id="«eClass.name»Map" type="«eClass.instanceClassName»">
  	«FOR f : eClass.EAllAttributes.filter(e|e.isPrimaryKey(eClass))»
  		<id property="«f.name»" column="«f.getColumnName(eClass)»" />
  	«ENDFOR»
  	«FOR f : eClass.EAllAttributes.filter(e|!e.isPrimaryKey(eClass) && !e.derived && !e.transient)»
  		<result property="«f.name»" column="«f.getColumnName(eClass)»"/>
  	«ENDFOR»
  </resultMap>
  <insert id="insertObject" parameterType="«eClass.instanceClassName»">
  	INSERT INTO «eClass.tableName» 
  	(
  		«FOR f : eClass.EAllAttributes.filter(e|e.isPrimaryKey(eClass))»
  			«f.getColumnName(eClass)»
  		«ENDFOR»
  		«FOR f : eClass.EAllAttributes.filter[e|!e.isPrimaryKey(eClass) && !e.derived && !e.transient]»
  			, «f.getColumnName(eClass)»
  		«ENDFOR»
  		«FOR f : eClass.EAllReferences.filter[e|e.isRelation]»
  			, «f.getColumnName(eClass)»
  		«ENDFOR»
  	)
  	VALUES
  	(
  		«FOR f : eClass.EAllAttributes.filter(e|e.isPrimaryKey(eClass))»
  			( NEXT FOR "«f.getPrimaryKeySequenceName(eClass)»"),
  		«ENDFOR»
  		«FOR f : eClass.EAllAttributes.filter[e|!e.isPrimaryKey(eClass) && !e.derived && !e.transient]»
  			, #{«f.name»}
  		«ENDFOR»
  		«FOR f : eClass.EAllReferences.filter[e|e.isRelation]»
  			, #{«f.name».«eClass.EAllAttributes.findFirst[e|e.isPrimaryKey(eClass)].name»}
  		«ENDFOR»
  	)
  </insert>
</mapper>
'''

	def generateMapperJava() '''
package «eClass.packageName»;

import at.bestsolution.persistence.mybatis.mapper.BaseMapper;
import «eClass.instanceClassName»;

public interface «eClass.name»Mapper extends BaseMapper<«eClass.name»> {
	
}
'''

	public def static generatingMappingProviderJava(EClass[] eClasses) '''
package mapping;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import at.bestsolution.persistence.mybatis.MappingProvider;
import at.bestsolution.persistence.mybatis.mapper.URLMappingUnit;

«FOR e : eClasses»
import «e.instanceClassName»;
import «e.instanceClassName»Mapper;
«ENDFOR»



public class MappingProviderImpl implements MappingProvider {
	private List<MappingUnit> units;
	
	public MappingProviderImpl() {
		units = new ArrayList<MappingUnit>();
		«FOR e : eClasses»
		units.add(new URLMappingUnit("«UUID::randomUUID.toString»",«e.name».class,«e.name»Mapper.class,«e.packageName».«e.EPackage.name.toFirstUpper»Package.eINSTANCE.get«e.name.toFirstUpper»(),getClass().getClassLoader().getResource("mappers/«e.name»Mapper.xml")));
		«ENDFOR»
	}
	
	public List<MappingUnit> getMappingUnits() {
		return Collections.unmodifiableList(units);
	}
}
	'''
	
	public def static generateMappingProviderReg(String projectName) '''
<?xml version="1.0" encoding="UTF-8"?>
<scr:component xmlns:scr="http://www.osgi.org/xmlns/scr/v1.1.0" name="«projectName».mappingprovider">
   <implementation class="mapping.MappingProviderImpl"/>
   <service>
      <provide interface="at.bestsolution.persistence.mybatis.MappingProvider"/>
   </service>
</scr:component>
	'''
	
	def fqn(EClass eClass) {
		var packname = new StringBuilder("")
		var sp = eClass.EPackage
		while( sp != null ) {
			packname.append(sp.name);
			sp = sp.ESuperPackage
		}
		return packname + "." + eClass.name
	}
	
	static def packageName(EClass eClass) {
		return eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf("."))
	}
	
	def isRelation(EReference f) {
		if( ! f.many && f.EOpposite != null && f.EOpposite.containment ) {
			return true
		}
		return false
	}
}