package com.perennial.eshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.perennial.eshop.entities.User;
import com.perennial.eshop.forms.SignUpForm;
import com.perennial.eshop.repositories.UserRepo;
import com.perennial.eshop.utils.Utils;

@Service
public class AuthService {


	@Autowired
	private UserRepo userRepo;
	
	public ResponseEntity<String> signUp(@RequestBody SignUpForm signUpForm) {
		User user = new User(Utils.idGenerator(), signUpForm.getUsername(), signUpForm.getUsername(), signUpForm.getPassword(), "A");
		if (!this.userRepo.existsByUserNo(signUpForm.getUsername())) {
			this.userRepo.save(user);
			return ResponseEntity.ok("Signed up");
		} else {
			return ResponseEntity.ok("Username Already Exist");
		}
	}
}
