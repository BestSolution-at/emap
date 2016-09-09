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
	public Class<O> getEntityType();
	public void update(O object);
	public void insert(O object);
	public void delete(O object);
	public void delete(O... object);
	
	public void deleteAll();
	public MappedUpdateQuery<O> deleteAllMappedQuery();
	public Session getSession();

	public String getTableName();
	public String getColumnName(String propertyName);
	

	@Deprecated
	public long selectVersion(Object id);
	
	public <K extends Key<O>> long selectVersion(K id);
	
	
	@Deprecated
	public void deleteById(Object... id);
	
	public void deleteById(Key<O>... id);
	
	
	@Deprecated
	public <P> P getPrimaryKeyValue(O object);
	
	public <K extends Key<O>> K getPrimaryKey(O object);
	
}