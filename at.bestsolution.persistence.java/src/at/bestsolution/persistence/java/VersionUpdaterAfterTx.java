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

import org.eclipse.emf.ecore.EObject;

public class VersionUpdaterAfterTx implements AfterTxRunnable {
	private final Object object;
	private final Object id;
	private final long version;

	public VersionUpdaterAfterTx(Object object, Object id, long version) {
		this.object = object;
		this.id = id;
		this.version = version;
	}

	@Override
	public void runAfterTx(JavaSession session) {
		session.getCache().updateVersion((EObject)object, id, version);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		result = prime * result + (int) (version ^ (version >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VersionUpdaterAfterTx other = (VersionUpdaterAfterTx) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
}