package at.bestsolution.persistence.expr;

public final class EqualsExpression<O> extends PropertyExpression<O> {

	EqualsExpression(String property, Object data) {
		super(ExpressionType.EQUALS,property, data);
	}
}