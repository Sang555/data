package com.loginportal.data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.Token;
import com.loginportal.data.model.User;
import com.loginportal.data.service.TokenService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/token")
@EnableSwagger2
@Api(value = "Operations pertaining to token")
public class TokenController {
	@Autowired
	TokenService tokenService;

	@PostMapping("/find-tokens")
	@ApiOperation(value = "${TokenController.find-tokens.value}", notes = "${TokenController.find-tokens.notes}", response = Iterable.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public List<Token> getTokens(@ApiParam(value = "${TokenController.find-tokens.param}", required = true)  @RequestBody User user) {
		return tokenService.getTokens(user);
	}

	@PostMapping("/find-token")
	@ApiOperation(value = "${TokenController.find-token.value}", notes = "${TokenController.find-token.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Optional<Token> getToken(@ApiParam(value = "${TokenController.find-token.param}", required = true) @RequestBody Token token) {
		return tokenService.getToken(token);
	}
	
	@PostMapping("/create")
	@ApiOperation(value = "${TokenController.create.value}", notes = "${TokenController.create.notes}", response = Token.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 201, message = "CREATED")
	})
	public Token create(@ApiParam(value = "${TokenController.create.param}", required = true) @RequestBody Token token) {
		return tokenService.create(token);
	}
	
	@PostMapping("/delete-by-user")
	@ApiOperation(value = "${TokenController.delete-by-user.value}", notes = "${TokenController.delete-by-user.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String deleteTokenByUserID(@ApiParam(value = "${TokenController.delete-by-user.param}", required = true) @RequestBody User user) {
		tokenService.deleteTokenByUserID(user);
		return "success";
	}
	
	@PostMapping("/delete-by-token")
	@ApiOperation(value = "${TokenController.delete-by-token.value}", notes = "${TokenController.delete-by-token.notes}", response = String.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String deleteTokenByTokenID(@ApiParam(value = "${TokenController.delete-by-token.param}", required = true) @RequestBody Token token) {
		tokenService.deleteTokenByTokenID(token);
		return "success";
	}
}
