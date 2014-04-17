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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EStructuralFeature;

public class FeaturePathBuilder {
	private List<FeaturePathSegment> segments = new ArrayList<FeaturePathSegment>();

	public FeaturePathBuilder segment(EStructuralFeature feature) {
		segments.add(new FeaturePathSegment(feature));
		return this;
	}

	public FeaturePathBuilder manySegment(EStructuralFeature feature, Condition condition) {
		segments.add(new FeaturePathSegment(feature, condition));
		return this;
	}

	public FeaturePath create() {
		return new FeaturePath(segments.toArray(new FeaturePathSegment[0]));
	}
}
