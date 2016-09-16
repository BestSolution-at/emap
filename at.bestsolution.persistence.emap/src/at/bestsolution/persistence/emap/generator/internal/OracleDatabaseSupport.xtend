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

import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EBundleEntity
import at.bestsolution.persistence.emap.eMap.EMapFactory
import at.bestsolution.persistence.emap.eMap.ESQLDbType
import at.bestsolution.persistence.emap.eMap.ESQLTypeDef
import at.bestsolution.persistence.emap.eMap.EType
import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.generator.UtilCollection
import java.util.Map
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EcorePackage

class OracleDatabaseSupport extends DatabaseSupport {

	override getAutokeyDefinition(EAttribute primaryKey) {
		return ""
	}

	override getDatabaseId() {
		return "Oracle"
	}
	
	override getDatabaseType(EAttribute attribute, EDataType dataType) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getDatabaseType(String javaType) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

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
//		mapping.addType(EcorePackage.Literals.EINT, 			"integer")
//		mapping.addType(EcorePackage.Literals.EINTEGER_OBJECT, 	"integer")
//		mapping.addType(EcorePackage.Literals.ELONG, 			"bigint")
//		mapping.addType(EcorePackage.Literals.ELONG_OBJECT, 	"bigint")
//		mapping.addType(EcorePackage.Literals.ESTRING,			"varchar(${size})", "255")
//		mapping.addType(EcorePackage.Literals.EDOUBLE, 			"decimal")
//		mapping.addType(EcorePackage.Literals.EDOUBLE_OBJECT, 	"decimal")
//		mapping.addType(EcorePackage.Literals.EFLOAT, 			"decimal")
//		mapping.addType(EcorePackage.Literals.EFLOAT_OBJECT,	"decimal")
//		mapping.addType(EcorePackage.Literals.EBIG_DECIMAL,		"decimal")
//		mapping.addType(EcorePackage.Literals.EDATE,			"timestamp")
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