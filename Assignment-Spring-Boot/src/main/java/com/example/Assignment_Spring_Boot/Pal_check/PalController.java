package com.example.Assignment_Spring_Boot.Pal_check;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalController {
	
	@Autowired
	private PalService palService;
	
	@GetMapping(value="/palindrome/{word}")
	public boolean palcheck(String word) {
		return palService.func(word);
	}

}
