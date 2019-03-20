package com.yue.pojo;

import java.util.Date;
import java.util.List;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */
public class Product implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer productId;
	private String productName;
	private Integer productCount;
	private String productFormat;
	private String productItem;
	private Date productStocktime;
	private List<Stock> stocks;

	// Constructors

	/** default constructor */
	public Product() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}

	public String getProductFormat() {
		return productFormat;
	}

	public void setProductFormat(String productFormat) {
		this.productFormat = productFormat;
	}

	public String getProductItem() {
		return productItem;
	}

	public void setProductItem(String productItem) {
		this.productItem = productItem;
	}

	public Date getProductStocktime() {
		return productStocktime;
	}

	public void setProductStocktime(Date productStocktime) {
		this.productStocktime = productStocktime;
	}

	public List<Stock> getStocks() {
		return stocks;
	}

	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Product{" + "productId=" + productId + ", productName='" + productName + '\'' + ", productCount="
				+ productCount + ", productFormat='" + productFormat + '\'' + ", productItem='" + productItem + '\''
				+ ", productStocktime=" + productStocktime + ", stocks=" + stocks + '}';
	}
}