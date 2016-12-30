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
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.google.common.collect.Lists;

import at.bestsolution.persistence.DynamicSelectQuery;
import at.bestsolution.persistence.Key;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.PersistanceException;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.KeyLayout;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.internal.PreparedExtendsInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedUpdateStatement;
import at.bestsolution.persistence.java.internal.PreparedStatement.Column;
import at.bestsolution.persistence.java.query.DynamicListDelegate;
import at.bestsolution.persistence.java.query.DynamicSelectQueryImpl;
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
	public String getArrayBaseType(Class<?> javaType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueryBuilder createQueryBuilder(JavaObjectMapper<?> rootMapper, String tableName) {
		return new FirebirdQueryBuilder(this,tableName);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.SEQUENCE;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		return new FirebirdMappedQuery<O>(this,rootMapper, rootPrefix, listDelegate);
	}

	@Override
	public <T, O> DynamicSelectQuery<T, O> createMappedSelectQuery(
			JavaObjectMapper<?> rootMapper, String rootPrefix,
			DynamicListDelegate<T, O> listDelegate) {
		return new FirebirdSelectQuery<T,O>(this,rootMapper,rootPrefix,listDelegate);
	}

	@Override
	public <O> MappedUpdateQuery<O> createMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
		return new FirebirdMappedUpdateQuery<O>(this,rootMapper, rootPrefix, updateDelegate);
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
		return false;
	}

	static class FirebirdMappedUpdateQuery<O> extends MappedUpdateQueryImpl<O> {

		/**
		 * @param rootMapper
		 * @param rootPrefix
		 * @param updateDelegate
		 */
		public FirebirdMappedUpdateQuery(DatabaseSupport db, JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
			super(db, rootMapper, rootPrefix, updateDelegate);
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

		public FirebirdMappedQuery(DatabaseSupport db, JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
			super(db, rootMapper, rootPrefix, listDelegate);
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

	static class FirebirdSelectQuery<T,O> extends DynamicSelectQueryImpl<T,O> {

		public FirebirdSelectQuery(DatabaseSupport db, JavaObjectMapper<?> rootMapper, String rootPrefix, DynamicListDelegate<T,O> listDelegate) {
			super(db, rootMapper, rootPrefix, listDelegate);
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

	static class FirebirdQueryBuilder implements QueryBuilder {
		private String tableName;
		private DatabaseSupport db;

		public FirebirdQueryBuilder(DatabaseSupport db, String tableName) {
			this.tableName = tableName;
			this.db = db;
		}


		@Override
		public <K extends Key<?>> UpdateStatement createUpdateStatement(KeyLayout<K> pkLayout, String lockColumn) {
			return new PreparedUpdateStatement(db, tableName, pkLayout, lockColumn);
		}

		@Override
		public ExtendsInsertStatement createExtendsInsertStatement(String pkColumn) {
			return new PreparedExtendsInsertStatement(db,tableName, pkColumn);
		}

		@Override
		public <K extends Key<?>> InsertStatement createInsertStatement(KeyLayout<K> pkLayout, Map<String, String> sequenceNames, String lockColumn) {
			return new FirebirdPreparedInsertStatement(db, tableName, pkLayout, sequenceNames, lockColumn);
		}
		
	}
	
	private static class FirebirdPreparedInsertStatement extends PreparedInsertStatement {

		public FirebirdPreparedInsertStatement(DatabaseSupport db, String tableName, KeyLayout pkLayout, Map<String, String> pkExpressions, String lockColumn) {
			super(db, tableName, pkLayout, pkExpressions, lockColumn);
		}

		@Override
		protected String createSQL(String tableName, KeyLayout pkLayout, Map<String, String> pkExpressions,
				String lockColumn, List<Column> columnList) {
			String whereIsMyStreamAPI = "";
			Iterator<String> colIt = pkLayout.getColumns().iterator();
			while (colIt.hasNext()) {
				String cur = colIt.next();
				whereIsMyStreamAPI += '"' + correctCase(cur) + '"';
				if (colIt.hasNext()) {
					whereIsMyStreamAPI += ", ";
				}
			}
			return super.createSQL(tableName, pkLayout, pkExpressions, lockColumn, columnList) + " RETURNING " + whereIsMyStreamAPI;
		}

		@Override
		protected PreparedStatement createPreparedStatement(
				Connection connection, String query)
				throws SQLException {
			return connection.prepareStatement(query);
		}
		
		@Override
		protected <K extends Key<?>> K execute(PreparedStatement pstmt) throws SQLException {
			final ResultSet set = pstmt.executeQuery();
			if( set.next() ) {
				return (K) Util.extractKey(pkLayout, set);
			}
			throw new SQLException("Unable to retrieve insert pk");
		}
	}
}
