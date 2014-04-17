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
package at.bestsolution.persistence.java.defaultproxy.internal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import at.bestsolution.persistence.java.ProxyFactory;

public class DefaultProxyFactory implements ProxyFactory {

	@SuppressWarnings("unchecked")
	@Override
	public <O extends EObject> O createProxy(EClass eClass) {
		return (O) EcoreUtil.create(eClass);
	}

}