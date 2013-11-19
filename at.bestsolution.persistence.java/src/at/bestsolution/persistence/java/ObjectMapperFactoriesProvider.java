package at.bestsolution.persistence.java;

import java.util.Map;

import at.bestsolution.persistence.ObjectMapper;

public interface ObjectMapperFactoriesProvider {
	public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?>> getMapperFactories();
}
