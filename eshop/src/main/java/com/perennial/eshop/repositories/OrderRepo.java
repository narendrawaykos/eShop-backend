package com.perennial.eshop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.perennial.eshop.entities.Order;

public interface OrderRepo extends CrudRepository<Order, Long>{

}
