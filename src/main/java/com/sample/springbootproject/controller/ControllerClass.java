package com.sample.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ControllerClass {

	@GetMapping("/")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/user")
	public String getUser() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		return "Welcome Admin";
	}

}
