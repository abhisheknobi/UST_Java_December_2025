package com.simplemovie.controller;

import com.simplemovie.entity.Show;
import com.simplemovie.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shows") // All URLs in this class start with /api/shows
public class ShowController {

    @Autowired
    private ShowService showService;

    // API 3: Create Show
    // URL: POST http://localhost:8080/api/shows
    @PostMapping
    public Show createShow(@RequestBody Show show) {
        return showService.createShow(show);
    }

    // API 4: Get All Shows
    // URL: GET http://localhost:8080/api/shows
    @GetMapping
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }

    // API 5: Get Shows by Movie
    // URL: GET http://localhost:8080/api/shows/movie/1
    @GetMapping("/movie/{movieId}")
    public List<Show> getShowsByMovie(@PathVariable Long movieId) {
        return showService.getShowsByMovieId(movieId);
    }
}