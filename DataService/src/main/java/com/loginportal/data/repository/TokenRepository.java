package com.loginportal.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {
	@Query("select t from Token t where t.tokenID = :tokenID")
	public Optional<Token> getToken(@Param("tokenID") Long tokenID);
	
	@Query("select t from Token t where t.userID = :userID")
	public List<Token> getTokensByUserID(Long userID);
	
	@Modifying(clearAutomatically = true)
	@Query("delete from Token t where t.userID = :userID")
	public void deleteTokenByUserID(@Param("userID") Long userID);
	
	@Modifying(clearAutomatically = true)
	@Query("delete from Token t where t.tokenID = :tokenID")
	public void deleteTokenByTokenID(@Param("tokenID") Long tokenID);
}
