package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.LongExpression;

public class LongExpressionImpl<C extends Criteria<?>> extends ExpressionImpl<C> implements LongExpression<C> {

	public LongExpressionImpl(C criteria, String propertyName) {
		super(criteria, propertyName);
	}

	@Override
	public C eq(long value) {
		return _eq(value);
	}

}
