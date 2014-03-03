package at.bestsolution.persistence.java;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.java.Util.ProcessedSQL;
import at.bestsolution.persistence.java.query.ListDelegate;


public interface DatabaseSupport {
	public String getDatabaseType();
	public QueryBuilder createQueryBuilder(String tableName);
	public PrimaryKeyGenType getPrimaryKeyType();
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate);
	public boolean isArrayStoreSupported(Class<?> type);

	public enum PrimaryKeyGenType {
		AUTO,
		SEQUENCE
	}

	public interface QueryBuilder {
		public void addColumn(String columnName, String dynamicParameter);
		public ProcessedSQL buildUpdate(String pkColumn, String primaryValueParameter);
		public ProcessedSQL buildInsert(String pkColumn, String primaryKeyExpression);
	}
}
