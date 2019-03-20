package com.yue.pojo;

import java.util.List;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer roleId;
	private String roleName;
	private List<DepRole> depRoles;

	public Role() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<DepRole> getDepRoles() {
		return depRoles;
	}

	public void setDepRoles(List<DepRole> depRoles) {
		this.depRoles = depRoles;
	}

	@Override
	public String toString() {
		return "Role{" + "roleId=" + roleId + ", roleName='" + roleName + '\'' + ", depRoles=" + depRoles + '}';
	}
}