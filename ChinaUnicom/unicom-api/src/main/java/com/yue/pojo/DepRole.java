package com.yue.pojo;

import java.util.List;

/**
 * DepRole entity. @author MyEclipse Persistence Tools
 */
public class DepRole implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer depOleId;
	private Role role;
	private Department department;
	private List<Users> users;

	public DepRole() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getDepOleId() {
		return depOleId;
	}

	public void setDepOleId(Integer depOleId) {
		this.depOleId = depOleId;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "DepRole{" + "depOleId=" + depOleId + ", role=" + role + ", department=" + department + ", users="
				+ users + '}';
	}
}