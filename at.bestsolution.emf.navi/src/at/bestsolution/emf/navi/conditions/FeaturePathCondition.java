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

import at.bestsolution.emf.navi.Condition;
import at.bestsolution.emf.navi.FeaturePath;


public abstract class FeaturePathCondition implements Condition {

	protected final FeaturePath path;

	public FeaturePathCondition(FeaturePath path) {
		this.path = path;
	}

}
