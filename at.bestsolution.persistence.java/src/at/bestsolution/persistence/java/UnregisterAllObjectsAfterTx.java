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


public class UnregisterAllObjectsAfterTx implements AfterTxRunnable {

	private final EClass eClass;
	
	public UnregisterAllObjectsAfterTx(EClass eClass) {
		this.eClass = eClass; 
	}
	
	@Override
	public void runAfterTx(JavaSession session) {
		 session.unregisterAllObjects(eClass);
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName()+"(" + eClass + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eClass == null) ? 0 : eClass.hashCode());
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
		UnregisterAllObjectsAfterTx other = (UnregisterAllObjectsAfterTx) obj;
		if (eClass == null) {
			if (other.eClass != null)
				return false;
		} else if (!eClass.equals(other.eClass))
			return false;
		return true;
	}

	
}
