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
import at.bestsolution.persistence.order.OrderColumnFactory;

public class AttributeMetaData<O,T, E extends PropertyExpressionFactory<?>> extends FeatureMetaData<O,T,E> {
	private final OrderColumnFactory<O> order;

	public AttributeMetaData(Class<O> ownerType, Class<T> type, E filter, OrderColumnFactory<O> order) {
		super(ownerType, type, filter);
		this.order = order;
	}

	public OrderColumnFactory<O> order() {
		return order;
	}
}
