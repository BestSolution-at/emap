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
import java.util.Iterator;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.Key;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.DatabaseSupport.UpdateStatement;
import at.bestsolution.persistence.java.KeyLayout;
import at.bestsolution.persistence.java.KeyLayout.KeyLayoutEntry;
import at.bestsolution.persistence.java.Util;

public class PreparedUpdateStatement extends PreparedStatement implements UpdateStatement {
	private final String tableName;
	private final String lockColumn;
	private final KeyLayout<? extends Key<?>> pkLayout;

	static final Logger LOGGER = Logger.getLogger(PreparedStatement.class);

	public <K extends Key<?>> PreparedUpdateStatement(DatabaseSupport db, String tableName, KeyLayout<K> pkLayout, String lockColumn) {
		super(db);
		this.tableName = tableName;
		this.pkLayout = pkLayout;
		this.lockColumn = lockColumn;
	}

	@Override
	public boolean execute(Connection connection, long primaryKeyValue, long version) throws SQLException {
//		String sql = createSQL(tableName, pkColumn, lockColumn, columnList);
//		if (LOGGER.isDebugEnabled()) LOGGER.debug("Executing statement \n'"+sql+"'");
//		java.sql.PreparedStatement pstmt = connection.prepareStatement(sql);
//		for( Column c : columnList ) {
//			c.apply(pstmt);
//		}
//		pstmt.setLong(columnList.size()+1, primaryKeyValue);
//		if( lockColumn != null ) {
//			pstmt.setLong(columnList.size()+2, version);
//		}
//		return pstmt.executeUpdate() != 0;
		return false;
	}

	
	protected String buildUpdatePart() {
		StringBuilder b = new StringBuilder();
		
		if( lockColumn != null ) {
			b.append( doubleQuote(correctCase(lockColumn)) + " = " + doubleQuote(correctCase(lockColumn)) + " + 1");
		}
		
		for (Column c : columnList) {
			if (b.length() != 0) {
				b.append("\n,");
			}
			b.append(doubleQuote(correctCase(c.column)) + " = ?");
		}
		return b.toString();
	}
	
	protected String buildLockColumnWhere() {
		return doubleQuote(correctCase(lockColumn)) + " = ?";
	}
	
	protected String buildPKWhere() {
		StringBuilder b = new StringBuilder();
		Iterator<KeyLayoutEntry> it = pkLayout.getEntries().iterator();
		while (it.hasNext()) {
			KeyLayoutEntry e = it.next();
			b.append(doubleQuote(correctCase(e.colName))); b.append(" = ?");
			
			if (it.hasNext()) {
				b.append(" AND ");
			}
		}
		return b.toString();
	}
	
	protected String doubleQuote(String v) {
		return '"' + v + '"';
	}
	
	protected String buildSql() {
		return "UPDATE " + doubleQuote(correctCase(tableName)) +
				" SET " + buildUpdatePart() +
				" WHERE " + buildPKWhere() +
				(lockColumn == null ? "" :
					(" AND " + buildLockColumnWhere())
				);
		
	}
	
	@Override
	public boolean execute(Connection connection, Key<?> primaryKeyValue, long version) throws SQLException {
		// TODO NEWKEYS
		// TODO Auto-generated method stub
		
		String sql = buildSql();
		java.sql.PreparedStatement pstmt = connection.prepareStatement(sql);
		for( Column c : columnList ) {
			c.apply(pstmt);
		}
		int idx = columnList.size()+1;
		
		for (String attr : primaryKeyValue.getAttributes()) {
			Util.setKeyValue(pstmt, idx++, (KeyLayout<Key<?>>) pkLayout, primaryKeyValue, attr);
		}
		
		if( lockColumn != null ) {
			pstmt.setLong(idx, version);
		}
		return pstmt.executeUpdate() != 0;
	}

}
