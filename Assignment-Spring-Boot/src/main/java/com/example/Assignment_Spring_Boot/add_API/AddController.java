package com.example.Assignment_Spring_Boot.add_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	
	@Autowired
	private AddService addService;
	
	@GetMapping(value="/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		return addService.addition(a, b);
	}

}
