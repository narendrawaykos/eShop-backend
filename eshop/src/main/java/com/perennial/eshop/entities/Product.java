package com.perennial.eshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@Column(name= "product_id")
	private long productId;
	@Column(name= "product_name")
	private String productName;
	private double price;
	private long quantity;
	private String img;
	@Column(name= "product_desc")
	private String productDesc;
	
	@ManyToOne
	@JoinColumn(name="category")
	private Category category;
	
	public Product() {
		
	}
	
	


	public Product(long productId, String productName, double price, long quantity, String img, String productDesc,
			Category category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.img = img;
		this.productDesc = productDesc;
		this.category = category;
	}




	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}




	public Category getCategory() {
		return category;
	}




	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
