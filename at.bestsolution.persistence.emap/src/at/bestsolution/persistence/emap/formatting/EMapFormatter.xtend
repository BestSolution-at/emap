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
package at.bestsolution.persistence.emap.formatting

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter
import org.eclipse.xtext.formatting.impl.FormattingConfig
// import com.google.inject.Inject;
import at.bestsolution.persistence.emap.services.EMapGrammarAccess
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ParserRule
import org.eclipse.xtext.parsetree.reconstr.ITokenStream

/**
 * This class contains custom formatting description.
 *
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 *
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class EMapFormatter extends AbstractDeclarativeFormatter {

	@Inject extension EMapGrammarAccess

	def ParserRule findRule(EObject obj) {
		if (obj instanceof ParserRule)
			return obj as ParserRule
		else if (obj == null)
			return null
		else 
			return findRule(obj.eContainer)
	}
	
	override createFormatterStream(String indent, ITokenStream out, boolean preserveWhitespaces) {
		super.createFormatterStream(indent, new SpacerTokenStream(out), preserveWhitespaces)
	}
	
	override createFormatterStream(EObject context, String indent, ITokenStream out, boolean preserveWhitespaces) {
		super.createFormatterStream(context, indent, new SpacerTokenStream(out), preserveWhitespaces)
	}

	override protected void configureFormatting(FormattingConfig c) {
// It's usually a good idea to activate the following three statements.
// They will add and preserve newlines around comments
//		c.setLinewrap(0, 1, 2).before(SL_COMMENTRule)
//		c.setLinewrap(0, 1, 2).before(ML_COMMENTRule)
//		c.setLinewrap(0, 1, 1).after(ML_COMMENTRule)
		c.setAutoLinewrap(160);
		c.setWrappedLineIndentation(1)
		
		findRuleCalls(EMappingAttributeRule, ENamedQueryRule).forEach[
			c.setLinewrap(1).before(it)
		]
		
		findKeywordPairs("{", "}").forEach[
			c.setSpace(" ").before(it.first)
			c.setIndentation(it.first, it.second)
			val rule = findRule(it.first)
			if (rule == EMappingEntityRule || rule == ENamedQueryRule) {
				c.setLinewrap(1).after(it.first)
				c.setLinewrap(1).before(it.second);
			}
		]
		
		
		
		findKeywordPairs("(", ")").forEach[
			c.setNoSpace().before(it.first);
     		c.setNoSpace().after(it.first);
      		c.setNoSpace().before(it.second);
      	]
      	
      	findRuleCalls(EAttributeRule, EMappingAttributeRule).forEach[
      		//c.setSpace(SpacerTokenStream.POINT0).before(it)
      		c.setLinewrap(1).before(it)
      	]
      	
		findKeywords("=>").forEach[
			c.setSpace(SpacerTokenStream.POINT1).before(it)
			c.setSpace("\t").after(it)
		]
		
		findRuleCalls(packageDeclarationRule).forEach[
			c.setLinewrap(2).after(it)
		]
		
		findKeywords("etype", "entity", "attributes", "queries").forEach[
			c.setLinewrap(1).before(it)
		]
		
		findKeywords(",", ";").forEach[
			c.setNoSpace.before(it)
			c.setLinewrap(1).after(it)
		]
		
		findKeywords("#", ".").forEach[
			c.setNoSpace.around(it)
		]
		
		

	}
}
