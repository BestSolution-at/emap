/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.expr;

public class PropertyExpressionFactory<O> {
	final String property;

	PropertyExpressionFactory(String property) {
		this.property = property;
	}

	public NullExpression<O> isNotNull() {
		return PropertyExpressionFactory.isNotNull(property);
	}

	public NullExpression<O> isNull() {
		return PropertyExpressionFactory.isNull(property);
	}

	public static <O> EqualsExpression<O> equals(String property, Object value) {
		return EqualsExpression.<O>eq(property, value);
	}

	public static <O> EqualsExpression<O> notEquals(String property, Object value) {
		return EqualsExpression.<O>neq(property, value);
	}

	public static <O> NullExpression<O> isNotNull(String property) {
		return NullExpression.isNotNull(property);
	}

	public static <O> NullExpression<O> isNull(String property) {
		return NullExpression.isNull(property);
	}

	public static <O> InExpression<O> in(String property, Object... values) {
		return new InExpression<O>(property, values);
	}

	public static Object[] toObjectArray(int... values) {
		Integer[] rv = new Integer[values.length];
		for( int i = 0; i < values.length; i++ ) {
			rv[i] = values[i];
		}
		return rv;
	}

	public static Object[] toObjectArray(long... values) {
		Long[] rv = new Long[values.length];
		for( int i = 0; i < values.length; i++ ) {
			rv[i] = values[i];
		}
		return rv;
	}

	public static Object[] toObjectArray(double... values) {
		Double[] rv = new Double[values.length];
		for( int i = 0; i < values.length; i++ ) {
			rv[i] = values[i];
		}
		return rv;
	}

	public static Object[] toObjectArray(float... values) {
		Float[] rv = new Float[values.length];
		for( int i = 0; i < values.length; i++ ) {
			rv[i] = values[i];
		}
		return rv;
	}

	public final static class IntegerExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public IntegerExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(int value) {
			return PropertyExpressionFactory.equals(property, value);
		}

		public InExpression<O> in(int... values) {
			return PropertyExpressionFactory.in(property, toObjectArray(values));
		}
	}

	public final static class DoubleExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public DoubleExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(double value) {
			return PropertyExpressionFactory.equals(property, value);
		}

		public InExpression<O> in(double... values) {
			return PropertyExpressionFactory.in(property, toObjectArray(values));
		}
	}

	public final static class LongExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public LongExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(long value) {
			return PropertyExpressionFactory.equals(property, value);
		}

		public InExpression<O> in(long... values) {
			return PropertyExpressionFactory.in(property, toObjectArray(values));
		}
	}

	public final static class BooleanExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public BooleanExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(boolean value) {
			return PropertyExpressionFactory.equals(property, value);
		}
	}

	public static class GenericExpressionFactory<O,T> extends PropertyExpressionFactory<O> {
		public GenericExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(T value) {
			return PropertyExpressionFactory.equals(property, value);
		}

		public EqualsExpression<O> neq(T value) {
			return PropertyExpressionFactory.notEquals(property, value);
		}

		public InExpression<O> in(T... values) {
			return PropertyExpressionFactory.in(property, values);
		}
	}

	public static class RelationExpressionFactory<O,T,J> extends PropertyExpressionFactory<O> {
		public final J join;

		public RelationExpressionFactory(String property, J join) {
			super(property);
			this.join = join;
		}
	}

	public static class LongObjectExpressionFactory<O> extends GenericExpressionFactory<O,Long> {

		public LongObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class IntegerObjectExpressionFactory<O> extends GenericExpressionFactory<O,Integer> {

		public IntegerObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class BooleanObjectExpressionFactory<O> extends GenericExpressionFactory<O,Boolean> {

		public BooleanObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class DoubleObjectExpressionFactory<O> extends GenericExpressionFactory<O,Double> {

		public DoubleObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class FloatObjectExpressionFactory<O> extends GenericExpressionFactory<O,Float> {

		public FloatObjectExpressionFactory(String property) {
			super(property);
		}
	}

	public static class StringExpressionFactory<O> extends GenericExpressionFactory<O, String> {

		public StringExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> ieq(String value) {
			return EqualsExpression.ieq(property,value);
		}

		public EqualsExpression<O> notIeq(String value) {
			return EqualsExpression.ieq(property,value);
		}

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
		}

		public LikeExpression<O> ilike(String value) {
			return LikeExpression.ilike(property, value);
		}

		public LikeExpression<O> notLike(String value) {
			return LikeExpression.notLike(property, value);
		}

		public LikeExpression<O> notIlike(String value) {
			return LikeExpression.notIlike(property, value);
		}
	}
}
