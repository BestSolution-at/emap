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
import at.bestsolution.persistence.emap.eMap.EValueTypeAttribute
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.core.runtime.CoreException
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.runtime.Platform
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import java.nio.file.Path

class TypeDefGenerator {
	
	def computeExpressionFactory(Resource resource, EValueTypeAttribute t, String typeName) {
		var factoryName = ""
		
		switch (t.type) {
			case "long": factoryName = "Long"
			case "int": factoryName = "Integer"
			case "bool": factoryName = "Boolean"
			case "float": factoryName = "Float"
			case "double": factoryName = "Double"
			case "String": factoryName = "String"
			default: {
				try {
					// we use jdt to test if we have an enum type
					val workspace = ResourcesPlugin.getWorkspace
					val root = workspace.getRoot
					
					val eProject = root.getFile(new org.eclipse.core.runtime.Path(resource.URI.toPlatformString(true))).project
					val jProject = JavaCore.create(eProject);
					
					val jType = jProject.findType(t.type);
					
					if (jType.enum) {
						// this is a enum
						factoryName =  "Enum"
					}
					
				} catch (Exception e) {
					println(e.getMessage());
				}
			}
		}
		
		var factory = ""
		if (factoryName != "") {
			factory = "at.bestsolution.persistence.expr.PropertyExpressionFactory." + factoryName + "ExpressionFactory";
			
			if (factoryName == "Enum") {
				factory += "<" + typeName + ", " + t.type + ">"
			}
			else {
				factory += "<" + typeName + ">"
			}
			
			return factory
		}	
		
		
		return null
	}
	
	
	
//	def getNameWithAlias(EValueTypeAttribute attr, ETypeDef typeDef, ECustomQuery query) {
//		return query.columns.split(",").get(typeDef.types.indexOf(attr))
//	}
	
	def generate(Resource resource, EMappingEntityDef entDef, ETypeDef typeDef) '''
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
		
		public final static class Expression {
			«FOR t : typeDef.types»
				«var expFac = computeExpressionFactory(resource, t, typeDef.name)»
				«IF expFac != null»
					public final static «expFac» «t.name»() {return new «expFac»("@«t.name»");}
				«ENDIF»
			«ENDFOR»
		}
		
		public final static class Order {
			«FOR t : typeDef.types»
				«var factoryType = "at.bestsolution.persistence.order.OrderColumnFactory<" + typeDef.name + ">"»
				public final static «factoryType» «t.name»() {return new «factoryType»("@«t.name»");}
			«ENDFOR»
		}
	}
	'''	
}