package com.perennial.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perennial.eshop.entities.Product;
import com.perennial.eshop.forms.AddToCartForm;
import com.perennial.eshop.forms.SignUpForm;
import com.perennial.eshop.services.ShoppingService;

@RestController
@RequestMapping("/shop")
public class ShoppingController {


	@Autowired
	private ShoppingService shoppingService;
	
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		return this.shoppingService.getAllProducts();
	}
	
	
	@PostMapping("/addtocart")
	public ResponseEntity<String> addToCard(@RequestBody AddToCartForm addToCartForm) {
		System.out.println(addToCartForm);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

}
