package com.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringBootFormHandingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFormHandingApplication.class, args);
	}
	
	@GetMapping("/get")
	public ModelAndView getEmployeeInfo() {
		return new ModelAndView("getEmployees");
	}
}