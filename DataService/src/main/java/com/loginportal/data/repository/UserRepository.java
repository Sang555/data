package com.loginportal.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("select u from User u where u.emailID = :emailID")
	Optional<User> getUserByEmailID(@Param("emailID") String emailID);

	@Query("select u from User u where u.userID = :userID")
	Optional<User> getUserByUserID(@Param("userID") Long userID);
	
	@Modifying
	@Query("delete from User u where u.userID = :userID")
	void deleteUser(@Param("userID") Long userID);
}
