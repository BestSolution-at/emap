package at.bestsolution.persistence;

import java.util.List;

import at.bestsolution.persistence.expr.Expression;

public interface MappedQuery<O> {
	public List<O> list();
	public O unique();
	public MappedQuery<O> where(Expression<O> expression);
}
