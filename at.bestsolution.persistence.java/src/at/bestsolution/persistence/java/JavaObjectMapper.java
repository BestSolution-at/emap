package at.bestsolution.persistence.java;

import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.java.query.JDBCType;

public interface JavaObjectMapper<O> extends ObjectMapper<O> {
	public JDBCType getJDBCType(String property);
	public EStructuralFeature getReferenceId(String property);
}
