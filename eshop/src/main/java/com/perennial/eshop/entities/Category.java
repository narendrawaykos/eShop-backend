package com.perennial.eshop.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Category {

	@Id
	@Column(name = "cat_id")
	private int catId;
	
	@Column(name = "category_name")
	private String categoryName;
	
	@ManyToOne
	@JoinColumn(name ="parent_id")
	private Category parent;
	
	public Category() {
	}
	
	public Category(int catId, String categoryName, Category parent) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
		this.parent = parent;
	}
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category getParent() {
		return parent;
	}
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	
}
