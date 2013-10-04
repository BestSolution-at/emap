package at.bestsolution.persistence.emap.ecore

import org.eclipse.emf.ecore.EClass

class EcoreToEMapGenerator {
	EClass eclass;
	
	new(EClass eclass) {
		this.eclass = eclass;	
	}
	
	def generate() '''
	package «eclass.packageName»;
	
	«IF eclass.abstract»abstract«ENDIF» entity «eclass.name»«IF ! eclass.ESuperTypes.empty» derives «eclass.ESuperTypes.head.name»«ENDIF» {
	}
	'''
	
	static def packageName(EClass eClass) {
		return eClass.instanceClassName.substring(0,eClass.instanceClassName.lastIndexOf("."))
	}
}