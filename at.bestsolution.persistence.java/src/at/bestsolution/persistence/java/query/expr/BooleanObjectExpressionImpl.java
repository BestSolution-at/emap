package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.BooleanObjectExpression;

public class BooleanObjectExpressionImpl<C extends Criteria<?>> extends GenericExpressionImpl<C, Boolean> implements BooleanObjectExpression<C> {

	public BooleanObjectExpressionImpl(C criteria, String property) {
		super(criteria, property);
	}

}
