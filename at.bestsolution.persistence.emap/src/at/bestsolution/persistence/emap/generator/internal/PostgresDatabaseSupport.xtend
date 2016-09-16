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
import java.util.Map
import at.bestsolution.persistence.emap.eMap.ESQLTypeDef
import java.util.HashMap
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import at.bestsolution.persistence.emap.eMap.EMapFactory
import at.bestsolution.persistence.emap.eMap.EType
import at.bestsolution.persistence.emap.eMap.ESQLDbType

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

	def createType(EDataType dataType, String sqlTypeDef) {
		return createType(dataType, sqlTypeDef, null)
	}

	def createType(EDataType dataType, String sqlTypeDef, String size) {
		val ESQLTypeDef t = EMapFactory.eINSTANCE.createESQLTypeDef
		val EType etype = EMapFactory.eINSTANCE.createEType
		etype.name = dataType.name
		etype.url = dataType.EPackage.nsURI
		t.etype = etype
		
		val ESQLDbType dbType = EMapFactory.eINSTANCE.createESQLDbType
		dbType.dbType = getDatabaseId
		dbType.sqlTypeDef = sqlTypeDef
		dbType.size = size
		t.dbTypes.add(dbType)
		
		return t
	}
	
	def addType(Map<EDataType, ESQLTypeDef> it, EDataType dataType, String sqlTypeDef, String size) {
		it.put(dataType, createType(dataType, sqlTypeDef, size))
	}
	def addType(Map<EDataType, ESQLTypeDef> it, EDataType dataType, String sqlTypeDef) {
		it.put(dataType, createType(dataType, sqlTypeDef))
	}
	
	override protected defineDatatypeMapping(Map<EDataType, ESQLTypeDef> mapping) {
		mapping.addType(EcorePackage.Literals.EINT, 			"integer")
		mapping.addType(EcorePackage.Literals.EINTEGER_OBJECT, 	"integer")
		mapping.addType(EcorePackage.Literals.ELONG, 			"bigint")
		mapping.addType(EcorePackage.Literals.ELONG_OBJECT, 	"bigint")
		mapping.addType(EcorePackage.Literals.ESTRING,			"varchar(${size})", "255")
		mapping.addType(EcorePackage.Literals.EDOUBLE, 			"decimal")
		mapping.addType(EcorePackage.Literals.EDOUBLE_OBJECT, 	"decimal")
		mapping.addType(EcorePackage.Literals.EFLOAT, 			"decimal")
		mapping.addType(EcorePackage.Literals.EFLOAT_OBJECT,	"decimal")
		mapping.addType(EcorePackage.Literals.EBIG_DECIMAL,		"decimal")
		mapping.addType(EcorePackage.Literals.EBIG_INTEGER,		"numeric")
		mapping.addType(EcorePackage.Literals.EDATE,			"timestamp")
	}

	override getDatabaseType(EAttribute attribute, EDataType dataType) {
		val size = attribute?.size;

		if (dataType instanceof EEnum) return if (size != null) '''varchar(«size»)''' else "varchar(255)"
		
		switch (dataType.name) {
			case "EInt": 			return "integer"
			case "EIntegerObject": 	return "integer"
			case "ELong":			return "bigint"
			case "ELongObject":		return "bigint"
			case "EDouble":			return "decimal"
			case "EDoubleObject":	return "decimal"
			case "EBigDecimal":		return "decimal"
			case "EBoolean":		return "boolean"
			case "EBooleanObject":	return "boolean"
			case "EString":			return if (size != null) '''varchar(«size»)''' else "varchar(255)"
			case "java.sql.Clob":	return "text"
			case "java.sql.Blob":	return "bytea"
			case "EDate":			return "timestamp"
		}
		
		return "***UNKOWN "+dataType.name+"***";
	}
	
	override getDatabaseType(String javaType) {
		switch(javaType) {
			case "int":						return "integer"
			case "java.lang.Integer":		return "integer"
			case "long":					return "bigint"
			case "java.lang.Long":			return "bigint"
			case "double":					return "decimal"
			case "java.lang.Double":		return "decimal"
			case "float":					return "decimal"
			case "java.lang.Float":			return "decimal"
			case "java.math.BigDecimal":	return "decimal"
			case "java.lang.String":		return "varchar(255)"
			case "java.sql.Clob":			return "text"
			case "java.sql.Blob":			return "bytea"
			case "java.util.Date":			return "timestamp"
		}
		
		return "***UNKOWN "+javaType+"***";
	}

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
		} else if( "EBigInteger" == dataType.name) {
			return "numeric";
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