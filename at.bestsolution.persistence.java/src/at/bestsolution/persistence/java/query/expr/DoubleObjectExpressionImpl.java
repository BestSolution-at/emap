package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.DoubleObjectExpression;

public class DoubleObjectExpressionImpl<C extends Criteria<?>> extends GenericExpressionImpl<C, Double> implements DoubleObjectExpression<C> {

	public DoubleObjectExpressionImpl(C criteria, String property) {
		super(criteria, property);
	}

}
