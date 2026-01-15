package com.example.Assignment_Spring_Boot.assignment13;

import org.springframework.stereotype.Service;


@Service
class InterestService {
    public double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}

