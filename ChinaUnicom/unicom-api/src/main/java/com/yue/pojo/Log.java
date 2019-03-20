package com.yue.pojo;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Log entity. @author MyEclipse Persistence Tools
 */

public class Log implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer logId;
	private Users users;
	private String userName;
	private String logContent;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date logTime;
	private String logTimeString;

	// Constructors

	/** default constructor */
	public Log() {
	}

	/** full constructor */
	public Log(Users users, String userName, String logContent, Date logTime) {
		this.users = users;
		this.userName = userName;
		this.logContent = logContent;
		this.logTime = logTime;
	}

	// Property accessors

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLogContent() {
		return this.logContent;
	}

	/**
	 * @return the logTimeString
	 */
	public String getLogTimeString() {
		return logTimeString;
	}

	/**
	 * @param logTimeString the logTimeString to set
	 */
	public void setLogTimeString(String logTimeString) {
		this.logTimeString = logTimeString;
	}

	public void setLogContent(String logContent) {
		this.logContent = logContent;
	}

	public Date getLogTime() {
		return this.logTime;
	}

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Log [logId=" + logId + ", users=" + users + ", userName=" + userName + ", logContent=" + logContent
				+ ", logTime=" + logTime + "]";
	}

}