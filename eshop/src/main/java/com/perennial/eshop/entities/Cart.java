package com.perennial.eshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@Column(name = "cart_id")
	private long cartId;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User userId;

	
	
	public Cart() {

	}

	public Cart(long cartId, User userId) {
		super();
		this.cartId = cartId;
		this.userId = userId;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

}
