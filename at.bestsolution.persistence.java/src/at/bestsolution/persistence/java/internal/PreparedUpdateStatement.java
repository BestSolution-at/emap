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
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement;

public class PreparedUpdateStatement extends PreparedStatement implements UpdateStatement {
	private final String tableName;
	private final String pkColumn;
	private final String lockColumn;

	static final Logger LOGGER = Logger.getLogger(PreparedStatement.class);

	public PreparedUpdateStatement(String tableName, String pkColumn, String lockColumn) {
		this.tableName = tableName;
		this.pkColumn = pkColumn;
		this.lockColumn = lockColumn;
	}

	protected String createSQL(String tableName, String pkColumn, String lockColumn, List<Column> columnList) {
		StringBuilder b = new StringBuilder();
		if( lockColumn != null ) {
			b.append( '"' + lockColumn.toUpperCase() + '"' + " = " + '"' + lockColumn.toUpperCase() + '"' + " + 1");
		}

		for (Column c : columnList) {
			if (b.length() != 0) {
				b.append("\n,");
			}
			b.append('"' + c.column + '"' + " = ?");
		}
		if( lockColumn != null ) {
			return "UPDATE " + '"' + tableName + '"' + " SET " + b
					+ " WHERE " + '"' + pkColumn + '"' + " = ? AND " + lockColumn + " = ?";
		}
		return "UPDATE " + '"' + tableName + '"' + " SET " + b
				+ " WHERE " + '"' + pkColumn + '"' + " = ?";
	}

	@Override
	public boolean execute(Connection connection, long primaryKeyValue, long version) throws SQLException {
		String sql = createSQL(tableName, pkColumn, lockColumn, columnList);
		if (LOGGER.isDebugEnabled()) LOGGER.debug("Executing statement \n'"+sql+"'");
		java.sql.PreparedStatement pstmt = connection.prepareStatement(sql);
		for( Column c : columnList ) {
			c.apply(pstmt);
		}
		pstmt.setLong(columnList.size()+1, primaryKeyValue);
		if( lockColumn != null ) {
			pstmt.setLong(columnList.size()+2, version);
		}
		return pstmt.executeUpdate() != 0;
	}

}
