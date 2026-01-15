package com.example.Assignment_Spring_Boot.assignment10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    @Autowired
    private PrimeService primeService;

    @GetMapping("/prime/{num}")
    public String checkPrime(@PathVariable int num) {
        return primeService.checkPrime(num);
    }
}
