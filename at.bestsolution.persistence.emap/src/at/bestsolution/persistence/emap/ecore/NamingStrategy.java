package at.bestsolution.persistence.emap.ecore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;


public interface NamingStrategy {
	public String getColumnName(EAttribute attribute, EClass eClass);
	public String getTableName(EClass eClass);
	public boolean hasCustomTableName(EClass eClass);
}
