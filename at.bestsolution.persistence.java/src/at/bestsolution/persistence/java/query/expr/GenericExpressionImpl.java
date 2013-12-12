package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.GenericExpression;

public class GenericExpressionImpl<C extends Criteria<?>,O> extends ExpressionImpl<C> implements GenericExpression<C, O> {

	public GenericExpressionImpl(C criteria, String property) {
		super(criteria, property);
	}

	@Override
	public C eq(O value) {
		return _eq(value);
	}
}
