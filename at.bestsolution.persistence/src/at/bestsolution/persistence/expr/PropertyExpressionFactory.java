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

	public static <O> EqualsExpression<O> equals(String property, Object value) {
		return new EqualsExpression<O>(property, value);
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
	}
}
