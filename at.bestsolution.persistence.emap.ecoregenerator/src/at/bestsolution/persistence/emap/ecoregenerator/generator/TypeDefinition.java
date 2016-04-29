/* ----------------------------------------------------------------
 * Original File Name:     TypeDefinition.java
 * Creation Date:          2012-10-08
 * Description:            TypeDefinition
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
package at.bestsolution.persistence.emap.ecoregenerator.generator;

/**
 * TypeDefinition bean class.
 */
public class TypeDefinition {
	/**
	 * phpType.
	 */
	private final String phpType;
	/**
	 * columnType.
	 */
	private final String columnType;

	/**
	 * Constructor.
	 * 
	 * @param phpType
	 *            phpType
	 * @param columnType
	 *            columnType
	 */
	public TypeDefinition( final String phpType, final String columnType ) {
		this.phpType = phpType;
		this.columnType = columnType;
	}

	/**
	 * getPhpType.
	 * 
	 * @return PHP type
	 */
	public final String getPhpType() {
		return phpType;
	}

	/**
	 * getColumnType.
	 * 
	 * @return column type
	 */
	public final String getColumnType() {
		return columnType;
	}
}
