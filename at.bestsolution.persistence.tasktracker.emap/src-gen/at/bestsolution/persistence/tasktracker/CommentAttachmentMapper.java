package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.CommentAttachment;

public interface CommentAttachmentMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.CommentAttachment,CommentAttachmentMapper.CommentAttachmentMappedQuery> {
	public at.bestsolution.persistence.tasktracker.CommentAttachment selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.CommentAttachment> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.CommentAttachment> selectAllForComment(long sid);


		public abstract class CommentAttachmentMappedQuery implements at.bestsolution.persistence.MappedQuery<CommentAttachment> {
			public abstract CommentAttachmentMappedQuery where(at.bestsolution.persistence.expr.Expression<CommentAttachment> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<CommentAttachment> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<CommentAttachment>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<CommentAttachment,java.sql.Blob> binary() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<CommentAttachment,java.sql.Blob>("binary");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<CommentAttachment> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<CommentAttachment>("description");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<CommentAttachment> mimetype() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<CommentAttachment>("mimetype");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<CommentAttachment> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<CommentAttachment>("title");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment> binary() { return new at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment>("binary");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment> description() { return new at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment>("description");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment> mimetype() { return new at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment>("mimetype");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment> title() { return new at.bestsolution.persistence.order.OrderColumnFactory<CommentAttachment>("title");};
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
		public CommentAttachmentMappedQuery selectAllMappedQuery();
}
