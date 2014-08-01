/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christoph Caks <christoph.caks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence;

public class Result<R, E extends Throwable> {
	private final R result;
	private final E exception;
	
	protected Result(R result) {
		this.result = result;
		this.exception = null;
	}
	
	protected Result(E exception) {
		this.result = null;
		this.exception = exception;
	}
	
	public R get() throws E  {
		if (exception != null) {
			throw exception;
		}
		else {
			return result;
		}
	}
	
	public static <R, E extends Exception> Result<R, E> result(R result) {
		return new Result<R, E>(result);
	}
	
	public static <R, E extends Exception> Result<R, E> exception(E ex) {
		return new Result<R, E>(ex);
	}
}
