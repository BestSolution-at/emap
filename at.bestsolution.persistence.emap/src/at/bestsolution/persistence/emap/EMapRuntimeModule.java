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


import at.bestsolution.persistence.emap.generator.DDLGenerator;
import at.bestsolution.persistence.emap.generator.EClassLookup;
import at.bestsolution.persistence.emap.generator.JavaObjectMapperGenerator;
import at.bestsolution.persistence.emap.generator.UtilCollection;

import com.google.inject.Binder;
import com.google.inject.Scope;
import com.google.inject.Scopes;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class EMapRuntimeModule extends at.bestsolution.persistence.emap.AbstractEMapRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);


		binder.bind(EClassLookup.class);
		binder.bind(DDLGenerator.class);
		binder.bind(UtilCollection.class);
		binder.bind(JavaObjectMapperGenerator.class);
	}

}
