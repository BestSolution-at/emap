/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.expr;

import java.util.Arrays;
import java.util.Collection;

public abstract class PropertyExpression<O> extends Expression<O> {
	public final String property;
	public final Collection<Object> data;

	public PropertyExpression(ExpressionType type, String property, Object... data) {
		super(type);
		this.property = property;
		this.data = Arrays.asList(data);
	}
}
