package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.BooleanExpression;

public class BooleanExpressionImpl<C extends Criteria<?>> extends ExpressionImpl<C> implements BooleanExpression<C> {

	public BooleanExpressionImpl(C criteria, String propertyName) {
		super(criteria, propertyName);
	}

	@Override
	public C eq(boolean value) {
		return _eq(value);
	}

}
