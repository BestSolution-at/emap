package at.bestsolution.persistence.emap.generator.internal;

import at.bestsolution.persistence.emap.eMap.EAttribute;
import at.bestsolution.persistence.emap.eMap.EValueGenerator;
import at.bestsolution.persistence.emap.generator.DatabaseSupport;
import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FirebirdDatabaseSupport implements DatabaseSupport {
  public String getDatabaseId() {
    return "Firebird";
  }
  
  public String getSequenceStatement(final EAttribute primaryKey) {
    EList<EValueGenerator> _valueGenerators = primaryKey.getValueGenerators();
    final Function1<EValueGenerator,Boolean> _function = new Function1<EValueGenerator,Boolean>() {
        public Boolean apply(final EValueGenerator it) {
          String _dbType = it.getDbType();
          String _databaseId = FirebirdDatabaseSupport.this.getDatabaseId();
          boolean _equals = Objects.equal(_dbType, _databaseId);
          return Boolean.valueOf(_equals);
        }
      };
    EValueGenerator _findFirst = IterableExtensions.<EValueGenerator>findFirst(_valueGenerators, _function);
    String _sequence = _findFirst.getSequence();
    return ("NEXT VALUE FOR " + _sequence);
  }
  
  public String processInsert(final EAttribute primaryKey, final String insert) {
    String _plus = (insert + " RETURNING ");
    String _columnName = primaryKey.getColumnName();
    return (_plus + _columnName);
  }
  
  public boolean supportsGeneratedKeys() {
    return true;
  }
}
