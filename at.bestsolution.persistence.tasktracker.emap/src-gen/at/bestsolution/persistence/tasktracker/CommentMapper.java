package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.Comment;

public interface CommentMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.Comment,CommentMapper.CommentMappedQuery> {
	public at.bestsolution.persistence.tasktracker.Comment selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.Comment> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.Comment> selectAllForTask(long sid);


		public abstract class CommentMappedQuery implements at.bestsolution.persistence.MappedQuery<Comment> {
			public abstract CommentMappedQuery where(at.bestsolution.persistence.expr.Expression<Comment> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Comment> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Comment>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Comment> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Comment>("description");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Comment> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Comment>("title");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Comment> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<Comment>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Comment> description() { return new at.bestsolution.persistence.order.OrderColumnFactory<Comment>("description");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Comment> title() { return new at.bestsolution.persistence.order.OrderColumnFactory<Comment>("title");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> description() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".description");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> title() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".title");};
		}
		public CommentMappedQuery selectAllMappedQuery();
}
