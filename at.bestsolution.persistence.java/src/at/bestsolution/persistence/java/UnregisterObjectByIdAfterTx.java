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

import org.eclipse.emf.ecore.EClass;


public class UnregisterObjectByIdAfterTx implements AfterTxRunnable {

	private final EClass eClass;
	private final Object id;
	
	public UnregisterObjectByIdAfterTx(EClass eClass, Object id) {
		this.eClass = eClass; 
		this.id = id; 
	}
	
	@Override
	public void runAfterTx(JavaSession session) {
		 session.unregisterObject(eClass , id);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+"(" + eClass +", " + id + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eClass == null) ? 0 : eClass.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		UnregisterObjectByIdAfterTx other = (UnregisterObjectByIdAfterTx) obj;
		if (eClass == null) {
			if (other.eClass != null)
				return false;
		} else if (!eClass.equals(other.eClass))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
}
