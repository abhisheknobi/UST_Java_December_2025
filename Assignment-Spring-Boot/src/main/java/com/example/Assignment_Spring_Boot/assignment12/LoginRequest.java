package com.example.Assignment_Spring_Boot.assignment12;

import org.springframework.stereotype.Service;


// Simple DTO for Login Request
class LoginRequest {
    public String username;
    public String password;
}

@Service
class LoginService {
    public String validateLogin(String username, String password) {
        if ("admin".equals(username) && "admin123".equals(password)) {
            return "Login Successful";
        }
        return "Login Failed: Invalid Credentials";
    }
}

