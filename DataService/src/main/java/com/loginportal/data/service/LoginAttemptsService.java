package com.loginportal.data.service;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.LoginAttempts;
import com.loginportal.data.model.User;
import com.loginportal.data.repository.LoginAttemptsRepository;

@Service
public class LoginAttemptsService {
	@Autowired
	LoginAttemptsRepository loginAttemptsRepository;
	
	private static Logger logger = LoggerFactory.getLogger(LoginAttempts.class);

	@Transactional
	public Optional<LoginAttempts> getLoginAttempts(User user) {
		return loginAttemptsRepository.getLoginAttemptsByUserID(user.getUserID());
	}

	@Transactional
	public int updateFailedAttempts(LoginAttempts loginAttempts) {
		LocalDateTime now = LocalDateTime.now();
		return loginAttemptsRepository.updateFailedAttempts(loginAttempts.getUserID(),
				loginAttempts.getNumberOfAttempts(), loginAttempts.getBlocked(), now);
	}

	@Transactional
	public LoginAttempts create(LoginAttempts loginAttempts) {
		LocalDateTime now = LocalDateTime.now();
//		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		loginAttempts.setLastAttempt(now);
		logger.info("{}", loginAttempts.getLastAttempt());
		return loginAttemptsRepository.save(loginAttempts);
	}
	
	@Transactional
	public void deleteLoginAttemptsByUserID(User user) {
		loginAttemptsRepository.deleteLoginAttemptsByUserID(user.getUserID());
	}
}
