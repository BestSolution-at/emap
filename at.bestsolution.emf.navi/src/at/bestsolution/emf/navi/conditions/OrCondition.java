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
package at.bestsolution.emf.navi.conditions;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import at.bestsolution.emf.navi.Condition;

public class OrCondition implements Condition {

	private final List<Condition> conditions;

	public OrCondition(Condition... conditions) {
		this.conditions = Arrays.asList(conditions);
	}

	@Override
	public boolean matches(EObject object) {
		for (Condition c : conditions) {
			if (c.matches(object)) {
				return true;
			}
		}
		return false;
	}

}
