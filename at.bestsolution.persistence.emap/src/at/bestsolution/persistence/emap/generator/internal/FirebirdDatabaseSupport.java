package at.bestsolution.persistence.emap.generator.internal;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.generator.DatabaseSupport;

public class FirebirdDatabaseSupport implements DatabaseSupport {
	@Override
	public String getDatabaseId() {
		return "Firebird";
	}
	
	@Override
	public String getSequenceStatement(EAttribute primaryKey) {
		return "NEXT VALUE FOR " + primaryKey.getSequence();
	}

	@Override
	public boolean supportsGeneratedKeys() {
		return true;
	}

	@Override
	public String processInsert(EAttribute primaryKey, String insert) {
		return insert + " RETURNING " + primaryKey.getColumnName();
	}
}