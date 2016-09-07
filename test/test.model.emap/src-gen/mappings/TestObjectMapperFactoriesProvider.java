package mappings;

import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import java.util.HashMap;
import java.util.Map;

@org.osgi.service.component.annotations.Component
public final class TestObjectMapperFactoriesProvider implements ObjectMapperFactoriesProvider {
  private Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> factories = new HashMap<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>>();
  public TestObjectMapperFactoriesProvider() {
    factories.put(test.model.emap.test.AddressMapper.class, new test.model.emap.test.java.AddressMapperFactory());
    factories.put(test.model.emap.test.PersonMapper.class, new test.model.emap.test.java.PersonMapperFactory());
    factories.put(test.model.emap.test.PlaceMapper.class, new test.model.emap.test.java.PlaceMapperFactory());
  }

  public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> getMapperFactories() {
    return factories;
  }
}
