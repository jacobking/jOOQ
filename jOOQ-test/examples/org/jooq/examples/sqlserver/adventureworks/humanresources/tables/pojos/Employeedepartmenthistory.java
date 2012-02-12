/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "EmployeeDepartmentHistory", schema = "HumanResources", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"EmployeeID", "StartDate", "DepartmentID", "ShiftID"})
})
public class Employeedepartmenthistory implements java.io.Serializable {

	private static final long serialVersionUID = 333904507;

	private java.lang.Integer  employeeid;
	private java.lang.Short    departmentid;
	private java.lang.Byte     shiftid;
	private java.sql.Timestamp startdate;
	private java.sql.Timestamp enddate;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "EmployeeID")
	public java.lang.Integer getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(java.lang.Integer employeeid) {
		this.employeeid = employeeid;
	}

	@javax.persistence.Column(name = "DepartmentID")
	public java.lang.Short getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(java.lang.Short departmentid) {
		this.departmentid = departmentid;
	}

	@javax.persistence.Column(name = "ShiftID")
	public java.lang.Byte getShiftid() {
		return this.shiftid;
	}

	public void setShiftid(java.lang.Byte shiftid) {
		this.shiftid = shiftid;
	}

	@javax.persistence.Column(name = "StartDate")
	public java.sql.Timestamp getStartdate() {
		return this.startdate;
	}

	public void setStartdate(java.sql.Timestamp startdate) {
		this.startdate = startdate;
	}

	@javax.persistence.Column(name = "EndDate")
	public java.sql.Timestamp getEnddate() {
		return this.enddate;
	}

	public void setEnddate(java.sql.Timestamp enddate) {
		this.enddate = enddate;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}
