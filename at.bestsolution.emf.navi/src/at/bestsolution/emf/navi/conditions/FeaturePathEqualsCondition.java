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
package at.bestsolution.emf.navi.conditions;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.emf.navi.FeaturePath;
import at.bestsolution.emf.navi.FeaturePathUtil;

public class FeaturePathEqualsCondition extends FeaturePathCondition {

	private final Object equals;

	public FeaturePathEqualsCondition(FeaturePath path, Object equals) {
		super(path);
		this.equals = equals;
	}

	@Override
	public boolean matches(EObject object) {
		final Object obj = FeaturePathUtil.get(object, path);
		return equals.equals(obj);
	}

}
