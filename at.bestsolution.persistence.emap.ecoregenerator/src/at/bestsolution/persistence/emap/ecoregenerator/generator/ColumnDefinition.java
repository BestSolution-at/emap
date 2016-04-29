/* ----------------------------------------------------------------
 * Original File Name:     ColumnDefinition.java
 * Creation Date:          2012-10-08
 * Description:            ColumnDefinition
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
 * ColumnDefinition bean class.
 */
public class ColumnDefinition {
	/**
	 * sqlType.
	 */
	private final String sqlType;
	/**
	 * notNull.
	 */
	private final boolean notNull;

	/**
	 * Column Definition constructor.
	 * 
	 * @param sqlType
	 *            sqlType
	 * @param notNull
	 *            notNull
	 */
	public ColumnDefinition( final String sqlType, final boolean notNull ) {
		super();
		this.sqlType = sqlType;
		this.notNull = notNull;
	}

	/**
	 * getSqlType.
	 * 
	 * @return sql type
	 */
	public final String getSqlType() {
		return sqlType;
	}

	/**
	 * isNotNull.
	 * 
	 * @return is not null?
	 */
	public final boolean isNotNull() {
		return notNull;
	}
}
