package at.bestsolution.persistence.java;

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.text.StrLookup;
import org.apache.commons.lang.text.StrSubstitutor;

import at.bestsolution.persistence.java.JavaSession.ChangeDescription;
import at.bestsolution.persistence.java.query.TypedValue;

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

		public final ProcessedSQL buildUpdate(String pkColumn,
				String pkColumnParameter, String lockColumn) {
			List<String> dynamicValues = new ArrayList<String>();
			StringBuilder b = new StringBuilder();
			if( lockColumn != null ) {
				b.append( '"' + lockColumn + '"' + " = " + '"' + lockColumn + '"' + " + 1");
			}

			for (Column c : columns) {
				if (b.length() != 0) {
					b.append("\n,");
				}
				b.append('"' + c.columnName + '"' + " = ?");
				dynamicValues.add(c.dynamicParameter);
			}
			dynamicValues.add(pkColumnParameter);
			return new ProcessedSQL("UPDATE " + '"' + tableName + '"' + " SET " + b
					+ " WHERE " + '"' + pkColumn + '"' + " = ?", dynamicValues);
		}

		public final ProcessedSQL buildInsert(String pkColumn,
				String valueExpression, String lockColumn) {
			StringBuilder col = new StringBuilder();
			StringBuilder val = new StringBuilder();
			List<String> dynamicValues = new ArrayList<String>();

			if (pkColumn != null) {
				col.append('"'+pkColumn+'"');
				val.append(valueExpression);
			}

			if( lockColumn != null ) {
				if (col.length() != 0) {
					col.append("\n,");
					val.append("\n,");
				}
				col.append(lockColumn);
				val.append("0");
			}

			for (Column c : columns) {
				if (col.length() != 0) {
					col.append("\n,");
					val.append("\n,");
				}
				col.append('"'+c.columnName+'"');
				val.append("?");
				dynamicValues.add(c.dynamicParameter);
			}

			return new ProcessedSQL("INSERT INTO "+'"' + tableName + '"' +"(" + col
					+ ") VALUES (" + val + ")", dynamicValues);
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
		if (inputStream == null) {
			return null;
		}
		byte[] buf = new byte[1024];
		int l;
		StringBuilder b = new StringBuilder();
		try {
			while ((l = inputStream.read(buf)) != -1) {
				b.append(new String(buf, 0, l));
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
		}, "#{", "}", '#').replace(sql);
		return new ProcessedSQL(s, dynamicParameterNames);
	}

	public static final SimpleQueryBuilder createQueryBuilder(String tableName) {
		return new SimpleQueryBuilder(tableName);
	}

	public static void setValue(PreparedStatement pstmt, int parameterIndex, TypedValue value) throws SQLException {
		if (value.value == null) {
			int sqlType;
			switch (value.type) {
			case INT:
				sqlType = Types.INTEGER;
				break;
			case DOUBLE:
				sqlType = Types.DECIMAL;
				break;
			case FLOAT:
				sqlType = Types.FLOAT;
				break;
			case BOOLEAN:
				sqlType = Types.BOOLEAN;
				break;
			case LONG:
				sqlType = Types.BIGINT;
				break;
			case STRING:
				sqlType = Types.VARCHAR;
				break;
			default:
				sqlType = Types.OTHER;
				break;
			}
			pstmt.setNull(parameterIndex, sqlType);
		} else {
			switch (value.type) {
			case INT:
				pstmt.setInt(parameterIndex, ((Number)value.value).intValue());
				break;
			case DOUBLE:
				pstmt.setDouble(parameterIndex, ((Number)value.value).doubleValue());
				break;
			case FLOAT:
				pstmt.setDouble(parameterIndex, ((Number)value.value).doubleValue());
				break;
			case BOOLEAN:
				pstmt.setBoolean(parameterIndex, Boolean.TRUE.equals(value.value) );
				break;
			case LONG:
				pstmt.setLong(parameterIndex, ((Number)value.value).longValue());
				break;
			case STRING:
				pstmt.setString(parameterIndex, (String)value.value);
				break;
			case UNKNOWN:
				pstmt.setObject(parameterIndex, value.value);
			default:
				throw new IllegalStateException("Unknown type");
			}
		}
	}

	public static boolean isModified(JavaSession session, Object object, String attributeName) {
		for( ChangeDescription d : session.getChangeDescription(object) ) {
			if( d.getFeature().getName().equals(attributeName) ) {
				return true;
			}
		}

		return false;
	}
}