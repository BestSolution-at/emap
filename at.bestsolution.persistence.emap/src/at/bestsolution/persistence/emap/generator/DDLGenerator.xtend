package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EMappingBundle
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EcorePackage
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import static extension at.bestsolution.persistence.emap.generator.UtilCollection.*
import com.google.inject.Inject

class DDLGenerator {
	
	@Inject extension
	var UtilCollection util;
	
	@Inject
	private JavaHelper javaHelper;
	
	
	def CharSequence generatedDDL(EMappingBundle bundleDef, DatabaseSupport db) '''
	«FOR e : bundleDef.entities»
	«val eClass = javaHelper.getEClass(e.etype)»
	CREATE TABLE «e.calcTableName»
	(
		«var flag = false»
		«val pk = e.collectDerivedAttributes.values.findFirst[pk]»
		«FOR a : e.collectDerivedAttributes.values.sort[a,b|sortAttributes(eClass,a,b)]»
			«IF a.columnName != null»
				«IF flag», «ENDIF»«a.columnName» «db.getDatabaseType(eClass.getEStructuralFeature(a.name).EType as EDataType)»«IF ! a.valueGenerators.empty && a.valueGenerators.findFirst[it.dbType==db.databaseId].autokey» «db.getAutokeyDefinition(a)»«ENDIF»«IF a.pk && db.isPrimaryKeyPartOfColDef(a)» PRIMARY KEY«ENDIF»
				«dummy(flag = true)»
			«ELSEIF a.parameters.size == 1 && a.parameters.head != pk.columnName»
				«val pkEClass = javaHelper.getEClass((a.query.eContainer as EMappingEntity).etype)»
				«IF flag», «ENDIF» «a.parameters.head» «db.getDatabaseType(pkEClass.getEStructuralFeature((a.query.eContainer as EMappingEntity).attributes.findFirst[it.pk].name).EType as EDataType)» NOT NULL
				«dummy(flag = true)»
			«ENDIF»
		«ENDFOR»

		«IF e.descriminationColumn != null»
			, «e.descriminationColumn» «db.getDatabaseType(EcorePackage::eINSTANCE.EString)»
		«ENDIF»
		«IF ! db.isPrimaryKeyPartOfColDef(pk)»
		, PRIMARY KEY(«pk.columnName»)
		«ENDIF»
	);


	«ENDFOR»

	«FOR e : bundleDef.entities»
		«val eClass = javaHelper.getEClass(e.etype)»
		«val pk = e.collectDerivedAttributes.values.findFirst[pk].columnName»
		«FOR a : e.collectDerivedAttributes.values.filter[resolved && parameters.size == 1 && parameters.head != pk].sort[a,b|sortAttributes(eClass,a,b)]»
			ALTER TABLE «e.calcTableName»
				ADD FOREIGN KEY («a.parameters.head») REFERENCES «(a.query.eContainer as EMappingEntity).calcTableName» («(a.query.eContainer as EMappingEntity).attributes.findFirst[it.pk].columnName»);


		«ENDFOR»
		«IF e.extensionType == "extends"»
		ALTER TABLE «e.calcTableName»
			ADD FOREIGN KEY(«pk») REFERENCES «e.parent.calcTableName» («e.parent.attributes.findFirst[it.pk].columnName»)
		«ENDIF»
	«ENDFOR»
	'''

	def void dummy(boolean b) {

	}
}