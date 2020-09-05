package com.devops.DockerizingJenkinsPipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String hello() {
		return "Docker is running Successfully.For incremental changes also build is successful.";
	}
}
