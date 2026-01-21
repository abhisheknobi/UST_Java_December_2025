package com.simplemovie.service;

import com.simplemovie.entity.Movie;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.MovieRepository;
import com.simplemovie.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    private ShowRepository showRepository;

    @Autowired
    private MovieRepository movieRepository;

    // API 3: Create Show
    public Show createShow(Show show) {
        // 1. Verify the Movie exists
        Long movieId = show.getMovie().getMovieId();
        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new RuntimeException("Movie ID " + movieId + " not found"));

        // 2. Link the full movie object
        show.setMovie(movie);
        
        // 3. Save
        return showRepository.save(show);
    }

    // API 4: Get All Shows
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }

    // API 5: Get Shows by Movie (UPDATED LOGIC)
    public List<Show> getShowsByMovieId(Long movieId) {
        // Step 1: Get EVERY show from the database
        List<Show> allShows = showRepository.findAll();
        
        // Step 2: Create a separate list to hold the matches
        List<Show> filteredShows = new ArrayList<>();

        // Step 3: Loop through them and pick the ones that match the Movie ID
        for (Show show : allShows) {
            if (show.getMovie().getMovieId().equals(movieId)) {
                filteredShows.add(show);
            }
        }
        
        return filteredShows;
    }
}