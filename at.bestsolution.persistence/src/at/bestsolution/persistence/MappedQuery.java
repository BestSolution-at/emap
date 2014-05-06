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
package at.bestsolution.persistence;

import java.util.List;

import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.order.OrderColumn;

public interface MappedQuery<O> {
	public List<O> list();
	public O unique();
	public MappedQuery<O> maxRows(int maxRows);
	public MappedQuery<O> where(Expression<O> expression);
	public MappedQuery<O> orderBy(OrderColumn<O>... columns);
}
