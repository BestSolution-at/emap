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
package at.bestsolution.persistence.order;

public class OrderColumnFactory<O> {
	private final String column;

	public OrderColumnFactory(String column) {
		this.column = column;
	}

	public OrderColumn<O> asc() {
		return new OrderColumn<O>(column, true);
	}

	public OrderColumn<O> desc() {
		return new OrderColumn<O>(column, false);
	}
}
