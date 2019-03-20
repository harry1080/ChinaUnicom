package com.yue.pojo;

import java.util.Date;

/**
 * Visit entity. @author MyEclipse Persistence Tools
 */

public class Visit implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer visitId;
	private Khvalue khvalue;
	private String visitPurpose;
	private Date visitDate;
	private String visitResult;
	private String visitDetail;

	// Constructors

	/** default constructor */
	public Visit() {
	}

	/** minimal constructor */
	public Visit(Khvalue khvalue) {
		this.khvalue = khvalue;
	}

	/**
	 * @param visitId
	 * @param visitPurpose
	 * @param visitDate
	 * @param visitResult
	 * @param visitDetail
	 */
	public Visit(Integer visitId, String visitPurpose, Date visitDate,
			String visitResult, String visitDetail) {
		super();
		this.visitId = visitId;
		this.visitPurpose = visitPurpose;
		this.visitDate = visitDate;
		this.visitResult = visitResult;
		this.visitDetail = visitDetail;
	}

	/** full constructor */
	public Visit(Khvalue khvalue, String visitPurpose, Date visitDate,
			String visitResult, String visitDetail) {
		this.khvalue = khvalue;
		this.visitPurpose = visitPurpose;
		this.visitDate = visitDate;
		this.visitResult = visitResult;
		this.visitDetail = visitDetail;
	}

	// Property accessors

	public Integer getVisitId() {
		return this.visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public Khvalue getKhvalue() {
		return this.khvalue;
	}

	public void setKhvalue(Khvalue khvalue) {
		this.khvalue = khvalue;
	}

	public String getVisitPurpose() {
		return this.visitPurpose;
	}

	public void setVisitPurpose(String visitPurpose) {
		this.visitPurpose = visitPurpose;
	}

	public Date getVisitDate() {
		return this.visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public String getVisitResult() {
		return this.visitResult;
	}

	public void setVisitResult(String visitResult) {
		this.visitResult = visitResult;
	}

	public String getVisitDetail() {
		return this.visitDetail;
	}

	public void setVisitDetail(String visitDetail) {
		this.visitDetail = visitDetail;
	}

}