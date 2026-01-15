package com.example.Assignment_Spring_Boot.assignment14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordCountController {

    @Autowired
    private WordCountService wordCountService;

    @PostMapping("/wordcount")
    public String countWords(@RequestBody String text) {
        int count = wordCountService.countWords(text);
        return "Word count: " + count;
    }
}
