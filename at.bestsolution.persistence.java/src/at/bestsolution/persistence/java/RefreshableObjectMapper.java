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
package at.bestsolution.persistence.java;

import java.util.Set;

import at.bestsolution.persistence.ObjectMapper;

public interface RefreshableObjectMapper<O> extends ObjectMapper<O> {
	public void refreshWithReferences(O object, Set<Object> refreshedRegistry);
}
