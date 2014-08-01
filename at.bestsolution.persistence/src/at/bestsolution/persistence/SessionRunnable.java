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

public abstract class SessionRunnable<R> implements Function<Session, R> {

	private Session session;
	
	protected Session getSession() {
		return session;
	}
	
	@Override
	public R execute(Session value) {
		this.session = value;
		return run();
	}
	
	protected abstract R run();
}
