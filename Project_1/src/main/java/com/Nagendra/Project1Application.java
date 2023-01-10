package com.Nagendra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Project1Application {
	
	@RequestMapping(value="/")
	public String index() {
		return "Hi Hello Nagendra";
	}

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}

}
