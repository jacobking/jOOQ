/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductListPriceHistory", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ProductID", "StartDate"})
})
public class ProductListPriceHistory extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductListPriceHistory> {

	private static final long serialVersionUID = -1589644688;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductListPriceHistory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.ProductID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT FK_ProductListPriceHistory_Product_ProductID
	 * FOREIGN KEY (ProductID)
	 * REFERENCES Production.Product (ProductID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.ProductID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.StartDate, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Column(name = "StartDate", nullable = false)
	public java.sql.Timestamp getStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.StartDate);
	}

	/**
	 * An uncommented item
	 */
	public void setEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.EndDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.EndDate);
	}

	/**
	 * An uncommented item
	 */
	public void setListPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.ListPrice, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ListPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getListPrice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.ListPrice);
	}

	/**
	 * An uncommented item
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.ModifiedDate, value);
	}

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory.ModifiedDate);
	}

	/**
	 * Create a detached ProductListPriceHistory
	 */
	public ProductListPriceHistory() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ProductListPriceHistory.ProductListPriceHistory);
	}
}
