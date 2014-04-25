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

public class NullExpression<O> extends PropertyExpression<O> {

	private NullExpression(ExpressionType type, String property) {
		super(type, property);
	}

	public static <O> NullExpression<O> isNull(String property) {
		return new NullExpression<O>(ExpressionType.IS_NULL, property);
	}

	public static <O> NullExpression<O> isNotNull(String property) {
		return new NullExpression<O>(ExpressionType.IS_NOT_NULL, property);
	}
}