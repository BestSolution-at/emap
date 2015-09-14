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
package at.bestsolution.persistence.emap.generator;

import org.eclipse.emf.ecore.EDataType;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EBundleEntity;

public abstract class DatabaseSupport {
	public abstract String getDatabaseId();
	public abstract boolean supportsGeneratedKeys();
	public abstract String getSequenceStatementNextVal(EAttribute primaryKey);
	public abstract String getDatabaseType(EAttribute attribute, boolean fkResolve, EDataType dataType);
	public abstract String getAutokeyDefinition(EAttribute primaryKey);
	public abstract boolean isPrimaryKeyPartOfColDef(EAttribute primaryKey);

	public String getPrimaryKeyAsConstraint(UtilCollection util, EBundleEntity bd, EAttribute primaryKey) {
		if( bd.getPkConstraintName() == null ) {
			return "constraint " +  "pk_" + util.calcTableName(bd.getEntity()) + " PRIMARY KEY(\""+ primaryKey.getColumnName()+"\")";
		}
		return "constraint " +  bd.getPkConstraintName() + " PRIMARY KEY(\""+ primaryKey.getColumnName()+"\")";
	}

	public boolean isArrayStoreSupported(Class<?> type) {
		return false;
	}

	public boolean isDefaultLowerCase() {
		return false;
	}
}
