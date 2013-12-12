package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.IntegerObjectExpression;

public class IntegerObjectExpressionImpl<C extends Criteria<?>> extends GenericExpressionImpl<C, Integer> implements IntegerObjectExpression<C> {

	public IntegerObjectExpressionImpl(C criteria, String property) {
		super(criteria, property);
	}

}
