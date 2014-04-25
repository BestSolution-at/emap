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
package at.bestsolution.persistence.java.spi;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import at.bestsolution.persistence.java.Util.SimpleQueryBuilder;
import at.bestsolution.persistence.java.internal.PreparedExtendsInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedUpdateStatement;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.MappedQueryImpl;

public class H2DatabaseSupport implements DatabaseSupport {

	@Override
	public String getDatabaseType() {
		return "h2";
	}

	@Override
	public QueryBuilder createQueryBuilder(String tableName) {
		return null;
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.AUTO;
	}

	@Override
	public boolean isArrayStoreSupported(Class<?> type) {
		return false;
	}

	public boolean isNestedResultSetsSupported() {
		return false;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		return new MappedQueryImpl<O>(rootMapper, rootPrefix, listDelegate);
	}

	static class H2QueryBuilder implements QueryBuilder {
		private final String tableName;

		public H2QueryBuilder(String tableName) {
			this.tableName = tableName;
		}

		@Override
		public UpdateStatement createUpdateStatement(String pkColumn, String lockColumn) {
			return new PreparedUpdateStatement(tableName, pkColumn, lockColumn);
		}

		@Override
		public InsertStatement createInsertStatement(String pkColumn,
				String primaryKeyExpression, String lockColumn) {
			return new PreparedInsertStatement(tableName, pkColumn, primaryKeyExpression, lockColumn);
		}
		
		@Override
		public ExtendsInsertStatement createExtendsInsertStatement(String pkColumn) {
			return new PreparedExtendsInsertStatement(pkColumn, pkColumn);
		}
	}
}
