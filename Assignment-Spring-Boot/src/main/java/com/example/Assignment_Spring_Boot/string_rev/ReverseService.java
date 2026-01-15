package com.example.Assignment_Spring_Boot.string_rev;

import org.springframework.stereotype.Service;

@Service
public class ReverseService {
	
	public String func(String s) {
		if(s==null){
			return "";
		}
		
		return new StringBuilder(s).reverse().toString();
	}

}
