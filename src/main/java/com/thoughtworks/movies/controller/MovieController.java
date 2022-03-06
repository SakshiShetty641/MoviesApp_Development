package com.thoughtworks.movies.controller;

import com.thoughtworks.movies.entity.Movie;
import com.thoughtworks.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/hello")
    public String display(){
        return "Hello world!!!!, Spring App";
    }

    @GetMapping("/movies")
    public List<Movie> movies() {
        return movieService.movies();
    }

    @PostMapping("/addMovies")
    public Movie addMovie(@RequestBody Movie movies) {
        return movieService.addMovie(movies);
    }
}