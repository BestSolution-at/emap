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
package at.bestsolution.persistence.emap.junit;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;

public class AbstractTestCase<M extends ObjectMapper<?>> {
	private SessionFactory factory;
	private Session session;
	private Class<M> mapper;

	public AbstractTestCase(Class<M> mapper) {
		this.mapper = mapper;
	}

	protected Session getSession() {
		if( session == null ) {
			session = getSessionFactory().createSession();
		}
		return session;
	}

	public SessionFactory getSessionFactory() {
		if( factory == null ) {
			BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
			ServiceReference<SessionFactory> reference = bundleContext.getServiceReference(SessionFactory.class);
			factory = bundleContext.getService(reference);
		}

		return factory;

	}

	public M getMapper() {
		return getSession().createMapper(mapper);
	}
}