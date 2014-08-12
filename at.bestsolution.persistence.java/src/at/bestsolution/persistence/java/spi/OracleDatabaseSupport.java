/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tom <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.spi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.internal.PreparedExtendsInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedUpdateStatement;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.MappedQueryImpl;
import at.bestsolution.persistence.java.query.MappedUpdateQueryImpl;
import at.bestsolution.persistence.java.query.UpdateDelegate;

public class OracleDatabaseSupport implements DatabaseSupport {

	@Override
	public String getDatabaseType() {
		return "Oracle";
	}

	@Override
	public QueryBuilder createQueryBuilder(String tableName) {
		return new OracleQueryBuilder(tableName);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.SEQUENCE;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<O> rootMapper,
			String rootPrefix, ListDelegate<O> listDelegate) {
		return new OracleMappedQuery<O>(rootMapper, rootPrefix, listDelegate);
	}

	@Override
	public <O> MappedUpdateQuery<O> createMappedUpdateQuery(
			JavaObjectMapper<O> rootMapper, String rootPrefix,
			UpdateDelegate<O> updateDelegate) {
		return new OracleMappedUpdateQuery<O>(rootMapper, rootPrefix, updateDelegate);
	}

	@Override
	public boolean isArrayStoreSupported(Class<?> type) {
		return false;
	}

	@Override
	public boolean isNestedResultSetsSupported() {
		return false;
	}

	@Override
	public Timestamp getServerTime(Connection connection) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("NOT IMPLEMENTED");
//		return null;
	}

	static class OracleMappedUpdateQuery<O> extends MappedUpdateQueryImpl<O> {

		public OracleMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
			super(rootMapper, rootPrefix, updateDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<O> mapper, String colPrefix, Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" +colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + ") LIKE lower ( ? )" );
				return;
			case NOT_ILIKE:
				b.append("lower(" +colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + ") NOT LIKE lower ( ? )" );
				return;
			default:
				super.appendCriteria(b, mapper, colPrefix, expression);
			}
		}

		@Override
		public String processSQL(String sql) {
			return sql;
		}

	}

	static class OracleMappedQuery<O> extends MappedQueryImpl<O> {

		public OracleMappedQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
			super(rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<O> mapper, String colPrefix,
				Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" +colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + ") LIKE lower ( ? )" );
				return;
			case NOT_ILIKE:
				b.append("lower(" +colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + ") NOT LIKE lower ( ? )" );
				return;
			default:
				super.appendCriteria(b, mapper, colPrefix, expression);
			}
		}

		@Override
		public String processSQL(String sql) {
			if( getMaxRows() != -1) {
				sql = sql.replaceFirst("SELECT", "SELECT FIRST " + getMaxRows());
			}
			return sql;
		}
	}

	static class OracleQueryBuilder implements QueryBuilder {
		private String tableName;

		public OracleQueryBuilder(String tableName) {
			this.tableName = tableName;
		}


		@Override
		public UpdateStatement createUpdateStatement(String pkColumn, String lockColumn) {
			return new PreparedUpdateStatement(tableName, pkColumn, lockColumn);
		}

		@Override
		public ExtendsInsertStatement createExtendsInsertStatement(String pkColumn) {
			return new PreparedExtendsInsertStatement(tableName, pkColumn);
		}

		@Override
		public InsertStatement createInsertStatement(String pkColumn, String primaryKeyExpression, String lockColumn) {
			return new PreparedInsertStatement(tableName, pkColumn, primaryKeyExpression, lockColumn) {
				@Override
				protected String createSQL(String tableName, String pkColumn,
						String primaryKeyExpression, String lockColumn,
						List<Column> columnList) {
					return super.createSQL(tableName, pkColumn, primaryKeyExpression, lockColumn,
							columnList);
				}

//				@Override
//				protected long execute(PreparedStatement pstmt)
//						throws SQLException {
//					ResultSet set = pstmt.executeQuery();
//					if( set.next() ) {
//						return set.getLong(1);
//					}
//					throw new SQLException("Unable to retrieve insert ID");
//				}
			};
		}
	}
}
