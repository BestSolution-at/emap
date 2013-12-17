package at.bestsolution.persistence.java;

import java.util.List;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.ObjectMapper;

public interface ObjectMapperFactory<M extends ObjectMapper<?>, O> {
	public M createMapper(JavaSession session);
	public NamedQuery<O> createNamedQuery(JavaSession session, String name);
	public MappedQuery<O> mappedQuery(JavaSession session, String name);

	public interface NamedQuery<O> {
		public List<O> queryForList(Object... parameters);
		public O queryForOne(Object... parameters);
		public String[] getParameterNames();
	}
}