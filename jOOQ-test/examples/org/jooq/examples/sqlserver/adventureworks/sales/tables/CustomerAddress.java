/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class CustomerAddress extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress> {

	private static final long serialVersionUID = 2058172369;

	/**
	 * The singleton instance of Sales.CustomerAddress
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress CustomerAddress = new org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CustomerAddress_Customer_CustomerID
	 * FOREIGN KEY (CustomerID)
	 * REFERENCES Sales.Customer (CustomerID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, java.lang.Integer> CustomerID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CustomerAddress_Address_AddressID
	 * FOREIGN KEY (AddressID)
	 * REFERENCES Person.Address (AddressID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, java.lang.Integer> AddressID = createField("AddressID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_CustomerAddress_AddressType_AddressTypeID
	 * FOREIGN KEY (AddressTypeID)
	 * REFERENCES Person.AddressType (AddressTypeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, java.lang.Integer> AddressTypeID = createField("AddressTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private CustomerAddress() {
		super("CustomerAddress", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * No further instances allowed
	 */
	private CustomerAddress(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress.CustomerAddress);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CustomerAddress_CustomerID_AddressID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CustomerAddress_CustomerID_AddressID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CustomerAddress, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CustomerAddress_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CustomerAddress_Address_AddressID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_CustomerAddress_AddressType_AddressTypeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.CustomerAddress(alias);
	}
}
