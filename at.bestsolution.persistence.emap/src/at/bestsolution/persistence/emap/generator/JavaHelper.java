package at.bestsolution.persistence.emap.generator;

import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.bestsolution.persistence.emap.eMap.EType;

public class JavaHelper {

	public static EClass getEClass(EType type) {
		// Look in the local workspace first
		Map<String, URI> map = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);
		
		URI uri = map.get(type.getUrl());
		
		if( uri != null ) {
			ResourceSet s = new ResourceSetImpl();
			Resource resource = s.getResource(uri, true);
			GenModel m = (GenModel) resource.getContents().get(0);
			for( GenPackage gp : m.getAllGenPackagesWithClassifiers() ) {
				if( gp.getNSURI().equals(type.getUrl()) ) {
					EClass e = (EClass) gp.getEcorePackage().getEClassifier(type.getName());
					for( GenClassifier c : gp.getGenClassifiers() ) {
						if( c.getName().equals(e.getName()) ) {
							e.setInstanceClassName(c.getImportedInstanceClassName());
							return e;
						}
					}
				}
			}
		}
		
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
	
//	private static GenClass getGenClass(EClass eClass) {
//		Map<String, URI> map = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);
//		URI uri = map.get(eClass.getEPackage().getNsURI());
//		ResourceSet s = new ResourceSetImpl();
//		GenModel m = (GenModel) s.getResource(uri, true).getContents().get(0);
//		for( GenPackage p : m.getAllGenPackagesWithClassifiers() ) {
//			for( GenClassifier gc : p.getGenClassifiers() ) {
//				if( gc.getName().equals(eClass.getName()) ) {
//					return (GenClass) gc;
//				}
//			}
//		}
//		return null;
//	}
//	
//	public static String calcInstanceClassName(EClass eClass) {
//		String rv = eClass.getInstanceClassName();
//		if( rv == null ) {
//			getGenClass(eClass);
//		}
//	}
}
