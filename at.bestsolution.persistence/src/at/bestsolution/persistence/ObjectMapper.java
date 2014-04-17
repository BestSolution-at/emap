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
package at.bestsolution.persistence;

public interface ObjectMapper<O> {
	public void update(O object);
	public void insert(O object);
	public void delete(O object);
	public void delete(O... object);
	public void deleteById(Object... id);
	public void deleteAll();

	public String getTableName();
	public String getColumnName(String propertyName);
	public <P> P getPrimaryKeyValue(O object);
}