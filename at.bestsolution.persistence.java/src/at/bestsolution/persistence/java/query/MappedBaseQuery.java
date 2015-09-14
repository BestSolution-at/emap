/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.query;

import at.bestsolution.persistence.java.DatabaseSupport;

public class MappedBaseQuery<O> extends DynamicBaseQuery<O, O> {

	public MappedBaseQuery(DatabaseSupport db) {
		super(db);
	}

}
