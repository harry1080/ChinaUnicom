package com.yue.pojo;

import java.util.Date;
import java.util.List;

/**
 * Plan entity. @author MyEclipse Persistence Tools
 */

public class Plan implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer planId;
	private Users users;
	private String planNum;
	private String planName;
	private Integer planType;
	private String planRequirements;
	private String planVersion;
	private String planChannels;
	private String planApplication;
	private String planContent;
	private Double planBudget;
	private String planIndicators;
	private String planResponsible;
	private String planResource;
	private Date planStarttime;
	private Date planEndtime;
	private String planPublished;
	private Integer planStatus;
	private List<Activity> activities;

	// Constructors

	public Plan() {

	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getPlanNum() {
		return planNum;
	}

	public void setPlanNum(String planNum) {
		this.planNum = planNum;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getPlanType() {
		return planType;
	}

	public void setPlanType(Integer planType) {
		this.planType = planType;
	}

	public String getPlanRequirements() {
		return planRequirements;
	}

	public void setPlanRequirements(String planRequirements) {
		this.planRequirements = planRequirements;
	}

	public String getPlanVersion() {
		return planVersion;
	}

	public void setPlanVersion(String planVersion) {
		this.planVersion = planVersion;
	}

	public String getPlanChannels() {
		return planChannels;
	}

	public void setPlanChannels(String planChannels) {
		this.planChannels = planChannels;
	}

	public String getPlanApplication() {
		return planApplication;
	}

	public void setPlanApplication(String planApplication) {
		this.planApplication = planApplication;
	}

	public String getPlanContent() {
		return planContent;
	}

	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public Double getPlanBudget() {
		return planBudget;
	}

	public void setPlanBudget(Double planBudget) {
		this.planBudget = planBudget;
	}

	public String getPlanIndicators() {
		return planIndicators;
	}

	public void setPlanIndicators(String planIndicators) {
		this.planIndicators = planIndicators;
	}

	public String getPlanResponsible() {
		return planResponsible;
	}

	public void setPlanResponsible(String planResponsible) {
		this.planResponsible = planResponsible;
	}

	public String getPlanResource() {
		return planResource;
	}

	public void setPlanResource(String planResource) {
		this.planResource = planResource;
	}

	public Date getPlanStarttime() {
		return planStarttime;
	}

	public void setPlanStarttime(Date planStarttime) {
		this.planStarttime = planStarttime;
	}

	public Date getPlanEndtime() {
		return planEndtime;
	}

	public void setPlanEndtime(Date planEndtime) {
		this.planEndtime = planEndtime;
	}

	public String getPlanPublished() {
		return planPublished;
	}

	public void setPlanPublished(String planPublished) {
		this.planPublished = planPublished;
	}

	public Integer getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(Integer planStatus) {
		this.planStatus = planStatus;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Plan{" + "planId=" + planId + ", users=" + users + ", planNum='" + planNum + '\'' + ", planName='"
				+ planName + '\'' + ", planType=" + planType + ", planRequirements='" + planRequirements + '\''
				+ ", planVersion='" + planVersion + '\'' + ", planChannels='" + planChannels + '\''
				+ ", planApplication='" + planApplication + '\'' + ", planContent='" + planContent + '\''
				+ ", planBudget=" + planBudget + ", planIndicators='" + planIndicators + '\'' + ", planResponsible='"
				+ planResponsible + '\'' + ", planResource='" + planResource + '\'' + ", planStarttime=" + planStarttime
				+ ", planEndtime=" + planEndtime + ", planPublished='" + planPublished + '\'' + ", planStatus="
				+ planStatus + ", activities=" + activities + '}';
	}
}