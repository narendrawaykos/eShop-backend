package com.perennial.eshop.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.perennial.eshop.entities.User;

public interface UserRepo extends CrudRepository<User, Long> {

	boolean existsByUserNo(String username);
	Optional<User> findByUserNo(String username);
}
