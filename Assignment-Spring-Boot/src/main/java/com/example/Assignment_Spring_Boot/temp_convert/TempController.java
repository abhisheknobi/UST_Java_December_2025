package com.example.Assignment_Spring_Boot.temp_convert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {
	
	@Autowired
	private TempService tempService;
	
	@GetMapping(value="/celsius-to-fahrenheit/{celsius}")
	public double getFaren(@PathVariable double celsius) {
		return tempService.func(celsius);
	}
	
}
