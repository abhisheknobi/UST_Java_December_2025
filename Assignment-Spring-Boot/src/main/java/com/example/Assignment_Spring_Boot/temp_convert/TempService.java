package com.example.Assignment_Spring_Boot.temp_convert;

import org.springframework.stereotype.Service;

@Service
public class TempService {
	
	public double func(double celsius) {
		
			return (celsius*(9.0/5.0))+32;
	}

}
