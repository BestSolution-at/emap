/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tom <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.HashMap;
import java.util.Map;

public class Dummy {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Map<String,Object> map = new HashMap<String, Object>();
		ResultSet set = null;
		ResultSetMetaData m = set.getMetaData();
		int columnCount = m.getColumnCount();

		for( int i = 0; i < columnCount; i++ ) {
			map.put(m.getColumnName(i),set.getObject(i));
		}
	}

}
