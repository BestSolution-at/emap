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
package at.bestsolution.emf.navi;

import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.emf.navi.conditions.AndCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsIntCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsLongCondition;
import at.bestsolution.emf.navi.conditions.OrCondition;

public class NaviFactory {

	public static FeaturePathBuilder featurePath() {
		return new FeaturePathBuilder();
	}

	/** creates a simple feature path */
	public static FeaturePath featurePath(EStructuralFeature feature) {
		return new FeaturePath(new FeaturePathSegment(feature));
	}

	public static Condition and(Condition...conditions) {
		return new AndCondition(conditions);
	}

	public static Condition or(Condition...conditions) {
		return new OrCondition(conditions);
	}

	public static Condition pathEquals(FeaturePath path, Object equals) {
		return new FeaturePathEqualsCondition(path, equals);
	}

	public static Condition pathEquals(FeaturePath path, int equals) {
		final FeaturePathSegment lastSegment = path.getSegments().get(path.getSegments().size()-1);
		if (lastSegment.feature.getEType().getInstanceClassName().equals("long")) {
			return pathEquals(path, (long)equals);
		}
		else {
			return new FeaturePathEqualsIntCondition(path, equals);
		}
	}

	public static Condition pathEquals(FeaturePath path, long equals) {
		return new FeaturePathEqualsLongCondition(path, equals);
	}
}
