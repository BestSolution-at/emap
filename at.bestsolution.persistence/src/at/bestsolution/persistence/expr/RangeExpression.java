/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     tom <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.expr;

import java.util.ArrayList;
import java.util.List;

public class RangeExpression<O> extends PropertyExpression<O> {

	private RangeExpression(ExpressionType type, String property, Object[] data) {
		super(type, property, data);
	}

	public static <O> RangeExpression<O> range(String property, Range[] ranges) {
		return new RangeExpression<O>(ExpressionType.RANGE, property, ranges);
	}

	public static <O> RangeExpression<O> range(String property, String rangeString) {
		return new RangeExpression<O>(ExpressionType.RANGE, property, parseRanges(rangeString));
	}

	private static Range[] parseRanges(String rangeString) {
		List<Range> r = new ArrayList<RangeExpression.Range>();
		for( String rangeSegment : rangeString.split(",") ) {
			if( rangeSegment.contains("-") ) {
				String[] parts = rangeSegment.split("-");
				if( parts.length != 2 ) {
					throw new IllegalArgumentException("Invalid range definition: '"+rangeSegment+"' in '"+rangeString+"'");
				} else if( parts[0].trim().length() == 0 || parts[1].trim().length() == 0 ) {
					throw new IllegalArgumentException("Invalid range definition: '"+rangeSegment+"' in '"+rangeString+"'");
				}

				r.add(new Range(parts[0], parts[1]));
			} else {
				r.add(new Range(rangeSegment, rangeSegment));
			}
		}

		return r.toArray(new Range[0]);
	}

	public static class Range {
		public final String min;
		public final String max;

		public Range(String min, String max) {
			this.min = min;
			this.max = max;
		}
	}
}
