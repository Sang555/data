package com.loginportal.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.Deactivate;

@Repository
public interface DeactivateRepository extends JpaRepository<Deactivate, Long> {
	@Query("select d from Deactivate d where d.deactivateId = :deactivateId")
	public Optional<Deactivate> getDeactivateByID(@Param("deactivateId") Long deactivateId);
	
	@Query("select d from Deactivate d where d.userID = :userID")
	public Optional<Deactivate> getDeactivateByUserID(@Param("userID") Long userID);
	
	@Modifying(clearAutomatically = true)
	@Query("delete from Deactivate d where d.userID = :userID")
	public void deleteDeactivate(@Param("userID") Long userID);
}
