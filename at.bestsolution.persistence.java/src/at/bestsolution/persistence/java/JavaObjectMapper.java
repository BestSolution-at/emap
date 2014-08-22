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

import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.java.query.JDBCType;

public interface JavaObjectMapper<O> extends ObjectMapper<O> {
	public JDBCType getJDBCType(String property);
	public String getLockColumn();
	public <M extends ObjectMapper<?>> M createMapperForReference(String property);
	public EStructuralFeature getReferenceId(String property);
	public Set<EReference> getReferenceFeatures();
	public boolean containsForcedFkFeatures();
	public boolean isForcedFkFeature(EReference e);
	public EClass getEClass();
}
