/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * Information about accessible columns in constraint definitions
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.3"},
                            comments = "This class is generated by jOOQ")
public class AllConsColumnsRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.oracle.sys.tables.records.AllConsColumnsRecord> {

	private static final long serialVersionUID = -13276483;

	/**
	 * Owner of the constraint definition
	 */
	public void setOwner(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.OWNER, value);
	}

	/**
	 * Owner of the constraint definition
	 */
	public java.lang.String getOwner() {
		return getValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.OWNER);
	}

	/**
	 * Name associated with the constraint definition
	 */
	public void setConstraintName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.CONSTRAINT_NAME, value);
	}

	/**
	 * Name associated with the constraint definition
	 */
	public java.lang.String getConstraintName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.CONSTRAINT_NAME);
	}

	/**
	 * Name associated with table with constraint definition
	 */
	public void setTableName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.TABLE_NAME, value);
	}

	/**
	 * Name associated with table with constraint definition
	 */
	public java.lang.String getTableName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.TABLE_NAME);
	}

	/**
	 * Name associated with column or attribute of object column specified in the constraint definition
	 */
	public void setColumnName(java.lang.String value) {
		setValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.COLUMN_NAME, value);
	}

	/**
	 * Name associated with column or attribute of object column specified in the constraint definition
	 */
	public java.lang.String getColumnName() {
		return getValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.COLUMN_NAME);
	}

	/**
	 * Original position of column or attribute in definition
	 */
	public void setPosition(java.math.BigDecimal value) {
		setValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.POSITION, value);
	}

	/**
	 * Original position of column or attribute in definition
	 */
	public java.math.BigDecimal getPosition() {
		return getValue(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS.POSITION);
	}

	/**
	 * Create a detached AllConsColumnsRecord
	 */
	public AllConsColumnsRecord() {
		super(org.jooq.util.oracle.sys.tables.AllConsColumns.ALL_CONS_COLUMNS);
	}
}
