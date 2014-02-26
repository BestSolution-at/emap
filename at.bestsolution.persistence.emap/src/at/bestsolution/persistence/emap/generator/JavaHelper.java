package at.bestsolution.persistence.emap.generator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;

import at.bestsolution.persistence.emap.eMap.EType;

import com.google.inject.Inject;

public class JavaHelper {

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider;
	
	public EClass getEClass(ResourceDescriptionsProvider provider, EType type) {
		
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
	
	public EClass getEClass(EType type) {
//		// Look in the local workspace first
//		Map<String, URI> map = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);
//
//		URI uri = map.get(type.getUrl());
//
//		if( uri != null ) {
//			try {
//				ResourceSet s = new ResourceSetImpl();
//				Resource resource = s.getResource(uri, true);
//				GenModel m = (GenModel) resource.getContents().get(0);
//				for( GenPackage gp : m.getAllGenPackagesWithClassifiers() ) {
//					if( gp.getNSURI().equals(type.getUrl()) ) {
//						EClass e = (EClass) gp.getEcorePackage().getEClassifier(type.getName());
//						for( GenClassifier c : gp.getGenClassifiers() ) {
//							if( c.getName().equals(e.getName()) ) {
//								e.setInstanceClassName(c.getImportedInstanceClassName());
//								System.err.println("FOUND IN TARGET!!!!");
//								return e;
//							}
//						}
//					}
//				}
//			} catch(Throwable t ) {
//			}
//		}

		System.err.println("looking for package: " + type.getUrl());
		System.err.println("known packages:");
		for (String key : EPackage.Registry.INSTANCE.keySet()) {
			System.err.println(" * " + key);
		}
		
//		IResourceVisitor visitor = new IResourceVisitor() {
//			public boolean visit(IResource res) { 
//				System.err.println("RES: " + res);
//				return true;
//			}
//		};
//		
//		
//		IResource root = ResourcesPlugin.getWorkspace().getRoot();
//		try {
//			root.accept(visitor);
//			
//			
//		} catch (CoreException e) {
//			e.printStackTrace();
//		}
		
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(type.getUrl());
//		List<EPackage.Descriptor> l = new ArrayList<EPackage.Descriptor>();
//		for( Object o : EPackage.Registry.INSTANCE.values() ) {
//			if( o instanceof EPackage.Descriptor ) {
//				l.add((Descriptor) o);
//			}
////			System.err.println(o);
//		}
//
//		for( Descriptor d : l ) {
//			System.err.println(d.getEPackage().getNsURI());
//		}
		

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
