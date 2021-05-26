package com.perennial.eshop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.perennial.eshop.entities.ProductCartMapping;

public interface ProductCartRepo extends CrudRepository<ProductCartMapping, Long>{

}
