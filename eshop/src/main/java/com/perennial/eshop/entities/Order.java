package com.perennial.eshop.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="orders")
public class Order {

	@Id
	@Column(name = "order_id")
	private long orderId;
	@Column(name = "placed_date")
	private Date placedDate;
	@Column(name = "order_no")
	private String orderNo;
	@Column(name = "place_of_supply")
	private String placeOfSupply;
	@Column(name = "estimate_del_date")
	private Date estimateDelDate;
	@Column(name = "order_amount")
	private double orderAmount;
	@Column(name = "total_quantity")
	private long totalQuantity;

	public Order() {
	}

	public Order(long orderId, Date placedDate, String orderNo, String placeOfSupply, Date estimateDelDate,
			double orderAmount, long totalQuantity) {
		super();
		this.orderId = orderId;
		this.placedDate = placedDate;
		this.orderNo = orderNo;
		this.placeOfSupply = placeOfSupply;
		this.estimateDelDate = estimateDelDate;
		this.orderAmount = orderAmount;
		this.totalQuantity = totalQuantity;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Date getPlacedDate() {
		return placedDate;
	}

	public void setPlacedDate(Date placedDate) {
		this.placedDate = placedDate;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPlaceOfSupply() {
		return placeOfSupply;
	}

	public void setPlaceOfSupply(String placeOfSupply) {
		this.placeOfSupply = placeOfSupply;
	}

	public Date getestimateDelDate() {
		return estimateDelDate;
	}

	public void setestimateDelDate(Date estimateDelDate) {
		this.estimateDelDate = estimateDelDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public long getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(long totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

}
