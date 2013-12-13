package at.bestsolution.persistence.expr;

import java.util.Collection;

public final class AndExpression<O> extends GroupExpression<O> {

	AndExpression(Collection<Expression<O>> expressions) {
		super(ExpressionType.AND,expressions);
	}

}