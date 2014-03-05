package at.bestsolution.persistence.java;

import java.util.Set;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.java.query.JDBCType;

public interface JavaObjectMapper<O> extends ObjectMapper<O> {
	public JDBCType getJDBCType(String property);
	public String getLockColumn();
	public EStructuralFeature getReferenceId(String property);
	public Set<EReference> getReferenceFeatures();
}
