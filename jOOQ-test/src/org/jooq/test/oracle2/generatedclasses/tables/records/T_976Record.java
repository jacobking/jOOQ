/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class T_976Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle2.generatedclasses.tables.records.T_976Record> {

	private static final long serialVersionUID = -723839431;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setD(java.sql.Timestamp value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.D, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getD() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.D);
	}

	/**
	 * An uncommented item
	 */
	public void setT(org.jooq.test.oracle2.generatedclasses.udt.records.T_976VarrayTypeRecord value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.T, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle2.generatedclasses.udt.records.T_976VarrayTypeRecord getT() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.T);
	}

	/**
	 * An uncommented item
	 */
	public void setO(org.jooq.test.oracle2.generatedclasses.udt.records.T_976ObjectTypeRecord value) {
		setValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.O, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.test.oracle2.generatedclasses.udt.records.T_976ObjectTypeRecord getO() {
		return getValue(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976.O);
	}

	/**
	 * Create a detached T_976Record
	 */
	public T_976Record() {
		super(org.jooq.test.oracle2.generatedclasses.tables.T_976.T_976);
	}
}
