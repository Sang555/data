package com.loginportal.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.PasswordHistory;

@Repository
public interface PasswordHistoryRepository extends JpaRepository<PasswordHistory, Long> {
	@Modifying(clearAutomatically = true)
	@Query("update PasswordHistory ph set ph.pwd1 = :pwd1, ph.pwd2 = :pwd2, ph.pwd3 = :pwd3, ph.salt1 = :salt1, ph.salt2 = :salt2, ph.salt3 = :salt3 where ph.passId = :passID")
	int updatePassword(@Param("passID") Long passID, @Param("pwd1") String pwd1, @Param("pwd2") String pwd2,
			@Param("pwd3") String pwd3, @Param("salt1") String salt1, @Param("salt2") String salt2,
			@Param("salt3") String salt3);
}
