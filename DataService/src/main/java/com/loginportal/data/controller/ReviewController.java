package com.loginportal.data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.Review;
import com.loginportal.data.model.User;
import com.loginportal.data.service.ReviewService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/review")
@EnableSwagger2
@Api(value = "Operations pertaining to review")
public class ReviewController {

	@Autowired
	ReviewService reviewService;

	@GetMapping("/findAll")
	@ApiOperation(value = "${ReviewController.findAll.value}", notes = "${ReviewController.findAll.notes}", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public List<Review> getReviews() {
		return reviewService.getReviews();
	}

	@PostMapping("/find-by-user")
	@ApiOperation(value = "${ReviewController.find-by-user.value}", notes = "${ReviewController.find-by-user.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Optional<Review> getReview(@ApiParam(value = "${ReviewController.find-by-user.param}", required = true) @RequestBody User user) {
		return reviewService.getReview(user.getUserID());
	}
	
	@PostMapping("/change-name")
	@ApiOperation(value = "${ReviewController.change-name.value}", notes = "${ReviewController.change-name.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String changeName(@ApiParam(value = "${ReviewController.change-name.param}", required = true) @RequestBody User user) {
		return reviewService.changeName(user.getUserID());
	}
	
	@PostMapping("/delete-user")
	@ApiOperation(value = "${ReviewController.delete-user.value}", notes = "${ReviewController.delete-user.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String deleteUser(@ApiParam(value = "${ReviewController.delete-user.param}", required = true) @RequestBody User user) {
		return reviewService.deleteUser(user.getUserID());
	}

	@PostMapping("/delete-reviews")
	@ApiOperation(value = "${ReviewController.delete-reviews.value}", notes = "${ReviewController.delete-reviews.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String deleteReviews(@ApiParam(value = "${ReviewController.delete-reviews.param}", required = true) @RequestBody User user) {
		return reviewService.deleteReviews(user.getUserID());
	}
	
	@PostMapping("/create")
	@ApiOperation(value = "${ReviewController.create.value}", notes = "${ReviewController.create.notes}", response = Review.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 201, message = "CREATED")
	})
	public Review create(@ApiParam(value = "${ReviewController.create.param}", required = true) @RequestBody Review review) {
		return reviewService.create(review);
	}
}
