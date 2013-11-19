package at.bestsolution.persistence.emap.generator.internal

import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.eMap.EAttribute
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EEnum

class MSSQLServerDatabaseSupport extends DatabaseSupport {

	override getDatabaseId() {
		return "mssql";
	}

	override getSequenceStatement(EAttribute primaryKey) {
		return ""
	}

	override processInsert(EAttribute primaryKey, String insert) {
		return insert;
	}

	override supportsGeneratedKeys() {
		return true;
	}

	override getDatabaseType(EDataType dataType) {
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

}