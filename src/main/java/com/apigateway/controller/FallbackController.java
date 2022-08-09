package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userServiceFallback")
	public String userServiceFallback() {
		
		return "User Service Is Down At This Time !!";
		
	}
	
	@GetMapping("/contactServiceFallback")
	public String contactServiceFallback() {
		
		return "Contact Service Is Down At This Time !!";
		
	}

}
