package at.bestsolution.persistence.expr;

import java.util.Collection;

public class OrExpresion<O> extends GroupExpression<O> {

	OrExpresion(Collection<Expression<O>> expressions) {
		super(ExpressionType.OR, expressions);
	}
}
