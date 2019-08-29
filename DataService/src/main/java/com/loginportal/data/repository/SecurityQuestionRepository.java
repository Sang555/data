package com.loginportal.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.SecurityQuestion;

@Repository
public interface SecurityQuestionRepository extends JpaRepository<SecurityQuestion, Long> {

}
