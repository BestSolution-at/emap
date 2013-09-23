package at.bestsolution.persistence.mybatis.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

import at.bestsolution.persistence.mybatis.generator.gen.EClassMapper;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	private static <S> S getService(Class<S> clazz) {
		Bundle bundle = FrameworkUtil.getBundle(Application.class);
		BundleContext ctx = bundle.getBundleContext();
		return ctx.getService(ctx.getServiceReference(clazz));
	}
	
	public Object start(IApplicationContext context) throws Exception {
		TableNameProvider tblProvider = getService(TableNameProvider.class);
		ColumnInfoProvider clProvider = getService(ColumnInfoProvider.class);
		
		String emap_bundle = System.getProperty("emap_bundle");	
		
//		String ecorePackage = System.getProperty("epackage-uri");
//		String mappingProject = System.getProperty("mapping-project");
//		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ecorePackage);
//		Set<EClass> mappedClasses = new HashSet<EClass>();
//		generateMappers(mappingProject, Boolean.getBoolean("overwrite"), ePackage, tblProvider, clProvider, mappedClasses);
//		
//		File f = new File(mappingProject + "/src/mapping/MappingProviderImpl.java");
//		f.getParentFile().mkdirs();
//		f.createNewFile();
//		FileOutputStream out = new FileOutputStream(f);
//		out.write(EClassMapper.generatingMappingProviderJava(mappedClasses.toArray(new EClass[0])).toString().getBytes());
//		out.close();
//		
//		f = new File(mappingProject + "/OSGI-INF/services/mappingprovider.xml");
//		f.getParentFile().mkdirs();
//		f.createNewFile();
//		
//		out = new FileOutputStream(f);
//		out.write(EClassMapper.generateMappingProviderReg(new File(mappingProject).getName()).toString().getBytes());
//		out.close();
		
		return IApplication.EXIT_OK;
	}

	private boolean isTransientObject(EClass eClass) {
		for( EStructuralFeature f : eClass.getEAllStructuralFeatures() ) {
			if( ! f.isTransient() ) {
				return false;
			}
		}
		
		return true;
	}
	
	private void generateMappers(String projectRoot, boolean overwrite, EPackage ePackage, TableNameProvider tblProvider, ColumnInfoProvider clProvider, Set<EClass> mappedClasses) {
		for( EClassifier eClassifier : ePackage.getEClassifiers() ) {
			if( eClassifier instanceof EClass ) {
				EClass ec = (EClass) eClassifier;
				if( ec.isAbstract() || ec.isInterface() || isTransientObject(ec) || "java.util.Map$Entry".equals(ec.getInstanceTypeName()) ) {
					continue;
				}
				EClassMapper m = new EClassMapper((EClass) eClassifier);
				mappedClasses.add((EClass) eClassifier);
				try {
					{
						File f = new File(projectRoot + "/mappers/" + eClassifier.getName() + "Mapper.xml");
						if( overwrite || ! f.exists() ) {
							f.getParentFile().mkdirs();
							f.createNewFile();
							FileOutputStream out = new FileOutputStream(f);
							out.write(m.generateMapperXML(tblProvider, clProvider).toString().getBytes());
							out.close();	
						}						
					}
					
					{
						File f = new File(projectRoot + "/src/" + eClassifier.getInstanceClassName().replace('.', '/') + "Mapper.java");
						if( overwrite || ! f.exists() ) {
							f.getParentFile().mkdirs();
							f.createNewFile();
							FileOutputStream out = new FileOutputStream(f);
							out.write(m.generateMapperJava().toString().getBytes());
							out.close();				
						}
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.err.println("Not an EClass: " + eClassifier);
			}
		}
		for( EPackage eSub : ePackage.getESubpackages() ) {
			generateMappers(projectRoot, overwrite, eSub, tblProvider, clProvider, mappedClasses);
		}
	}
	
	public void stop() {
		// nothing to do
	}
}
