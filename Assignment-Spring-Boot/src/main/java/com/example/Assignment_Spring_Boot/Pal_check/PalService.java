package com.example.Assignment_Spring_Boot.Pal_check;

import org.springframework.stereotype.Service;

@Service
public class PalService {
	
	public boolean func(String s) {
		if (s == null) return false;
	    
	    int left = 0;
	    int right = s.length() - 1;

	    while (left < right) {
	        // Compare characters
	        if (s.charAt(left) != s.charAt(right)) {
	            return false; // Mismatch found, not a palindrome
	        }
	        left++;
	        right--;
	    }
	    return true; // If we get here, it matches perfectly
	}

}
