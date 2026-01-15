package com.example.Assignment_Spring_Boot.assignment11;

import org.springframework.stereotype.Service;


@Service
class DiscountService {
    public double calculateFinalPrice(double price, double discount) {
        return price - (price * discount / 100);
    }
}

