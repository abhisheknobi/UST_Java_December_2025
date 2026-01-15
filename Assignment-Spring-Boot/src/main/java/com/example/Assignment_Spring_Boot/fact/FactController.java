package com.example.Assignment_Spring_Boot.fact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactController {
	
	@Autowired
	private FactService factService;
	
	@GetMapping(value="/factorial/{num}")
	public int getFact(int num) {
		return factService.func(num);
	}

}
