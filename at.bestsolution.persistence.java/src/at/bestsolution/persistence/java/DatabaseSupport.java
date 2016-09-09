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

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Map;

import at.bestsolution.persistence.DynamicSelectQuery;
import at.bestsolution.persistence.Key;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.java.query.DynamicListDelegate;
import at.bestsolution.persistence.java.query.JDBCType;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.UpdateDelegate;


public interface DatabaseSupport {
	public String getDatabaseType();
	public QueryBuilder createQueryBuilder(JavaObjectMapper<?> rootMapper, String tableName);
	public PrimaryKeyGenType getPrimaryKeyType();

	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate);
	public <T,O> DynamicSelectQuery<T,O> createMappedSelectQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, DynamicListDelegate<T,O> listDelegate);

	public <O> MappedUpdateQuery<O> createMappedUpdateQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, UpdateDelegate<O> updateDelegate);
	public boolean isArrayStoreSupported(Class<?> type);
	public boolean isNestedResultSetsSupported();
	public Timestamp getServerTime(Connection connection);
	public boolean isDefaultLowerCase();

	public enum PrimaryKeyGenType {
		AUTO,
		SEQUENCE
	}

	public interface QueryBuilder {
		public UpdateStatement createUpdateStatement(String pkColumn, String lockColumn);
		public InsertStatement createInsertStatement(KeyLayout<?> pkLayout, Map<String, String> sequenceNames, String lockColumn);
		public ExtendsInsertStatement createExtendsInsertStatement(String pkColumn);
	}

	public interface Statement {
		public void addInt(String column, int value);
		public void addInt(String column, Integer value);

		public void addDouble(String column, double value);
		public void addDouble(String column, Double value);
		public void addBigDecimal(String column, BigDecimal value);

		public void addString(String column, String value);

		public void addTimestamp(String column, Date value);

		public void addLong(String column, long value);
		public void addLong(String column, Long value);

		public void addBoolean(String column, boolean value);
		public void addBoolean(String column, Boolean value);

		public void addNull(String column, JDBCType type);
		public void addEnum(String column, Enum<?> value);
		public void addBlob(String column, Blob value);
	}

	public interface InsertStatement extends Statement {
		public <O> Key<O> execute(Connection connection) throws SQLException;
	}

	public interface ExtendsInsertStatement extends Statement {
		@Deprecated public boolean execute(Connection connection, long primaryKeyValue) throws SQLException;
		public boolean execute(Connection connection, Key<?> primaryKeyValue) throws SQLException;
	}
	
	public interface UpdateStatement extends Statement {
		@Deprecated public boolean execute(Connection connection, long primaryKeyValue, long version) throws SQLException;
		public boolean execute(Connection connection, Key<?> primaryKeyValue, long version) throws SQLException;
	}
	
}
