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
	public static enum KeyGenerationType {
		AUTOKEY,
		SEQNEXT,
		QUERY
	}
	public abstract String getDatabaseId();
	public abstract boolean isKeyGenerationTypeSupported(KeyGenerationType type);
	public abstract boolean supportsGeneratedKeys();
	public abstract String getSequenceStatementNextVal(EAttribute primaryKey);
	public abstract String getDatabaseType(EAttribute attribute, boolean fkResolve, EDataType dataType);
	public abstract String getAutokeyDefinition(EAttribute primaryKey);
	
	/** @deprecated replaced by has {@link #hasPrimaryKeyCreateInlineContribution(EAttribute)} and {@link #getPrimaryKeyCreateInlineContribution(EAttribute)} */
	@Deprecated
	public abstract boolean isPrimaryKeyPartOfColDef(EAttribute primaryKey);

	public abstract String getPrimaryKeyCreateInlineContribution(UtilCollection util, EAttribute primaryKey);
	public abstract String getPrimaryKeyCreateConstraintContribution(UtilCollection util, EBundleEntity bundleEntity, EAttribute primaryKey);
	public abstract String getPrimaryKeyAlterContribution(UtilCollection util, EAttribute primaryKey);
	
	public boolean hasPrimaryKeyCreateInlineContribution(UtilCollection util, EAttribute primaryKey) {
		return null != getPrimaryKeyCreateInlineContribution(util, primaryKey);
	}
	public boolean hasPrimaryKeyCreateConstraintContribution(UtilCollection util, EBundleEntity bundleEntity, EAttribute primaryKey) {
		return null != getPrimaryKeyCreateConstraintContribution(util, bundleEntity, primaryKey);
	}
	public boolean hasPrimaryKeyAlterContribution(UtilCollection util, EAttribute primaryKey) {
		return null != getPrimaryKeyAlterContribution(util, primaryKey);
	}
	
	
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
