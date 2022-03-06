package com.thoughtworks.movies;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @GetMapping("/hello")
    public String display(){
        return "Hello world!!!!, Spring App";
    }
}
