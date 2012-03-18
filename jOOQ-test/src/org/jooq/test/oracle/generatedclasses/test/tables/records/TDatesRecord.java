/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES", schema = "TEST")
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> {

	private static final long serialVersionUID = 1682763519;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setD(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "D", length = 7)
	public java.sql.Date getD() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D);
	}

	/**
	 * An uncommented item
	 */
	public void setT(java.sql.Timestamp value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.T, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "T", length = 11)
	public java.sql.Timestamp getT() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.T);
	}

	/**
	 * An uncommented item
	 */
	public void setTs(java.sql.Timestamp value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TS", length = 11)
	public java.sql.Timestamp getTs() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS);
	}

	/**
	 * An uncommented item
	 */
	public void setDInt(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D_INT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "D_INT", precision = 7)
	public java.lang.Integer getDInt() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.D_INT);
	}

	/**
	 * An uncommented item
	 */
	public void setTsBigint(java.lang.Long value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS_BIGINT, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TS_BIGINT", precision = 18)
	public java.lang.Long getTsBigint() {
		return getValue(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES.TS_BIGINT);
	}

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES);
	}
}
