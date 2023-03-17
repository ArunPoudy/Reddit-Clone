package com.arun.springredditclone.model;

import java.time.Instant;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
@AllArgsConstructor
public class Subreddit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long subredditId;
	
	@NotBlank(message="Comunity name is required")
	private String communityName;
	
	@NotBlank(message="Description is required")
	private String description;
	
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Post> posts;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	private Instant created; // <-- Timestamp when the user is created
	
   public Subreddit() {
		
	}
}
