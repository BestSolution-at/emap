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
package at.bestsolution.persistence.compat;

import java.sql.Connection;

import at.bestsolution.persistence.Function;

public interface CompatSession {
	public CompatTransaction beginTransaction();
	public <R> R jdbcRun(boolean modify, Function<Connection, R> function);
	
}
