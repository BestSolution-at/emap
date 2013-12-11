package at.bestsolution.persistence.java.spi;

import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.Util;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import at.bestsolution.persistence.java.Util.SimpleQueryBuilder;
import at.bestsolution.persistence.java.query.ColumnDelegate;
import at.bestsolution.persistence.java.query.DBCriteria;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.TypeDelegate;

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
	public <O> DBCriteria<O> createCriteria(ColumnDelegate columnDelegate, TypeDelegate typeDelegate, ListDelegate<O> listDelegate) {
		return new DBCriteria<O>(columnDelegate, typeDelegate, listDelegate);
	}

	static class H2QueryBuilder implements QueryBuilder {
		private SimpleQueryBuilder b;

		public H2QueryBuilder(String tableName) {
			b = Util.createQueryBuilder(tableName);
		}

		@Override
		public void addColumn(String columnName, String dynamicParameter) {
			b.addColumn(columnName, dynamicParameter);
		}

		@Override
		public ProcessedSQL buildUpdate(String pkColumn,
				String primaryValueParameter) {
			return b.buildInsert(pkColumn, null);
		}

		@Override
		public ProcessedSQL buildInsert(String pkColumn,
				String primaryKeyExpression) {
			return b.buildUpdate(pkColumn, primaryKeyExpression);
		}
	}
}
