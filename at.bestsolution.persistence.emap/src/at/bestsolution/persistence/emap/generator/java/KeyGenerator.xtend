/*******************************************************************************
 * Copyright (c) 2016 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ccaks <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.generator.java

import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import at.bestsolution.persistence.emap.generator.UtilCollection
import com.google.inject.Inject
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.EAttribute
import at.bestsolution.persistence.emap.eMap.EMappingEntity

class KeyGenerator {
	@Inject extension
  	var UtilCollection util;
	
	val generatorCredit = '''by «class.simpleName»'''
	
	def generatePrimaryKeyLayout(EMappingEntityDef entityDef, EClass eClass) '''
	// «generatorCredit»
	final static at.bestsolution.persistence.java.KeyLayout<«entityDef.entity.name»Mapper.Key> PKLayout = new at.bestsolution.persistence.java.KeyLayout<«entityDef.entity.name»Mapper.Key>(«
		entityDef.findPKAttributes.join(", ", [a|
			"\n\t" +
			'''new at.bestsolution.persistence.java.KeyLayout.KeyLayoutEntry("«a.name»", "«a.columnName»", «a.getEAttribute(eClass).EType.instanceClassName».class)'''
		])») {
		@Override
		public «entityDef.entity.name»Mapper.Key create(Map<String, Object> values) {
			return new KeyImpl(values);
		}
	};
	'''
	
	def getFKName(EAttribute reference) '''FK«reference.name.toFirstUpper»'''
	def getFKLayoutName(EAttribute reference) '''«reference.getFKName»Layout'''
	
	def generateForeignKeyLayout(EMappingEntityDef entityDef, EClass eClass, EAttribute reference) '''
	«val oppositeEntity = reference.query.eContainer as EMappingEntity»
	«val oppositeEClass = reference.getEAttribute(eClass).eContainer as EClass»
	«val keyType = '''«oppositeEntity.fqn».Key'''»
	// «generatorCredit»
	final static at.bestsolution.persistence.java.KeyLayout<«keyType»> «reference.getFKLayoutName» = new at.bestsolution.persistence.java.KeyLayout<«keyType»>(«
		oppositeEntity.findPKAttributes.join(", ", [a|
			// TODO insert fk column names here!
			// TODO this is not multi primarykey compatible yet
			"\n\t" +
			'''new at.bestsolution.persistence.java.KeyLayout.KeyLayoutEntry("«a.name»", "«reference.parameters.head»", «a.getEAttribute(oppositeEClass).EType.instanceClassName».class)
			'''
		])») {
		@Override
		public «keyType» create(Map<String, Object> values) {
			// delegate to PKLayout of opposite
			return «oppositeEntity.fqn».PKLayout.create(values);
		}
	};
	'''
	
	def generateKeyImpl(EMappingEntityDef entityDef, EClass eClass) '''
	// «generatorCredit»
	final static class KeyImpl extends at.bestsolution.persistence.java.AMapBasedKey<«eClass.name»> implements «entityDef.entity.name»Mapper.Key {
		KeyImpl(Map<String, Object> values) {
			super(«eClass.name».class, values);
		}
		
		@Override
		public at.bestsolution.persistence.java.KeyLayout<«entityDef.entity.name»Mapper.Key> getKeyLayout() {
			// TODO think about me some more!
			return PKLayout;
		}
		
		«FOR pk : entityDef.findPKAttributes»
		@Override
		public «pk.getEAttribute(eClass).EType.instanceClassName» «pk.name»() {
			return getValue("«pk.name»");
		}
		
		«ENDFOR»
		
		@Override
		public String toString() {
			return "Key(«entityDef.entity.name», " + super.toString() + ")";
		}
	}
	'''
	
}