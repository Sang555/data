package com.loginportal.data.repository;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.LoginAttempts;

@Repository
public interface LoginAttemptsRepository extends JpaRepository<LoginAttempts, Long> {
	@Modifying(clearAutomatically = true)
	@Query("update LoginAttempts set numberOfAttempts = :numberOfAttempts, blocked = :blocked, lastAttempt= :lastAttempt where userID = :userID")
	public int updateFailedAttempts(@Param("userID") Long userID, @Param("numberOfAttempts") int numberOfAttempts,
			@Param("blocked") Boolean blocked, @Param("lastAttempt") LocalDateTime lastAttempt);

	@Query("select la from LoginAttempts la where la.userID = :userID")
	public Optional<LoginAttempts> getLoginAttemptsByUserID(@Param("userID") Long userID);
	
	@Modifying(clearAutomatically = true)
	@Query("delete from LoginAttempts la where la.userID = :userID")
	public void deleteLoginAttemptsByUserID(@Param("userID") Long userID);
}
