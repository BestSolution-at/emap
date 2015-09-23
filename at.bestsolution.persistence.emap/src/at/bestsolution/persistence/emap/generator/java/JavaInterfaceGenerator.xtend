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
import at.bestsolution.persistence.emap.eMap.EModelTypeDef
import org.eclipse.emf.ecore.EEnum
import at.bestsolution.persistence.emap.generator.JavaObjectMapperGenerator

class JavaInterfaceGenerator {
	@Inject extension
  	var UtilCollection util;

  	@Inject
	var JavaObjectMapperGenerator javaObjectMapperGenerator;

	@Inject
	var CustomSQLQueryGenerator customSQLQueryGenerator;

	def generateJavaMapper(EMappingEntityDef entityDef, EClass eClass) '''
	package «entityDef.package.name»;

	import «eClass.instanceClassName»;

	public interface «entityDef.entity.name»Mapper extends «IF entityDef.entity.namedQueries.findFirst[name == "selectAll" && parameters.empty] != null»at.bestsolution.persistence.ConcreteObjectMapper<«eClass.instanceClassName»,at.bestsolution.persistence.MappedQuery<«eClass.name»>>«ELSE»at.bestsolution.persistence.ObjectMapper<«eClass.instanceClassName»>«ENDIF» {
		«FOR query : entityDef.entity.namedQueries»
		/**
		 * Find elements managed Domain-Elements with a query like this:
		 * <pre>
		 «FOR l : javaObjectMapperGenerator.generateSQL(query,query.queries.head,true).toString.split(System.getProperty("line.separator"))»
		 * «l»
		 «ENDFOR»
		 * </pre>
		 * «FOR p : query.parameters»
		 * @param «p.name»
		 * «ENDFOR»
		 */
		public «IF query.returnType == ReturnType::LIST»java.util.List<«ENDIF»«eClass.instanceClassName»«IF query.returnType == ReturnType::LIST»>«ENDIF» «query.name»(«query.parameters.join(", ",[p|p.parameterType + " " + p.name])»);
		«ENDFOR»

		«FOR q : entityDef.entity.namedCustomQueries»
		/**
		 * Find <b>unmanaged</b> elements with a query like this:
		 * <pre>
		 «FOR l : customSQLQueryGenerator.generate(q,q.queries.head,true).toString.split(System.getProperty("line.separator"))»
		 * «l»
		 «ENDFOR»
		 * </pre>
		 * «FOR p : q.parameters»
		 * @param «p.name»
		 * «ENDFOR»
		 */
		public «IF q.list»java.util.List<«q.returnType.handle.toObjectType»>«ELSE»«q.returnType.handle»«ENDIF» «q.name»(«q.parameters.join(",",[p|p.type + " " + p.name])»);

		«ENDFOR»

«««		«IF entityDef.entity.namedQueries.findFirst[parameters.empty] != null»
«««			public abstract class «eClass.name»MappedQuery implements at.bestsolution.persistence.MappedQuery<«eClass.name»> {
«««				public abstract «eClass.name»MappedQuery where(at.bestsolution.persistence.expr.Expression<«eClass.name»> expression);
«««			}
			«val pk = entityDef.entity.PKAttribute»
			/**
			 * Build dynamic query filters
			 */
			public static final class Expression {
				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return eClass.getEStructuralFeature(t1.name).equals(eClass.getEStructuralFeature(t2.name))]»
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
						/**
						 * Join with «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.name»
						 */
						public static final «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<«eClass.name»> «a.name.javaReservedNameEscape»() { return new «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<«eClass.name»>("«a.name»");};
						public static final «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»(); }
						«IF a.opposite == null && a.isSingle(eClass) && (pk == null || pk.parameters.head != a.parameters.head)»
						/**
						 * Join directly on the fk avoiding unneeded joins
						 */
						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»_fk() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»>("«a.name»"); };
						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»_fk() { return «a.name.javaReservedNameEscape»_fk(); };

						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»> «a.name.javaReservedNameEscape»_obj() {
							return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»>(«a.name.javaReservedNameEscape»().«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.PKAttribute.name»().getProperty()) {
								protected long getSid(«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName» value) {
									return value.get«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.PKAttribute.name.toFirstUpper»();
								}
							};
						}
						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»_obj() {
							return «a.name.javaReservedNameEscape»_obj();
						}
						«ELSE»
«««						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»_sid() { return «a.name.javaReservedNameEscape»().«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.PKAttribute.name»(); };
						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»> «a.name.javaReservedNameEscape»_obj() {
							return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»>(«a.name.javaReservedNameEscape»().«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.PKAttribute.name»().getProperty()) {
								protected long getSid(«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName» value) {
									return value.get«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.PKAttribute.name.toFirstUpper»();
								}
							};
						}

						public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»_obj() {
							return «a.name.javaReservedNameEscape»_obj();
						}
						«ENDIF»
					«ELSE»
						«val eAttribute = a.getEAttribute(eClass)»
«««						// «a»
						/**
						 * Filter on «a.name»
						 */
						«IF eAttribute.boolean»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ENDIF»
						«ELSEIF eAttribute.integer»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<«eClass.name»>("«a.name»");};
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ENDIF»
						«ELSEIF eAttribute.long»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ENDIF»
						«ELSEIF eAttribute.double»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ENDIF»
						«ELSEIF eAttribute.float»
							«IF eAttribute.primitive»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ELSE»
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<«eClass.name»>("«a.name»");}
								public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
							«ENDIF»
						«ELSEIF eAttribute.string»
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<«eClass.name»>("«a.name»");}
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
						«ELSEIF eAttribute.EType.instanceClassName == "java.util.Date"»
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DateExpressionFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DateExpressionFactory<«eClass.name»>("«a.name»");}
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.DateExpressionFactory<«eClass.name»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
						«ELSEIF typeof(EEnum).isAssignableFrom(eAttribute.EType.class)»
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EnumExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.EnumExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»>("«a.name»");}
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.EnumExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
						«ELSE»
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»>("«a.name»");}
							public static final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»> «entityDef.entity.name»_«a.name.javaReservedNameEscape»() { return «a.name.javaReservedNameEscape»();}
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			}

			/**
			 * Do not create instances of this class but use {@link «entityDef.entity.name»Mapper#metaData()}
			 */
			public static class MetaData {
				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return eClass.getEStructuralFeature(t1.name).equals(eClass.getEStructuralFeature(t2.name))]»
					«IF a.resolved»
						«val eAttribute = a.getEStructuralFeature(eClass)»
						public at.bestsolution.persistence.ReferenceMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.EntityExpressionFactory<«eClass.name»,«((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.lookupEClass.instanceClassName»>> «a.name»() {
							return new at.bestsolution.persistence.ReferenceMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»_obj());
						}
					«ELSE»
						«val eAttribute = a.getEAttribute(eClass)»
						«IF eAttribute.boolean»
							«IF eAttribute.primitive»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName.toObjectType»,at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ELSE»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ENDIF»
						«ELSEIF eAttribute.integer»
							«IF eAttribute.primitive»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName.toObjectType»,at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ELSE»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ENDIF»
						«ELSEIF eAttribute.long»
							«IF eAttribute.primitive»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName.toObjectType»,at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ELSE»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ENDIF»
						«ELSEIF eAttribute.double»
							«IF eAttribute.primitive»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName.toObjectType»,at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ELSE»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ENDIF»
						«ELSEIF eAttribute.float»
							«IF eAttribute.primitive»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName.toObjectType»,at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ELSE»
								public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<«eClass.name»>> «a.name»() {
									return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
								}
							«ENDIF»
						«ELSEIF eAttribute.string»
							public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<«eClass.name»>> «a.name»() {
								return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
							}
						«ELSEIF eAttribute.EType.instanceClassName == "java.util.Date"»
							public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.DateExpressionFactory<«eClass.name»>> «a.name»() {
								return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
							}
						«ELSEIF typeof(EEnum).isAssignableFrom(eAttribute.EType.class)»
							public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.EnumExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»>> «a.name»() {
								return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
							}
						«ELSE»
							public at.bestsolution.persistence.AttributeMetaData<«eClass.name»,«eAttribute.EType.instanceClassName»,at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<«eClass.name»,«eAttribute.EType.instanceClassName»>> «a.name»() {
								return new at.bestsolution.persistence.AttributeMetaData<>(«eClass.name».class,«eAttribute.EType.instanceClassName».class,Expression.«a.name»(),Order.«a.name»());
							}
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			}

			public MetaData metaData();

			/**
			 * Build dynamic query order by
			 */
			public static final class Order {
				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return t1.getEAttribute(eClass).equals(t2.getEAttribute(eClass))].filter[isSingle(eClass)]»
					/**
					 * Order by for «a.name»
					 */
					«IF ! a.resolved»
					public static final at.bestsolution.persistence.order.OrderColumnFactory<«eClass.name»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.order.OrderColumnFactory<«eClass.name»>("«a.name»");};
					«ENDIF»
				«ENDFOR»
			}

			/**
			 * Build join expressions
			 */
			public static final class Join<O> {
				private final String path;
				public Join(String path) {
					this.path = path;
				}

				«FOR a : entityDef.entity.collectAllAttributes.filterDups[t1,t2|return eClass.getEStructuralFeature(t1.name).equals(eClass.getEStructuralFeature(t2.name))]»
					«IF a.resolved»
						/**
						 * Join with «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).entity.name»
						 */
						public final «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<O> «a.name.javaReservedNameEscape»() {return new «((a.query.eResource.contents.head as EMapping).root as EMappingEntityDef).fqn».Join<O>(path+".«a.name»");};
					«ELSE»
						«val eAttribute = a.getEAttribute(eClass)»
						/**
						 * Filter on «a.name»
						 */
						«IF eAttribute.boolean»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.BooleanObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.integer»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.IntegerObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.long»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.LongObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.double»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DoubleObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.float»
							«IF eAttribute.primitive»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatExpressionFactory<O>(path+".«a.name»");};
							«ELSE»
								public final at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.FloatObjectExpressionFactory<O>(path+".«a.name»");};
							«ENDIF»
						«ELSEIF eAttribute.string»
							public final at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.StringExpressionFactory<O>(path+".«a.name»");};
						«ELSEIF eAttribute.EType.instanceClassName == "java.util.Date"»
							public final at.bestsolution.persistence.expr.PropertyExpressionFactory.DateExpressionFactory<O> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.DateExpressionFactory<O>(path+".«a.name»");};
						«ELSE»
							public final at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,«eAttribute.EType.instanceClassName»> «a.name.javaReservedNameEscape»() { return new at.bestsolution.persistence.expr.PropertyExpressionFactory.GenericExpressionFactory<O,«eAttribute.EType.instanceClassName»>(path+".«a.name»");};
						«ENDIF»
					«ENDIF»
				«ENDFOR»
			}
			«FOR query : entityDef.entity.namedQueries.filter[parameters.empty]»
				/**
				 * Build a query elements for <b>managed</b> Domain-Elements from a base query like this:
				 * <pre>
				 «FOR l : javaObjectMapperGenerator.generateSQL(query,query.queries.head,true).toString.split(System.getProperty("line.separator"))»
				 * «l»
				 «ENDFOR»
				 * </pre>
				 */
				public at.bestsolution.persistence.MappedQuery<«eClass.name»> «query.name»MappedQuery();
			«ENDFOR»
			«FOR q : entityDef.entity.namedCustomQueries.filter[parameters.empty && list /*&& returnType instanceof EModelTypeDef*/]»
				/**
				 * Build a query for <b>unmanaged</b> elements from a base query like this:
				 * <pre>
				 «FOR l : customSQLQueryGenerator.generate(q,q.queries.head,true).toString.split(System.getProperty("line.separator"))»
				 * «l»
				 «ENDFOR»
				 * </pre>
				 */
				public at.bestsolution.persistence.MappedQuery<«q.returnType.handle.toObjectType»> «q.name»MappedQuery();
			«ENDFOR»
			/**
			 * Build a delete query
			 */
			public at.bestsolution.persistence.MappedUpdateQuery<«eClass.name»> deleteAllMappedQuery();

«««		«ENDIF»
	}
	'''
}