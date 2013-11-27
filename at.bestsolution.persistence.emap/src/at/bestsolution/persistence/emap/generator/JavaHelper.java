package at.bestsolution.persistence.emap.generator;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import at.bestsolution.persistence.emap.eMap.EType;

public class JavaHelper {

	public static EClass getEClass(EType type) {
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(type.getUrl());
		if( ePackage == null ) {
			throw new IllegalStateException("Unknown package '"+type.getUrl()+"'");
		}

		EClass eClass = (EClass) ePackage.getEClassifier(type.getName());

		if( eClass == null ) {
			throw new IllegalStateException("Could not find class '"+type.getName()+"' in package '"+ePackage.getName()+"'");
		}

		return eClass;
	}
}
