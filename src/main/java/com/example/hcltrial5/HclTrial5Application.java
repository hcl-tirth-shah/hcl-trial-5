package com.example.hcltrial5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HclTrial5Application {
	
//	@RequestMapping("")
//	public String none() {
//		return "Hello World hi";
//		}

	
	public static void main(String[] args) {
		SpringApplication.run(HclTrial5Application.class, args);
	}

}
