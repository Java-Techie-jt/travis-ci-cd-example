package com.javatechie.travis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TravisCiCdApplication {

	@GetMapping("/hello")
	public String welcome(){
		return "welcome to javatechie";
	}

	public static void main(String[] args) {
		SpringApplication.run(TravisCiCdApplication.class, args);
	}

}
