package com.ycbae.sbt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("/")
	public String root() {
		return "Spring Boot Test";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "Spring Boot Test";
	}

}
