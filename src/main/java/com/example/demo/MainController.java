package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/providers")
    public String getAllProviders() {
        try {
            String s = null;
            return s.length() + "";
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid provider (custome message)", e);
        }
    }

}
