package com.example.hcltrial5.helloController1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {

	@RequestMapping("")
	public String show() {
		return "Hi, how are you?";
	}
	@RequestMapping("/hi")
	public String lol() {
		return "Works new image";
	}
	@RequestMapping("/error1")
	public String errorMessage() {
		return "You are accessing a invalid url";
	}
	

	@RequestMapping("/hello")
	public String helloMessage() {
		return "Hello World";
	}
}

