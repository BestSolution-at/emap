/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tom <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.expr;

public class CompareExpression<O> extends PropertyExpression<O> {

	public CompareExpression(ExpressionType type, String property, Object data) {
		super(type, property, data);
	}

	public static <O> CompareExpression<O> gt(String property, Object data) {
		return new CompareExpression<O>(ExpressionType.GT, property, data);
	}

	public static <O> CompareExpression<O> gte(String property, Object data) {
		return new CompareExpression<O>(ExpressionType.GTE, property, data);
	}

	public static <O> CompareExpression<O> lt(String property, Object data) {
		return new CompareExpression<O>(ExpressionType.LT, property, data);
	}

	public static <O> CompareExpression<O> lte(String property, Object data) {
		return new CompareExpression<O>(ExpressionType.LTE, property, data);
	}

	public CompareExpression<O> lpad(int padding) {
		functions.add(FunctionFactory.<O>createLpad(padding));
		return this;
	}
}
