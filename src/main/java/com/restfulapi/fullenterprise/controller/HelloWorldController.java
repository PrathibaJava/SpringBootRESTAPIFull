package com.restfulapi.fullenterprise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfulapi.fullenterprise.model.UserDetails;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/helloBean")
	public UserDetails helloBean() {
		return new UserDetails("I will", "get job in", "Google");	
	}
}
