package mappings;

import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import java.util.HashMap;
import java.util.Map;

public final class SampleObjectMapperFactoriesProvider implements ObjectMapperFactoriesProvider {
	private Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> factories = new HashMap<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>>();
	public SampleObjectMapperFactoriesProvider() {
		factories.put(sample.AddressMapper.class, new sample.java.AddressMapperFactory());
		factories.put(sample.ContactBookMapper.class, new sample.java.ContactBookMapperFactory());
		factories.put(sample.CountryMapper.class, new sample.java.CountryMapperFactory());
		factories.put(sample.PersonMapper.class, new sample.java.PersonMapperFactory());
	}

	public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> getMapperFactories() {
		return factories;
	}
}
