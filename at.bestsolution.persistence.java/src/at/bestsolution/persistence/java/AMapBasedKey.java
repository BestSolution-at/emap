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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AMapBasedKey<O> extends AKey<O> {

	private Map<String, Object> values = new HashMap<String, Object>();
	private Class<O> entityType;
	
	public AMapBasedKey(Class<O> entityType, Map<String, Object> values) {
		this.values = values;
		this.entityType = entityType;
	}

	@Override
	public <K> K getValue(String attribute) {
		return (K) values.get(attribute);
	}
	
	@Override
	public boolean isNew() {
		for (Entry<String, Object> e : values.entrySet()) {
			if (e.getValue() instanceof Number) {
				Number key = (Number) e.getValue();
				if (key.doubleValue() == 0) {
					return true;
				}
			}
			else {
				if (e.getValue() == null) {
					return true;
				}
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entityType == null) ? 0 : entityType.hashCode());
		result = prime * result + ((values == null) ? 0 : values.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AMapBasedKey other = (AMapBasedKey) obj;
		if (entityType == null) {
			if (other.entityType != null)
				return false;
		} else if (!entityType.equals(other.entityType))
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return values.toString();
	}
	
}
