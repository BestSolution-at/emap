package at.bestsolution.persistence.expr;

public class PropertyExpressions<O> {
	final String property;

	PropertyExpressions(String property) {
		this.property = property;
	}

	public static <O> EqualsExpression<O> equals(String property, Object value) {
		return new EqualsExpression<O>(property, value);
	}

	public final static class IntegerExpressions<O> extends PropertyExpressions<O> {

		public IntegerExpressions(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(int value) {
			return PropertyExpressions.equals(property, value);
		}
	}

	public final static class DoubleExpressions<O> extends PropertyExpressions<O> {

		public DoubleExpressions(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(double value) {
			return PropertyExpressions.equals(property, value);
		}
	}

	public final static class LongExpressions<O> extends PropertyExpressions<O> {

		public LongExpressions(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(long value) {
			return PropertyExpressions.equals(property, value);
		}
	}

	public final static class BooleanExpressions<O> extends PropertyExpressions<O> {

		public BooleanExpressions(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(boolean value) {
			return PropertyExpressions.equals(property, value);
		}
	}

	public static class GenericExpressions<O,T> extends PropertyExpressions<O> {
		public GenericExpressions(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(T value) {
			return PropertyExpressions.equals(property, value);
		}
	}

	public static class IntegerObjectExpressions<O> extends GenericExpressions<O,Integer> {

		public IntegerObjectExpressions(String property) {
			super(property);
		}
	}

	public static class BooleanObjectExpressions<O> extends GenericExpressions<O,Boolean> {

		public BooleanObjectExpressions(String property) {
			super(property);
		}
	}

	public static class DoubleObjectExpressions<O> extends GenericExpressions<O,Double> {

		public DoubleObjectExpressions(String property) {
			super(property);
		}
	}

	public static class FloatObjectExpressions<O> extends GenericExpressions<O,Float> {

		public FloatObjectExpressions(String property) {
			super(property);
		}
	}

	public static class StringExpressions<O> extends GenericExpressions<O, String> {

		public StringExpressions(String property) {
			super(property);
		}
	}
}
