package com.yue.pojo;

import java.sql.Date;
import java.util.List;

/**
 * Khvalue entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Khvalue implements java.io.Serializable {

	// Fields

	private Integer khId;
	private String khName;
	private String khSexz;
	private String khTel;
	private Date khTime;
	private String khDz;
	private List<Visit> visits;
	private List<Telman> telmans;

	public Khvalue() {
	}

	public Integer getKhId() {
		return khId;
	}

	public void setKhId(Integer khId) {
		this.khId = khId;
	}

	public String getKhName() {
		return khName;
	}

	public void setKhName(String khName) {
		this.khName = khName;
	}

	public String getKhSexz() {
		return khSexz;
	}

	public void setKhSexz(String khSexz) {
		this.khSexz = khSexz;
	}

	public String getKhTel() {
		return khTel;
	}

	public void setKhTel(String khTel) {
		this.khTel = khTel;
	}

	public Date getKhTime() {
		return khTime;
	}

	public void setKhTime(Date khTime) {
		this.khTime = khTime;
	}

	public String getKhDz() {
		return khDz;
	}

	public void setKhDz(String khDz) {
		this.khDz = khDz;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	public List<Telman> getTelmans() {
		return telmans;
	}

	public void setTelmans(List<Telman> telmans) {
		this.telmans = telmans;
	}

	@Override
	public String toString() {
		return "Khvalue{" + "khId=" + khId + ", khName='" + khName + '\'' + ", khSexz='" + khSexz + '\'' + ", khTel='"
				+ khTel + '\'' + ", khTime=" + khTime + ", khDz='" + khDz + '\'' + ", visits=" + visits + ", telmans="
				+ telmans + '}';
	}
}