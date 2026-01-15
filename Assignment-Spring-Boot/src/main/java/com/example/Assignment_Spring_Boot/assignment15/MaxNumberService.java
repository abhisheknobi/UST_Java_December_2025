package com.example.Assignment_Spring_Boot.assignment15;

import org.springframework.stereotype.Service;


@Service
class MaxNumberService {
    public int findMax(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }
}

