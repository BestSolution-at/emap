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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

public class FeaturePath {

	private final List<FeaturePathSegment> segments;

	public FeaturePath(FeaturePathSegment... segments) {
		if (segments == null || segments.length == 0) {
			throw new IllegalArgumentException("no segments"); //$NON-NLS-1$
		}
		this.segments = Arrays.asList(segments);
	}

	public List<FeaturePathSegment> getSegments() {
		return Collections.unmodifiableList(segments);
	}

	public boolean contains(EStructuralFeature eStructuralFeature) {
		for (FeaturePathSegment seg : segments) {
			if (seg.feature == eStructuralFeature)
				return true;
		}
		return false;
	}
}
