package com.perennial.eshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.perennial.eshop.entities.User;
import com.perennial.eshop.forms.SignUpForm;
import com.perennial.eshop.repositories.UserRepo;
import com.perennial.eshop.services.AuthService;

@RestController
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@RequestBody @Validated SignUpForm signUpForm) {
		return authService.signUp(signUpForm);
	}
}
