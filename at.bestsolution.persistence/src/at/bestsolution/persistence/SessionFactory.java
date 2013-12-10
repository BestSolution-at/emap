package at.bestsolution.persistence;

public interface SessionFactory {
	public String getFactoryId();
	public Session createSession();
}
