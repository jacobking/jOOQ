/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -473897550;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.ase.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.ase.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.ase.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES dbo.x_unused (ID)
	 * </pre></code>
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES dbo.x_unused (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT x_test_case_64_69__fk_x_test_case_64_69
	 * FOREIGN KEY (UNUSED_ID)
	 * REFERENCES dbo.x_unused (ID)
	 * </pre></code>
	 */
	public org.jooq.test.ase.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.ase.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.ase.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.UNUSED_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.ase.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
