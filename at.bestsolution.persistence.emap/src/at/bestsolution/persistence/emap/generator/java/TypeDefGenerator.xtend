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
package at.bestsolution.persistence.emap.generator.java

import at.bestsolution.persistence.emap.eMap.ETypeDef
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef

class TypeDefGenerator {
	def generate(EMappingEntityDef entDef, ETypeDef typeDef) '''
	package «entDef.package.name»;
	
	public final class «typeDef.name» {
		«FOR t : typeDef.types»
		public final «t.type» «t.name»;
		«ENDFOR»
		public «typeDef.name»(«typeDef.types.join(',',[type + " " + name])») {
			«FOR t : typeDef.types»
			this.«t.name» = «t.name»;
			«ENDFOR»
		}
	}
	'''	
}