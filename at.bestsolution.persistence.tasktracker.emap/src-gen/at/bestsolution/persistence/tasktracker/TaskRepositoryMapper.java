package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.TaskRepository;

public interface TaskRepositoryMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.TaskRepository,TaskRepositoryMapper.TaskRepositoryMappedQuery> {
	public at.bestsolution.persistence.tasktracker.TaskRepository selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.TaskRepository> selectAll();


		public abstract class TaskRepositoryMappedQuery implements at.bestsolution.persistence.MappedQuery<TaskRepository> {
			public abstract TaskRepositoryMappedQuery where(at.bestsolution.persistence.expr.Expression<TaskRepository> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<TaskRepository> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<TaskRepository>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskRepository> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskRepository>("description");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskRepository> name() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskRepository>("name");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskRepository> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskRepository>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskRepository> description() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskRepository>("description");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskRepository> name() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskRepository>("name");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".description");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> name() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".name");};
		}
		public TaskRepositoryMappedQuery selectAllMappedQuery();
}
