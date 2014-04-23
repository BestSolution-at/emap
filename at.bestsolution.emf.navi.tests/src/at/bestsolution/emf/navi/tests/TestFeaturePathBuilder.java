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

import static org.junit.Assert.*;

import org.eclipse.emf.ecore.EReference;
import org.junit.Test;

import at.bestsolution.emf.navi.FeaturePath;
import at.bestsolution.emf.navi.FeaturePathBuilder;
import at.bestsolution.emf.navi.conditions.TrueCondition;
import at.bestsolution.emf.navi.tests.conditions.DepartmentNameCondition;
import at.bestsolution.emf.navi.tests.model.sample.SamplePackage;

public class TestFeaturePathBuilder {
	@Test(expected = IllegalArgumentException.class)
	public void testNullCondition() {
		new FeaturePathBuilder().manySegment(
				SamplePackage.Literals.COMPANY__DEPARTMENTS, null);
		fail("built a feature path with null condition"); //$NON-NLS-1$
	}

	@Test
	public void testOneManySegment() {
		DepartmentNameCondition condition = new DepartmentNameCondition(
				"Marketing"); //$NON-NLS-1$
		EReference ref = SamplePackage.Literals.COMPANY__DEPARTMENTS;
		FeaturePath p = new FeaturePathBuilder().manySegment(ref, condition)
				.create();
		assertEquals(1, p.getSegments().size());
		assertSame(ref, p.getSegments().get(0).feature);
		assertSame(condition, p.getSegments().get(0).condition);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testEmpty() {
		new FeaturePathBuilder().create();
		fail("allowed to create an empty feature path"); //$NON-NLS-1$
	}

	@Test(expected = IllegalArgumentException.class)
	public void testManySegmentUseForSingleReference() {
		new FeaturePathBuilder().manySegment(
				SamplePackage.Literals.COMPANY__DEPARTMENTS,
				TrueCondition.getInstance()).manySegment(
				SamplePackage.Literals.DEPARTMENT__COMPANY,
				TrueCondition.getInstance());
		fail("allowed to create feature path (many) segment for single reference"); //$NON-NLS-1$
	}

	@Test(expected = IllegalArgumentException.class)
	public void test3Segments() {
		EReference ref13 = SamplePackage.Literals.COMPANY__DEPARTMENTS;
		EReference ref2 = SamplePackage.Literals.DEPARTMENT__COMPANY;
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(ref13, TrueCondition.getInstance()).segment(ref2)
				.manySegment(ref13, TrueCondition.getInstance()).create();
		assertEquals(3, p.getSegments().size());
		assertSame(ref13, p.getSegments().get(0).feature);
		assertSame(TrueCondition.getInstance(),
				p.getSegments().get(0).condition);

		assertSame(ref2, p.getSegments().get(1).feature);
		assertNull(p.getSegments().get(1).condition);

		assertSame(ref13, p.getSegments().get(2).feature);
		assertSame(TrueCondition.getInstance(),
				p.getSegments().get(2).condition);
	}
}
