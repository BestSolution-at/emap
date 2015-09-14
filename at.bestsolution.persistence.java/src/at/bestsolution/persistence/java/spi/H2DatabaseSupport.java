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

import at.bestsolution.persistence.DynamicSelectQuery;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.PersistanceException;
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

public class H2DatabaseSupport implements DatabaseSupport {
	@Override
	public Timestamp getServerTime(Connection connection) {
		PreparedStatement prepareStatement = null;
		ResultSet set = null;
		try {
			prepareStatement = connection.prepareStatement("SELECT CURRENT_TIMESTAMP");
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
	public String getDatabaseType() {
		return "h2";
	}

	@Override
	public QueryBuilder createQueryBuilder(JavaObjectMapper<?> rootMapper, String tableName) {
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
	public boolean isDefaultLowerCase() {
		return false;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		return new H2MappedQueryImpl<O>(this,rootMapper, rootPrefix, listDelegate);
	}

	@Override
	public <T, O> DynamicSelectQuery<T, O> createMappedSelectQuery(
			JavaObjectMapper<?> rootMapper, String rootPrefix,
			DynamicListDelegate<T, O> listDelegate) {
		return new H2SelectQueryImpl<T,O>(this,rootMapper,rootPrefix,listDelegate);
	}

	@Override
	public <O> MappedUpdateQuery<O> createMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
		return new H2MappedUpdateQueryImpl<O>(this,rootMapper, rootPrefix, updateDelegate);
	}

	static class H2MappedUpdateQueryImpl<O> extends MappedUpdateQueryImpl<O> {

		public H2MappedUpdateQueryImpl(DatabaseSupport db,JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate) {
			super(db,rootMapper, rootPrefix, updateDelegate);
		}

		@Override
		public String processSQL(String sql) {
			return sql;
		}
	}

	static class H2MappedQueryImpl<O> extends MappedQueryImpl<O> {

		public H2MappedQueryImpl(DatabaseSupport db,JavaObjectMapper<?> rootMapper,
				String rootPrefix, ListDelegate<O> listDelegate) {
			super(db,rootMapper, rootPrefix, listDelegate);
		}

		@Override
		public String processSQL(String sql) {
			if( getMaxRows() != -1 ) {
				sql = sql + " LIMIT " + getMaxRows();
			}
			return sql;
		}
	}

	static class H2SelectQueryImpl<T,O> extends DynamicSelectQueryImpl<T,O> {

		public H2SelectQueryImpl(DatabaseSupport db,JavaObjectMapper<?> rootMapper,
				String rootPrefix, DynamicListDelegate<T,O> listDelegate) {
			super(db,rootMapper, rootPrefix, listDelegate);
		}

		@Override
		public String processSQL(String sql) {
			if( getMaxRows() != -1 ) {
				sql = sql + " LIMIT " + getMaxRows();
			}
			return sql;
		}
	}

	static class H2QueryBuilder implements QueryBuilder {
		private final String tableName;
		private final DatabaseSupport db;

		public H2QueryBuilder(DatabaseSupport db, String tableName) {
			this.db = db;
			this.tableName = tableName;
		}

		@Override
		public UpdateStatement createUpdateStatement(String pkColumn, String lockColumn) {
			return new PreparedUpdateStatement(db, tableName, pkColumn, lockColumn);
		}

		@Override
		public InsertStatement createInsertStatement(String pkColumn,
				String primaryKeyExpression, String lockColumn) {
			return new PreparedInsertStatement(db, tableName, pkColumn, primaryKeyExpression, lockColumn);
		}

		@Override
		public ExtendsInsertStatement createExtendsInsertStatement(String pkColumn) {
			return new PreparedExtendsInsertStatement(db,pkColumn, pkColumn);
		}
	}
}
