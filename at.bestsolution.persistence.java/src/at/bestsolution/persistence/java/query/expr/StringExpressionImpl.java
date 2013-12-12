package at.bestsolution.persistence.java.query.expr;

import at.bestsolution.persistence.Criteria;
import at.bestsolution.persistence.expressions.StringExpression;

public class StringExpressionImpl<C extends Criteria<?>> extends GenericExpressionImpl<C, String> implements StringExpression<C> {

	public StringExpressionImpl(C criteria, String property) {
		super(criteria, property);
	}
}