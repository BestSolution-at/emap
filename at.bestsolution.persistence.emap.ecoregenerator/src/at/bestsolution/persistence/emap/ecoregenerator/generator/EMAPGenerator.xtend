/* ----------------------------------------------------------------
 * Original File Name:     EMAPGenerator.java
 * Creation Date:          2012-10-08
 * Description:            EMAPGenerator
 * ----------------------------------------------------------------

 * ----------------------------------------------------------------
 * Copyright (c) 2010 BestSolution.at EDV Systemhaus GmbH
 * All Rights Reserved.
 *
 * BestSolution.at MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE
 * SUITABILITY OF THE SOFTWARE , EITHER EXPRESS OR IMPLIED, INCLUDING
 * BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE, OR NON-INFRINGEMENT.
 * BestSolution.at SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY
 * LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS
 * SOFTWARE OR ITS DERIVATIVES.
 *
 * This software must not be used, redistributed or based from in
 * any other than the designated way without prior explicit written
 * permission by BestSolution.at.
 * -----------------------------------------------------------------

 * -----------------------------------------------------------------
 * $HeadURL: $
 * $Revision: $
 * Creator: martin.bluehweis@bestsolution.at
 * Creation Date: 2012-10-08
 *
 * $LastChangedDate: $
 * $LastChangedBy: $
 * ----------------------------------------------------------------
 */
package at.bestsolution.persistence.emap.ecoregenerator.generator

import java.util.HashMap
import org.eclipse.emf.codegen.ecore.genmodel.GenClass
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EReference
import java.util.List
import java.util.ArrayList

import static extension at.bestsolution.persistence.emap.ecoregenerator.generator.EMapHelper.getTableColumnName
import static extension at.bestsolution.persistence.emap.ecoregenerator.generator.EMapHelper.getTableName
import static extension at.bestsolution.persistence.emap.ecoregenerator.generator.EMapHelper.getReferenceQueryCall
import static extension at.bestsolution.persistence.emap.ecoregenerator.generator.EMapHelper.getReferenceQuerySignature
import static extension at.bestsolution.persistence.emap.ecoregenerator.generator.EMapHelper.getFKName

class EMAPGenerator {
	
	def generateAttributes(List<EAttribute> attributes, EClass eClass, List<EReference> references) '''
	«FOR EAttribute a : attributes»
	    «IF "sid".equals(a.name)» 
			primarykey sid 	=> SID
									generatedby {
										"Firebird" seqnext "SEQ_SID_parameter_value",
										"Oracle" seqnext "SEQ_SID_parameter_value",
										"Postgres" seqnext "ID"}«IF attributes.get(attributes.size - 1) != a»,«ENDIF»
	    «ELSE»								
			«a.name»	=> «a.tableColumnName»«IF !references.empty || attributes.get(attributes.size - 1) != a»,«ENDIF»
		«ENDIF»
	«ENDFOR»
	
	«FOR EReference r : references»
	        «r.name»	=> resolve «r.referenceQueryCall»«IF references.get(references.size - 1) != r»,«ENDIF»
	«ENDFOR»
	'''
	
	def generateQueries(EClass eClass, String tblname, List<EReference> references) '''
	«FOR EReference r : references»
	        «r.referenceQuerySignature»(long rSid) {
	        	default «eClass.name» FROM "«tblname»" WHERE "«r.FKName» = ${rSid}" 
	        }«IF references.get(references.size - 1) != r»,«ENDIF»
	«ENDFOR»
	'''
	
	def generate(GenClass genClass, HashMap<EClass, EClassMetaInfo> metaInfo, HashMap<String, TypeDefinition> typeMapping) '''
	«val EClass eClass = genClass.ecoreClass»
	«val boolean makeAbstract = false»
	«var List<EAttribute> attributes = new ArrayList<EAttribute>()»
	«var List<EReference> references = new ArrayList<EReference>()»
	«IF makeAbstract»
		«var nix = attributes.addAll(eClass.EAttributes)»
		«var nixx =references.addAll(eClass.EReferences)»
	«ELSE»
		«var nix = attributes.addAll(eClass.EAllAttributes)»
		«var nixx =references.addAll(eClass.EAllReferences)»
	«ENDIF»
	«val tblname = eClass.tableName» 
package «metaInfo.get(eClass).genNamespace»;

entity «eClass.name»«IF makeAbstract» derived «metaInfo.get(eClass.ESuperTypes.get(0)).genClassName»«ENDIF» {
    etype "«eClass.EPackage.nsURI»"#«metaInfo.get(eClass).genClassName»
    attributes {
		«generateAttributes(attributes, eClass, references)»
	}
    «val queries = metaInfo.get(eClass).queries»
    queries {
      selectAll() {
      	default «eClass.name» FROM "«tblname»"
      },
      single selectById(primarykey long sid) {
      	default «eClass.name» FROM "«tblname»" WHERE "sid = ${sid}"
      }«IF !queries.empty»,«ENDIF»
	  «generateQueries(eClass, tblname, queries)» 
	}

} as «tblname» 
'''
}
