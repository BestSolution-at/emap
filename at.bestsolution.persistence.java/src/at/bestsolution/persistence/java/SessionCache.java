package at.bestsolution.persistence.java;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public interface SessionCache {
	public <O extends EObject> O getObject(EClass eClass, Object id);
	public void putObject(EObject object, Object id, long version);
	public long getVersion(EObject object, Object id);
	public boolean updateVersion(EObject object, Object id, long version);
	public void evitObject(EObject object);
	public boolean isCached(EObject object);
	public void clear();
	public void release();
	public <O extends EObject> List<O> getQueryResult(String query, Object... parameters);
	public void putQueryResult(List<EObject> list, String query, Object... parameters);
}
