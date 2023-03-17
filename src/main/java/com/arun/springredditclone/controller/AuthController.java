package com.arun.springredditclone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.springredditclone.dto.RegisterRequest;
import com.arun.springredditclone.service.AuthService;

@RestController
@RequestMapping("api/auth")
public class AuthController {
	
	// Rest Controller is going to make use of Auth Service, therefore import
	// auth service class here
	
	private AuthService authService;
	
	
	// Constructor injection on Rest Service by autowiring injecting the auth service class
	
	@Autowired
	public AuthController(AuthService myAuthService){
		this.authService=myAuthService;
		
	}
	
	

	@PostMapping("/signup")
	public void signUp(@RequestBody RegisterRequest registerrequest) { // <--- @RequestBody is used in POST to Add one
		
		
  }
	
}
