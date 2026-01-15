package com.example.Assignment_Spring_Boot.even_odd;

import org.springframework.stereotype.Service;

@Service
public class CheckEvenService {
	
	public String func(int a) {
		if(a%2==0)
			return "Even";
		return "odd";
		
	}

}
