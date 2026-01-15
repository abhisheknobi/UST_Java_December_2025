package com.example.Assignment_Spring_Boot.calculate_grade;

import org.springframework.stereotype.Service;

@Service
public class GradeService {
	
	public String func(int num) {
		if(num>=90)
			return "A";
		else if(num>=75)
			return "B";
		else if(num>=60)
			return "C";
		else
			return "fail";
		
	}

}
