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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class PropertyExpression<O> extends Expression<O> {
	public final String property;
	public final Collection<Object> data;
	protected final List<QueryFunction<O, ?, ?>> functions = new ArrayList<QueryFunction<O,?,?>>();

	public PropertyExpression(ExpressionType type, String property, Object... data) {
		super(type);
		this.property = property;
		this.data = Arrays.asList(data);
	}

	public boolean hasFunctions() {
		return ! functions.isEmpty();
	}

	public List<QueryFunction<O, ?, ?>> getFunctions() {
		return Collections.unmodifiableList(functions);
	}
}
