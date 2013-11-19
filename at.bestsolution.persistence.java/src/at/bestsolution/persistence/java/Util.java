package at.bestsolution.persistence.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.text.StrLookup;
import org.apache.commons.lang.text.StrSubstitutor;

public class Util {
	public static class ProcessedSQL {
		public final String sql;
		public final List<String> dynamicParameterNames;

		public ProcessedSQL(String sql, List<String> dynamicParameterNames) {
			this.sql = sql;
			this.dynamicParameterNames = dynamicParameterNames;
		}
	}

	public static class SimpleQueryBuilder {
		private final String tableName;
		private final List<Column> columns = new ArrayList<Util.Column>();

		public SimpleQueryBuilder(String tableName) {
			this.tableName = tableName;
		}

		public final void addColumn(String columnName, String dynamicParameter) {
			columns.add(new Column(columnName, dynamicParameter));
		}

		public final ProcessedSQL buildUpdate(String pkColumn, String pkColumnParameter) {
			List<String> dynamicValues = new ArrayList<String>();
			StringBuilder b = new StringBuilder();
			for( Column c : columns ) {
				if( b.length() != 0 ) {
					b.append("\n,");
				}
				b.append( c.columnName + " = ?");
				dynamicValues.add(c.dynamicParameter);
			}
			dynamicValues.add(pkColumnParameter);
			return new ProcessedSQL("UPDATE " + tableName + " SET " + b + " WHERE " + pkColumn + " = ?",dynamicValues);
		}

		public final ProcessedSQL buildInsert(String pkColumn, String valueExpression) {
			StringBuilder col = new StringBuilder();
			StringBuilder val = new StringBuilder();
			List<String> dynamicValues = new ArrayList<String>();

			if( pkColumn != null ) {
				col.append(pkColumn);
				val.append(valueExpression);
			}

			for( Column c : columns ) {
				if( col.length() != 0 ) {
					col.append("\n,");
					val.append("\n,");
				}
				col.append(c.columnName);
				val.append("?");
				dynamicValues.add(c.dynamicParameter);
			}

			return new ProcessedSQL("INSERT INTO " + tableName + "("+col+") VALUES ("+val+")",dynamicValues);
		}
	}

	public static class Column {
		final String columnName;
		final String dynamicParameter;

		public Column(final String columnName, final String dynamicParameter) {
			this.columnName = columnName;
			this.dynamicParameter = dynamicParameter;
		}
	}

	public static final String loadFile(Class<?> clazz, String name) {
		InputStream inputStream = clazz.getResourceAsStream(name);
		if( inputStream == null ) {
			return null;
		}
		byte[] buf = new byte[1024];
		int l;
		StringBuilder b = new StringBuilder();
		try {
			while( (l = inputStream.read(buf)) != -1 ) {
				b.append(new String(buf,0,l));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b.toString();
	}

	public static final ProcessedSQL processSQL(String sql) {
		final List<String> dynamicParameterNames = new ArrayList<String>();
		String s = new StrSubstitutor(new StrLookup() {

			@Override
			public String lookup(String key) {
				dynamicParameterNames.add(key);
				return "?";
			}
		},"#{","}",'#').replace(sql);
		return new ProcessedSQL(s, dynamicParameterNames);
	}

	public static final SimpleQueryBuilder createQueryBuilder(String tableName) {
		return new SimpleQueryBuilder(tableName);
	}
}