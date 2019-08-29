package com.loginportal.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.SecurityQuestion;
import com.loginportal.data.service.SecurityQuestionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/security-question")
@EnableSwagger2
@Api(value = "Operations pertaining to security question")
public class SecurityQuestionController {

	@Autowired
	SecurityQuestionService securityQuestionService;

	@GetMapping("/find")
	@ApiOperation(value = "${SecurityQuestionController.find.value}", notes = "${SecurityQuestionController.find.notes}", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public List<SecurityQuestion> getSecurityQuestions() {
		return securityQuestionService.getSecurityQuestions();
	}
}
