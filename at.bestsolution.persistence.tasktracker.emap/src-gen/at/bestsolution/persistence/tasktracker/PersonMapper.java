package at.bestsolution.persistence.tasktracker;

import at.bestsolution.persistence.tasktracker.Person;

public interface PersonMapper extends at.bestsolution.persistence.ConcreteObjectMapper<at.bestsolution.persistence.tasktracker.Person,PersonMapper.PersonMappedQuery> {
	public at.bestsolution.persistence.tasktracker.Person selectById(long sid);
	public java.util.List<at.bestsolution.persistence.tasktracker.Person> selectAll();
	public java.util.List<at.bestsolution.persistence.tasktracker.Person> selectAllForTaskRepository(long sid);


		public abstract class PersonMappedQuery implements at.bestsolution.persistence.MappedQuery<Person> {
			public abstract PersonMappedQuery where(at.bestsolution.persistence.expr.Expression<Person> expression);
		}

		public static final class Expression {
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Person> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<Person>("sid");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person> firstname() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person>("firstname");};
			public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person> lastname() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<Person>("lastname");};
			public static final at.bestsolution.persistence.tasktracker.PersonMapper.Join<Person> repository() { return new at.bestsolution.persistence.tasktracker.PersonMapper.Join<Person>("repository");};
		}

		public static final class Order {
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Person> sid() { return new at.bestsolution.persistence.order.OrderColumnFactory<Person>("sid");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Person> firstname() { return new at.bestsolution.persistence.order.OrderColumnFactory<Person>("firstname");};
			public static final at.bestsolution.persistence.order.OrderColumnFactory<Person> lastname() { return new at.bestsolution.persistence.order.OrderColumnFactory<Person>("lastname");};
		}

		public static final class Join<O> {
			private final String path;
			public Join(String path) {
				this.path = path;
			}

			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> sid() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".sid");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> firstname() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".firstname");};
			public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> lastname() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".lastname");};
		}
		public PersonMappedQuery selectAllMappedQuery();
}
