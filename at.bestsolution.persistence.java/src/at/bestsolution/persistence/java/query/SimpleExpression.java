package at.bestsolution.persistence.java.query;

public abstract class SimpleExpression {
	public final SimpleExpressionType type;
	public final String columnName;
	public final TypedValue[] values;

	public SimpleExpression(SimpleExpressionType type, String columnName,
			TypedValue... values) {
		this.type = type;
		this.columnName = columnName;
		this.values = values;
	}

	public static class Equals extends SimpleExpression {

		public Equals(String columnName, TypedValue value) {
			super(SimpleExpressionType.EQUALS, columnName, value);
		}
	}
}