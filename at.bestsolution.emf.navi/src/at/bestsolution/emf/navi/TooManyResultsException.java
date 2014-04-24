/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis <martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.emf.navi;

@SuppressWarnings("serial")
public class TooManyResultsException extends NaviException {
	public TooManyResultsException() {
	}

	public TooManyResultsException(String arg0) {
		super(arg0);
	}

	public TooManyResultsException(Throwable arg0) {
		super(arg0);
	}

	public TooManyResultsException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
