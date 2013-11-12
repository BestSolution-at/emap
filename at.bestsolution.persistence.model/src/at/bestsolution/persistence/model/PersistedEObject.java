package at.bestsolution.persistence.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public interface PersistedEObject extends EObject {
	public boolean isResolved(EReference f);
//	public Object getPrimaryKey();
}
