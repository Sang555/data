package com.loginportal.data.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginportal.data.model.Review;
import com.loginportal.data.repository.ReviewRepository;
import com.loginportal.data.repository.UserRepository;

@Service
public class ReviewService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	ReviewRepository reviewRepository;

	public List<Review> getReviews() {
		try {
			return reviewRepository.getReviews();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public Optional<Review> getReview(Long userID) {
		try {
			return reviewRepository.getReviewByUserID(userID);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	@Transactional
	public String changeName(Long userID) {
		try {
			System.out.println("Welcome");
			String firstName = "anonymous";
			reviewRepository.updateName(userID, firstName);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Transactional
	public String deleteUser(Long userID) {
		try {
			userRepository.deleteUser(userID);
			return "Success";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Transactional
	public String deleteReviews(Long userID) {
		try {
			reviewRepository.deleteReviews(userID);
			return "done";
		} catch (Exception e) {
			return "error";
		}
	}
	
	@Transactional
	public Review create(Review review) {
		return reviewRepository.save(review);
	}
}
