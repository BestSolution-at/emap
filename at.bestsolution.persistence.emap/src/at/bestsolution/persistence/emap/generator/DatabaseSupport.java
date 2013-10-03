package at.bestsolution.persistence.emap.generator;

import at.bestsolution.persistence.emap.eMap.EAttribute;

public interface DatabaseSupport {
	public String getDatabaseId();
	public boolean supportsGeneratedKeys();
	public String getSequenceStatement(EAttribute primaryKey);
	public String processInsert(EAttribute primaryKey, String insert);
}
