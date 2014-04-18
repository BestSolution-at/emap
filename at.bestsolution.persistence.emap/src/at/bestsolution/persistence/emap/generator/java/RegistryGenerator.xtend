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

import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.EMappingBundle
import at.bestsolution.persistence.emap.eMap.EMappingEntity

class RegistryGenerator {
	@Inject extension
  	var UtilCollection util;

  	def generateMapperRegistry(EMappingBundle bundleDef) '''
  package mappings;

  import at.bestsolution.persistence.java.ObjectMapperFactoriesProvider;
  import at.bestsolution.persistence.ObjectMapper;
  import at.bestsolution.persistence.java.ObjectMapperFactory;
  import java.util.HashMap;
  import java.util.Map;

  public final class «bundleDef.name»ObjectMapperFactoriesProvider implements ObjectMapperFactoriesProvider {
    private Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> factories = new HashMap<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>>();
    public «bundleDef.name»ObjectMapperFactoriesProvider() {
      «FOR e : bundleDef.entities»
        factories.put(«e.fqn».class, new «e.mapperFactoryName»());
      «ENDFOR»
    }

    public Map<Class<? extends ObjectMapper<?>>, ObjectMapperFactory<?,?>> getMapperFactories() {
      return factories;
    }
  }
  '''

	def mapperFactoryName(EMappingEntity e) {
		val factoryInterface = e.fqn
    	return factoryInterface.substring(0,factoryInterface.lastIndexOf('.')) + ".java"+factoryInterface.substring(factoryInterface.lastIndexOf('.'))+"Factory"
	}

}