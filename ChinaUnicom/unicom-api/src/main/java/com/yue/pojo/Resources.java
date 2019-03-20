package com.yue.pojo;

import java.util.Date;

/**
 * Resources entity. @author MyEclipse Persistence Tools
 */

public class Resources implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer resourceId;
	private Users users;
	private Activity activity;
	private Integer resourceQuantuty;
	private Integer resourceType;
	private String resourceDistribution;
	private String resourceAbility;
	private String resourcePropaganda;
	private Integer resourcePromotions;
	private String userName;
	private Date resourceTime;
	private Integer resourceStaff;

	// Constructors

	/** default constructor */
	public Resources() {
	}

	/**
	 * @param users
	 * @param activity
	 * @param resourceQuantuty
	 * @param resourceType
	 * @param resourceDistribution
	 * @param resourceAbility
	 * @param resourcePropaganda
	 * @param resourcePromotions
	 * @param resourceTime
	 * @param resourceStaff
	 */
	public Resources(Users users, Activity activity, Integer resourceQuantuty,
			Integer resourceType, String resourceDistribution,
			String resourceAbility, String resourcePropaganda,
			Integer resourcePromotions, Date resourceTime,
			Integer resourceStaff, String userName) {
		this.users = users;
		this.activity = activity;
		this.resourceQuantuty = resourceQuantuty;
		this.resourceType = resourceType;
		this.resourceDistribution = resourceDistribution;
		this.resourceAbility = resourceAbility;
		this.userName = userName;
		this.resourcePropaganda = resourcePropaganda;
		this.resourcePromotions = resourcePromotions;
		this.resourceTime = resourceTime;
		this.resourceStaff = resourceStaff;
	}

	/**
	 * @param resourceId
	 * @param resourceQuantuty
	 * @param resourceType
	 * @param resourceDistribution
	 * @param resourceAbility
	 * @param resourcePropaganda
	 * @param resourcePromotions
	 * @param resourceStaff
	 */
	public Resources(Integer resourceId, Integer resourceQuantuty,
			Integer resourceType, String resourceDistribution,
			String resourceAbility, String resourcePropaganda,
			Integer resourcePromotions, Integer resourceStaff) {
		this.resourceId = resourceId;
		this.resourceQuantuty = resourceQuantuty;
		this.resourceType = resourceType;
		this.resourceDistribution = resourceDistribution;
		this.resourceAbility = resourceAbility;
		this.resourcePropaganda = resourcePropaganda;
		this.resourcePromotions = resourcePromotions;
		this.resourceStaff = resourceStaff;
	}

	/** minimal constructor */
	public Resources(Users users, Activity activity) {
		this.users = users;
		this.activity = activity;
	}

	/** full constructor */
	public Resources(Users users, Activity activity, Integer resourceQuantuty,
			Integer resourceType, String resourceDistribution,
			String resourceAbility, String resourcePropaganda,
			Integer resourcePromotions, String userName, Date resourceTime,
			Integer resourceStaff) {
		this.users = users;
		this.activity = activity;
		this.resourceQuantuty = resourceQuantuty;
		this.resourceType = resourceType;
		this.resourceDistribution = resourceDistribution;
		this.resourceAbility = resourceAbility;
		this.resourcePropaganda = resourcePropaganda;
		this.resourcePromotions = resourcePromotions;
		this.userName = userName;
		this.resourceTime = resourceTime;
		this.resourceStaff = resourceStaff;
	}

	// Property accessors

	public Integer getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Activity getActivity() {
		return this.activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public Integer getResourceQuantuty() {
		return this.resourceQuantuty;
	}

	public void setResourceQuantuty(Integer resourceQuantuty) {
		this.resourceQuantuty = resourceQuantuty;
	}

	public Integer getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceDistribution() {
		return this.resourceDistribution;
	}

	public void setResourceDistribution(String resourceDistribution) {
		this.resourceDistribution = resourceDistribution;
	}

	public String getResourceAbility() {
		return this.resourceAbility;
	}

	public void setResourceAbility(String resourceAbility) {
		this.resourceAbility = resourceAbility;
	}

	public String getResourcePropaganda() {
		return this.resourcePropaganda;
	}

	public void setResourcePropaganda(String resourcePropaganda) {
		this.resourcePropaganda = resourcePropaganda;
	}

	public Integer getResourcePromotions() {
		return this.resourcePromotions;
	}

	public void setResourcePromotions(Integer resourcePromotions) {
		this.resourcePromotions = resourcePromotions;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getResourceTime() {
		return this.resourceTime;
	}

	public void setResourceTime(Date resourceTime) {
		this.resourceTime = resourceTime;
	}

	public Integer getResourceStaff() {
		return this.resourceStaff;
	}

	public void setResourceStaff(Integer resourceStaff) {
		this.resourceStaff = resourceStaff;
	}

}