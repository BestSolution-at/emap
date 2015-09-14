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

import at.bestsolution.persistence.DynamicSelectQuery;
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
import at.bestsolution.persistence.java.query.DynamicListDelegate;
import at.bestsolution.persistence.java.query.DynamicSelectQueryImpl;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.MappedQueryImpl;
import at.bestsolution.persistence.java.query.MappedUpdateQueryImpl;
import at.bestsolution.persistence.java.query.UpdateDelegate;

public class PostgresDatabaseSupport implements DatabaseSupport {

	@Override
	public String getDatabaseType() {
		return "Postgres";
	}

	@Override
	public QueryBuilder createQueryBuilder(JavaObjectMapper<?> rootMapper, String tableName) {
		return new PostgresQueryBuilder(this, tableName);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.AUTO;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		return new PostgresMappedQuery<O>(this,rootMapper, rootPrefix, listDelegate);
	}

	@Override
	public <T, O> DynamicSelectQuery<T, O> createMappedSelectQuery(
			JavaObjectMapper<?> rootMapper, String rootPrefix,
			DynamicListDelegate<T, O> listDelegate) {
		return new PostgresSelectQuery<T,O>(this,rootMapper,rootPrefix,listDelegate);
	}

	@Override
	public <O> MappedUpdateQuery<O> createMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
		return new PostgresMappedUpdateQuery<O>(this,rootMapper, rootPrefix, updateDelegate);
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

	@Override
	public boolean isDefaultLowerCase() {
		return true;
	}

	static class PostgresMappedUpdateQuery<O> extends MappedUpdateQueryImpl<O> {

		/**
		 * @param rootMapper
		 * @param rootPrefix
		 * @param updateDelegate
		 */
		public PostgresMappedUpdateQuery(DatabaseSupport db,JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
			super(db,rootMapper, rootPrefix, updateDelegate);
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

	static class PostgresMappedQuery<O> extends MappedQueryImpl<O> {

		public PostgresMappedQuery(DatabaseSupport db,JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
			super(db,rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<?> mapper, String colPrefix,
				Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" + getColumnExpression(mapper, colPrefix, expression) + ") LIKE lower ( ? )" );
				return;
			case NOT_ILIKE:
				b.append("lower(" + getColumnExpression(mapper, colPrefix, expression) + ") NOT LIKE lower ( ? )" );
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

	static class PostgresSelectQuery<T,O> extends DynamicSelectQueryImpl<T,O> {

		public PostgresSelectQuery(DatabaseSupport db,JavaObjectMapper<?> rootMapper, String rootPrefix, DynamicListDelegate<T,O> listDelegate) {
			super(db,rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<?> mapper, String colPrefix,
				Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" + getColumnExpression(mapper, colPrefix, expression) + ") LIKE lower ( ? )" );
				return;
			case NOT_ILIKE:
				b.append("lower(" + getColumnExpression(mapper, colPrefix, expression) + ") NOT LIKE lower ( ? )" );
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

	static class PostgresQueryBuilder implements QueryBuilder {
		private String tableName;
		private DatabaseSupport db;

		public PostgresQueryBuilder(DatabaseSupport db, String tableName) {
			this.db = db;
			this.tableName = tableName;
		}


		@Override
		public UpdateStatement createUpdateStatement(String pkColumn, String lockColumn) {
			return new PreparedUpdateStatement(db,tableName, pkColumn, lockColumn);
		}

		@Override
		public ExtendsInsertStatement createExtendsInsertStatement(String pkColumn) {
			return new PreparedExtendsInsertStatement(db,tableName, pkColumn);
		}

		@Override
		public InsertStatement createInsertStatement(String pkColumn, String primaryKeyExpression, String lockColumn) {
			return new PreparedInsertStatement(db,tableName, pkColumn, primaryKeyExpression, lockColumn) {
				@Override
				protected String createSQL(String tableName, String pkColumn,
						String primaryKeyExpression, String lockColumn,
						List<Column> columnList) {
					return super.createSQL(tableName, pkColumn, primaryKeyExpression, lockColumn,
							columnList) + " RETURNING " + '"' + correctCase(pkColumn) + '"';
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
