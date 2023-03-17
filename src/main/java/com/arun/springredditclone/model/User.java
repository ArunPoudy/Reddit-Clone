package com.arun.springredditclone.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long userId;
	
	@NotBlank(message="username is required")
	private String username;
	
	@NotBlank(message="password is required")
	private String password;
	
	@Email
	@NotEmpty(message="email is required")
	private String email;
	
	private Instant created; // <-- Timestamp when the user is created
	
	private boolean enabled; //<-- This means user is logged in successfully. And a verification token/session is generated
	
	public User() {
		
	}

}
