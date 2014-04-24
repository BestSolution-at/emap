/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis <martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.emf.navi.tests;

import static org.junit.Assert.fail;

import org.junit.Test;

import at.bestsolution.emf.navi.Condition;
import at.bestsolution.emf.navi.conditions.AndCondition;
import at.bestsolution.emf.navi.conditions.OrCondition;

public class TestConditions {
	@Test(expected = IllegalArgumentException.class)
	public void testEmptyAndCondition() {
		new AndCondition();
		fail("allowed to create an empty And condition"); //$NON-NLS-1$
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullAndCondition() {
		new AndCondition((Condition[]) null);
		fail("allowed to create an null And condition"); //$NON-NLS-1$
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmptyOrCondition() {
		new OrCondition();
		fail("allowed to create an empty Or condition"); //$NON-NLS-1$
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullOrCondition() {
		new OrCondition((Condition[]) null);
		fail("allowed to create an null Or condition"); //$NON-NLS-1$
	}
}
