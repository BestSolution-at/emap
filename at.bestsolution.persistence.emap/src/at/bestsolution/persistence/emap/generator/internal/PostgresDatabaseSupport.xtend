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

import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EBundleEntity
import at.bestsolution.persistence.emap.generator.DatabaseSupport
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import at.bestsolution.persistence.emap.generator.UtilCollection

class PostgresDatabaseSupport extends DatabaseSupport {

	override getDatabaseId() {
		return "Postgres"
	}

	

//	override getSequenceStatementCurVal(EAttribute primaryKey) {
//		return null;
//	}

//	override processInsert(EAttribute primaryKey, String insert) {
//		return insert + " RETURNING " + primaryKey.getColumnName();
//	}

	override isKeyGenerationTypeSupported(KeyGenerationType type) {
		return type == KeyGenerationType.AUTOKEY || type == KeyGenerationType.SEQNEXT || type == KeyGenerationType.QUERY
	}

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
			if ( !fkResolve && attribute.pk && (attribute.valueGenerators.findFirst[dbType==this.databaseId] == null || attribute.valueGenerators.findFirst[dbType==this.databaseId].autokey)) {
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
			return "text"
		} else if( "java.sql.Blob" == dataType.instanceClassName ) {
			return "bytea";
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

	override isDefaultLowerCase() {
		return true;
	}
	
	override getSequenceStatementNextVal(EAttribute primaryKey) {
		return null; // in postgres this comes always from the default value (see getPrimaryKeyAlterContribution)
	}
	
	override getPrimaryKeyCreateInlineContribution(UtilCollection util, EAttribute primaryKey) {
		'''PRIMARY KEY'''
	}
	
	override getPrimaryKeyCreateConstraintContribution(UtilCollection util, EBundleEntity bundleEntity, EAttribute primaryKey) {
		null
	}
	
	override getPrimaryKeyAlterContribution(extension UtilCollection util, EAttribute primaryKey) {
		if (primaryKey.getValueGenerator(this).isSequence){
			val tableName = primaryKey.entity.calcTableName(this)
			val columnName = primaryKey.calcColumnName(this)
			val sequenceName = primaryKey.getValueGenerator(this).sequence
			'''ALTER TABLE «tableName» ALTER COLUMN «columnName» SET DEFAULT nextval('«sequenceName»'::regclass);'''
		}
		else {
			null
		}
	}

}