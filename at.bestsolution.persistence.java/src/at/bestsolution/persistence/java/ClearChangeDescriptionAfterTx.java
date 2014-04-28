/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ccaks <christoph.caks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java;

public class ClearChangeDescriptionAfterTx implements AfterTxRunnable {

	private final Object object;
	
	public ClearChangeDescriptionAfterTx(Object object) {
		this.object = object; 
	}
	
	@Override
	public void runAfterTx(JavaSession session) {
		session.clearChangeDescription(object);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+"(" + object +")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((object == null) ? 0 : object.hashCode());
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
		ClearChangeDescriptionAfterTx other = (ClearChangeDescriptionAfterTx) obj;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		return true;
	}

}
