/* ----------------------------------------------------------------
 * Original File Name:     EClassMetaInfo.java
 * Creation Date:          2012-10-16
 * Description:            EClassMetaInfo
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
 * Creation Date: 2012-10-16
 *
 * $LastChangedDate: $
 * $LastChangedBy: $
 * ----------------------------------------------------------------
 */
package at.bestsolution.persistence.emap.ecoregenerator.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EReference;

import at.bestsolution.persistence.emap.ecoregenerator.preferences.PreferenceHelper;

/**
 * EClassMetaInfo.
 */
public class EClassMetaInfo {
	private String genNamespace;
	private String genClassName;
	private String srcNamespace;
	private String srcClassName;
	private IFolder srcFolder;
	private String inputFilterNamespace;
	private String inputFilterClassName;
	private List<EReference> queries = new ArrayList<>();

	public IFolder getGenFolder() {
		return srcFolder.getFolder( PreferenceHelper.getPackageGeneratedClasses() );
	}

	public String getSrcNamespace() {
		return srcNamespace;
	}

	public void setSrcNamespace( String srcNamespace ) {
		this.srcNamespace = srcNamespace;
	}

	public String getGenClassName() {
		return genClassName;
	}

	public String getGenClassFQ() {
		return genNamespace + "\\" + genClassName;
	}

	public void setGenClassName( String genClassName ) {
		this.genClassName = genClassName;
	}

	public IFolder getSrcFolder() {
		return srcFolder;
	}

	public void setSrcFolder( IFolder srcFolder ) {
		this.srcFolder = srcFolder;
	}

	public String getSrcClassName() {
		return srcClassName;
	}

	public String getSrcClassFQ() {
		return srcNamespace + "\\" + srcClassName;
	}

	public void setSrcClassName( String srcClassName ) {
		this.srcClassName = srcClassName;
	}

	public String getInputFilterClassName() {
		return inputFilterClassName;
	}

	public String getInputFilterClassFQ() {
		return inputFilterNamespace + "\\" + inputFilterClassName;
	}

	public void setInputFilterClassName( String inputFilterClassName ) {
		this.inputFilterClassName = inputFilterClassName;
	}

	public String getGenNamespace() {
		return genNamespace;
	}

	public void setGenNamespace( String genNamespace ) {
		this.genNamespace = genNamespace;
	}

	public String getInputFilterNamespace() {
		return inputFilterNamespace;
	}

	public void setInputFilterNamespace( String inputFilterNamespace ) {
		this.inputFilterNamespace = inputFilterNamespace;
	}

	public IFolder getInputFilterClassFolder() {
		return srcFolder.getFolder( new Path( PreferenceHelper.getPackageInputFilter() ) );
	}

	public List<EReference> getQueries() {
		return queries;
	}

	public void setQueries( List<EReference> queries ) {
		this.queries = queries;
	}
}
