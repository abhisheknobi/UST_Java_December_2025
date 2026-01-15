package com.example.Assignment_Spring_Boot.assignment15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaxNumberController {

    @Autowired
    private MaxNumberService maxNumberService;

    @GetMapping("/max")
    public String getMaxNumber(@RequestParam int a, @RequestParam int b, @RequestParam int c) {
        int max = maxNumberService.findMax(a, b, c);
        return "The maximum number is: " + max;
    }
}
