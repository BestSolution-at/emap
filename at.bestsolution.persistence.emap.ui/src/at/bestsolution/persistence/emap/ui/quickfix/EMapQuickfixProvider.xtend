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
package at.bestsolution.persistence.emap.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import at.bestsolution.persistence.emap.validation.EMapValidator
import at.bestsolution.persistence.emap.eMap.EMappingEntity
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import at.bestsolution.persistence.emap.eMap.EMapPackage
import at.bestsolution.persistence.emap.eMap.EMapFactory
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

//import org.eclipse.xtext.ui.editor.quickfix.Fix
//import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
//import org.eclipse.xtext.validation.Issue

/**
 * Custom quickfixes.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#quickfixes
 */
class EMapQuickfixProvider extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {

//	@Fix(MyDslValidator::INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

	@Fix(EMapValidator::ATTRIBUTE_MISSING)
	def addMissingAttribute(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add attribute '" + issue.data.get(0) + "'", "adds the attribute '" + issue.data.get(0) + "'", 'upcase.png') [
			element, context |
			println("accepting quick fix")
			val name = issue.data.get(0)
			val entity = element as EMappingEntity
			val lastAttribute = entity.attributes.last
			
			val node = NodeModelUtils.findActualNodeFor(lastAttribute)
			
			val endPos = node.offset + node.length
			
			val xtextdoc = context.xtextDocument
			
			xtextdoc.replace(endPos, 0, ",\n\t\t" + name + " => /* automatically inserted, please add the correct mapping */ TODO")
			
			println("acceptor finished")
		]
		
	}
}
