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

class FirebirdDatabaseSupport extends DatabaseSupport {

	override getDatabaseId() {
		return "Firebird"
	}

	override getSequenceStatement(EAttribute primaryKey) {
		return "NEXT VALUE FOR " + primaryKey.valueGenerators.findFirst[dbType==databaseId].sequence;
	}

	override processInsert(EAttribute primaryKey, String insert) {
		return insert + " RETURNING " + primaryKey.getColumnName();
	}

	override supportsGeneratedKeys() {
		return false;
	}

	override supportsGeneratedKeyAsResultSet() {
		return true;
	}

	override getDatabaseType(EDataType dataType) {
		if( dataType instanceof EEnum ) {
			return "varchar(255)";
		} else if( "EInteger" == dataType.name || "EIntegerObject" == dataType.name ) {
			return "integer";
		} else if( "ELong" == dataType.name || "ELongObject" == dataType.name ) {
			return "int64";
		} else if( "EDouble" == dataType.name || "EDoubleObject" == dataType.name || "EBigDecimal" == dataType.name ) {
			return "decimal";
		} else if( "EString" == dataType.name ) {
			return "varchar(255)"
		} else if( "java.sql.Clob" == dataType.instanceClassName ) {
			return "blob sub_type 1 segment size 2048"
		} else if( "java.sql.Blob" == dataType.instanceClassName ) {
			return "blob segment size 2048";
		} else if( "EBoolean" == dataType.name || "EBooleanObject" == dataType.name ) {
			return "smallint"
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