package at.bestsolution.persistence.emap.generator.internal

import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.eMap.EAttribute

class MSSQLServerDatabaseSupport implements DatabaseSupport {
	
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
	
}