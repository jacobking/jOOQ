/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
public class U_STREET_TYPE extends org.jooq.impl.UDTRecordImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> {

	private static final long serialVersionUID = -904620513;


	/**
	 * An uncommented item
	 */
	public void setSTREET(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.STREET, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSTREET() {
		return getValue(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.STREET);
	}

	/**
	 * An uncommented item
	 */
	public void setNO(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.NO, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getNO() {
		return getValue(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.NO);
	}

	/**
	 * An uncommented item
	 */
	public void setFLOORS(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.FLOORS, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_ARRAY getFLOORS() {
		return getValue(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.FLOORS);
	}

	public U_STREET_TYPE() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.U_STREET_TYPE);
	}
}
