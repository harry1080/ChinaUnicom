package com.yue.pojo;

import java.util.Date;
import java.util.List;

/**
 * Activity entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Activity implements java.io.Serializable {

	// Fields

	/**
	 *
	 */
	private Integer activityId;
	private Users users;
	private Plan plan;
	private String planNum;
	private Integer activityNum;
	private String activityName;
	private String activityTarget;
	private String activityWay;
	private String activityRegion;
	private String activityLocation;
	private String activityCustomer;
	private Date activityStarttime;
	private Date activityEndtime;
	private String activityCommission;
	private String activityPublicity;
	private String activityOther;
	private String activityContent;
	private String activityClaim;
	private Integer activityStatus;
	private Double activityBudget;
	private Integer activityDisplay;
	private List<Execution> executions;
	private List<Resources> resources;

	public Activity() {
	}

	public Integer getActivityId() {
		return activityId;
	}

	public void setActivityId(Integer activityId) {
		this.activityId = activityId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public String getPlanNum() {
		return planNum;
	}

	public void setPlanNum(String planNum) {
		this.planNum = planNum;
	}

	public Integer getActivityNum() {
		return activityNum;
	}

	public void setActivityNum(Integer activityNum) {
		this.activityNum = activityNum;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityTarget() {
		return activityTarget;
	}

	public void setActivityTarget(String activityTarget) {
		this.activityTarget = activityTarget;
	}

	public String getActivityWay() {
		return activityWay;
	}

	public void setActivityWay(String activityWay) {
		this.activityWay = activityWay;
	}

	public String getActivityRegion() {
		return activityRegion;
	}

	public void setActivityRegion(String activityRegion) {
		this.activityRegion = activityRegion;
	}

	public String getActivityLocation() {
		return activityLocation;
	}

	public void setActivityLocation(String activityLocation) {
		this.activityLocation = activityLocation;
	}

	public String getActivityCustomer() {
		return activityCustomer;
	}

	public void setActivityCustomer(String activityCustomer) {
		this.activityCustomer = activityCustomer;
	}

	public Date getActivityStarttime() {
		return activityStarttime;
	}

	public void setActivityStarttime(Date activityStarttime) {
		this.activityStarttime = activityStarttime;
	}

	public Date getActivityEndtime() {
		return activityEndtime;
	}

	public void setActivityEndtime(Date activityEndtime) {
		this.activityEndtime = activityEndtime;
	}

	public String getActivityCommission() {
		return activityCommission;
	}

	public void setActivityCommission(String activityCommission) {
		this.activityCommission = activityCommission;
	}

	public String getActivityPublicity() {
		return activityPublicity;
	}

	public void setActivityPublicity(String activityPublicity) {
		this.activityPublicity = activityPublicity;
	}

	public String getActivityOther() {
		return activityOther;
	}

	public void setActivityOther(String activityOther) {
		this.activityOther = activityOther;
	}

	public String getActivityContent() {
		return activityContent;
	}

	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
	}

	public String getActivityClaim() {
		return activityClaim;
	}

	public void setActivityClaim(String activityClaim) {
		this.activityClaim = activityClaim;
	}

	public Integer getActivityStatus() {
		return activityStatus;
	}

	public void setActivityStatus(Integer activityStatus) {
		this.activityStatus = activityStatus;
	}

	public Double getActivityBudget() {
		return activityBudget;
	}

	public void setActivityBudget(Double activityBudget) {
		this.activityBudget = activityBudget;
	}

	public Integer getActivityDisplay() {
		return activityDisplay;
	}

	public void setActivityDisplay(Integer activityDisplay) {
		this.activityDisplay = activityDisplay;
	}

	public List<Execution> getExecutions() {
		return executions;
	}

	public void setExecutions(List<Execution> executions) {
		this.executions = executions;
	}

	public List<Resources> getResources() {
		return resources;
	}

	public void setResources(List<Resources> resources) {
		this.resources = resources;
	}

	@Override
	public String toString() {
		return "Activity{" + "activityId=" + activityId + ", users=" + users + ", plan=" + plan + ", planNum='"
				+ planNum + '\'' + ", activityNum=" + activityNum + ", activityName='" + activityName + '\''
				+ ", activityTarget='" + activityTarget + '\'' + ", activityWay='" + activityWay + '\''
				+ ", activityRegion='" + activityRegion + '\'' + ", activityLocation='" + activityLocation + '\''
				+ ", activityCustomer='" + activityCustomer + '\'' + ", activityStarttime=" + activityStarttime
				+ ", activityEndtime=" + activityEndtime + ", activityCommission='" + activityCommission + '\''
				+ ", activityPublicity='" + activityPublicity + '\'' + ", activityOther='" + activityOther + '\''
				+ ", activityContent='" + activityContent + '\'' + ", activityClaim='" + activityClaim + '\''
				+ ", activityStatus=" + activityStatus + ", activityBudget=" + activityBudget + ", activityDisplay="
				+ activityDisplay + ", executions=" + executions + ", resources=" + resources + '}';
	}
}