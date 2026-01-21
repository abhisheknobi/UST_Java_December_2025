package com.simplemovie.service;

import com.simplemovie.entity.Movie;
import com.simplemovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    // API 1: Add Movie
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    // API 2: Get All Movies
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    
}