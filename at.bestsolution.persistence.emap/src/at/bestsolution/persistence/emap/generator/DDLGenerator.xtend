package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EMappingBundle
import org.eclipse.emf.ecore.EDataType
import static extension at.bestsolution.persistence.emap.generator.EMapGenerator.*

class DDLGenerator {
	def static generatedDDL(EMappingBundle bundleDef, DatabaseSupport db) '''
	«FOR e : bundleDef.entities»
	«val eClass = JavaHelper::getEClass(e.etype)»
	CREATE «IF e.tableName == null»«eClass.name.toUpperCase»«ELSE»«e.tableName.toUpperCase»«ENDIF»
	(
		«var flag = false»
		«FOR a : e.collectDerivedAttributes.values.sort[a,b|sortAttributes(eClass,a,b)]»
			«IF a.columnName != null»
			«IF flag», «ENDIF»«a.columnName» «db.getDatabaseType(eClass.getEStructuralFeature(a.property).EType as EDataType)»«IF ! a.valueGenerators.empty && a.valueGenerators.findFirst[it.dbType==db.databaseId].autokey» «db.getAutokeyDefinition(a)»«ENDIF»«IF a.pk && db.isPrimaryKeyPartOfColDef(a)» PRIMARY KEY«ENDIF»
			«dummy(flag = true)»
			«ENDIF»
		«ENDFOR»
		«val pk = e.collectDerivedAttributes.values.findFirst[pk]»
		«IF ! db.isPrimaryKeyPartOfColDef(pk)»
		, PRIMARY KEY(«pk.columnName»)
		«ENDIF»
	);
	
	
	«ENDFOR»
	'''
	
	def static void dummy(boolean b) {
		
	}
}