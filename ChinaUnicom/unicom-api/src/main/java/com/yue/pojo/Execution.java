package com.yue.pojo;

import java.util.Date;

/**
 * Execution entity. @author MyEclipse Persistence Tools
 */

public class Execution implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer executionId;
	private Activity activity;
	private Integer activityNum;
	private String activityName;
	private Date activityStarttime;
	private Date activityEndtime;
	private String executionMakers;
	private String executionDepartments;

	// Constructors

	/** default constructor */
	public Execution() {
	}

	/**
	 * @param executionId
	 * @param executionMakers
	 * @param executionDepartments
	 */
	public Execution(Integer executionId, String executionMakers,
			String executionDepartments) {
		super();
		this.executionId = executionId;
		this.executionMakers = executionMakers;
		this.executionDepartments = executionDepartments;
	}

	/** full constructor */
	public Execution(Activity activity, Integer activityNum,
			String activityName, Date activityStarttime, Date activityEndtime,
			String executionMakers, String executionDepartments) {
		this.activity = activity;
		this.activityNum = activityNum;
		this.activityName = activityName;
		this.activityStarttime = activityStarttime;
		this.activityEndtime = activityEndtime;
		this.executionMakers = executionMakers;
		this.executionDepartments = executionDepartments;
	}

	// Property accessors

	public Integer getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(Integer executionId) {
		this.executionId = executionId;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Integer getActivityNum() {
		return this.activityNum;
	}

	public void setActivityNum(Integer activityNum) {
		this.activityNum = activityNum;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Date getActivityStarttime() {
		return this.activityStarttime;
	}

	public void setActivityStarttime(Date activityStarttime) {
		this.activityStarttime = activityStarttime;
	}

	public Date getActivityEndtime() {
		return this.activityEndtime;
	}

	public void setActivityEndtime(Date activityEndtime) {
		this.activityEndtime = activityEndtime;
	}

	public String getExecutionMakers() {
		return this.executionMakers;
	}

	public void setExecutionMakers(String executionMakers) {
		this.executionMakers = executionMakers;
	}

	public String getExecutionDepartments() {
		return this.executionDepartments;
	}

	public void setExecutionDepartments(String executionDepartments) {
		this.executionDepartments = executionDepartments;
	}

}