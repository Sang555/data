package com.loginportal.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.ActiveUser;
import com.loginportal.data.model.User;
import com.loginportal.data.service.ActiveUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/active-user")
@EnableSwagger2
@Api(value = "Operations pertaining to active user")
public class ActiveUserController {
	@Autowired
	ActiveUserService activeUserService;

	@PostMapping("/find")
	@ApiOperation(value = "${ActiveUserController.find.value}", notes = "${ActiveUserController.find.notes}", response = Iterable.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND") })
	public List<ActiveUser> getActiveUsers(
			@ApiParam(value = "${ActiveUserController.find.param}", required = true) @RequestBody User user) {
		return activeUserService.getActiveUsers(user);
	}

	@PostMapping("/create")
	@ApiOperation(value = "${ActiveUserController.create.value}", notes = "${ActiveUserController.create.notes}", response = ActiveUser.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 201, message = "CREATED"),
	})
	public ActiveUser create(@ApiParam(value = "${ActiveUserController.create.param}", required = true) @RequestBody ActiveUser activeUser) {
		return activeUserService.create(activeUser);
	}

	@PostMapping("/delete")
	@ApiOperation(value = "${ActiveUserController.delete.value}", notes = "${ActiveUserController.delete.notes}", response = ActiveUser.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND"),
	})
	public String deleteActiveUser(@ApiParam(value = "${ActiveUserController.delete.param}", required = true) @RequestBody ActiveUser activeUser) {
		activeUserService.deleteActiveUserByIP(activeUser);
		return "success";
	}
}
