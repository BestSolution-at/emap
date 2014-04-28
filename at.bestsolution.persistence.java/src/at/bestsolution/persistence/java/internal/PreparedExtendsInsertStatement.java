/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <christoph.caks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.internal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.java.DatabaseSupport.ExtendsInsertStatement;
import at.bestsolution.persistence.java.DatabaseSupport.InsertStatement;

public class PreparedExtendsInsertStatement extends PreparedStatement implements ExtendsInsertStatement {
	private final String tableName;
	private final String pkColumn;
	
	static final Logger LOGGER = Logger.getLogger(PreparedStatement.class);
	
	public PreparedExtendsInsertStatement(String tableName, String pkColumn) {
		this.tableName = tableName;
		this.pkColumn = pkColumn;
	}
	
	protected String createSQL(String tableName, String pkColumn, long pkValue, List<Column> columnList) {
		StringBuilder col = new StringBuilder();
		StringBuilder val = new StringBuilder();

		if (pkColumn != null && pkValue != 0) {
			col.append('"'+pkColumn+'"');
			val.append(pkValue);
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
	
	@Override
	public final boolean execute(Connection connection, long primaryKeyValue) throws SQLException {
		final String sql = createSQL(tableName, pkColumn, primaryKeyValue, columnList);
		if (LOGGER.isDebugEnabled()) LOGGER.debug("Executing statement \n'"+sql+"'");
		final java.sql.PreparedStatement pstmt = connection.prepareStatement(sql);
		
		for( final Column c : columnList ) {
			c.apply(pstmt);
		}
		
		try {
			return pstmt.execute();	
		} finally {
			pstmt.close();
		}
	}
}