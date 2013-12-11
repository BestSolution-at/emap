package at.bestsolution.persistence.java.spi;

import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import at.bestsolution.persistence.java.Util.SimpleQueryBuilder;
import at.bestsolution.persistence.java.query.DBCriteria;
import at.bestsolution.persistence.java.query.ColumnDelegate;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.TypeDelegate;

public class FirebirdDatabaseSupport implements DatabaseSupport {

	@Override
	public String getDatabaseType() {
		return "Firebird";
	}

	@Override
	public QueryBuilder createQueryBuilder(String tableName) {
		return new FirebirdQueryBuilder(tableName);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.SEQUENCE;
	}

	@Override
	public <O> DBCriteria<O> createCriteria(ColumnDelegate columnDelegate, TypeDelegate typeDelegate, ListDelegate<O> listDelegate) {
		return new DBCriteria<O>(columnDelegate, typeDelegate, listDelegate);
	}

	static class FirebirdQueryBuilder implements QueryBuilder {
		private SimpleQueryBuilder b;

		public FirebirdQueryBuilder(String tableName) {
			b = Util.createQueryBuilder(tableName);
		}


		@Override
		public void addColumn(String columnName, String dynamicParameter) {
			b.addColumn(columnName, dynamicParameter);
		}

		@Override
		public ProcessedSQL buildUpdate(String pkColumn, String primaryKeyType) {
			return b.buildUpdate(pkColumn, primaryKeyType);
		}

		@Override
		public ProcessedSQL buildInsert(String pkColumn, String primaryKeyExpression) {
			ProcessedSQL buildInsert = b.buildInsert(pkColumn, primaryKeyExpression);
			return new ProcessedSQL(buildInsert.sql + " RETURNING " + pkColumn, buildInsert.dynamicParameterNames);
		}
	}
}
