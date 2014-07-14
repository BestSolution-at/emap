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

public abstract class QueryFunction<O,T,R> {
	private final Object[] data;

	public QueryFunction(Object... data) {
		this.data = data;
	}

	public abstract Class<R> getValueType();

	public abstract R convert(T value);

	public FunctionType getType() {
		return FunctionType.LPAD;
	}

	public Object[] getData() {
		return data;
	}

	public enum FunctionType {
		LPAD
	}
}
