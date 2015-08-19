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
package at.bestsolution.persistence.emap.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;

import com.google.inject.Binder;

import at.bestsolution.persistence.emap.ui.fsa.EMapFilesystemAccess;

/**
 * Use this class to register components to be used within the IDE.
 */
public class EMapUiModule extends at.bestsolution.persistence.emap.ui.AbstractEMapUiModule {
	public EMapUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
		binder.bind(EclipseResourceFileSystemAccess2.class).to(EMapFilesystemAccess.class);
	}
}
