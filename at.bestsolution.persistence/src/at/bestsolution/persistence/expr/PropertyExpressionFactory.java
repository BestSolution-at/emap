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

import java.util.Date;

import at.bestsolution.persistence.LongFunction;

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
		return new InExpression<O>(ExpressionType.IN, property, values);
	}

	public static <O> InExpression<O> notIn(String property, Object... values) {
		return new InExpression<O>(ExpressionType.NOT_IN, property, values);
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

	public abstract static class EntityExpressionFactory<O> extends PropertyExpressionFactory<O> {
		public EntityExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(O value) {
			return PropertyExpressionFactory.equals(property, getSid(value));
		}

		public InExpression<O> in(O... values) {
			return PropertyExpressionFactory.in(property, toObjectArray(values));
		}

		public CompareExpression<O> gt(O data) {
			return CompareExpression.gt(property, getSid(data));
		}

		public CompareExpression<O> gte(O data) {
			return CompareExpression.gte(property, getSid(data));
		}

		public CompareExpression<O> lt(O data) {
			return CompareExpression.lt(property, getSid(data));
		}

		public CompareExpression<O> lte(O data) {
			return CompareExpression.lte(property, getSid(data));
		}

		private Object[] toObjectArray(O...values ) {
			Long[] rv = new Long[values.length];
			for( int i = 0; i < values.length; i++ ) {
				rv[i] = getSid(values[i]);
			}
			return rv;
		}

		protected abstract long getSid(O value);
	}

	public final static class IntegerExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public IntegerExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(int value) {
			return PropertyExpressionFactory.equals(property, value);
		}

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
		}

		public InExpression<O> in(int... values) {
			return PropertyExpressionFactory.in(property, toObjectArray(values));
		}

		public CompareExpression<O> gt(int data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(int data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(int data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(int data) {
			return CompareExpression.lte(property, data);
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

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
		}

		public CompareExpression<O> gt(double data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(double data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(double data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(double data) {
			return CompareExpression.lte(property, data);
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

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
		}

		public CompareExpression<O> gt(long data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(long data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(long data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(long data) {
			return CompareExpression.lte(property, data);
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

	public final static class FloatExpressionFactory<O> extends PropertyExpressionFactory<O> {

		public FloatExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(float value) {
			return PropertyExpressionFactory.equals(property, value);
		}

		public InExpression<O> in(float... values) {
			return PropertyExpressionFactory.in(property, toObjectArray(values));
		}

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
		}

		public CompareExpression<O> gt(float data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(float data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(float data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(float data) {
			return CompareExpression.lte(property, data);
		}
	}

	public static class EnumExpressionFactory<O,T extends Enum<T>> extends PropertyExpressionFactory<O> {
		public EnumExpressionFactory(String property) {
			super(property);
		}

		public EqualsExpression<O> eq(T value) {
			return StringExpressionFactory.equals(property, value.name());
		}

		public EqualsExpression<O> neq(T value) {
			return StringExpressionFactory.notEquals(property, value.name());
		}

		public InExpression<O> in(T... values) {
			final String[] strVals = new String[values.length];
			for (int i = 0; i < values.length; i++) {
				strVals[i] = values[i].toString();
			}
			return StringExpressionFactory.in(property, strVals);
		}

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
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

		public LikeExpression<O> like(String value) {
			return LikeExpression.like(property, value);
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

		public CompareExpression<O> gt(Long data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(Long data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(Long data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(Long data) {
			return CompareExpression.lte(property, data);
		}
	}

	public static class IntegerObjectExpressionFactory<O> extends GenericExpressionFactory<O,Integer> {

		public IntegerObjectExpressionFactory(String property) {
			super(property);
		}

		public CompareExpression<O> gt(Integer data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(Integer data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(Integer data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(Integer data) {
			return CompareExpression.lte(property, data);
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

		public CompareExpression<O> gt(Double data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(Double data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(Double data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(Double data) {
			return CompareExpression.lte(property, data);
		}
	}

	public static class FloatObjectExpressionFactory<O> extends GenericExpressionFactory<O,Float> {

		public FloatObjectExpressionFactory(String property) {
			super(property);
		}

		public CompareExpression<O> gt(Float data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(Float data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(Float data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(Float data) {
			return CompareExpression.lte(property, data);
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
			return EqualsExpression.ineq(property,value);
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

		public CompareExpression<O> gt(String data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(String data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(String data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(String data) {
			return CompareExpression.lte(property, data);
		}
	}

	public static class DateExpressionFactory<O> extends GenericExpressionFactory<O,Date> {

		public DateExpressionFactory(String property) {
			super(property);
		}

		public CompareExpression<O> gt(Date data) {
			return CompareExpression.gt(property, data);
		}

		public CompareExpression<O> gte(Date data) {
			return CompareExpression.gte(property, data);
		}

		public CompareExpression<O> lt(Date data) {
			return CompareExpression.lt(property, data);
		}

		public CompareExpression<O> lte(Date data) {
			return CompareExpression.lte(property, data);
		}
	}
}
