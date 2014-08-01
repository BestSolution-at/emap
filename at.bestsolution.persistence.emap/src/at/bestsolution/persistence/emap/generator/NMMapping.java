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
package at.bestsolution.persistence.emap.generator;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EBundleEntity;

public class NMMapping {
	public final EBundleEntity e1;
	public final EBundleEntity e2;
	public final EAttribute a1;
	public final EAttribute a2;

	/**
	 *
	 */
	public NMMapping(EBundleEntity e1, EAttribute a1, EBundleEntity e2, EAttribute a2) {
		this.a1 = a1.getRelationColumn().compareTo(a2.getRelationColumn()) < 0 ? a1 : a2;
		this.e1 = a1.getRelationColumn().compareTo(a2.getRelationColumn()) < 0 ? e1 : e2;

		this.a2 = a1.getRelationColumn().compareTo(a2.getRelationColumn()) < 0 ? a2 : a1;
		this.e2 = a1.getRelationColumn().compareTo(a2.getRelationColumn()) < 0 ? e2 : e1;
	}

	@Override
	public int hashCode() {
		return a1.hashCode() + a2.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return
				a1 == ((NMMapping)obj).a1 && a2 == ((NMMapping)obj).a2
				||
				a1 == ((NMMapping)obj).a2 && a2 == ((NMMapping)obj).a1;
	}
}
