/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *     Martin Platter <mplatter@bestsolution.at> - filter  implementation
 *     Martin Bluehweis <martin.bluehweis@bestsolution.at> - improvements & bugfixes
 *******************************************************************************/
package at.bestsolution.emf.navi;

import java.util.ArrayList;
import java.util.Collections;
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
	
	public static interface PathSegmentResolver {
		List<Object> resolveSegment(EObject owner, FeaturePathSegment segment, boolean lastSegment) throws PathNotTraversableException, TooManyResultsException;
	}
	
	public static PathSegmentResolver GET_FIRST_RESOLVER = new PathSegmentResolver() {

		@Override
		public List<Object> resolveSegment(EObject owner, FeaturePathSegment segment, boolean lastSegment) throws PathNotTraversableException {
			
			if (!owner.eClass().getEAllStructuralFeatures().contains(segment.feature)) {
				throw new PathNotTraversableException("Object " + owner + " does not have " + segment.feature);
			}
			
			List<Object> result = new ArrayList<Object>();
			if (segment.feature.isMany()) {
				// TODO NULL HANDLING
				final List<Object> candidates = (List<Object>) owner.eGet(segment.feature);
				for (Object candidate : candidates) {
					if (segment.condition.matches(candidate)) {
						result.add(candidate);
						break; // we always take the first match
					}
				}
			}
			else {
				// TODO NULL HANDLING
				final Object resolved = owner.eGet(segment.feature);
				result.add(resolved);
			}
			return result;
		}
		
	};
	
	public static PathSegmentResolver GET_RESOLVER = new PathSegmentResolver() {

		@Override
		public List<Object> resolveSegment(EObject owner, FeaturePathSegment segment, boolean lastSegment) throws PathNotTraversableException, TooManyResultsException {
			
			if (!owner.eClass().getEAllStructuralFeatures().contains(segment.feature)) {
				throw new PathNotTraversableException("Object " + owner + " does not have " + segment.feature);
			}
			
			List<Object> result = new ArrayList<Object>();
			if (segment.feature.isMany()) {
				// TODO NULL HANDLING
				final List<Object> candidates = (List<Object>) owner.eGet(segment.feature);
				for (Object candidate : candidates) {
					if (segment.condition.matches(candidate)) {
						if (!lastSegment && !result.isEmpty()) {
							throw new TooManyResultsException();
						}
						result.add(candidate);
					}
				}
			}
			else {
				// TODO NULL HANDLING
				final Object resolved = owner.eGet(segment.feature);
				result.add(resolved);
			}
			return result;
		}
		
	};
	
	public static PathSegmentResolver FILTER_RESOLVER = new PathSegmentResolver() {

		@Override
		public List<Object> resolveSegment(EObject owner, FeaturePathSegment segment, boolean lastSegment) throws PathNotTraversableException {
			
			if (!owner.eClass().getEAllStructuralFeatures().contains(segment.feature)) {
				throw new PathNotTraversableException("Object " + owner + " does not have " + segment.feature);
			}
			
			List<Object> result = new ArrayList<Object>();
			if (segment.feature.isMany()) {
				// TODO NULL HANDLING
				final List<Object> candidates = (List<Object>) owner.eGet(segment.feature);
				for (Object candidate : candidates) {
					if (segment.condition.matches(candidate)) {
						result.add(candidate);
					}
				}
			}
			else {
				// TODO NULL HANDLING
				final Object resolved = owner.eGet(segment.feature);
				result.add(resolved);
			}
			return result;
		}
		
	};
	
	protected static void resolvePath(EObject currentOwner, int currentSegmentIdx,  FeaturePath path, PathSegmentResolver resolver, List<Object> result, FeaturePathCallback callback, Object memento) throws PathNotTraversableException, TooManyResultsException {
		final FeaturePathSegment currentSegment = path.getSegments().get(currentSegmentIdx);
		final boolean lastSegment = currentSegmentIdx == path.getSegments().size() - 1;
		
		final List<Object> nextResult = resolver.resolveSegment(currentOwner, currentSegment, lastSegment);
		
		if (lastSegment) {
			result.addAll(nextResult);
			if (callback != null) {
				for (Object leaf : nextResult) {
					callback.runOnLeaf(memento, leaf);
				}
			}
		}
		else {
			if (callback != null) {
				memento = callback.runOnNode(memento, currentOwner, currentSegment);
			}
			for (final Object nextOwner : nextResult) {
				if (nextOwner instanceof EObject) {
					resolvePath((EObject)nextOwner, currentSegmentIdx + 1, path, resolver, result, callback, memento);
				}
			}
		}
	}
	
	public static List<Object> resolvePath(EObject owner, FeaturePath path, PathSegmentResolver resolver, FeaturePathCallback callback) throws PathNotTraversableException, TooManyResultsException {
		List<Object> result = new ArrayList<Object>();
		resolvePath(owner, 0, path, resolver, result, callback, null);
		return result;
	}
	
	public static List<Object> doFilter(EObject owner, FeaturePath path) throws PathNotTraversableException {
		try {
			return resolvePath(owner, path, FILTER_RESOLVER, null);
		} catch (TooManyResultsException e) {
			// filter wont throw this one
			return null;
		}
	}
	
	public static Object doGetFirst(EObject owner, FeaturePath path) throws PathNotTraversableException {
		try {
		return resolvePath(owner, path, GET_FIRST_RESOLVER, null).get(0);
		} catch (TooManyResultsException e) {
			// get first wont throw this one
			return null;
		}
	}
	
	public static Object doGet(EObject owner, FeaturePath path) throws PathNotTraversableException, TooManyResultsException {
		final List<Object> result = resolvePath(owner, path, GET_RESOLVER, null);
		if (path.getSegments().get(path.getSegments().size()-1).feature.isMany()) {
			return result;
		}
		else {
			return result.get(0);
		}
	}
	
	
	public static Object get(EObject owner, FeaturePath path) throws PathNotTraversableException, TooManyResultsException {
		return doGet(owner, path);
		// TODO needs to be reimplemented
//		Object current = owner;
//		EObject eCurrent = owner;
//		Iterator<FeaturePathSegment> it = path.getSegments().iterator();
//		while (it.hasNext()) {
//			final FeaturePathSegment segment = it.next();
//			if (!eCurrent.eClass().getEAllStructuralFeatures()
//					.contains(segment.feature)) {
//				throw new IllegalArgumentException(
//						"Invalid feature path segment: "
//								+ eCurrent.eClass().getName()
//								+ " does not contain feature "
//								+ segment.feature.getName());
//			}
//			Object newCurrent = null;
//			if (segment.feature.isMany()) {
//				// handle collection
//				Object many = eCurrent.eGet(segment.feature);
//				if (many instanceof List) {
//					@SuppressWarnings("unchecked")
//					List<Object> manyList = (List<Object>) many;
//					List<Object> result = new ArrayList<Object>();
//					for (Object o : manyList) {
//						if (o instanceof EObject) {
//							EObject eo = (EObject) o;
//							if (segment.condition.matches(eo)) {
//								result.add(eo);
//							}
//						}
//					}
//					if (!it.hasNext()) {
//						newCurrent = result;
//					} else {
//						switch (result.size()) {
//						case 0:
//							// TODO this needs configurable handling
//							return null;
//						case 1:
//							newCurrent = result.get(0);
//							break;
//						default:
//							throw new TooManyResultsException(
//									"expected 0 or 1 result, but got many: " + result); //$NON-NLS-1$
//						}
//					}
//				}
//			} else {
//
//				newCurrent = eCurrent.eGet(segment.feature);
//			}
//
//			current = newCurrent;
//
//			if (it.hasNext()) {
//				if (current instanceof EObject) {
//					eCurrent = (EObject) current;
//				}
//				// if (current == null) {
//				// throw new NullPointerException("last segment was null! " +
//				// eCurrent);
//				// }
//				else {
//					throw new NullPointerException("could not resolve segment "
//							+ segment + " after " + eCurrent);
//				}
//			}
//		}
//		return current;
	}

	/**
	 * get the first object in a given feature path
	 * @param owner
	 *            owner object
	 * @param path
	 *            feature path
	 * @return first found object
	 */
	public static Object first(EObject owner, FeaturePath path) throws PathNotTraversableException {
		return doGetFirst(owner, path);
//		// TODO needs to be reimplemented
//		Object current = owner;
//		EObject eCurrent = owner;
//		Iterator<FeaturePathSegment> it = path.getSegments().iterator();
//		while (it.hasNext()) {
//			final FeaturePathSegment segment = it.next();
//			if (!eCurrent.eClass().getEAllStructuralFeatures()
//					.contains(segment.feature)) {
//				throw new IllegalArgumentException(
//						"Invalid feature path segment: "
//								+ eCurrent.eClass().getName()
//								+ " does not contain feature "
//								+ segment.feature.getName());
//			}
//			Object newCurrent = null;
//			if (segment.feature.isMany()) {
//				// handle collection
//				Object many = eCurrent.eGet(segment.feature);
//				if (many instanceof List) {
//					@SuppressWarnings("unchecked")
//					List<Object> manyList = (List<Object>) many;
//
//					for (Object o : manyList) {
//						if (o instanceof EObject) {
//							EObject eo = (EObject) o;
//							if (segment.condition.matches(eo)) {
//								newCurrent = eo;
//								break;
//							}
//						}
//					}
//				}
//			} else {
//				newCurrent = eCurrent.eGet(segment.feature);
//			}
//
//			current = newCurrent;
//
//			if (it.hasNext()) {
//				if (current instanceof EObject) {
//					eCurrent = (EObject) current;
//				}
//				else {
//					throw new NullPointerException("could not resolve segment "
//							+ segment + " after " + eCurrent);
//				}
//			}
//		}
//		return current;
	}
	
	public static List<Object> filter(EObject owner, FeaturePath path) {
		FeaturePathSegment[] segs = path.getSegments().toArray(
				new FeaturePathSegment[0]);
		return filter(owner, segs, null);
	}

	public static List<Object> filter(EObject owner, FeaturePathSegment[] segs,
			FeaturePathCallback cb) {
		List<Object> result = new ArrayList<Object>();
		filter(owner, segs, 0, result, cb, null);
		return result;
	}

	@SuppressWarnings("rawtypes")
	public static void filter(EObject owner, FeaturePathSegment[] path,
			int idx, List<Object> result, FeaturePathCallback cb, Object memento) {
		EStructuralFeature feature = path[idx].feature;
		if (!owner.eClass().getEAllStructuralFeatures().contains(feature)) {
			throw new IllegalArgumentException("Invalid feature path segment: "
					+ owner.eClass().getName() + " does not contain feature "
					+ feature.getName());
		}
		Object obj = owner.eGet(feature);
		if (cb != null) {
			memento = cb.runOnNode(memento, owner, path[idx]);
		}
		if (feature.isMany()) {
			for (Object o : (List) obj) {
				if (path[idx].condition.matches((EObject) o)) {
					filterInternalRecursion((EObject) o, path, idx, result, cb,
							memento);
				}
			}
		} else {
			filterInternalRecursion((EObject) obj, path, idx, result, cb,
					memento);
		}
	}

	private static void filterInternalRecursion(EObject owner,
			FeaturePathSegment[] path, int idx, List<Object> result,
			FeaturePathCallback cb, Object memento) {
		if (idx == path.length - 1) {
			if (cb != null) {
				cb.runOnLeaf(memento, owner, path[idx]);
			}
			result.add(owner);
		} else {
			filter(owner, path, idx + 1, result, cb, memento);
		}
	}
}
