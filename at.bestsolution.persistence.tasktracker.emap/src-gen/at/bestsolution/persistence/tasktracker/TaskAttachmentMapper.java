package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.TaskAttachment;

public interface TaskAttachmentMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.TaskAttachment,TaskAttachmentMapper.TaskAttachmentMappedQuery> {
	public at.bestsolution.persistence.tasktracker.TaskAttachment selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.TaskAttachment> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.TaskAttachment> selectAllForTask(long sid);


		public abstract class TaskAttachmentMappedQuery implements at.bestsolution.persistence.MappedQuery<TaskAttachment> {
			public abstract TaskAttachmentMappedQuery where(at.bestsolution.persistence.expr.Expression<TaskAttachment> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<TaskAttachment> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<TaskAttachment>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<TaskAttachment,java.sql.Blob> binary() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<TaskAttachment,java.sql.Blob>("binary");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskAttachment> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskAttachment>("description");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskAttachment> mimetype() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskAttachment>("mimetype");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskAttachment> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<TaskAttachment>("title");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment> binary() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment>("binary");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment> description() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment>("description");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment> mimetype() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment>("mimetype");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment> title() { return new at.bestsolution.persistence.order.OrderColumnFactory<TaskAttachment>("title");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,java.sql.Blob> binary() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,java.sql.Blob>(path+".binary");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".description");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> mimetype() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".mimetype");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".title");};
		}
		public TaskAttachmentMappedQuery selectAllMappedQuery();
}
