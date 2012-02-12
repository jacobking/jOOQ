/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
public class Salesterritoryhistory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord> {

	private static final long serialVersionUID = 1073462747;

	/**
	 * The singleton instance of SalesTerritoryHistory
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory SALESTERRITORYHISTORY = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.SalesPersonID]
	 * REFERENCES SalesPerson [Sales.SalesPerson.SalesPersonID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, java.lang.Integer> SALESPERSONID = createField("SalesPersonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [Sales.SalesTerritoryHistory.TerritoryID]
	 * REFERENCES SalesTerritory [Sales.SalesTerritory.TerritoryID]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, java.lang.Integer> TERRITORYID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, java.sql.Timestamp> STARTDATE = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, java.sql.Timestamp> ENDDATE = createField("EndDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Salesterritoryhistory() {
		super("SalesTerritoryHistory", org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES);
	}

	/**
	 * No further instances allowed
	 */
	private Salesterritoryhistory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.SALES, org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory.SALESTERRITORYHISTORY);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesTerritoryHistory_SalesPersonID_StartDate_TerritoryID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesTerritoryHistory_SalesPersonID_StartDate_TerritoryID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesterritoryhistoryRecord, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesTerritoryHistory_SalesPerson_SalesPersonID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesTerritoryHistory_SalesTerritory_TerritoryID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Salesterritoryhistory(alias);
	}
}
