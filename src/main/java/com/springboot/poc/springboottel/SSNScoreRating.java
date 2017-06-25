package com.springboot.poc.springboottel;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSNScoreRating {
	
	@RequestMapping("/")
    public String index() {
        return "Welcome to SSN score calculation!";
    }

}
