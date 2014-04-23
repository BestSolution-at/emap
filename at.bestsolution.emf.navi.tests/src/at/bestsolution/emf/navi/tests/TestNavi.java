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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Before;
import org.junit.Test;

import at.bestsolution.emf.navi.FeaturePath;
import at.bestsolution.emf.navi.FeaturePathBuilder;
import at.bestsolution.emf.navi.FeaturePathUtil;
import at.bestsolution.emf.navi.conditions.TrueCondition;
import at.bestsolution.emf.navi.tests.conditions.DepartmentNameCondition;
import at.bestsolution.emf.navi.tests.model.sample.Company;
import at.bestsolution.emf.navi.tests.model.sample.Department;
import at.bestsolution.emf.navi.tests.model.sample.SamplePackage;

public class TestNavi {
	private Company rootObject = null;

	@Before
	public void setUp() throws Exception {
		SamplePackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("model", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(
				URI.createURI("resources/Company.xmi"), true); //$NON-NLS-1$
		rootObject = (Company) resource.getContents().get(0);
	}

	@Test
	public void testRootObject() {
		assertNotNull(rootObject);
	}

	@Test
	public void testNSimpleValue() {
		for (Department d : rootObject.getDepartments()) {
			FeaturePath p = new FeaturePathBuilder().manySegment(
					SamplePackage.Literals.COMPANY__DEPARTMENTS,
					new DepartmentNameCondition(d.getName())).create();
			Object o = FeaturePathUtil.get(rootObject, p);
			assertTrue(o instanceof List<?>);
			@SuppressWarnings("unchecked")
			List<Object> result = (List<Object>) o;
			assertEquals(1, result.size());
			assertSame(d, result.get(0));
		}
	}

	@Test
	public void testNNothingFound() {
		FeaturePath p = new FeaturePathBuilder().manySegment(
				SamplePackage.Literals.COMPANY__DEPARTMENTS,
				new DepartmentNameCondition("not existing department"))
				.create();
		Object o = FeaturePathUtil.get(rootObject, p);
		assertTrue(o instanceof List<?>);
		@SuppressWarnings("unchecked")
		List<Object> result = (List<Object>) o;
		assertTrue(result.isEmpty());
	}

	@Test
	public void testNMultipleResults() {
		FeaturePath p = new FeaturePathBuilder().manySegment(
				SamplePackage.Literals.COMPANY__DEPARTMENTS,
				TrueCondition.getInstance()).create();
		Object o = FeaturePathUtil.get(rootObject, p);
		// there are 2 matching departments, so it is wrong to obtain a single
		// result value.
		// maybe we need to discuss the expected behaviour
		assertFalse(o instanceof Department);
		// TODO test expected behaviour
	}

	@Test
	public void testN1NMultipleResult() {
		String name = "Marketing";
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name))
				.segment(SamplePackage.Literals.DEPARTMENT__COMPANY)
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						TrueCondition.getInstance()).create();
		Object o = FeaturePathUtil.get(rootObject, p);
		// there are 2 matching departments, so it is wrong to obtain a single
		// result value.
		// maybe we need to discuss the expected behaviour
		assertFalse(o instanceof Department);
		// TODO test expected behaviour
	}

	@Test(expected = IllegalArgumentException.class)
	public void testAttributeSegment() {
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition("Marketing"))
				.segment(SamplePackage.Literals.GROUP__NAME).create();
		FeaturePathUtil.get(rootObject, p);
		fail(); //$NON-NLS-1$
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReturnIvalidValueOnIncompleteFeatureFath() {
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition("Marketing"))
				.segment(SamplePackage.Literals.GROUP__NAME).create();
		FeaturePathUtil.get(rootObject, p);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testN1InvalidSegment() {
		String name = "Marketing"; //$NON-NLS-1$
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name))
				// this is an invalid segment at this place in the model
				.segment(SamplePackage.Literals.GROUP__DEPARTMENT).create();
		FeaturePathUtil.get(rootObject, p);
		fail("got a result on an inconsistent feature path");
	}

	@Test
	public void testN1BackReference() {
		String name = "Marketing"; //$NON-NLS-1$
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name))
				.segment(SamplePackage.Literals.DEPARTMENT__COMPANY).create();
		Object o = FeaturePathUtil.get(rootObject, p);
		assertSame(o, rootObject);
	}

	@Test
	public void testN1BackReference2Times() {
		String name = "Marketing"; //$NON-NLS-1$
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name))
				.segment(SamplePackage.Literals.DEPARTMENT__COMPANY)
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name))
				.segment(SamplePackage.Literals.DEPARTMENT__COMPANY).create();
		Object o = FeaturePathUtil.get(rootObject, p);
		assertSame(o, rootObject);
	}

	@Test
	public void testN1N() {
		String name = "Marketing"; //$NON-NLS-1$
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name))
				.segment(SamplePackage.Literals.DEPARTMENT__COMPANY)
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition(name)).create();
		Object o = FeaturePathUtil.get(rootObject, p);
		assertTrue(o instanceof List<?>);
		@SuppressWarnings("unchecked")
		List<Object> result = (List<Object>) o;
		assertEquals(1, result.size());
		assertEquals(name, ((Department) result.get(0)).getName());
	}

	@Test
	public void testReturnIvalidValueOnInvalidFeatureFath() {
		FeaturePath p = new FeaturePathBuilder()
				.manySegment(SamplePackage.Literals.COMPANY__DEPARTMENTS,
						new DepartmentNameCondition("Marketing"))
				.manySegment(SamplePackage.Literals.DEPARTMENT__GROUPS,
						TrueCondition.getInstance()).create();
		Object o = FeaturePathUtil.get(rootObject, p);
		assertFalse(
				"The condition is missing, but however: we never may get a single department instance",
				o instanceof Department);
	}
}
