package at.bestsolution.persistence;

import java.util.List;

public interface ConcreteObjectMapper<O, C extends Criteria<O>> extends ObjectMapper<O> {
	public List<O> selectAll();
	public C selectAllByCriteria();
}
