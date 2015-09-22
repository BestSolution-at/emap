/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence;

import at.bestsolution.persistence.expr.PropertyExpressionFactory;

public class ReferenceMetaData<O,T, E extends PropertyExpressionFactory<?>> extends FeatureMetaData<O,T,E> {

	public ReferenceMetaData(Class<O> ownerType,Class<T> type, E filter) {
		super(ownerType,type, filter);
	}
}

