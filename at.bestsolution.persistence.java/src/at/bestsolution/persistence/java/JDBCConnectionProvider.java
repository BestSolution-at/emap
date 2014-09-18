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

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.SQLException;

public interface JDBCConnectionProvider {
	public static final String DEFAULT_CONFIGURATION = "__DEFAULT";
	public String getDatabaseType(String configurationId);
	public Connection checkoutConnection(String configurationId);
	public void returnConnection(String configurationId, Connection connection);
	public Blob createTempBlob(String configurationId, Connection connection) throws SQLException;
	public Clob createTempClob(String configurationId, Connection connection) throws SQLException;
	public void releaseTempBlob(String configurationId, Connection connection, Blob blob) throws SQLException;
	public void releaseTempClob(String configurationId, Connection connection, Clob clob) throws SQLException;
}
