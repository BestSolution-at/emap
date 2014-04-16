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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * 
 * @author Christoph Caks, Martin Platter
 *
 */
public class FeaturePathUtil {
	public static Object get( EObject owner, FeaturePath path ) {
		Object current = owner;
		EObject eCurrent = owner;
		Iterator<FeaturePathSegment> it = path.getSegments().iterator();
		while ( it.hasNext() ) {
			final FeaturePathSegment segment = it.next();
			Object newCurrent = null;
			if ( segment.feature.isMany() ) {
				// handle collection
				Object many = eCurrent.eGet( segment.feature );
				if ( many instanceof List ) {
					@SuppressWarnings( "unchecked" )
					List<Object> manyList = (List<Object>) many;

					for ( Object o : manyList ) {
						if ( o instanceof EObject ) {
							EObject eo = (EObject) o;
							if ( segment.condition.matches( eo ) ) {
								newCurrent = eo;
								break;
							}
						}
					}
				}
			}
			else {
				newCurrent = eCurrent.eGet( segment.feature );
			}

			current = newCurrent;

			if ( it.hasNext() ) {
				if ( current instanceof EObject ) {
					eCurrent = (EObject) current;
				}
				// if (current == null) {
				// throw new NullPointerException("last segment was null! " + eCurrent);
				// }
				else {
					throw new NullPointerException( "could not resolve segment " + segment + " after " + eCurrent );
				}

			}

		}
		return current;
	}

	public static List<Object> filter( EObject owner, FeaturePath path ) {
		FeaturePathSegment[] segs = path.getSegments().toArray( new FeaturePathSegment[ 0 ] );
		return filter( owner, segs, null );
	}

	public static List<Object> filter( EObject owner, FeaturePathSegment[] segs, FeaturePathCallback cb ) {
		List<Object> result = new ArrayList<Object>();
		filter( owner, segs, 0, result, cb, null );
		return result;
	}

	@SuppressWarnings( "rawtypes" )
	public static void filter( EObject owner, FeaturePathSegment[] path, int idx, List<Object> result, FeaturePathCallback cb, Object memento ) {
		EStructuralFeature feature = path[ idx ].feature;
		Object obj = owner.eGet( feature );
		if ( cb != null ) {
			memento = cb.runOnNode( memento, owner, path[ idx ] );
		}
		if ( feature.isMany() ) {
			for ( Object o : (List) obj ) {
				if ( path[ idx ].condition.matches( (EObject) o ) ) {
					filterInternalRecursion( (EObject) o, path, idx, result, cb, memento );
				}
			}
		}
		else {
			filterInternalRecursion( (EObject) obj, path, idx, result, cb, memento );
		}
	}

	private static void filterInternalRecursion( EObject owner, FeaturePathSegment[] path, int idx, List<Object> result, FeaturePathCallback cb, Object memento ) {
		if ( idx == path.length - 1 ) {
			if ( cb != null ) {
				cb.runOnLeaf( memento, owner, path[ idx ] );
			}
			result.add( owner );
		}
		else {
			filter( owner, path, idx + 1, result, cb, memento );
		}
	}
}
