package at.bestsolution.persistence.java.query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import at.bestsolution.persistence.Criteria;

public class DBCriteria<O> implements Criteria<O> {
	// TODO in future add sub expressions!!!
	private final List<SimpleExpression> segments = new ArrayList<SimpleExpression>();
	private final ColumnDelegate columnDelegate;
	private final TypeDelegate typeDelegate;
	private final ListDelegate<O> listDelegate;

	public DBCriteria(ColumnDelegate columnDelegate, TypeDelegate typeDelegate, ListDelegate<O> listDelegate) {
		this.columnDelegate = columnDelegate;
		this.typeDelegate = typeDelegate;
		this.listDelegate = listDelegate;
	}

	public TypeDelegate getTypeDelegate() {
		return typeDelegate;
	}

	public ColumnDelegate getColumnDelegate() {
		return columnDelegate;
	}

	public List<SimpleExpression> getSegments() {
		return segments;
	}

	@Override
	public Criteria<O> eq(String propertyName, Object value) {
		getSegments().add(
				new SimpleExpression.Equals(columnDelegate.get(propertyName),
						getTypeDelegate().get(propertyName, value)));
		return this;
	}

	@Override
	public List<O> list() {
		return listDelegate.list(this);
	}

	public String getCriteria() {
		StringBuilder b = new StringBuilder();
		for (SimpleExpression e : getSegments()) {
			appendCriteria(b, e);
		}
		return b.toString();
	}

	public TypedValue[] getParameters() {
		List<TypedValue> rv = new ArrayList<TypedValue>();
		for (SimpleExpression e : getSegments()) {
			appendValues(rv, e);
		}
		return rv.toArray(new TypedValue[0]);
	}

	protected void appendCriteria(StringBuilder b, SimpleExpression expression) {
		switch (expression.type) {
		case EQUALS:
			b.append(expression.columnName + " = ?" );
			break;
		default:
			break;
		}
	}

	protected void appendValues(List<TypedValue> l, SimpleExpression expression) {
		l.addAll(Arrays.asList(expression.values));
	}
}