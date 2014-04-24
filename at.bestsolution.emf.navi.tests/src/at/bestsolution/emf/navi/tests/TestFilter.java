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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
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
import at.bestsolution.emf.navi.NaviException;
import at.bestsolution.emf.navi.PathNotTraversableException;
import at.bestsolution.emf.navi.conditions.TrueCondition;
import at.bestsolution.emf.navi.tests.model.sample.Company;
import at.bestsolution.emf.navi.tests.model.sample.SamplePackage;

public class TestFilter {
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

	@Test(expected=NullPointerException.class)
	public void testNullFeaturePath()  throws NaviException{ 
			FeaturePathUtil.filter(rootObject, null);
			fail("API accepted null filter"); //$NON-NLS-1$
	}

	@Test(expected=IllegalArgumentException.class)
	public void testEmptyFeaturePath() throws NaviException {
			FeaturePathUtil.filter(rootObject,
					new FeaturePathBuilder().create());
			fail("API accepted null filter"); //$NON-NLS-1$
	}

	@Test(expected=IllegalArgumentException.class)
	public void testInvalidFeaturePath() throws NaviException {
			FeaturePathUtil.filter(
					rootObject,
					new FeaturePathBuilder().manySegment(
							SamplePackage.Literals.GROUP__PERSONS,
							TrueCondition.getInstance()).create());
			fail("API accepted invalid feature path"); //$NON-NLS-1$
	}

	@Test
	public void testN() throws NaviException {
		FeaturePath p = new FeaturePathBuilder().manySegment(
				SamplePackage.Literals.COMPANY__DEPARTMENTS,
				TrueCondition.getInstance()).create();
		List<Object> res = FeaturePathUtil.filter(rootObject, p);
		assertEquals(2, res.size());
		assertEquals(0, rootObject.eAdapters().size());
	}

	@Test
	public void testNKeepingAdapter() throws NaviException {
		Adapter a = new AdapterImpl();
		try {
			rootObject.eAdapters().add(a);
			FeaturePath p = new FeaturePathBuilder().manySegment(
					SamplePackage.Literals.COMPANY__DEPARTMENTS,
					TrueCondition.getInstance()).create();
			List<Object> res = FeaturePathUtil.filter(rootObject, p);
			assertEquals(2, res.size());
			assertTrue(rootObject.eAdapters().contains(a));
		} finally {
			rootObject.eAdapters().remove(a);
		}
	}
}
