/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ccaks <christoph.caks@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.emf.navi;

@SuppressWarnings("serial")
public class PathNotTraversableException extends NaviException {

	/**
	 * 
	 */
	public PathNotTraversableException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public PathNotTraversableException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public PathNotTraversableException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public PathNotTraversableException(Throwable cause) {
		super(cause);
	}

}
