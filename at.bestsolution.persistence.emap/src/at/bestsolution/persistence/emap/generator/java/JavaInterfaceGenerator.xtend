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
package at.bestsolution.persistence.emap.generator.java

import com.google.inject.Inject
import at.bestsolution.persistence.emap.generator.UtilCollection
import at.bestsolution.persistence.emap.eMap.EMappingEntityDef
import org.eclipse.emf.ecore.EClass
import at.bestsolution.persistence.emap.eMap.ReturnType
import at.bestsolution.persistence.emap.eMap.EMapping
import static extension at.bestsolution.persistence.emap.generator.java.CustomQueryGenerator.*

class JavaInterfaceGenerator {
	@Inject extension
  	var UtilCollection util;

	def generateJavaMapper(EMappingEntityDef entityDef, EClass eClass) '''
	package «entityDef.package.name»;

	import «eClass.instanceClassName»;

	public interface «entityDef.entity.name»Mapper extends «IF entityDef.entity.namedQueries.findFirst[name == "selectAll" && parameters.empty] != null»at.bestsolution.persistence.ConcreteObjectMapper<«eClass.instanceClassName»,«entityDef.entity.name»Mapper.«eClass.name»MappedQuery>«ELSE»at.bestsolution.persistence.ObjectMapper<«eClass.instanceClassName»>«ENDIF» {
		«FOR query : entityDef.entity.namedQueries»
		public «IF query.returnType == ReturnType::LIST»java.util.List<«ENDIF»«eClass.instanceClassName»«IF query.returnType == ReturnType::LIST»>«ENDIF» «query.name»(«query.parameters.join(",",[p|p.type + " " + p.name])»);
		«ENDFOR»

		«FOR q : entityDef.entity.namedCustomQueries»
		public «IF q.list»java.util.List<«q.returnType.handle.toObjectType»>«ELSE»«q.returnType.handle»«ENDIF» «q.name»(«q.parameters.join(",",[p|p.type + " " + p.name])»);
		«ENDFOR»

«««		«IF entityDef.entity.namedQueries.findFirst[parameters.empty] != null»
			public abstract class «eClass.name»MappedQuery implements at.bestsolution.persistence.MappedQuery<«eClass.name»> {
				public abstract «eClass.name»MappedQuery where(at.bestsolution.persistence.expr.Expression<«eClass.name»> expression);
			}

			public static final class Expression {
				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return eClass.getEStructuralFeature(t1.name).equals(eClass.getEStructuralFeature(t2.name))].filter[isSingle(eClass)]»
«««				«val temp = entityDef.entity.collectAllAttributes»
«««				«val temp2 = temp.filterDups[t1,t2|
«««					val a1 = eClass.getEStructuralFeature(t1.name)
«««					val a2 =  eClass.getEStructuralFeature(t2.name)
«««//					if( t1.name == "sid" || t2.name == "sid" ) {
«««//						println("T1 " + t1.columnName + " => " + a1)
«««//						println("T2 " + t2.columnName + " => " + a2)
«««//					}
«««					return a1.equals(a2)
«««				]»
«««				«println(temp2.map[name])»
«««				«val temp3 = temp2.filter[isSingle(eClass)]»
«««				«println(temp3.map[name])»
«««				«FOR a : temp3»
«««					«println(a)»
					«IF a.resolved»
						public static final «((a.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<«eClass.name»> «a.name»() { return new «((a.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<«eClass.name»>("«a.name»");};
					«ELSE»
						«val eAttribute = a.getEAttribute(eClass)»
«««						// «a»
						«IF eAttribute.boolean»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<«eClass.name»>("«a.name»");};
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<«eClass.name»>("«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.integer»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<«eClass.name»>("«a.name»");};
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<«eClass.name»>("«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.long»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»>("«a.name»");};
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<«eClass.name»>("«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.double»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<«eClass.name»>("«a.name»");};
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<«eClass.name»>("«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.float»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<«eClass.name»>("«a.name»");};
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<«eClass.name»>("«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.string»
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<«eClass.name»>("«a.name»");};
						«ELSE»
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»>("«a.name»");};
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			}

			public static final class Order {
				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return t1.getEAttribute(eClass).equals(t2.getEAttribute(eClass))].filter[isSingle(eClass)]»
					«IF ! a.resolved»
					public static final at.bestsolution.persistence.order.OrderColumnFactory<«eClass.name»> «a.name»() { return new at.bestsolution.persistence.order.OrderColumnFactory<«eClass.name»>("«a.name»");};
					«ENDIF»
				«ENDFOR»
			}

			public static final class Join<O> {
				private final String path;
				public Join(String path) {
					this.path = path;
				}

				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return t1.getEAttribute(eClass).equals(t2.getEAttribute(eClass))].filter[isSingle(eClass)]»
					«IF a.resolved»
«««						public final «((a.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<O> «a.name»() {return new «((a.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<O>(path+".«a.name»");};
					«ELSE»
						«val eAttribute = a.getEAttribute(eClass)»
						«IF eAttribute.boolean»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.integer»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.long»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.double»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.float»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.string»
							public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".«a.name»");};
						«ELSE»
							public final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,«eAttribute.EType.instanceClassName»> «a.name»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,«eAttribute.EType.instanceClassName»>(path+".«a.name»");};
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			}
			«FOR query : entityDef.entity.namedQueries.filter[parameters.empty]»
				public «eClass.name»MappedQuery «query.name»MappedQuery();
			«ENDFOR»
«««		«ENDIF»
	}
	'''
}