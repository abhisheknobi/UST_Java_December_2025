package com.example.Assignment_Spring_Boot.age_category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController {
	@Autowired
	private AgeService ageService;
	
	@GetMapping(value="/age/{num}")
	public String getAge(@PathVariable int num) {
		return ageService.func(num);
		
	}
	
	

}
