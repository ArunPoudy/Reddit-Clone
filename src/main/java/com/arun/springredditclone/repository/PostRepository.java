package com.arun.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arun.springredditclone.model.Post;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
	
	
// Defining this interface serves two purposes: 
// First, by extending JpaRepository we get a bunch of generic CRUD methods into our type that allows saving Post, deleting them and so on.
// Second, this will allow the Spring Data JPA repository infrastructure to scan the classpath for this interface and create a Spring bean for it.
	
}
