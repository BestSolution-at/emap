package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.DoubleExpression;

public class DoubleExpressionImpl<C extends Criteria<?>> extends ExpressionImpl<C> implements DoubleExpression<C> {

	public DoubleExpressionImpl(C criteria, String propertyName) {
		super(criteria, propertyName);
	}

	@Override
	public C eq(double value) {
		return _eq(value);
	}

}
