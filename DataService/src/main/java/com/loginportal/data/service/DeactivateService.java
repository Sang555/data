package com.loginportal.data.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.Deactivate;
import com.loginportal.data.model.User;
import com.loginportal.data.repository.DeactivateRepository;

@Service
public class DeactivateService {
	@Autowired
	DeactivateRepository deactivateRepository;

	@Transactional
	public Optional<Deactivate> getDeactivateByID(Deactivate deactivate) {
		return deactivateRepository.getDeactivateByID(deactivate.getDeactivateId());
	}
	
	@Transactional
	public Optional<Deactivate> getDeactivateByUserID(User user) {
		return deactivateRepository.getDeactivateByUserID(user.getUserID());
	}
	
	@Transactional
	public Deactivate create(Deactivate deactivate) {
		Timestamp timestamp = new Timestamp((new Date()).getTime());
		deactivate.setDeactivateTime(timestamp);
		return deactivateRepository.save(deactivate);
	}
	
	@Transactional
	public void deleteDeactivateByUserID(User user) {
		deactivateRepository.deleteDeactivate(user.getUserID());
	}
}
