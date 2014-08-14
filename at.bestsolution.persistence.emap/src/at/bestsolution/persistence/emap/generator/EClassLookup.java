/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.persistence.emap.eMap.EType;

public class EClassLookup {

	
	public EClassLookup() {
		//System.err.println("<--- LIFE OF LOOKUP STARTS HERE " + System.identityHashCode(this));
	}

	private Map<EType, EClass> localCache = new HashMap<EType, EClass>();
	private Map<EType, EDataType> localCacheEDataType = new HashMap<EType, EDataType>();

	private EClass findEClass(EType type, boolean targetPlatform) {

		Map<String, URI> map = EcorePlugin.getEPackageNsURIToGenModelLocationMap(targetPlatform);
		URI uri = map.get(type.getUrl());
		if( uri != null ) {
			try {
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
			} catch(Throwable t ) {
			}
		}
		return null;
	}

	public EDataType getEDataType(EType type) {
		
		BundleContext bundleContext = FrameworkUtil.getBundle(EClassLookup.class).getBundleContext();
		ServiceReference<IEClassLookupService> lookupServiceReference = bundleContext.getServiceReference(IEClassLookupService.class);
		if (lookupServiceReference != null) {
			IEClassLookupService lookupService = bundleContext.getService(lookupServiceReference);
			return lookupService.getEDataType(type);
		}
		System.err.println("IEClassLookupService not found - using old method");
		
		
		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(type.getUrl());
		if( ePackage == null ) {
			throw new IllegalStateException("Unknown package '"+type.getUrl()+"'");
		}

		EDataType result = (EDataType) ePackage.getEClassifier(type.getName());

		if( result == null ) {
			throw new IllegalStateException("Could not find class '"+type.getName());
		}
		localCacheEDataType.put(type, result);

		return result;
	}

	public EClass getEClass(EType type) {
		
		BundleContext bundleContext = FrameworkUtil.getBundle(EClassLookup.class).getBundleContext();
		ServiceReference<IEClassLookupService> lookupServiceReference = bundleContext.getServiceReference(IEClassLookupService.class);
		if (lookupServiceReference != null) {
			IEClassLookupService lookupService = bundleContext.getService(lookupServiceReference);
			return lookupService.getEClass(type);
		}
		System.err.println("IEClassLookupService not found - using old method");
		
		// TODO disable cache until lifecycle is correctly managed
//		localCache.clear();
//
//
//		// first hit the cache
//		if (localCache.containsKey(type)) {
//			return localCache.get(type);
//		}
//
//		// frist we search the target platform (=workspace)
//		EClass result = findEClass(type, true);
//
//		// then we search the installation
//		if (result == null) {
//			result = findEClass(type, false);
//		}

		EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(type.getUrl());
		if( ePackage == null ) {
			throw new IllegalStateException("Unknown package '"+type.getUrl()+"'");
		}

		EClass result = (EClass) ePackage.getEClassifier(type.getName());

		if( result == null ) {
			throw new IllegalStateException("Could not find class '"+type.getName());
		}
		localCache.put(type, result);

		return result;
	}

}
