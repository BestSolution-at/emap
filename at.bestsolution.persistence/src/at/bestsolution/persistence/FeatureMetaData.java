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

public abstract class FeatureMetaData<O,T, E extends PropertyExpressionFactory<?>> {
	private final Class<O> ownerType;
	private final Class<T> type;
	private final E filter;

	public FeatureMetaData(Class<O> ownerType, Class<T> type, E filter) {
		this.ownerType = ownerType;
		this.type = type;
		this.filter = filter;
	}

	public Class<O> ownerType() {
		return ownerType;
	}

	public final Class<T> type() {
		return type;
	}

	public final E filter() {
		return filter;
	}
}
