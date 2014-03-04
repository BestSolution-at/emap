package at.bestsolution.persistence.java;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface SessionCache {
	public <O extends EObject> O getObject(EClass eClass, Object id);
	public void putObject(EObject object, Object id);
	public void evitObject(EObject object);
	public boolean isCached(EObject object);
	public void clear();
	public void release();
}
