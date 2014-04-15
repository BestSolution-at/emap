package at.bestsolution.persistence.expr;

public class InExpression<O> extends PropertyExpression<O> {

	InExpression(String property, Object... data) {
		super(ExpressionType.IN, property, data);
	}
}
