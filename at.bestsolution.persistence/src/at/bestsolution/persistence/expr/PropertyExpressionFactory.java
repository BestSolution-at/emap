package at.bestsolution.persistence.expr;

public class PropertyExpressionFactory<O> {
	final String property;

	PropertyExpressionFactory(String property) {
		this.property = property;
	}

	public static <O> EqualsExpression<O> equals(String property, Object value) {
		return new EqualsExpression<O>(property, value);
	}

	public final static class IntegerExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public IntegerExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(int value) {
			return PropertyExpressionFactory.equals(property, value);
		}
	}

	public final static class DoubleExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public DoubleExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(double value) {
			return PropertyExpressionFactory.equals(property, value);
		}
	}

	public final static class LongExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public LongExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(long value) {
			return PropertyExpressionFactory.equals(property, value);
		}
	}

	public final static class BooleanExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public BooleanExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(boolean value) {
			return PropertyExpressionFactory.equals(property, value);
		}
	}

	public static class GenericExpressionFactory<O,T> extends PropertyExpressionFactory<O> {
		public GenericExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(T value) {
			return PropertyExpressionFactory.equals(property, value);
		}
	}

	public static class RelationExpressionFactory<O,T,J> extends PropertyExpressionFactory<O> {
		public final J join;

		public RelationExpressionFactory(String property, J join) {
			super(property);
			this.join = join;
		}
	}


	public static class IntegerObjectExpressionFactory<O> extends GenericExpressionFactory<O,Integer> {

		public IntegerObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class BooleanObjectExpressionFactory<O> extends GenericExpressionFactory<O,Boolean> {

		public BooleanObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class DoubleObjectExpressionFactory<O> extends GenericExpressionFactory<O,Double> {

		public DoubleObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class FloatObjectExpressionFactory<O> extends GenericExpressionFactory<O,Float> {

		public FloatObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class StringExpressionFactory<O> extends GenericExpressionFactory<O, String> {

		public StringExpressionFactory(String property) {
			super(property);
		}
	}
}
