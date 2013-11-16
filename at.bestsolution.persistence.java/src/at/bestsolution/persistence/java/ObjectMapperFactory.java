package at.bestsolution.persistence.java;

import at.bestsolution.persistence.ObjectMapper;

public interface ObjectMapperFactory<M extends ObjectMapper<?>> {
	public M createMapper(JavaSession session);
}