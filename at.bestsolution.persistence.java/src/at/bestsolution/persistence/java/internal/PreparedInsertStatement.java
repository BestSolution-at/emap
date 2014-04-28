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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.java.DatabaseSupport.InsertStatement;

public class PreparedInsertStatement extends PreparedStatement implements InsertStatement {
	private final String tableName;
	private final String pkColumn;
	private final String primaryKeyExpression;
	private final String lockColumn;
	
	static final Logger LOGGER = Logger.getLogger(PreparedStatement.class);
	
	public PreparedInsertStatement(String tableName, String pkColumn, String primaryKeyExpression, String lockColumn) {
		this.tableName = tableName;
		this.pkColumn = pkColumn;
		this.primaryKeyExpression = primaryKeyExpression;
		this.lockColumn = lockColumn;
	}
	
	protected String createSQL(String tableName, String pkColumn, String primaryKeyExpression, String lockColumn, List<Column> columnList) {
		StringBuilder col = new StringBuilder();
		StringBuilder val = new StringBuilder();

		if (pkColumn != null && primaryKeyExpression != null) {
			col.append('"'+pkColumn+'"');
			val.append(primaryKeyExpression);
		}

		if( lockColumn != null ) {
			if (col.length() != 0) {
				col.append("\n,");
				val.append("\n,");
			}
			col.append('"'+lockColumn.toUpperCase()+'"');
			val.append("0");
		}

		for (Column c : columnList) {
			if (col.length() != 0) {
				col.append("\n,");
				val.append("\n,");
			}
			col.append('"'+c.column+'"');
			val.append("?");
		}

		return "INSERT INTO "+'"' + tableName + '"' +"(" + col + ") VALUES (" + val + ")";
	}
	
	protected long execute(java.sql.PreparedStatement pstmt) throws SQLException {
		ResultSet set = null;
		try {
			set = pstmt.getGeneratedKeys();
			return set.getLong(1);
		} finally {
			if( set != null ) {
				set.close();
			}
		}
	}

	@Override
	public final long execute(Connection connection) throws SQLException {
		String sql = createSQL(tableName, pkColumn, primaryKeyExpression, lockColumn, columnList);
		if (LOGGER.isDebugEnabled()) LOGGER.debug("Executing statement \n'"+sql+"'");
		java.sql.PreparedStatement pstmt = connection.prepareStatement(sql);
		
		for( Column c : columnList ) {
			c.apply(pstmt);
		}
		
		try {
			return execute(pstmt);	
		} finally {
			pstmt.close();
		}
	}
}