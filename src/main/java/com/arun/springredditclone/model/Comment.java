package com.arun.springredditclone.model;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@AllArgsConstructor
public class Comment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long commentId;
	
	@NotEmpty
	private String text;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="postId",referencedColumnName="postId")
	private Post post;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId",referencedColumnName="userId")
	private User user;
	
	
	private Instant created; // <-- Timestamp when the user is created
	
	private boolean enabled; //<-- This means user is logged in successfully. And a verification token/session is generated
	
	
public Comment() {
		
	}

}
