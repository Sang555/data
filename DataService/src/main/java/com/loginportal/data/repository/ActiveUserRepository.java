package com.loginportal.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.ActiveUser;

@Repository
public interface ActiveUserRepository extends JpaRepository<ActiveUser, Long> {
	@Query("select au from ActiveUser au where au.userID = :userID")
	public List<ActiveUser> getActiveUsersByUserID(@Param("userID") Long userID);
	
	@Query("select au from ActiveUser au where au.ipAddress = :ipAddress")
	public ActiveUser getActiveUsersByIP(@Param("ipAddress") String ipAddress);
	
	@Modifying(clearAutomatically = true)
	@Query("delete from ActiveUser au where au.ipAddress = :ipAddress")
	public void deleteActiveUserByIP(@Param("ipAddress") String ipAddress);
}
