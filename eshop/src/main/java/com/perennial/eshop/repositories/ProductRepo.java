package com.perennial.eshop.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.perennial.eshop.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

	List<Product> findAll();
}
