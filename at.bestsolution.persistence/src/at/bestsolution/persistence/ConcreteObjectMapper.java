package at.bestsolution.persistence;

import java.util.List;

public interface ConcreteObjectMapper<O> extends ObjectMapper<O> {
	public List<O> selectAll();
	public Criteria<O> selectAllByCriteria();
}
