package com.yue.pojo;

import java.util.List;


/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer userId;
	private String userName;
	private String userLoginname;
	private String userPassword;
	private Integer userStatus;
	private Integer userDisplay;
	private DepRole depRole;
	private List<Resources> resources;
	private List<Activity> activities;
	private List<Log> logs;
	private List<Plan> plans;

	// Constructors

	/** default constructor */
	public Users() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public DepRole getDepRole() {
		return depRole;
	}

	public void setDepRole(DepRole depRole) {
		this.depRole = depRole;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLoginname() {
		return userLoginname;
	}

	public void setUserLoginname(String userLoginname) {
		this.userLoginname = userLoginname;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getUserDisplay() {
		return userDisplay;
	}

	public void setUserDisplay(Integer userDisplay) {
		this.userDisplay = userDisplay;
	}

	public List<Resources> getResources() {
		return resources;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public List<Log> getLogs() {
		return logs;
	}

	public List<Plan> getPlans() {
		return plans;
	}

	@Override
	public String toString() {
		return "Users{" + "userId=" + userId + ", depRole=" + depRole + ", userName='" + userName + '\''
				+ ", userLoginname='" + userLoginname + '\'' + ", userPassword='" + userPassword + '\''
				+ ", userStatus=" + userStatus + ", userDisplay=" + userDisplay + ", resources=" + resources
				+ ", activities=" + activities + ", logs=" + logs + ", plans=" + plans + '}';
	}
}