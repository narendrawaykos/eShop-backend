package com.perennial.eshop.config;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.perennial.eshop.entities.User;
import com.perennial.eshop.repositories.UserRepo;

@Service
public class MyUserDetailService implements UserDetailsService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByUserNo(username);
		
		if (!user.isPresent()) {
			throw new UsernameNotFoundException(username);
		} else 
			return new MyUserDetails(user.get());
		
	}
}
