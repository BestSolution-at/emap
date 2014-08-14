/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import at.bestsolution.persistence.emap.eMap.EType;

public class EClassLookupServiceImpl implements IEClassLookupService, IResourceChangeListener {

	private static boolean debug = Boolean.getBoolean("emap.eclasslookup.verbose");

	// 
	private Map<URI, GenModel> genModelCache = new WeakHashMap<URI, GenModel>();
	private Map<String, GenPackage> genPackageCache = new WeakHashMap<String, GenPackage>();
	
	// this cache allows us to immediate answer - this one makes it fast
	private Map<String, EClass> eClassCache = new WeakHashMap<String, EClass>();
	private Map<String, EDataType> eDataTypeCache = new WeakHashMap<String, EDataType>();
	
	private Map<URI, URI> eCoreToGenModelMap = new HashMap<URI, URI>();

	
	private void flushSpeedCaches() {
		flushGenPackageCache();
		flushEClassCache();
		flushEDataTypeCache();
	}
	
	private void flushEClassCache() {
		eClassCache.clear();
	}
	
	private void flushGenModelCache() {
		genModelCache.clear();
	}
	
	private void flushEDataTypeCache() {
		eDataTypeCache.clear();
	}
	
	private void flushGenPackageCache() {
		genPackageCache.clear();
	}
	
	private void evictGenModel(URI uri) {
		genModelCache.remove(uri);
	}
	
	private ResourceSet rs = new ResourceSetImpl();
	
	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		try {
			event.getDelta().accept(new IResourceDeltaVisitor() {
				@Override
				public boolean visit(IResourceDelta delta) throws CoreException {
					if ("genmodel".equals(delta.getFullPath().getFileExtension())) {
						final URI uri = URI.createPlatformResourceURI(delta.getFullPath().toString(), false);
						if (debug) System.err.println(" => " + uri);
						
						// when a genmodel is changed, we evict it from our cache
						// and flush the other caches
						evictGenModel(uri);
						flushSpeedCaches();
						return false;
					}
					else if ("ecore".equals(delta.getFullPath().getFileExtension())) {
						final URI ecoreURI = URI.createPlatformResourceURI(delta.getFullPath().toString(), false);
						if (debug) System.err.println(" => " + ecoreURI);
						
						final URI genmodelURI = eCoreToGenModelMap.get(ecoreURI);
						
						// when a genmodel is changed, we evict it from our cache
						// and flush the other caches
						evictGenModel(genmodelURI);
						flushSpeedCaches();
						return false;
					}
					return true;
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private String getFastId(String nsURI, String className) {
		return nsURI + "#" + className;
	}
	
	private GenModel loadGenModel(URI uri) {
		System.err.println("loadGenModel! " + uri);
		//final ResourceSet rs = new ResourceSetImpl();
		final Resource resource = rs.getResource(uri, true);
		if (!resource.getContents().isEmpty()) {
			final GenModel model = (GenModel) resource.getContents().get(0);
			model.reconcile();
			genModelCache.put(uri, model);
			return model;
		}
		else {
			System.err.println("COULD NOT LOAD GENMODEL!!!!!! " + uri);
			return null;
		}
	}
	
	private GenModel getGenModel(URI uri) {
		long l = System.currentTimeMillis();
		try {
			final GenModel result = genModelCache.get(uri);
			if (result != null) {
				if (debug) System.err.println("found genmodel in cache!");
				return result;
			}
			return loadGenModel(uri);
		}
		finally {
			long e = System.currentTimeMillis() - l;
			if (debug) System.err.println("getGenModel needed " + e + "ms");
		}
	}
	
	private GenModel getGenModel(String nsURI) {
		return getGenModel(getGenmodelURI(nsURI));
	}
	
	private GenPackage findGenPackage(String nsURI) {
		long l = System.currentTimeMillis();
		try {
			for (GenPackage p : getGenModel(nsURI).getAllGenPackagesWithClassifiers()) {
				if (debug) System.err.println("checking " + p.getNSURI());
				if (nsURI.equals(p.getNSURI())) {
					
					URI ecoreURI = p.getEcoreModelElement().eResource().getURI();
					eCoreToGenModelMap.put(ecoreURI, getGenmodelURI(nsURI));
					
					genPackageCache.put(nsURI, p);
					return p;
				}
			}
			return null;
		}
		finally {
			long e = System.currentTimeMillis() - l;
			if (debug) System.err.println("findGenPackage needed " + e + "ms");
		}
	}
	
	private GenPackage getGenPackage(String nsURI) {
		GenPackage cacheResult = genPackageCache.get(nsURI);
		if (cacheResult != null) {
			return cacheResult;
		}
		else {
			return findGenPackage(nsURI);
		}
	}
	
	private void fixInstanceClassName(GenClassifier genClassifier) {
		if (genClassifier.getEcoreClassifier().getInstanceClassName() == null) {
			if (debug) System.err.println("setting instanceClassName for " + genClassifier.getName() + " to " + genClassifier.getImportedInstanceClassName());
			final String instanceClassName = genClassifier.getImportedInstanceClassName();
			genClassifier.getEcoreClassifier().setInstanceClassName(instanceClassName);
			
			// we cannot set the instanceClass
//			try {
//				eClassifier.setInstanceClass(Class.forName(instanceClassName));
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			}
			
			if (genClassifier instanceof GenClass) {
				GenClass genClass = (GenClass) genClassifier;
				
				// we fix the attribute types
				for (GenFeature genFeature : genClass.getChildrenFeatures()) {
					GenClassifier genT = genFeature.getTypeGenClassifier();
					fixInstanceClassName(genT);
				}
				
				// we fix the superclasses
				for (GenClass superGenClass : genClass.getBaseGenClasses()) {
					fixInstanceClassName(superGenClass);
				}
			}
		}
	}
	
	private EClass findEClass(GenPackage gp, String className) {
		for( GenClass genClass : gp.getGenClasses() ) {
			if (className.equals(genClass.getName())) {
				fixInstanceClassName(genClass);
				return genClass.getEcoreClass();
			}
		}
		// eclass does not exist in specified package
		if (debug) System.err.println("eclass " + className + " does not exist in specified package " + gp.getNSURI());
		return null;
	}
	
	private URI getGenmodelURI(String nsURI) {
		Map<String, URI> map = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true);
		if (!map.containsKey(nsURI)) {
			map = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false);
		}
		URI r =  map.get(nsURI);
		if (debug) System.err.println(nsURI + " maps to " + r);
		return r;
	}
	
	
	
	private EClass findEClass(String nsURI, String className) {
		EClass result = null;
		
		// first we try the registry
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		if( ePackage != null ) {
			result = (EClass) ePackage.getEClassifier(className);
		}

		// then we try our genmodel search
		if (result == null) {
			result = findEClass(getGenPackage(nsURI), className);
		}
		
		// add it to fastcache
		if (result != null) {
			eClassCache.put(getFastId(nsURI, className), result);
		}
		else {
			if (debug) System.err.println("=> NO RESULT! " + nsURI + " # " + className);
		}
		return result;
		
	}
	
	private EDataType findEDataType(GenPackage gp, String className) {
		for( GenDataType genDataType : gp.getGenDataTypes() ) {
			if( className.equals(genDataType.getName()) ) {
				fixInstanceClassName(genDataType);
				return genDataType.getEcoreDataType();
			}
		}
		
		// edatatype does not exist in specified package
		if (debug) System.err.println("edatatype " + className + " does not exist in specified package " + gp.getNSURI());
		return null;
	}
	
	private EDataType findEDataType(String nsURI, String className) {
		EDataType result = null;
		
		// first we try the registry
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(nsURI);
		if( ePackage != null ) {
			result = (EDataType) ePackage.getEClassifier(className);
		}

		// then we try our genmodel search
		if (result == null) {
			result = findEDataType(getGenPackage(nsURI), className);
		}
		
		// add it to fastcache
		if (result != null) {
			eDataTypeCache.put(getFastId(nsURI, className), result);
		}
		else {
			if (debug) System.err.println("=> NO RESULT! " + nsURI + " # " + className);
		}
		return result;
		
	}
	
	private EDataType getEDataType(String nsURI, String className) {
		final String fastId = getFastId(nsURI, className);
		
		final EDataType fastResult = eDataTypeCache.get(fastId);
		if (fastResult != null) {
			return fastResult;
		}
		
		return findEDataType(nsURI, className);
	}
	
	private EClass getEClass(String nsURI, String className) {
		final String fastId = getFastId(nsURI, className);
		
		final EClass fastResult = eClassCache.get(fastId);
		if (fastResult != null) {
			return fastResult;
		}
		
		return findEClass(nsURI, className);
	}
	
	public void activate() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
	}
	
	public void deactivate() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
	}
	
	@Override
	public EClass getEClass(EType type) {
		try {
			final EClass result = getEClass(type.getUrl(), type.getName());
			
			if (result.getInstanceClassName() == null) {
				System.err.println("instanceClassName was not set " + result);
				new Exception().printStackTrace();
			}
			
			return result;
		}
		catch (Throwable x) {
			x.printStackTrace();
			System.err.println("Exception occoured! Result is null");
			return null;
		}
	}

	@Override
	public EDataType getEDataType(EType type) {
		try {
			EDataType result = getEDataType(type.getUrl(), type.getName());
			
			if (result.getInstanceClassName() == null) {
				System.err.println("instanceClassName was not set " + result);
				new Exception().printStackTrace();
			}
			
			return result;
		}
		catch (Throwable x) {
			x.printStackTrace();
			System.err.println("Exception occoured! Result is null");
			return null;
		}
	}

	
	
}
