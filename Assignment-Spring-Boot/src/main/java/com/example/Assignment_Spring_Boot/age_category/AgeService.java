package com.example.Assignment_Spring_Boot.age_category;

import org.springframework.stereotype.Service;

@Service
public class AgeService {
	
	public String func(int age) {
		if(age<18)
			return "Child";
		else if(age>=18 && age<=59)
			return "Adult";
		else
			return "Senior";
			
	}

}
