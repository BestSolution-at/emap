package at.bestsolution.persistence;

public interface Session {
	public <O> O createMapper(Class<O> mapper);
	public void close();
}
