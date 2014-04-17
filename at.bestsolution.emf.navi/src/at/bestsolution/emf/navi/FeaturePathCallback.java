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

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author Martin Platter
 *
 */
public interface FeaturePathCallback {
	Object runOnNode( Object memento, EObject node, FeaturePathSegment segment );

	Object runOnLeaf( Object memento, EObject leaf, FeaturePathSegment segment );
}