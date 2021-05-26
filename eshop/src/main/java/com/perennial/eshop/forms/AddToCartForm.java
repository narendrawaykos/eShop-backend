package com.perennial.eshop.forms;

public class AddToCartForm {

	private long productId;
	private long userId;
	private double quantity;

	public AddToCartForm() {

	}

	public AddToCartForm(long productId, long userId, double quantity) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.quantity = quantity;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "AddToCartForm [productId=" + productId + ", userId=" + userId + ", quantity=" + quantity + "]";
	}
	


}
