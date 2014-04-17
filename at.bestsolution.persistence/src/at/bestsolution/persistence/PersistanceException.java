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
package at.bestsolution.persistence;

public class PersistanceException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public PersistanceException(Throwable cause) {
		super(cause);
	}

	public PersistanceException(String message) {
		super(message);
	}

	public PersistanceException(String message, Throwable cause) {
		super(message, cause);
	}
}
