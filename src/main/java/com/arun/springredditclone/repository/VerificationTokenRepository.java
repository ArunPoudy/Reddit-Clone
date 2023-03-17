package com.arun.springredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.springredditclone.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

}
