/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
public class PEnhanceAddress1 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 691846373;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord> ADDRESS = createParameter("ADDRESS", org.jooq.test.oracle.generatedclasses.test.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> NO = createParameter("NO", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public PEnhanceAddress1() {
		super(org.jooq.SQLDialect.ORACLE, "P_ENHANCE_ADDRESS1", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(ADDRESS);
		addOutParameter(NO);
	}

	/**
	 * Set the <code>ADDRESS</code> parameter to the routine
	 */
	public void setAddress(org.jooq.test.oracle.generatedclasses.test.udt.records.UAddressTypeRecord value) {
		setValue(ADDRESS, value);
	}

	public java.lang.String getNo() {
		return getValue(NO);
	}
}
