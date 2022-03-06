package com.thoughtworks.movies;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Value("${name}")
    private String name;

    @GetMapping("/hello")
    public String display(){
        return "Hello world!!!!, Spring App "  + name;
    }
}
