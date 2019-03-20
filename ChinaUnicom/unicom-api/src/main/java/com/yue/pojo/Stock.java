package com.yue.pojo;

import java.util.Date;

/**
 * Stock entity. @author MyEclipse Persistence Tools
 */

public class Stock implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer stockId;
	private Product product;
	private String putStock;
	private String outStock;
	private Date putStocktime;
	private Date outStocktime;
	private Integer linkman;

	// Constructors

	/** default constructor */
	public Stock() {
	}

	/** minimal constructor */
	public Stock(Product product) {
		this.product = product;
	}

	/** full constructor */
	public Stock(Integer stockId, Product product, String putStock,
			String outStock, Date putStocktime, Date outStocktime,
			Integer linkman) {
		this.stockId = stockId;
		this.product = product;
		this.putStock = putStock;
		this.outStock = outStock;
		this.putStocktime = putStocktime;
		this.outStocktime = outStocktime;
		this.linkman = linkman;
	}

	// Property accessors

	public Integer getStockId() {
		return this.stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getPutStock() {
		return this.putStock;
	}

	public void setPutStock(String putStock) {
		this.putStock = putStock;
	}

	public String getOutStock() {
		return this.outStock;
	}

	public void setOutStock(String outStock) {
		this.outStock = outStock;
	}

	public Date getPutStocktime() {
		return this.putStocktime;
	}

	public void setPutStocktime(Date putStocktime) {
		this.putStocktime = putStocktime;
	}

	public Date getOutStocktime() {
		return this.outStocktime;
	}

	public void setOutStocktime(Date outStocktime) {
		this.outStocktime = outStocktime;
	}

	public Integer getLinkman() {
		return this.linkman;
	}

	public void setLinkman(Integer linkman) {
		this.linkman = linkman;
	}

}