package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.ChangeSet;

public interface ChangeSetMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.ChangeSet,ChangeSetMapper.ChangeSetMappedQuery> {
	public at.bestsolution.persistence.tasktracker.ChangeSet selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.ChangeSet> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.ChangeSet> selectAllForTask(long sid);


		public abstract class ChangeSetMappedQuery implements at.bestsolution.persistence.MappedQuery<ChangeSet> {
			public abstract ChangeSetMappedQuery where(at.bestsolution.persistence.expr.Expression<ChangeSet> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<ChangeSet> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<ChangeSet>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<ChangeSet> comment() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<ChangeSet>("comment");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<ChangeSet> id() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<ChangeSet>("id");};
			public static final at.bestsolution.persistence.tasktracker.ChangeSetMapper.Join<ChangeSet> person() { return new at.bestsolution.persistence.tasktracker.ChangeSetMapper.Join<ChangeSet>("person");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<ChangeSet> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<ChangeSet>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<ChangeSet> comment() { return new at.bestsolution.persistence.order.OrderColumnFactory<ChangeSet>("comment");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<ChangeSet> id() { return new at.bestsolution.persistence.order.OrderColumnFactory<ChangeSet>("id");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> comment() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".comment");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> id() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".id");};
		}
		public ChangeSetMappedQuery selectAllMappedQuery();
}
