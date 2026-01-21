package com.simplemovie.controller;

import com.simplemovie.entity.Movie;
import com.simplemovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Tells Spring this class handles REST API requests
@RequestMapping("/api/movies") // All URLs in this class start with /api/movies
public class MovieController {

    @Autowired
    private MovieService movieService;

    // API 1: Add Movie
    // URL: POST http://localhost:8080/api/movies
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    // API 2: Get All Movies
    // URL: GET http://localhost:8080/api/movies
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
}