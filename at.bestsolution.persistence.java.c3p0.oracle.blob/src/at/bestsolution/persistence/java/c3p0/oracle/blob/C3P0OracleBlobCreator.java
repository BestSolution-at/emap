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
package at.bestsolution.persistence.java.c3p0.oracle.blob;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.SQLException;

import oracle.sql.BLOB;
import oracle.sql.CLOB;

import com.mchange.v2.c3p0.dbms.OracleUtils;

import at.bestsolution.persistence.java.c3p0.C3P0BlobCreator;

public class C3P0OracleBlobCreator implements C3P0BlobCreator {

	@Override
	public String getDatabaseType() {
		return "Oracle";
	}

	@Override
	public Blob createBlob(Connection connection) throws SQLException {
		return OracleUtils.createTemporaryBLOB(connection, false, BLOB.DURATION_SESSION);
	}

	@Override
	public Clob createClob(Connection connection) throws SQLException {
		return OracleUtils.createTemporaryCLOB(connection, false, BLOB.DURATION_SESSION);
	}

	@Override
	public void releaseBlob(Connection connection, Blob blob)
			throws SQLException {
		if( blob instanceof BLOB ) {
			((BLOB)blob).freeTemporary();
		}
	}
	
	@Override
	public void releaseClob(Connection connection, Clob clob)
			throws SQLException {
		if( clob instanceof CLOB ) {
			((CLOB)clob).freeTemporary();
		}
	}
}
