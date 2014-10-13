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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.DynamicSelectQuery;
import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.MappedUpdateQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JDBCConnectionProvider;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.internal.PreparedExtendsInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedStatement.Column;
import at.bestsolution.persistence.java.internal.PreparedUpdateStatement;
import at.bestsolution.persistence.java.query.DynamicListDelegate;
import at.bestsolution.persistence.java.query.DynamicSelectQueryImpl;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.MappedQueryImpl;
import at.bestsolution.persistence.java.query.MappedUpdateQueryImpl;
import at.bestsolution.persistence.java.query.UpdateDelegate;

public class OracleDatabaseSupport implements DatabaseSupport {
	static final Logger LOGGER = Logger.getLogger(OracleDatabaseSupport.class);
	
	private JDBCConnectionProvider connectionProvider;
	
	public void registerJDBCConnectionProvider(JDBCConnectionProvider connectionProvider) {
		this.connectionProvider = connectionProvider;
	}
	
	@Override
	public String getDatabaseType() {
		return "Oracle";
	}

	@Override
	public QueryBuilder createQueryBuilder(JavaObjectMapper<?> rootMapper, String tableName) {
		return new OracleQueryBuilder(tableName, rootMapper, connectionProvider);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.SEQUENCE;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<?> rootMapper,
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
	public <T, O> DynamicSelectQuery<T, O> createMappedSelectQuery(
			JavaObjectMapper<?> rootMapper, String rootPrefix,
			DynamicListDelegate<T, O> listDelegate) {
		return new OracleSelectQuery<T,O>(rootMapper, rootPrefix, listDelegate);
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

	static class OracleMappedQuery<O> extends MappedQueryImpl<O> {

		public OracleMappedQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
			super(rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<?> mapper, String colPrefix,
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
				//FIXME this needs to be cleverer
				if( sql.contains("WHERE") ) {
					sql = sql + " AND ";
				} else {
					sql = sql + " WHERE ";
				}
				sql = sql + "ROWNUM <= " + getMaxRows();
			}
			return sql;
		}
	}
	
	static class OracleSelectQuery<T,O> extends DynamicSelectQueryImpl<T,O> {

		public OracleSelectQuery(JavaObjectMapper<?> rootMapper, String rootPrefix, DynamicListDelegate<T,O> listDelegate) {
			super(rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<?> mapper, String colPrefix,
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
				//FIXME this needs to be cleverer
				if( sql.contains("WHERE") ) {
					sql = sql + " AND ";
				} else {
					sql = sql + " WHERE ";
				}
				sql = sql + "ROWNUM <= " + getMaxRows();
			}
			return sql;
		}
	}

	static class OracleQueryBuilder implements QueryBuilder {
		private final String tableName;
		private final JDBCConnectionProvider connectionProvider;
		private final JavaObjectMapper<?> rootMapper;

		public OracleQueryBuilder(String tableName, JavaObjectMapper<?> rootMapper, JDBCConnectionProvider connectionProvider) {
			this.tableName = tableName;
			this.connectionProvider = connectionProvider;
			this.rootMapper = rootMapper;
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
			return new OracleInsertStatement(tableName, pkColumn, primaryKeyExpression, lockColumn, rootMapper, connectionProvider);
		}
	}
	
	static class OracleInsertStatement extends PreparedInsertStatement {
		private final JDBCConnectionProvider connectionProvider;
		private final JavaObjectMapper<?> rootMapper;
		public OracleInsertStatement(String tableName, String pkColumn,
				String primaryKeyExpression, String lockColumn, JavaObjectMapper<?> rootMapper, JDBCConnectionProvider connectionProvider) {
			super(tableName, pkColumn, primaryKeyExpression, lockColumn);
			this.rootMapper = rootMapper;
			this.connectionProvider = connectionProvider;
		}
		
		@Override
		public void addBlob(String column, Blob value) {
			columnList.add(new OracleBlobColumn(rootMapper, columnList.size(), column, value, connectionProvider));
		}
		
		@Override
		protected long execute(PreparedStatement pstmt) throws SQLException {
			try {
				return super.execute(pstmt);	
			} finally {
				boolean isDebug = LOGGER.isDebugEnabled();
				for( Column c : columnList ) {
					if( c instanceof OracleBlobColumn ) {
						if( isDebug ) {
							LOGGER.debug("Freeing oracle blob for column '"+c+"'");
						}
						((OracleBlobColumn) c).release(pstmt.getConnection());
					}
				}
			}
		}
	}
	
	static class OracleBlobColumn extends Column {
		private final Blob blob;
		private final JDBCConnectionProvider connectionProvider;
		private Blob tempBlob;
		private final JavaObjectMapper<?> rootMapper;

		public OracleBlobColumn(JavaObjectMapper<?> rootMapper, int index, String column, Blob blob, JDBCConnectionProvider connectionProvider) {
			super(index, column);
			this.rootMapper = rootMapper;
			this.blob = blob;
			this.connectionProvider = connectionProvider;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			if (LOGGER.isDebugEnabled()) LOGGER.debug("Parameter " + (index+1) + " => Blob(" + blob.length() + ")");
			tempBlob = connectionProvider.createTempBlob(rootMapper.getSession().getConfigurationId(), pstmt.getConnection());
			OutputStream oracleStream = tempBlob.setBinaryStream(0);
			InputStream inputStream = blob.getBinaryStream();
			
			try {
				byte[] buf = new byte[1024];
				int l = 0;
				while( (l = inputStream.read(buf)) != -1 ) {
					oracleStream.write(buf, 0, l);
				}
				inputStream.close();
				pstmt.setBlob(index+1, tempBlob);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void release(Connection connection) throws SQLException {
			if( tempBlob != null ) {
				connectionProvider.releaseTempBlob(rootMapper.getSession().getConfigurationId(),connection, blob);
			}
		}
	}
}