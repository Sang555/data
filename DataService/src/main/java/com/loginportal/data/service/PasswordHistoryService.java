package com.loginportal.data.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.PasswordHistory;
import com.loginportal.data.repository.PasswordHistoryRepository;

@Service
public class PasswordHistoryService {

	@Autowired
	PasswordHistoryRepository passwordHistoryRepository;

	@Transactional
	public int changePassword(PasswordHistory passwordHistory) {
		return passwordHistoryRepository.updatePassword(passwordHistory.getPassId(),
				passwordHistory.getPwd1(), passwordHistory.getPwd2(), passwordHistory.getPwd3(), passwordHistory.getSalt1(), passwordHistory.getSalt2(), passwordHistory.getSalt3());
	}
}
