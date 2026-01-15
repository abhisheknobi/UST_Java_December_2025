package com.example.Assignment_Spring_Boot.calculate_grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {
	
	@Autowired
	private GradeService gradeService;
	
	@GetMapping(value="/grade/{marks}")
	public String getGrade(@PathVariable int marks) {
		return gradeService.func(marks);
	}
	

}
