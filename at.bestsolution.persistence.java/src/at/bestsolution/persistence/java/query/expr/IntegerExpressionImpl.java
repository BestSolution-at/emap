package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.BooleanExpression;
import at.bestsolution.persistence.expressions.IntegerExpression;

public class IntegerExpressionImpl<C extends Criteria<?>> extends ExpressionImpl<C> implements IntegerExpression<C> {

	public IntegerExpressionImpl(C criteria, String propertyName) {
		super(criteria, propertyName);
	}

	@Override
	public C eq(int value) {
		return _eq(value);
	}

}
