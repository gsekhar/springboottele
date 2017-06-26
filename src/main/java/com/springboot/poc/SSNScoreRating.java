package com.springboot.poc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSNScoreRating {
	
	@RequestMapping("/")
    public String index() {
        return "Welcome to SSN score calculation!";
    }

}
