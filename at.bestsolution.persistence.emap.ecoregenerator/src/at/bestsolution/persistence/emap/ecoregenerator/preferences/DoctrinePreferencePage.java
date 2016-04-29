/* ----------------------------------------------------------------
 * Original File Name:     DoctrinePreferencePage.java
 * Creation Date:          2012-10-08
 * Description:            DoctrinePreferencePage
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
package at.bestsolution.persistence.emap.ecoregenerator.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import at.bestsolution.persistence.emap.ecoregenerator.Activator;
import at.bestsolution.persistence.emap.ecoregenerator.i18n.Messages;

/**
 * DoctrinePreferencePage.
 */
public class DoctrinePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {
	/**
	 * Constructor.
	 */
	public DoctrinePreferencePage() {
		super( GRID );
		setPreferenceStore( Activator.getDefault().getPreferenceStore() );
		setDescription( Messages.DoctrinePreferencePage_0 );
	}

	@Override
	public final void createFieldEditors() {
		addField( new StringFieldEditor( PreferenceConstants.P_PACKAGE_GENERATED_CLASSES, Messages.DoctrinePreferencePage_1, getFieldEditorParent() ) );
		addField( new StringFieldEditor( PreferenceConstants.P_PREFIX_GENERATED_CLASSES, Messages.DoctrinePreferencePage_2, getFieldEditorParent() ) );
		addField( new StringFieldEditor( PreferenceConstants.P_PACKAGE_INPUT_FILTER, Messages.DoctrinePreferencePage_3, getFieldEditorParent() ) );
		addField( new StringFieldEditor( PreferenceConstants.P_POSTFIX_INPUT_FILTER_CLASSES, Messages.DoctrinePreferencePage_4, getFieldEditorParent() ) );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init( final IWorkbench workbench ) {
	}
}
