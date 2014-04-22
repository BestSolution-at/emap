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
package at.bestsolution.persistence.java.internal;

import java.sql.Blob;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import at.bestsolution.persistence.java.DatabaseSupport.Statement;
import at.bestsolution.persistence.java.query.JDBCType;

public class PreparedStatement implements Statement {
	List<Column> columnList = new ArrayList<Column>();
	
	@Override
	public void addInt(String column, int value) {
		columnList.add(new IntColumn(columnList.size(), column, value));
	}
	
	@Override
	public void addInt(String column, Integer value) {
		if( value == null ) {
			addNull(column, JDBCType.INT);
		} else {
			addInt(column, value.intValue());
		}
	}

	@Override
	public void addDouble(String column, double value) {
		columnList.add(new DoubleColumn(columnList.size(), column, value));
	}
	
	@Override
	public void addDouble(String column, Double value) {
		if( value == null ) {
			addNull(column, JDBCType.DOUBLE);
		} else {
			addDouble(column, value);	
		}
		
	}

	@Override
	public void addString(String column, String value) {
		columnList.add(new StringColumn(columnList.size(), column, value));
	}

	@Override
	public void addNull(String column, JDBCType type) {
		columnList.add(new NullColumn(columnList.size(), column, type));
	}
	
	@Override
	public void addBoolean(String column, boolean value) {
		columnList.add(new BooleanColumn(columnList.size(), column, value));
	}
	
	@Override
	public void addBoolean(String column, Boolean value) {
		if( value == null ) {
			addNull(column, JDBCType.BOOLEAN);
		} else {
			addBoolean(column, value);	
		}
	}
	
	@Override
	public void addTimestamp(String column, Date value) {
		columnList.add(new TimestampColumn(columnList.size(), column, value));
	}
	
	@Override
	public void addLong(String column, long value) {
		columnList.add(new LongColumn(columnList.size(), column, value));
	}
	
	@Override
	public void addLong(String column, Long value) {
		if( value == null ) {
			addNull(column, JDBCType.LONG);
		} else {
			addLong(column, value);	
		}
	}
	
	@Override
	public void addEnum(String column, Enum<?> value) {
		columnList.add(new StringColumn(columnList.size(), column, value.name()));
	}
	
	@Override
	public void addBlob(String column, Blob value) {
		columnList.add(new BlobColumn(columnList.size(), column, value));
	}
	
	public static abstract class Column {
		final String column;
		final int index;
		
		public Column(int index, String column) {
			this.index = index;
			this.column = column;
		}
		
		public abstract void apply(java.sql.PreparedStatement pstmt) throws SQLException; 
	}
	
	static class DoubleColumn extends Column {
		private final double value;
		
		public DoubleColumn(int index, String column, double value) {
			super(index, column);
			this.value = value;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setDouble(index, value);
		}
	}
	
	static class IntColumn extends Column {
		private final int value;
		
		public IntColumn(int index, String column, int value) {
			super(index, column);
			this.value = value;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setInt(index, value);
		}
	}

	static class LongColumn extends Column {
		private final long value;
		
		public LongColumn(int index, String column, long value) {
			super(index, column);
			this.value = value;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setLong(index, value);
		}
	}
	
	static class BooleanColumn extends Column {
		private final boolean value;
		
		public BooleanColumn(int index, String column, boolean value) {
			super(index, column);
			this.value = value;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setBoolean(index, value);
		}
	}

	static class TimestampColumn extends Column {
		private final Date value;
		
		public TimestampColumn(int index, String column, Date value) {
			super(index, column);
			this.value = value;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setTimestamp(index, new Timestamp(value.getTime()));
		}
	}

	
	static class StringColumn extends Column {
		private final String value;
		
		public StringColumn(int index, String column, String value) {
			super(index, column);
			this.value = value;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setString(index, value);
		}
	}

	static class NullColumn extends Column {
		private final JDBCType type;
		
		public NullColumn(int index, String column, JDBCType type) {
			super(index, column);
			this.type = type;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setObject(index+1, null);
		}
	}
	
	static class BlobColumn extends Column {
		private final Blob blob;
		
		public BlobColumn(int index, String column, Blob blob) {
			super(index, column);
			this.blob = blob;
		}

		@Override
		public void apply(java.sql.PreparedStatement pstmt) throws SQLException {
			pstmt.setBinaryStream(index+1, blob.getBinaryStream());
		}
		
	}
}
