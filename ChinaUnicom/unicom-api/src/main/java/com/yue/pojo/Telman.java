package com.yue.pojo;

import java.util.Date;

/**
 * Telman entity. @author MyEclipse Persistence Tools
 */

public class Telman implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer telId;
	private Khvalue khvalue;
	private String telName;
	private String telSexz;
	private String telTel;
	private Date telTime;

	// Constructors

	/** default constructor */
	public Telman() {
	}

	/** full constructor */
	public Telman(Khvalue khvalue, String telName, String telSexz,
			String telTel, Date telTime) {
		this.khvalue = khvalue;
		this.telName = telName;
		this.telSexz = telSexz;
		this.telTel = telTel;
		this.telTime = telTime;
	}

	// Property accessors

	/**
	 * @param telId
	 * @param telName
	 * @param telSexz
	 * @param telTel
	 * @param telTime
	 */
	public Telman(Integer telId, String telName, String telSexz, String telTel,
			Date telTime) {
		super();
		this.telId = telId;
		this.telName = telName;
		this.telSexz = telSexz;
		this.telTel = telTel;
		this.telTime = telTime;
	}

	public Integer getTelId() {
		return this.telId;
	}

	public void setTelId(Integer telId) {
		this.telId = telId;
	}

	public Khvalue getKhvalue() {
		return this.khvalue;
	}

	public void setKhvalue(Khvalue khvalue) {
		this.khvalue = khvalue;
	}

	public String getTelName() {
		return this.telName;
	}

	public void setTelName(String telName) {
		this.telName = telName;
	}

	public String getTelSexz() {
		return this.telSexz;
	}

	public void setTelSexz(String telSexz) {
		this.telSexz = telSexz;
	}

	public String getTelTel() {
		return this.telTel;
	}

	public void setTelTel(String telTel) {
		this.telTel = telTel;
	}

	public Date getTelTime() {
		return this.telTime;
	}

	public void setTelTime(Date telTime) {
		this.telTime = telTime;
	}

}