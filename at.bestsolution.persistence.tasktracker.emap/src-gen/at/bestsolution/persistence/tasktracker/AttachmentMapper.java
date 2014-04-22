package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.Attachment;

public interface AttachmentMapper extends at.bestsolution.persistence.ObjectMapper<at.bestsolution.persistence.tasktracker.Attachment> {


		public abstract class AttachmentMappedQuery implements at.bestsolution.persistence.MappedQuery<Attachment> {
			public abstract AttachmentMappedQuery where(at.bestsolution.persistence.expr.Expression<Attachment> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Attachment> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Attachment>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<Attachment,java.sql.Blob> binary() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<Attachment,java.sql.Blob>("binary");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Attachment> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Attachment>("description");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Attachment> mimetype() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Attachment>("mimetype");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Attachment> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Attachment>("title");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Attachment> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<Attachment>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Attachment> binary() { return new at.bestsolution.persistence.order.OrderColumnFactory<Attachment>("binary");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Attachment> description() { return new at.bestsolution.persistence.order.OrderColumnFactory<Attachment>("description");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Attachment> mimetype() { return new at.bestsolution.persistence.order.OrderColumnFactory<Attachment>("mimetype");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Attachment> title() { return new at.bestsolution.persistence.order.OrderColumnFactory<Attachment>("title");};
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
}
