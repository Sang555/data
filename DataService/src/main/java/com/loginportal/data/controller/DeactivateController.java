package com.loginportal.data.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginportal.data.model.Deactivate;
import com.loginportal.data.model.User;
import com.loginportal.data.service.DeactivateService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@RequestMapping("/api/data/deactivate")
@EnableSwagger2
@Api(value = "Operations pertaining to deactivate")
public class DeactivateController {
	@Autowired
	DeactivateService deactivateService;

	@PostMapping("/find-by-id")
	@ApiOperation(value = "${DeactivateController.find-by-id.value}", notes = "${DeactivateController.find-by-id.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Optional<Deactivate> getDeactivateByID(@ApiParam(value = "${DeactivateController.find-by-id.param}", required = true) @RequestBody Deactivate deactivate) {
		return deactivateService.getDeactivateByID(deactivate);
	}
	
	@PostMapping("/find-by-userid")
	@ApiOperation(value = "${DeactivateController.find-by-userid.value}", notes = "${DeactivateController.find-by-userid.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public Optional<Deactivate> getDeactivateByUserID(@ApiParam(value = "${DeactivateController.find-by-userid.param}", required = true) @RequestBody User user) {
		return deactivateService.getDeactivateByUserID(user);
	}
	
	@PostMapping("/create")
	@ApiOperation(value = "${DeactivateController.create.value}", notes = "${DeactivateController.create.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 201, message = "CREATED")
	})
	public Deactivate create(@ApiParam(value = "${DeactivateController.create.param}", required = true) @RequestBody Deactivate deactivate) {
		return deactivateService.create(deactivate);
	}
	
	@PostMapping("/delete")
	@ApiOperation(value = "${DeactivateController.delete.value}", notes = "${DeactivateController.delete.notes}", response = Optional.class)
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "SUCCESS | OK"),
			@ApiResponse(code = 404, message = "NOT FOUND")
	})
	public String deleteDeactivateByUserID(@ApiParam(value = "${DeactivateController.delete.param}", required = true) @RequestBody User user) {
		deactivateService.deleteDeactivateByUserID(user);
		return "success";
	}
}
