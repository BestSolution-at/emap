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
package at.bestsolution.persistence.emap.generator.internal

import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.eMap.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import at.bestsolution.persistence.emap.eMap.EBundleEntity
import at.bestsolution.persistence.emap.generator.UtilCollection
import javax.inject.Inject

class OracleDatabaseSupport extends DatabaseSupport {

	override getAutokeyDefinition(EAttribute primaryKey) {
		return ""
	}

	override getDatabaseId() {
		return "Oracle"
	}

	override getDatabaseType(EAttribute attribute, boolean fkResolve, EDataType dataType) {
		if( dataType instanceof EEnum ) {
			return "VARCHAR2(255)";
		} else if( "EInt" == dataType.name || "EIntegerObject" == dataType.name ) {
			return "NUMBER(38,0)";
		} else if( "ELong" == dataType.name || "ELongObject" == dataType.name ) {
			return "NUMBER(38,0)";
		} else if( "EDouble" == dataType.name || "EDoubleObject" == dataType.name || "EBigDecimal" == dataType.name ) {
			return "FLOAT";
		} else if( "EString" == dataType.name ) {
			return "NVARCHAR2(255)"
		} else if( "java.sql.Clob" == dataType.instanceClassName ) {
			return "CLOB"
		} else if( "java.sql.Blob" == dataType.instanceClassName ) {
			return "BLOB";
		} else if( "EBoolean" == dataType.name || "EBooleanObject" == dataType.name ) {
			return "NUMBER(1)"
		} else if( "EDate" == dataType.name ) {
			return "TIMESTAMP";
		}
		return "***UNKOWN "+dataType.name+"***";
	}

	override getSequenceStatementNextVal(EAttribute primaryKey) {
		return primaryKey.valueGenerators.findFirst[dbType==databaseId].sequence+".nextval"
	}

//	override getSequenceStatementCurVal(EAttribute primaryKey) {
//		return null;
//	}

	override isPrimaryKeyPartOfColDef(EAttribute primaryKey) {
		return false
	}

//	override processInsert(EAttribute primaryKey, String insert) {
//		return insert
//	}

	override isKeyGenerationTypeSupported(KeyGenerationType type) {
		return type == KeyGenerationType.SEQNEXT || type == KeyGenerationType.QUERY
	}

	override supportsGeneratedKeys() {
		return false;
	}
	
	override getPrimaryKeyCreateInlineContribution(UtilCollection util, EAttribute primaryKey) {
		null
	}
	
	override getPrimaryKeyCreateConstraintContribution(extension UtilCollection util, EBundleEntity bundleEntity, EAttribute primaryKey) {
		if (bundleEntity.pkConstraintName == null) {
			'''constraint pk_«bundleEntity.entity.calcTableName» PRIMARY KEY("«primaryKey.columnName»")'''
		}
		else {
			'''constraint «bundleEntity.pkConstraintName» PRIMARY KEY("«primaryKey.columnName»")'''	
		}
	}
	
	override getPrimaryKeyAlterContribution(UtilCollection util, EAttribute primaryKey) {
		null
	}

//	override supportsGeneratedKeyAsResultSet() {
//		return false;
//	}

}