/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production;

/**
 * This class is generated by jOOQ.
 */
public class ProductionFactory extends org.jooq.util.sqlserver.SQLServerFactory {

	private static final long serialVersionUID = -1333018536;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public ProductionFactory(java.sql.Connection connection) {
		super(connection);
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #ProductionFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public ProductionFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public ProductionFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);
	}
}
