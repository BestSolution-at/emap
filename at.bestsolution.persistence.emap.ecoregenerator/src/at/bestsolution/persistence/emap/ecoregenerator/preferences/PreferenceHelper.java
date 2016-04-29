/* ----------------------------------------------------------------
 * Original File Name:     .java
 * Creation Date:          2012-10-08
 * Description:            
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

import at.bestsolution.persistence.emap.ecoregenerator.Activator;

/**
 * Helper class for preferences access.
 * 
 * @author martin
 */
public final class PreferenceHelper {
	/**
	 * Hidden constructor.
	 */
	private PreferenceHelper() {
	}

	/**
	 * getPackageGeneratedClasses.
	 * 
	 * @return package for generated classes
	 */
	public static String getPackageGeneratedClasses() {
		return Activator.getDefault().getPreferenceStore().getString( PreferenceConstants.P_PACKAGE_GENERATED_CLASSES );
	}

	/**
	 * getPackageGeneratedClasses.
	 * 
	 * @return package for generated classes
	 */
	public static String getPackageInputFilter() {
		return Activator.getDefault().getPreferenceStore().getString( PreferenceConstants.P_PACKAGE_INPUT_FILTER );
	}

	/**
	 * getPrefixGeneratedClasses.
	 * 
	 * @return prefix generated classes
	 */
	public static String getPrefixGeneratedClasses() {
		return Activator.getDefault().getPreferenceStore().getString( PreferenceConstants.P_PREFIX_GENERATED_CLASSES );
	}

	/**
	 * getPostfixInputFilterClasses.
	 * @return postfix input filter classes
	 */
	public static String getPostfixInputFilterClasses() {
		return Activator.getDefault().getPreferenceStore().getString( PreferenceConstants.P_POSTFIX_INPUT_FILTER_CLASSES );
	}
}
