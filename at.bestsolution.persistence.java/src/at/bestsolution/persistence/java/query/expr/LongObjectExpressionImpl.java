package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.LongObjectExpression;

public class LongObjectExpressionImpl<C extends Criteria<?>> extends GenericExpressionImpl<C, Long> implements LongObjectExpression<C> {

	public LongObjectExpressionImpl(C criteria, String property) {
		super(criteria, property);
	}

}
