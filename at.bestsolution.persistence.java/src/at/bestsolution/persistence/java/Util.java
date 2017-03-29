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

import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.text.StrLookup;
import org.apache.commons.lang.text.StrSubstitutor;

import at.bestsolution.persistence.Function;
import at.bestsolution.persistence.java.JavaSession.ChangeDescription;
import at.bestsolution.persistence.java.query.JDBCType;
import at.bestsolution.persistence.java.query.TypedValue;

public class Util {
	public static class ProcessedSQL {
		public final String sql;
		public final List<String> dynamicParameterNames;
		public final Map<String, List<TypedValue>> listValueMaps;

		public ProcessedSQL(String sql, List<String> dynamicParameterNames, Map<String, List<TypedValue>> listValueMaps) {
			this.sql = sql;
			this.dynamicParameterNames = dynamicParameterNames;
			this.listValueMaps = listValueMaps == null ? new HashMap<String, List<TypedValue>>() : listValueMaps;
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
				b.append( '"' + lockColumn.toUpperCase() + '"' + " = " + '"' + lockColumn.toUpperCase() + '"' + " + 1");
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
					+ " WHERE " + '"' + pkColumn + '"' + " = ?", dynamicValues,null);
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
				col.append('"'+lockColumn.toUpperCase()+'"');
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
					+ ") VALUES (" + val + ")", dynamicValues,null);
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
		try {
			if (inputStream == null) {
				return null;
			}
			byte[] buf = new byte[1024];
			int l;
			StringBuilder b = new StringBuilder();
			while ((l = inputStream.read(buf)) != -1) {
				b.append(new String(buf, 0, l));
			}
			return b.toString();
		} 
		catch (IOException e) {
			e.printStackTrace();
			return "";
		}
		finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static final ProcessedSQL processSQL(String sql, final Function<String, List<?>> listLookup) {
		final List<String> dynamicParameterNames = new ArrayList<String>();
		final Map<String,List<TypedValue>> typedValuesMap = new HashMap<String, List<TypedValue>>();
		String s = new StrSubstitutor(new StrLookup() {

			@Override
			public String lookup(String key) {
				List<?> data = listLookup.execute(key);
				if( data == null ) {
					dynamicParameterNames.add(key);
					return "?";
				} else {
					List<TypedValue> list = null;
					StringBuilder rv = new StringBuilder();
					for( Object o : data ) {
						if( rv.length() > 0 ) {
							rv.append(", ");
						}

						if( o == null ) {
							rv.append("NULL");
						} else if( o instanceof Long || o instanceof Integer ) {
							rv.append(o);
						} else {
							if( list == null ) {
								list = new ArrayList<TypedValue>();
								typedValuesMap.put(key,list);
							}
							list.add(new TypedValue(o, JDBCType.fromJavaType(o.getClass())));
							rv.append("?");
						}
					}
					return rv.toString();
				}
			}
		}, "#{", "}", '#').replace(sql);
		return new ProcessedSQL(s, dynamicParameterNames,null);
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
		return new ProcessedSQL(s, dynamicParameterNames,null);
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
			case BLOB:
				sqlType = Types.BLOB;
				break;
			case CLOB:
				sqlType = Types.CLOB;
				break;
			case TIMESTAMP:
				sqlType = Types.TIMESTAMP;
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
			case TIMESTAMP:
				if( value.value instanceof Timestamp ) {
					pstmt.setTimestamp(parameterIndex, (Timestamp)value.value);
				} else {
					pstmt.setTimestamp(parameterIndex, new Timestamp(((Date)value.value).getTime()));
				}
				break;
			case UNKNOWN:
				pstmt.setObject(parameterIndex, value.value);
				break;
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

	public static Map<String, Object> mapResultSet(ResultSet set) throws SQLException {
		Map<String,Object> map = new HashMap<String, Object>();
		ResultSetMetaData m = set.getMetaData();
		int columnCount = m.getColumnCount();

		for( int i = 0; i < columnCount; i++ ) {
			map.put(m.getColumnName(i),set.getObject(i));
		}
		return map;
	}

	public static void trimToSize(List<?> listToTrim, int size) {
		listToTrim.subList(size, listToTrim.size()).clear();
	}

	public static <O> void syncLists(List<O> targetList, List<O> newList) {
		Iterator<O> it = targetList.iterator();
		List<O> removeItems = new ArrayList<O>();
		// remove items not found in new list
		// do not remove immediately because because then to many notifications
		// are regenerated
		while( it.hasNext() ) {
			O next = it.next();
			if( ! newList.contains(next) ) {
				removeItems.add(next);
			}
		}

		targetList.removeAll(removeItems);

		// remove all items from the new list already contained
		it = newList.iterator();
		while( it.hasNext() ) {
			if( targetList.contains(it.next()) ) {
				it.remove();
			}
		}

		targetList.addAll(newList);
	}
	
	public static String[] splitOfSegment(String propertyName) {
		String reference = propertyName.substring(0,propertyName.indexOf('.'));
		propertyName = propertyName.substring(propertyName.indexOf('.')+1,propertyName.length());
		return new String[] { reference, propertyName };
	}
}