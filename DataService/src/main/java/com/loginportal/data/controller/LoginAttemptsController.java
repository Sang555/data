package com.loginportal.data.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.LoginAttempts;
import com.loginportal.data.model.User;
import com.loginportal.data.service.LoginAttemptsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/loginattempts")
@EnableSwagger2
@Api(value = "Operations pertaining to loginattempts")
public class LoginAttemptsController {
	@Autowired
	LoginAttemptsService loginAttemptsService;

	@PostMapping("/find")
	@ApiOperation(value = "${LoginAttemptsController.find.value}", notes = "${LoginAttemptsController.find.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Optional<LoginAttempts> getLoginAttempts(@ApiParam(value = "${LoginAttemptsController.find.param}", required = true) @RequestBody User user) {
		return loginAttemptsService.getLoginAttempts(user);
	}

	@PostMapping("/update")
	@ApiOperation(value = "${LoginAttemptsController.update.value}", notes = "${LoginAttemptsController.update.notes}", response = Integer.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Integer updateFailedAttempts(@ApiParam(value = "${LoginAttemptsController.update.param}", required = true) @RequestBody LoginAttempts loginAttempts) {
		return loginAttemptsService.updateFailedAttempts(loginAttempts);
	}

	@PostMapping("/create")
	@ApiOperation(value = "${LoginAttemptsController.create.value}", notes = "${LoginAttemptsController.create.notes}", response = LoginAttempts.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 201, message = "CREATED")
	})
	public LoginAttempts create(@ApiParam(value = "${LoginAttemptsController.create.param}", required = true) @RequestBody LoginAttempts loginAttempts) {
		loginAttempts.setBlocked(false);
		return loginAttemptsService.create(loginAttempts);
	}

	@PostMapping("/delete")
	@ApiOperation(value = "${LoginAttemptsController.delete.value}", notes = "${LoginAttemptsController.delete.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String deleteDeactivateByUserID(@ApiParam(value = "${LoginAttemptsController.delete.param}", required = true) @RequestBody User user) {
		loginAttemptsService.deleteLoginAttemptsByUserID(user);
		return "success";
	}
}
