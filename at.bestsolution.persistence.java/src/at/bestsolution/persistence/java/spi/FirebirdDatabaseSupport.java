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

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.PersistanceException;
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

public class FirebirdDatabaseSupport implements DatabaseSupport {
	private Logger LOGGER = Logger.getLogger(FirebirdDatabaseSupport.class);

	@Override
	public String getDatabaseType() {
		return "Firebird";
	}

	@Override
	public QueryBuilder createQueryBuilder(JavaObjectMapper<?> rootMapper, String tableName) {
		return new FirebirdQueryBuilder(tableName);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.SEQUENCE;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		return new FirebirdMappedQuery<O>(rootMapper, rootPrefix, listDelegate);
	}

	@Override
	public <O> MappedUpdateQuery<O> createMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
		return new FirebirdMappedUpdateQuery<O>(rootMapper, rootPrefix, updateDelegate);
	}

	@Override
	public Timestamp getServerTime(Connection connection) {
		PreparedStatement prepareStatement = null;
		ResultSet set = null;
		try {
			prepareStatement = connection.prepareStatement("select current_timestamp from rdb$database");
			set = prepareStatement.executeQuery();
			if( set.next() ) {
				return set.getTimestamp(1);
			}
		} catch (SQLException e) {
			throw new PersistanceException(e);
		} finally {
			if( set != null ) {
				try {
					set.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if( prepareStatement != null ) {
				try {
					prepareStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public boolean isArrayStoreSupported(Class<?> type) {
		return false;
	}

	public boolean isNestedResultSetsSupported() {
		// See http://stackoverflow.com/questions/935511/how-can-i-avoid-resultset-is-closed-exception-in-java
		return false;
	}

	static class FirebirdMappedUpdateQuery<O> extends MappedUpdateQueryImpl<O> {

		/**
		 * @param rootMapper
		 * @param rootPrefix
		 * @param updateDelegate
		 */
		public FirebirdMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
			super(rootMapper, rootPrefix, updateDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<?> mapper, String colPrefix, Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" +colPrefix + quoteColumnName(mapper.getColumnName(((PropertyExpression<O>)expression).property)) + ") LIKE lower ( ? )" );
				return;
			case NOT_ILIKE:
				b.append("lower(" +colPrefix + quoteColumnName(mapper.getColumnName(((PropertyExpression<O>)expression).property)) + ") NOT LIKE lower ( ? )" );
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

	static class FirebirdMappedQuery<O> extends MappedQueryImpl<O> {

		public FirebirdMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
			super(rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<?> mapper, String colPrefix,
				Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" +colPrefix + quoteColumnName(mapper.getColumnName(((PropertyExpression<O>)expression).property)) + ") LIKE lower ( ? )" );
				return;
			case NOT_ILIKE:
				b.append("lower(" +colPrefix + quoteColumnName(mapper.getColumnName(((PropertyExpression<O>)expression).property)) + ") NOT LIKE lower ( ? )" );
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
			
			if( isJoinQuery() ) {
				sql = sql.replaceFirst("SELECT","SELECT DISTINCT ");
			}
			
			return sql;
		}
	}


	static class FirebirdQueryBuilder implements QueryBuilder {
		private String tableName;

		public FirebirdQueryBuilder(String tableName) {
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
							columnList) + " RETURNING " + '"' + pkColumn + '"';
				}

				@Override
				protected PreparedStatement createPreparedStatement(
						Connection connection, String query)
						throws SQLException {
					return connection.prepareStatement(query);
				}

				@Override
				protected long execute(PreparedStatement pstmt)
						throws SQLException {
					ResultSet set = pstmt.executeQuery();
					if( set.next() ) {
						return set.getLong(1);
					}
					throw new SQLException("Unable to retrieve insert ID");
				}
			};
		}
	}
}
