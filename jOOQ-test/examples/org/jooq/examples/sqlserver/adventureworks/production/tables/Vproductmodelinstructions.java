/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vproductmodelinstructions extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord> {

	private static final long serialVersionUID = 264716778;

	/**
	 * The singleton instance of vProductModelInstructions
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions VPRODUCTMODELINSTRUCTIONS = new org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.Integer> PRODUCTMODELID = createField("ProductModelID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.String> INSTRUCTIONS = createField("Instructions", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.Integer> LOCATIONID = createField("LocationID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.math.BigDecimal> SETUPHOURS = createField("SetupHours", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.math.BigDecimal> MACHINEHOURS = createField("MachineHours", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.math.BigDecimal> LABORHOURS = createField("LaborHours", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.Integer> LOTSIZE = createField("LotSize", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.String> STEP = createField("Step", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.String> ROWGUID = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Vproductmodelinstructions() {
		super("vProductModelInstructions", org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION);
	}

	/**
	 * No further instances allowed
	 */
	private Vproductmodelinstructions(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.PRODUCTION, org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions.VPRODUCTMODELINSTRUCTIONS);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.VproductmodelinstructionsRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_vProductModelInstructions;
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Vproductmodelinstructions(alias);
	}
}
