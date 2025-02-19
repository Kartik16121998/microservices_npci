package com.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employeenew")
public class MyController {
	
	@GetMapping
	public String display() {
		return "I'm running my first API inside DOCKER";
	}

}
