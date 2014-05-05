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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface SessionCache {
	public <O extends EObject> O getObject(EClass eClass, Object id);
	public void putObject(EObject object, Object id, long version);
	public long getVersion(EObject object, Object id);
	public boolean updateVersion(EObject object, Object id, long version);
	public void evitObject(EObject object);
	public void evictObject(EClass eClass, Object id);
	public void evictObjects(EClass eClass);
	public boolean isCached(EObject object);
	public void clear();
	public void release();
	public <O extends EObject> List<O> getQueryResult(String query, Object... parameters);
	public void putQueryResult(List<EObject> list, String query, Object... parameters);
}
