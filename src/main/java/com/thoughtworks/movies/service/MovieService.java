package com.thoughtworks.movies.service;

import com.thoughtworks.movies.entity.Movie;
import com.thoughtworks.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> movies() {
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movies) {
        return movieRepository.save(movies);

    }

    public Movie updateMovie(int id, Movie movies) {
        return movieRepository.save(movies);
    }
}
