/** -----------------------------------------------------------------
 * Copyright ( c) 2014 BestSolution.at EDV Systemhaus GmbH
 * All Rights Reserved .
 *
 * BestSolution.at MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE , EITHER EXPRESS OR IMPLIED , INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE , OR NON - INFRINGEMENT.
 *
 * BestSolution.at SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS
 * SOFTWARE OR ITS DERIVATIVES.
 *
 * This software is released under the terms of the
 *
 * "Eclipse Public License, Version 1.0
 * or any later version "
 *
 * and may only be distributed and used under the terms of the
 * mentioned license. You should have received a copy of the license
 * along with this software product, if not you can download it from
 * http://www.eclipse.org/legal/epl-v10.html
 * ----------------------------------------------------------------
 */
package at.bestsolution.emf.navi;

import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.emf.navi.conditions.AndCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsIntCondition;
import at.bestsolution.emf.navi.conditions.FeaturePathEqualsLongCondition;
import at.bestsolution.emf.navi.conditions.OrCondition;
import at.bestsolution.emf.navi.conditions.TrueCondition;

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
	
	public static Condition True() {
		return new TrueCondition();
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
