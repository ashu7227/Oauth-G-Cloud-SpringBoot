package com.oauth2.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oauth2.model.User;

@RestController
@RequestMapping("/hello")
public class TestCon {

	@GetMapping(value = "/login")
	public void getPass() {
		System.out.println("Here");
	}

	@GetMapping(value = "/user")
	public Principal getUser(Principal prinicipal) {
		System.out.println("Prinicipal Here");
		return prinicipal;
	}
	
	@PostMapping(value = "/user/add")
	public void getUser(@RequestBody User user) {
		System.out.println("Prinicipal Here");
		System.out.println(user.toString());
	}
}
