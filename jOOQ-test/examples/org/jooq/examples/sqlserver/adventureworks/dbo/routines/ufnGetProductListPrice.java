/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class ufnGetProductListPrice extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> {

	private static final long serialVersionUID = -1190140735;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ProductID = createParameter("ProductID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> OrderDate = createParameter("OrderDate", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public ufnGetProductListPrice() {
		super("ufnGetProductListPrice", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(ProductID);
		addInParameter(OrderDate);
	}

	/**
	 * Set the <code>ProductID</code> parameter to the routine
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(ProductID, value);
	}

	/**
	 * Set the <code>ProductID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setProductID(org.jooq.Field<java.lang.Integer> field) {
		setField(ProductID, field);
	}

	/**
	 * Set the <code>OrderDate</code> parameter to the routine
	 */
	public void setOrderDate(java.sql.Timestamp value) {
		setValue(OrderDate, value);
	}

	/**
	 * Set the <code>OrderDate</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setOrderDate(org.jooq.Field<java.sql.Timestamp> field) {
		setField(OrderDate, field);
	}
}
