package at.bestsolution.persistence;

import java.util.List;

public interface Criteria<T> {
	public Criteria<T> eq(String propertyName, Object value);
	public List<T> list();
}
