package com.loginportal.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.PasswordHistory;
import com.loginportal.data.model.User;
import com.loginportal.data.service.PasswordHistoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/password-history")
@EnableSwagger2
@Api(value = "Operations pertaining to password history")
public class PasswordHistoryController {

	@Autowired
	PasswordHistoryService passwordHistoryService;

	@PostMapping("/update")
	@ApiOperation(value = "${PasswordHistoryController.update.value}", notes = "${PasswordHistoryController.update.notes}", response = Integer.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Integer updatePassword(@ApiParam(value = "${PasswordHistoryController.update.param}", required = true) @RequestBody PasswordHistory passwordHistory) {
		return passwordHistoryService.changePassword(passwordHistory);
	}
}
