package com.loginportal.data.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.Token;
import com.loginportal.data.model.User;
import com.loginportal.data.repository.TokenRepository;

@Service
public class TokenService {
	@Autowired
	TokenRepository tokenRepository;
	
	@Transactional
	public List<Token> getTokens(User user) {
		return tokenRepository.getTokensByUserID(user.getUserID());
	}
	
	@Transactional
	public Optional<Token> getToken(Token token) {
		return tokenRepository.getToken(token.getTokenID());
	}
	
	@Transactional
	public Token create(Token token) {
		return tokenRepository.save(token);
	}
	
	@Transactional
	public void deleteTokenByUserID(User user) {
		tokenRepository.deleteTokenByUserID(user.getUserID());
	}
	
	@Transactional
	public void deleteTokenByTokenID(Token token) {
		tokenRepository.deleteTokenByTokenID(token.getTokenID());
	}
}
