package com.example.Assignment_Spring_Boot.assignment13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterestController {

    @Autowired
    private InterestService interestService;

    @GetMapping("/interest")
    public String getSimpleInterest(@RequestParam double p, @RequestParam double r, @RequestParam double t) {
        double interest = interestService.calculateSimpleInterest(p, r, t);
        return "Simple Interest is: " + interest;
    }
}