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

import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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

public class EClassLookupServiceImpl implements IEClassLookupService, IResourceChangeListener {

	private static boolean debug = Boolean.getBoolean("emap.eclasslookup.verbose");
	
	
	// 
	private Map<URI, GenModel> genModelCache = new WeakHashMap<URI, GenModel>();
	private Map<String, GenPackage> genPackageCache = new WeakHashMap<String, GenPackage>();
	
	// this cache allows us to immediate answer - this one makes it fast
	private Map<String, EClass> eClassCache = new WeakHashMap<String, EClass>();
	
	private void flushEClassCache() {
		eClassCache.clear();
	}
	
	private void flushGenModelCache() {
		genModelCache.clear();
	}
	
	private void flushGenPackageCache() {
		genPackageCache.clear();
	}
	
	private void evictGenModel(URI uri) {
		genModelCache.remove(uri);
	}
	
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
						flushGenPackageCache();
						flushEClassCache();
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
		final ResourceSet rs = new ResourceSetImpl();
		final Resource resource = rs.getResource(uri, true);
		if (!resource.getContents().isEmpty()) {
			final GenModel model = (GenModel) resource.getContents().get(0);
			genModelCache.put(uri, model);
			
			
			return model;
		}
		else {
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
			if (debug) System.err.println("genPackageCache hit");
			return cacheResult;
		}
		else {
			return findGenPackage(nsURI);
		}
	}
	
	private EClass findEClass(GenPackage gp, String className) {
		final EClass e = (EClass) gp.getEcorePackage().getEClassifier(className);
		if (e != null) {
			for( GenClassifier c : gp.getGenClassifiers() ) {
				if( e.getName().equals(c.getName()) ) {
					e.setInstanceClassName(c.getImportedInstanceClassName());
					return e;
				}
			}
		}
		else {
			// eclass does not exist in specified package
			if (debug) System.err.println("eclass " + className + " does not exist in specified package " + gp.getNSURI());
		}
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
	
	private EClass getEClass(String nsURI, String className) {
		final String fastId = getFastId(nsURI, className);
		
		final EClass fastResult = eClassCache.get(fastId);
		if (fastResult != null) {
			if (debug) System.err.println("fast cache hit!");
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
		long t = System.currentTimeMillis();
		try {
			return getEClass(type.getUrl(), type.getName());
		}
		catch (Throwable x) {
			x.printStackTrace();
			System.err.println("Exception occoured! Result is null");
			return null;
		}
		finally {
			long n = System.currentTimeMillis() - t;
			if (debug) System.err.println("getEClass needed " + n + "ms");
		}
	}

	
}
