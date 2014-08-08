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
package at.bestsolution.persistence.java.query;

import java.util.Date;

public enum JDBCType {
	LONG(true),
	INT(true),
	STRING(false),
	DOUBLE(true),
	BOOLEAN(false),
	FLOAT(true),
	BLOB(false),
	CLOB(false),
	TIMESTAMP(false),
	UNKNOWN(false);

	public final boolean numeric;

	private JDBCType(boolean numeric) {
		this.numeric = numeric;
	}

	public static JDBCType fromJavaType(Class<?> type) {
		if( type == String.class ) {
			return JDBCType.STRING;
		} else if( type == int.class || type == Integer.class ) {
			return JDBCType.INT;
		} else if( type == long.class || type == Long.class ) {
			return JDBCType.LONG;
		} else if( type == double.class || type == Double.class ) {
			return JDBCType.DOUBLE;
		} else if( type == boolean.class || type == Boolean.class ) {
			return JDBCType.BOOLEAN;
		} else if( type == float.class || type == Float.class ) {
			return JDBCType.FLOAT;
		} else if( type == Date.class ) {
			return JDBCType.TIMESTAMP;
		}
		return JDBCType.UNKNOWN;
	}
}