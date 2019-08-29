package com.loginportal.data.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.User;
import com.loginportal.data.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/user")
@EnableSwagger2
@Api(value = "Operations pertaining to user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/find")
	@ApiOperation(value = "${UserController.find.value}", notes = "${UserController.find.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Optional<User> getUser(@ApiParam(value = "${UserController.find.param}", required = true) @RequestBody User user) {
		return userService.getUser(user);
	}

	@PostMapping("/create")
	@ApiOperation(value = "${UserController.create.value}", notes = "${UserController.create.notes}", response = User.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 201, message = "CREATED"),
	})
	public User createUser(@ApiParam(value = "${UserController.create.param}", required = true) @RequestBody User user) {
		return userService.createUser(user);
	}
	
	@PostMapping("/delete")
	@ApiOperation(value = "${UserController.delete.value}", notes = "${UserController.delete.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String delete(@ApiParam(value = "${UserController.delete.param}", required = true) @RequestBody User user) {
		userService.delete(user);
		return "success";
	}
}
