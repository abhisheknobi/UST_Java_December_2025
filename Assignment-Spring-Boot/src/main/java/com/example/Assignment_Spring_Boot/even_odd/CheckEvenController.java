package com.example.Assignment_Spring_Boot.even_odd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckEvenController {
	
	@Autowired
	private CheckEvenService checkEvenService;
	
	@GetMapping(value="/evenodd/{num}")
	public String checkEvenOdd(@PathVariable int num) {
		return checkEvenService.func(num);
	}

}
