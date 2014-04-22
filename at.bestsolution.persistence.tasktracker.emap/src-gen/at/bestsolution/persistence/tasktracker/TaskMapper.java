package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.Task;

public interface TaskMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.Task,TaskMapper.TaskMappedQuery> {
	public at.bestsolution.persistence.tasktracker.Task selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.Task> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.Task> selectAllForTaskRepository(long sid);

	public long countTasks();
	public java.util.List<at.bestsolution.persistence.tasktracker.TaskAndPerson> selectTaskAndPerson();

		public abstract class TaskMappedQuery implements at.bestsolution.persistence.MappedQuery<Task> {
			public abstract TaskMappedQuery where(at.bestsolution.persistence.expr.Expression<Task> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Task> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Task>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Task> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Task>("description");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Task> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Task>("title");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<Task,at.bestsolution.persistence.tasktracker.TaskState> state() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<Task,at.bestsolution.persistence.tasktracker.TaskState>("state");};
			public static final at.bestsolution.persistence.tasktracker.TaskMapper.Join<Task> assignee() { return new at.bestsolution.persistence.tasktracker.TaskMapper.Join<Task>("assignee");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Task> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<Task>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Task> description() { return new at.bestsolution.persistence.order.OrderColumnFactory<Task>("description");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Task> title() { return new at.bestsolution.persistence.order.OrderColumnFactory<Task>("title");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Task> state() { return new at.bestsolution.persistence.order.OrderColumnFactory<Task>("state");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".description");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".title");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,at.bestsolution.persistence.tasktracker.TaskState> state() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,at.bestsolution.persistence.tasktracker.TaskState>(path+".state");};
		}
		public TaskMappedQuery selectAllMappedQuery();
}
