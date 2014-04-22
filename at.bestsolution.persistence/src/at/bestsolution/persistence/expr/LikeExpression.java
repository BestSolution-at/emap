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

public class LikeExpression<O> extends PropertyExpression<O> {

	private LikeExpression(ExpressionType type, String property, String data) {
		super(type, property, data);
	}

	public static <O> LikeExpression<O> like(String property, String data) {
		return new LikeExpression<O>(ExpressionType.LIKE, property, data);
	}

	public static <O> LikeExpression<O> ilike(String property, String data) {
		return new LikeExpression<O>(ExpressionType.ILIKE, property, data);
	}
}
