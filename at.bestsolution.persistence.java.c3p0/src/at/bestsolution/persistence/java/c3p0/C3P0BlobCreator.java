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
package at.bestsolution.persistence.java.c3p0;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.SQLException;

public interface C3P0BlobCreator {
	public String getDatabaseType();
	public Blob createBlob(Connection connection) throws SQLException;
	public Clob createClob(Connection connection) throws SQLException;
	public void releaseBlob(Connection connection, Blob blob) throws SQLException;
	public void releaseClob(Connection connection, Clob clob) throws SQLException;
}
