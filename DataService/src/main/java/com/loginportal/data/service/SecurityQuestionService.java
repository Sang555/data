package com.loginportal.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.repository.SecurityQuestionRepository;
import com.loginportal.data.model.SecurityQuestion;

@Service
public class SecurityQuestionService {

	@Autowired
	SecurityQuestionRepository securityQuestionRepository;

	public List<SecurityQuestion> getSecurityQuestions() {
		return securityQuestionRepository.findAll();
	}
}
