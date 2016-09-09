/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import at.bestsolution.persistence.Key;

public abstract class KeyLayout<K extends Key<?>> {
	
	private final List<KeyLayoutEntry> entries;
	
	public static class KeyLayoutEntry {
		public final String name;
		public final String colName;
		public final Class<?> type;
		
		public KeyLayoutEntry(String name, String colName, Class<?> type) {
			this.name = name;
			this.colName = colName;
			this.type = type;
		}
	}
	
	public abstract K create(Map<String, Object> values);
	
	public KeyLayout(KeyLayoutEntry... entries) {
		this.entries = Collections.unmodifiableList(Arrays.asList(entries));
	}
	
	public List<KeyLayoutEntry> getEntries() {
		return entries;
	}
	
	public List<String> getAttributes() {
		List<String> res = new ArrayList<String>();
		for (KeyLayoutEntry e : entries) {
			res.add(e.name);
		}
		return res;
	}
	public List<String> getColumns() {
		List<String> res = new ArrayList<String>();
		for (KeyLayoutEntry e : entries) {
			res.add(e.colName);
		}
		return res;
	}
}