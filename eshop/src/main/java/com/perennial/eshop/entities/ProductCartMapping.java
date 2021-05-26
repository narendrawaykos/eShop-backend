package com.perennial.eshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProductCartMapping {

	@Id
	@Column(name = "product_cart_id")
	private long productCartMapId;
	
	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	@Column(name = "quantity_in_cart")
	private long quantityInCart;
	
	public ProductCartMapping() {
		
	}
	

	public long getProductCartMapId() {
		return productCartMapId;
	}
	public void setProductCartMapId(long productCartMapId) {
		this.productCartMapId = productCartMapId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	public long getQuantityInCart() {
		return quantityInCart;
	}

	public void setQuantityInCart(long quantityInCart) {
		this.quantityInCart = quantityInCart;
	}
	
	
	
}
