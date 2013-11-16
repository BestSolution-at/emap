package at.bestsolution.persistence.model;


public interface LazyEObject extends PersistedEObject {
	public void setProxyDelegate(ResolveDelegate delegate);
	public void setProxyData(Object proxyData);
	public boolean isEnhanced();
}
