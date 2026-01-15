package com.example.Assignment_Spring_Boot.assignment10;

import org.springframework.stereotype.Service;

@Service
class PrimeService {
    public String checkPrime(int num) {
        if (num <= 1) return num + " is not a prime number";
        // Check divisibility up to square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return num + " is not a prime number";
            }
        }
        return num + " is a prime number";
    }
}

