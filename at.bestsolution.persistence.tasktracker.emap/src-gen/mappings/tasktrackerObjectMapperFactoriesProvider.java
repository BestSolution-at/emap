package mappings;

import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.java.ObjectMapperFactory;
import java.util.HashMap;
import java.util.Map;

public final class TasktrackerObjectMapperFactoriesProvider implements ObjectMapperFactoriesProvider {
  private Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> factories = new HashMap<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>>();
  public TasktrackerObjectMapperFactoriesProvider() {
    factories.put(at.bestsolution.persistence.tasktracker.ChangeSetMapper.class, new at.bestsolution.persistence.tasktracker.java.ChangeSetMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.CommentMapper.class, new at.bestsolution.persistence.tasktracker.java.CommentMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.CommentAttachmentMapper.class, new at.bestsolution.persistence.tasktracker.java.CommentAttachmentMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.PersonMapper.class, new at.bestsolution.persistence.tasktracker.java.PersonMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.SourceRepositoryMapper.class, new at.bestsolution.persistence.tasktracker.java.SourceRepositoryMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.TaskMapper.class, new at.bestsolution.persistence.tasktracker.java.TaskMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.TaskAttachmentMapper.class, new at.bestsolution.persistence.tasktracker.java.TaskAttachmentMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.TaskRepositoryMapper.class, new at.bestsolution.persistence.tasktracker.java.TaskRepositoryMapperFactory());
    factories.put(at.bestsolution.persistence.tasktracker.VersionMapper.class, new at.bestsolution.persistence.tasktracker.java.VersionMapperFactory());
  }

  public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> getMapperFactories() {
    return factories;
  }
}
