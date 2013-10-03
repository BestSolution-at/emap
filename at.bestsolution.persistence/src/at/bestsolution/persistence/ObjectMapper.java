package at.bestsolution.persistence;

public interface ObjectMapper<O> {
	public void update(O object);
	public void insert(O object);
}