package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringIntializer {

	@RequestMapping(value = "/intilaizer")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}