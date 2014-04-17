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
import at.bestsolution.emf.navi.FeaturePathSegment;
import at.bestsolution.emf.navi.FeaturePathUtil;

public class FeaturePathEqualsIntCondition extends FeaturePathCondition {

	private final int equals;

	public FeaturePathEqualsIntCondition(FeaturePath path, int equals) {
		super(path);
		this.equals = equals;
		FeaturePathSegment lastSegment = path.getSegments().get(path.getSegments().size()-1);
		if (!lastSegment.feature.getEType().getInstanceClassName().equals("int")) {
			throw new IllegalArgumentException("feature path must point to an int value");
		}
	}

	@Override
	public boolean matches(EObject object) {
		final int result = ((Integer)FeaturePathUtil.get(object, path)).intValue();
		return result == equals;
	}

}
