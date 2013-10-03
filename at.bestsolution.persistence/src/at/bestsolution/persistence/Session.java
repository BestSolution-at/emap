package at.bestsolution.persistence;

public interface Session {
	public <M extends ObjectMapper<?>> M createMapper(Class<M> mapper);
	public void close();
}
