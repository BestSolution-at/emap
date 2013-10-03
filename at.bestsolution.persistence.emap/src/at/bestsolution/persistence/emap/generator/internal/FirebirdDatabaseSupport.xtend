package at.bestsolution.persistence.emap.generator.internal

import at.bestsolution.persistence.emap.generator.DatabaseSupport
import at.bestsolution.persistence.emap.eMap.EAttribute

class FirebirdDatabaseSupport implements DatabaseSupport {
	
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
		return true;
	}
	
}