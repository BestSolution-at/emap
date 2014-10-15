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

import java.sql.Blob;
import java.util.concurrent.Future;

public interface SessionFactory {
	public String getFactoryId();
	
	public Session createSession();
	public Session createSession(String configurationId);
	
	public Future<Session> createFutureSession(Class<ObjectMapper<?>>... dependentMappers);
//	public Future<Session> createFutureSession(String configuration, Class<ObjectMapper<?>>... mappers);
	
	public <M extends ObjectMapper<?>> boolean isMapperAvailable(Class<M> mapper);
	public Blob createBlob();
	
	public <R> R runWithSession(SessionRunnable<R> runnable);
	public Registration registerPersistParticipant(PersistParticipant participant);
}
