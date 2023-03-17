package com.arun.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Subreddit extends JpaRepository<Subreddit, Long> {

}
