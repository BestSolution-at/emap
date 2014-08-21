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
package at.bestsolution.persistence.emap;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;

import at.bestsolution.persistence.emap.eMap.EMapping;

public abstract class EMapGeneratorParticipant {
	public enum FileType {
		JAVA_INTERFACE,
		JAVA_IMPL,
		MAPPED_SELECT,
		CUSTOM_SELECT,
		JAVA_TYPEDEF,
		CREATE_DDL,
		DROP_DDL,
		JAVA_SERVICE_COMPONENT
	}
	
	public void generate(Resource resource, IFileSystemAccess fsa) {
		
	}
	
	public CharSequence postProcess(EMapping root, FileType fileType, String databaseType, CharSequence currentSequence) {
		return currentSequence;
	}
	
}
