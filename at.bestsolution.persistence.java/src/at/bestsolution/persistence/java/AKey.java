/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java;

import java.util.List;

import at.bestsolution.persistence.Key;

public abstract class AKey<O> implements Key<O> {

	protected abstract KeyLayout getKeyLayout();
	
	@Override
	public List<String> getAttributes() {
		return getKeyLayout().getAttributes();
	}

}
