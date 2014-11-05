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
package at.bestsolution.persistence.emap;


import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.persistence.emap.generator.DDLGenerator;
import at.bestsolution.persistence.emap.generator.EClassLookup;
import at.bestsolution.persistence.emap.generator.IEClassLookupService;
import at.bestsolution.persistence.emap.generator.JavaObjectMapperGenerator;
import at.bestsolution.persistence.emap.generator.UtilCollection;

import com.google.inject.Binder;
import com.google.inject.Provider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class EMapRuntimeModule extends at.bestsolution.persistence.emap.AbstractEMapRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
			
		binder.bind(ILog.class).toProvider(new Provider<ILog>() {
			@Override
			public ILog get() {
				Bundle bundle = FrameworkUtil.getBundle(EMapRuntimeModule.class);
				return Platform.getLog(bundle);
			}
		});
		binder.bind(EClassLookup.class);
		binder.bind(DDLGenerator.class);
		binder.bind(UtilCollection.class);
		binder.bind(JavaObjectMapperGenerator.class);
		
		binder.bind(IEClassLookupService.class).toProvider(new Provider<IEClassLookupService>() {
			@Override
			public IEClassLookupService get() {
				BundleContext bundleContext = FrameworkUtil.getBundle(EMapRuntimeModule.class).getBundleContext();
				ServiceReference<IEClassLookupService> lookupServiceReference = bundleContext.getServiceReference(IEClassLookupService.class);
				if (lookupServiceReference != null) {
					return bundleContext.getService(lookupServiceReference);
				}
				else {
					return null;
				}
			}
		});
	}

}
