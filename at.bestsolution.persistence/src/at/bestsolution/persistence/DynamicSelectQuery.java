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
package at.bestsolution.persistence;

import java.util.List;

import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.order.OrderColumn;

public interface DynamicSelectQuery<T,O> {
	public List<T> list();
	public T unique();
	public DynamicSelectQuery<T,O> maxRows(int maxRows);
	public DynamicSelectQuery<T,O> where(Expression<O> expression);
	public DynamicSelectQuery<T,O> orderBy(OrderColumn<O>... columns);
}
