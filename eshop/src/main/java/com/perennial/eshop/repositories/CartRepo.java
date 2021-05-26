package com.perennial.eshop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.perennial.eshop.entities.Cart;

public interface CartRepo extends CrudRepository<Cart, Long>{

}
