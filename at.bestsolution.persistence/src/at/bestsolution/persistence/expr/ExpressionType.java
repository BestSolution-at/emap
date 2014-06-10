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

public enum ExpressionType {
	EQUALS,
	NOT_EQUALS,

	IEQUALS,
	INOT_EQUALS,

	IS_NULL,
	IS_NOT_NULL,

	LIKE,
	ILIKE,

	NOT_LIKE,
	NOT_ILIKE,

	IN,
	NOT_IN,

	AND,
	OR
}
