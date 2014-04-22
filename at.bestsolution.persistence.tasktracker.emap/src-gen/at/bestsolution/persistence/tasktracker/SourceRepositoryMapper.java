package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.SourceRepository;

public interface SourceRepositoryMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.SourceRepository,SourceRepositoryMapper.SourceRepositoryMappedQuery> {
	public at.bestsolution.persistence.tasktracker.SourceRepository selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.SourceRepository> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.SourceRepository> selectAllForTaskRepository(long sid);


		public abstract class SourceRepositoryMappedQuery implements at.bestsolution.persistence.MappedQuery<SourceRepository> {
			public abstract SourceRepositoryMappedQuery where(at.bestsolution.persistence.expr.Expression<SourceRepository> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<SourceRepository> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<SourceRepository>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<SourceRepository> sourceUrl() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<SourceRepository>("sourceUrl");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<SourceRepository,at.bestsolution.persistence.tasktracker.SourceRepositoryType> type() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<SourceRepository,at.bestsolution.persistence.tasktracker.SourceRepositoryType>("type");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<SourceRepository> webUrl() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<SourceRepository>("webUrl");};
			public static final at.bestsolution.persistence.tasktracker.SourceRepositoryMapper.Join<SourceRepository> repository() { return new at.bestsolution.persistence.tasktracker.SourceRepositoryMapper.Join<SourceRepository>("repository");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository> sourceUrl() { return new at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository>("sourceUrl");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository> type() { return new at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository>("type");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository> webUrl() { return new at.bestsolution.persistence.order.OrderColumnFactory<SourceRepository>("webUrl");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> sourceUrl() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".sourceUrl");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,at.bestsolution.persistence.tasktracker.SourceRepositoryType> type() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,at.bestsolution.persistence.tasktracker.SourceRepositoryType>(path+".type");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> webUrl() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".webUrl");};
		}
		public SourceRepositoryMappedQuery selectAllMappedQuery();
}
