package com.arun.springredditclone.service;

import java.time.Instant;
import java.util.UUID;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arun.springredditclone.dto.RegisterRequest;
import com.arun.springredditclone.model.User;
import com.arun.springredditclone.model.VerificationToken;
import com.arun.springredditclone.repository.UserRepository;
import com.arun.springredditclone.repository.VerificationTokenRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthService {

	//This contains the main business logic  to register the user request
	
	private final PasswordEncoder passwordEncoder; //Create field injection
	private final UserRepository userRepository;   //Create field injection
	private final VerificationTokenRepository verificationTokenRepository;
	
	@Transactional
	public void signUp(RegisterRequest registerrequest) {
		
		User user=new User();
		
		user.setUsername(registerrequest.getUsername());
		user.setEmail(registerrequest.getEmail());
		user.setPassword(passwordEncoder.encode(registerrequest.getPassword()));
		user.setCreated(Instant.now());
		user.setEnabled(false);
		
		userRepository.save(user); //Save the user
		
		String token = generateVerificationToken(user); //generate token for user
	}
	
	//write a method for token generation and return the token to the Singned user
	private String generateVerificationToken(User user) {
		
		String token= UUID.randomUUID().toString();
		
		VerificationToken verificationToken = new VerificationToken();
		verificationToken.setToken(token);
		verificationToken.setUser(user);
		
		verificationTokenRepository.save(verificationToken);
		
		
		return token;
		
	}
}
