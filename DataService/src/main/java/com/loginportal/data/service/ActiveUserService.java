package com.loginportal.data.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.ActiveUser;
import com.loginportal.data.model.User;
import com.loginportal.data.repository.ActiveUserRepository;

@Service
public class ActiveUserService {
	@Autowired
	ActiveUserRepository activeUserRepository;

	@Transactional
	public List<ActiveUser> getActiveUsers(User user) {
		return activeUserRepository.getActiveUsersByUserID(user.getUserID());
	}

	@Transactional
	public ActiveUser create(ActiveUser activeUser) {
		return activeUserRepository.save(activeUser);
	}

	@Transactional
	public void deleteActiveUserByIP(ActiveUser activeUser) {
		activeUserRepository.deleteActiveUserByIP(activeUser.getIpAddress());
	}
}
