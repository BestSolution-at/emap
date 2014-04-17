/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator

import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import org.eclipse.emf.ecore.EClass
//import com.google.inject.Inject
import at.bestsolution.persistence.emap.eMap.ReturnType

class JUnitGenerator {
//	@Inject extension
//  	var UtilCollection util;

	def assertClassGen(EMappingEntityDef entityDef, EClass eClass) '''
	package «entityDef.package.name».test;

	import org.eclipse.emf.ecore.EObject;
	import org.junit.Assert;
	import org.osgi.framework.BundleContext;
	import org.osgi.framework.FrameworkUtil;
	import org.osgi.framework.ServiceReference;

	import at.bestsolution.emf.navi.FeaturePath;
	import at.bestsolution.emf.navi.FeaturePathUtil;
	import at.bestsolution.persistence.Session;
	import at.bestsolution.persistence.SessionFactory;


	import static org.junit.Assert.*;

	import «entityDef.package.name».«eClass.name»;
	import «entityDef.package.name».«eClass.name»Mapper;

	public class Assert«eClass.name» {
		private static SessionFactory getSessionFactory() {
			final BundleContext ctx = FrameworkUtil.getBundle(Assert«eClass.name».class).getBundleContext();
			ServiceReference<SessionFactory> serviceReference = ctx.getServiceReference(SessionFactory.class);
			return ctx.getService(serviceReference);
		}

		private static «eClass.name»Mapper getMapper(Session session) {
			return session.createMapper(«eClass.name»Mapper.class);
		}

		«FOR query : entityDef.entity.namedQueries.filter[q|q.returnType==ReturnType::SINGLE]»
		public static void assertExists_«query.name»(«query.parameters.join(",",[p|p.type + " " + p.name])») {
			final Session session = getSessionFactory().createSession();
			try {
				final «eClass.name» o = getMapper(session).«query.name»(«query.parameters.join(",",[p|p.name])»);
				assertNotNull(o);
			} finally {
				session.close();
			}
		}

		public static void assertEquals_«query.name»(Object expected, FeaturePath path, «query.parameters.join(",",[p|p.type + " " + p.name])») {
			final Session session = getSessionFactory().createSession();
			try {
				final «eClass.name» o = getMapper(session).«query.name»(«query.parameters.join(",",[p|p.name])»);
				Assert.assertNotNull(o);
				Assert.assertEquals(expected, FeaturePathUtil.get((EObject)o, path));
			} finally {
				session.close();
			}
		}

		public static void assertNull_«query.name»(FeaturePath path, «query.parameters.join(",",[p|p.type + " " + p.name])») {
			final Session session = getSessionFactory().createSession();
			try {
				final «eClass.name» o = getMapper(session).«query.name»(«query.parameters.join(",",[p|p.name])»);
				Assert.assertNotNull(o);
				Assert.assertNull(FeaturePathUtil.get((EObject)o, path));
			} finally {
				session.close();
			}
		}

		public static void assertNotNull_«query.name»(FeaturePath path, «query.parameters.join(",",[p|p.type + " " + p.name])») {
			final Session session = getSessionFactory().createSession();
			try {
				final «eClass.name» o = getMapper(session).«query.name»(«query.parameters.join(",",[p|p.name])»);
				Assert.assertNotNull(o);
				Assert.assertNotNull(FeaturePathUtil.get((EObject)o, path));
			} finally {
				session.close();
			}
		}
		«ENDFOR»
	}
	'''
}