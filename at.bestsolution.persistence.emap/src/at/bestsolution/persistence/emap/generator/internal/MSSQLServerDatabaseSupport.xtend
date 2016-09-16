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

class MSSQLServerDatabaseSupport extends DatabaseSupport {

	override getDatabaseId() {
		return "mssql";
	}

	override getSequenceStatementNextVal(EAttribute primaryKey) {
		return ""
	}

//	override getSequenceStatementCurVal(EAttribute primaryKey) {
//		return null;
//	}

//	override processInsert(EAttribute primaryKey, String insert) {
//		return insert;
//	}

	override isKeyGenerationTypeSupported(KeyGenerationType type) {
		return type == KeyGenerationType.AUTOKEY || type == KeyGenerationType.SEQNEXT || type == KeyGenerationType.QUERY
	}

	override supportsGeneratedKeys() {
		return true;
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
	
	override getDatabaseType(EAttribute attribute, EDataType dataType) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getDatabaseType(String javaType) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	override getDatabaseType(EAttribute attribute, boolean fkResolve, EDataType dataType) {
		if( dataType instanceof EEnum ) {
			return "nvarchar(255)";
		} else if( "EInt" == dataType.name || "EIntegerObject" == dataType.name ) {
			return "int";
		} else if( "ELong" == dataType.name || "ELongObject" == dataType.name ) {
			return "bigint";
		} else if( "EDouble" == dataType.name || "EDoubleObject" == dataType.name || "EBigDecimal" == dataType.name ) {
			return "real";
		} else if( "EString" == dataType.name ) {
			return "nvarchar(255)"
		} else if( "java.sql.Clob" == dataType.instanceClassName ) {
			return "ntext"
		} else if( "java.sql.Blob" == dataType.instanceClassName ) {
			return "varbinary";
		} else if( "EBoolean" == dataType.name || "EBooleanObject" == dataType.name ) {
			return "bit"
		} else if( "EDate" == dataType.name ) {
			return "datetime";
		}
		return "***UNKOWN "+dataType.name+"***";
	}

	override getAutokeyDefinition(EAttribute primaryKey) {
		return "IDENTITY(1,1)";
	}

	override isPrimaryKeyPartOfColDef(EAttribute primaryKey) {
		return true;
	}
	
	override getPrimaryKeyCreateInlineContribution(UtilCollection util, EAttribute primaryKey) {
		'''PRIMARY KEY'''
	}
	
	override getPrimaryKeyCreateConstraintContribution(UtilCollection util, EBundleEntity bundleEntity, EAttribute primaryKey) {
		null
	}
	
	override getPrimaryKeyAlterContribution(UtilCollection util, EAttribute primaryKey) {
		null
	}

//	override supportsGeneratedKeyAsResultSet() {
//		return false;
//	}

}