package com.yue.pojo;

import java.util.List;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */
public class Department implements java.io.Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer departmentId;
	private String departmentName;
	private List<DepRole> depRoles;

	public Department() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<DepRole> getDepRoles() {
		return depRoles;
	}

	public void setDepRoles(List<DepRole> depRoles) {
		this.depRoles = depRoles;
	}

	@Override
	public String toString() {
		return "Department{" + "departmentId=" + departmentId + ", departmentName='" + departmentName + '\''
				+ ", depRoles=" + depRoles + '}';
	}
}