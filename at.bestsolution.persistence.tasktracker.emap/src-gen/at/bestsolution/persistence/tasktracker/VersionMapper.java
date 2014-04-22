package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.Version;

public interface VersionMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.Version,VersionMapper.VersionMappedQuery> {
	public at.bestsolution.persistence.tasktracker.Version selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.Version> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.Version> selectAllForTaskRepository(long sid);


		public abstract class VersionMappedQuery implements at.bestsolution.persistence.MappedQuery<Version> {
			public abstract VersionMappedQuery where(at.bestsolution.persistence.expr.Expression<Version> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Version> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Version>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Version> codename() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Version>("codename");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<Version,java.util.Date> date() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<Version,java.util.Date>("date");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Version> value() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Version>("value");};
			public static final at.bestsolution.persistence.tasktracker.VersionMapper.Join<Version> repository() { return new at.bestsolution.persistence.tasktracker.VersionMapper.Join<Version>("repository");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Version> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<Version>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Version> codename() { return new at.bestsolution.persistence.order.OrderColumnFactory<Version>("codename");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Version> date() { return new at.bestsolution.persistence.order.OrderColumnFactory<Version>("date");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Version> value() { return new at.bestsolution.persistence.order.OrderColumnFactory<Version>("value");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> codename() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".codename");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,java.util.Date> date() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,java.util.Date>(path+".date");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> value() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".value");};
		}
		public VersionMappedQuery selectAllMappedQuery();
}
