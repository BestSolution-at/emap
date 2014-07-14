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

import org.apache.commons.lang.StringUtils;

public class FunctionFactory {
	public static <O> QueryFunction<O, Integer, String> createLpad(int pad) {
		return new LPADFunction<O>(pad);
	}

	static class LPADFunction<O> extends QueryFunction<O, Integer,String> {
		private int padding;

		public LPADFunction(int padding) {
			super(padding);
			this.padding = padding;
		}

		@Override
		public String convert(Integer value) {
			return StringUtils.left(value+"", padding);
		}

		@Override
		public Class<String> getValueType() {
			return String.class;
		}
	}
}
