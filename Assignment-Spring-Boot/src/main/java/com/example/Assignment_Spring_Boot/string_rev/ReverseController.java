package com.example.Assignment_Spring_Boot.string_rev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
	
	@Autowired
	private ReverseService reverseService;
	
	public String getReverse(String s) {
		return reverseService.func(s);
	}
	
	

}
