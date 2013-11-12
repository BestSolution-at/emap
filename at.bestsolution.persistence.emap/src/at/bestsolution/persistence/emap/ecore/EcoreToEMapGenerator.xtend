package at.bestsolution.persistence.emap.ecore

import org.eclipse.emf.ecore.EClass

class EcoreToEMapGenerator {
	EClass eclass;

	new(EClass eclass) {
		this.eclass = eclass;
	}

	def generate(extension NamingStrategy namingStrategy) '''
	package «eclass.packageName»;

	«IF eclass.abstract»abstract«ENDIF» entity «eclass.name»«IF ! eclass.ESuperTypes.empty» derives «eclass.ESuperTypes.head.name»«ENDIF» {
		etype "«eclass.EPackage.nsURI»"#«eclass.name»
		attributes {
			«FOR a : eclass.EAttributes»
				«a.name» => «a.getColumnName(eclass)»
			«ENDFOR»
			«FOR r : eclass.EReferences»
				«IF r.containment»
					«r.name» => resolve «r.EType.name».selectAllFor«eclass.name.toFirstUpper»()
				«ENDIF»
			«ENDFOR»
		}
	}
	'''

	static def packageName(EClass eClass) {
		return eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf("."))
	}
}