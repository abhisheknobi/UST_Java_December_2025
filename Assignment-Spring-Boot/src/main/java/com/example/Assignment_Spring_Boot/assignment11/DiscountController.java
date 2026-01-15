package com.example.Assignment_Spring_Boot.assignment11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @GetMapping("/discount")
    public String getDiscountedPrice(@RequestParam double price, @RequestParam double discount) {
        double finalPrice = discountService.calculateFinalPrice(price, discount);
        return "Final price after " + discount + "% discount is: " + finalPrice;
    }
}
