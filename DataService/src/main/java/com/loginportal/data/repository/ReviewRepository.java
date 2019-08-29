package com.loginportal.data.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.loginportal.data.model.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	@Query("select r from Review r")
	public List<Review> getReviews();
	
	@Query("select r from Review r where r.userID = :userID")
	public Optional<Review> getReviewByUserID(Long userID);
	
	@Modifying(clearAutomatically = true)
	@Query("update Review r set r.firstName = :firstName where r.userID = :userID")
	public int updateName(@Param("userID") Long userID, @Param("firstName") String firstName);

	@Modifying(clearAutomatically = true)
	@Query("delete from Review r where r.userID = :userID")
	public void deleteReviews(@Param("userID") Long userID);
}
