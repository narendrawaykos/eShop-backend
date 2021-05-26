package com.perennial.eshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.perennial.eshop.entities.Product;
import com.perennial.eshop.forms.AddToCartForm;
import com.perennial.eshop.repositories.ProductRepo;


@Service
public class ShoppingService {

	@Autowired
	private ProductRepo productRepo;
	

	public List<Product> getAllProducts() {
		return this.productRepo.findAll();
	}
	
	public ResponseEntity<String> addToCard(@RequestBody AddToCartForm addToCartForm) {
		System.out.println(addToCartForm);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
