package com.yue.pojo;

import java.util.Date;

/**
 * Track entity. @author MyEclipse Persistence Tools
 */

public class Track implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer trackId;
	private String activityNum;
	private Date trackTime;
	private String trackMan;
	private String trackCost;
	private String trackResult;
	private String trackRisk;
	private String trackSchedule;
	private String userName;
	private Date trackRecordtime;

	// Constructors

	/** default constructor */
	public Track() {
	}

	/** full constructor */
	public Track(String activityNum, Date trackTime, String trackMan,
			String trackCost, String trackResult, String trackRisk,
			String trackSchedule, String userName, Date trackRecordtime) {
		this.activityNum = activityNum;
		this.trackTime = trackTime;
		this.trackMan = trackMan;
		this.trackCost = trackCost;
		this.trackResult = trackResult;
		this.trackRisk = trackRisk;
		this.trackSchedule = trackSchedule;
		this.userName = userName;
		this.trackRecordtime = trackRecordtime;
	}

	// Property accessors

	public Integer getTrackId() {
		return this.trackId;
	}

	public void setTrackId(Integer trackId) {
		this.trackId = trackId;
	}

	public String getActivityNum() {
		return this.activityNum;
	}

	public void setActivityNum(String activityNum) {
		this.activityNum = activityNum;
	}

	public Date getTrackTime() {
		return this.trackTime;
	}

	public void setTrackTime(Date trackTime) {
		this.trackTime = trackTime;
	}

	public String getTrackMan() {
		return this.trackMan;
	}

	public void setTrackMan(String trackMan) {
		this.trackMan = trackMan;
	}

	public String getTrackCost() {
		return this.trackCost;
	}

	public void setTrackCost(String trackCost) {
		this.trackCost = trackCost;
	}

	public String getTrackResult() {
		return this.trackResult;
	}

	public void setTrackResult(String trackResult) {
		this.trackResult = trackResult;
	}

	public String getTrackRisk() {
		return this.trackRisk;
	}

	public void setTrackRisk(String trackRisk) {
		this.trackRisk = trackRisk;
	}

	public String getTrackSchedule() {
		return this.trackSchedule;
	}

	public void setTrackSchedule(String trackSchedule) {
		this.trackSchedule = trackSchedule;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getTrackRecordtime() {
		return this.trackRecordtime;
	}

	public void setTrackRecordtime(Date trackRecordtime) {
		this.trackRecordtime = trackRecordtime;
	}

}