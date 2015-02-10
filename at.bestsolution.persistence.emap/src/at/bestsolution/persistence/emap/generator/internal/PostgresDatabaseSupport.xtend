/*******************************************************************************
 * Copyright (c) 2015 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tomschindl <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator.internal

import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.eMap.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum

class PostgresDatabaseSupport extends DatabaseSupport {

	override getDatabaseId() {
		return "Postgres"
	}

	override getSequenceStatementNextVal(EAttribute primaryKey) {
//		return "NEXT VALUE FOR " + primaryKey.valueGenerators.findFirst[dbType==databaseId].sequence;
		return null;
	}

//	override getSequenceStatementCurVal(EAttribute primaryKey) {
//		return null;
//	}

//	override processInsert(EAttribute primaryKey, String insert) {
//		return insert + " RETURNING " + primaryKey.getColumnName();
//	}

	override supportsGeneratedKeys() {
		return true;
	}

//	override supportsGeneratedKeyAsResultSet() {
//		return true;
//	}

	override getDatabaseType(EAttribute attribute, boolean fkResolve, EDataType dataType) {
		val size = attribute?.size;

		if( dataType instanceof EEnum ) {
			if( size != null ) {
				return "varchar("+size+")";
			}
			return "varchar(255)";
		} else if( "EInt" == dataType.name || "EIntegerObject" == dataType.name ) {
			return "integer";
		} else if( "ELong" == dataType.name || "ELongObject" == dataType.name ) {
			if( fkResolve && attribute.pk ) {
				return "bigserial"	
			} else {
				return "bigint";	
			}
		} else if( "EDouble" == dataType.name || "EDoubleObject" == dataType.name || "EBigDecimal" == dataType.name ) {
			return "decimal";
		} else if( "EString" == dataType.name ) {
			if( size != null ) {
				return "varchar("+size+")";
			}
			return "varchar(255)"
		} else if( "java.sql.Clob" == dataType.instanceClassName ) {
			return "blob sub_type 1 segment size 2048"
		} else if( "java.sql.Blob" == dataType.instanceClassName ) {
			return "blob segment size 2048";
		} else if( "EBoolean" == dataType.name || "EBooleanObject" == dataType.name ) {
			return "boolean"
		} else if( "EDate" == dataType.name ) {
			return "timestamp";
		}
		return "***UNKOWN "+dataType.name+"***";
	}

	override getAutokeyDefinition(EAttribute primaryKey) {
		return ""
	}

	override isPrimaryKeyPartOfColDef(EAttribute primaryKey) {
		return true;
	}
}