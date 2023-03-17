package com.arun.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arun.springredditclone.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>  {

}
