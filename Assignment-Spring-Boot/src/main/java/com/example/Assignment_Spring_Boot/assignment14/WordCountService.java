package com.example.Assignment_Spring_Boot.assignment14;

import org.springframework.stereotype.Service;


@Service
class WordCountService {
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        // Split by whitespace to handle multiple spaces correctly
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
}
