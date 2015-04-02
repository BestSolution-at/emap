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
package at.bestsolution.persistence.java;

import java.util.List;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.ObjectMapper;

public interface ObjectMapperFactory<M extends ObjectMapper<?>, O> {
	public Class<O> getEntityType();
	public Class<M> getMapperType();
	public M createMapper(JavaSession session);
	public NamedQuery<O> createNamedQuery(JavaSession session, String name);
	public MappedQuery<O> mappedQuery(JavaSession session, String name);

	public interface NamedQuery<O> {
		public List<O> queryForList(Object... parameters);
		public O queryForOne(Object... parameters);
		public String[] getParameterNames();
	}
}