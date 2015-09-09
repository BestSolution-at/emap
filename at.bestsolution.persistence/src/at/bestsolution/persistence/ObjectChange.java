/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence;

import java.util.List;

public interface ObjectChange<O> {
	public String getAttributeName();
	public Class<O> getInstanceType();
	public boolean isMultiValue();
	public List<O> getAdditions();
	public List<O> getRemovals();
	public O getNewValue();
	public O geOldValue();
}
