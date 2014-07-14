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

public final class EqualsExpression<O> extends PropertyExpression<O> {

	private EqualsExpression(ExpressionType type, String property, Object data) {
		super(type, property, data);
	}

	public static <O> EqualsExpression<O> eq(String property, Object data) {
		return new EqualsExpression<O>(ExpressionType.EQUALS, property, data);
	}

	public static <O> EqualsExpression<O> neq(String property, Object data) {
		return new EqualsExpression<O>(ExpressionType.NOT_EQUALS, property, data);
	}

	public static <O> EqualsExpression<O> ieq(String property, Object data) {
		return new EqualsExpression<O>(ExpressionType.IEQUALS, property, data);
	}

	public static <O> EqualsExpression<O> ineq(String property, Object data) {
		return new EqualsExpression<O>(ExpressionType.INOT_EQUALS, property, data);
	}

	public EqualsExpression<O> lpad(int padding) {
		functions.add(FunctionFactory.<O>createLpad(padding));
		return this;
	}
}