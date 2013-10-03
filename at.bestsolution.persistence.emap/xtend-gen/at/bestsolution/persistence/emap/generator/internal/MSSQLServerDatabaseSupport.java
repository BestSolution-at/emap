package at.bestsolution.persistence.emap.generator.internal;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.generator.DatabaseSupport;

@SuppressWarnings("all")
public class MSSQLServerDatabaseSupport implements DatabaseSupport {
  public String getDatabaseId() {
    return "mssql";
  }
  
  public String getSequenceStatement(final EAttribute primaryKey) {
    return "";
  }
  
  public String processInsert(final EAttribute primaryKey, final String insert) {
    return insert;
  }
  
  public boolean supportsGeneratedKeys() {
    return true;
  }
}
