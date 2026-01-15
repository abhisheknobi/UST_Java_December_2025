package com.example.Assignment_Spring_Boot.fact;

import org.springframework.stereotype.Service;

@Service
public class FactService {
	
	public int func(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
	

}
