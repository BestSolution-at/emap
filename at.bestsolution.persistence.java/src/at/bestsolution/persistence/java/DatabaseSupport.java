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

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import at.bestsolution.persistence.java.query.ListDelegate;


public interface DatabaseSupport {
	public String getDatabaseType();
	public QueryBuilder createQueryBuilder(String tableName);
	public PrimaryKeyGenType getPrimaryKeyType();
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate);
	public boolean isArrayStoreSupported(Class<?> type);
	public boolean isNestedResultSetsSupported();

	public enum PrimaryKeyGenType {
		AUTO,
		SEQUENCE
	}

	public interface QueryBuilder {
		public void addColumn(String columnName, String dynamicParameter);
		public ProcessedSQL buildUpdate(String pkColumn, String primaryValueParameter, String lockColumn);
		public ProcessedSQL buildInsert(String pkColumn, String primaryKeyExpression, String lockColumn);
	}
}
