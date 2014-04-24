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
import at.bestsolution.emf.navi.PathNotTraversableException;

public class FeaturePathEqualsCondition extends FeaturePathCondition {

	private final Object equals;

	public FeaturePathEqualsCondition(FeaturePath path, Object equals) {
		super(path);
		this.equals = equals;
	}

	@Override
	public boolean matches(Object object) {
		if (object instanceof EObject) {
			try {
				final Object obj = FeaturePathUtil.first((EObject)object, path);
				return equals.equals(obj);
			}
			catch (PathNotTraversableException e) {
				return false;
			}
		}
		else {
			return false;
		}
	}

}
