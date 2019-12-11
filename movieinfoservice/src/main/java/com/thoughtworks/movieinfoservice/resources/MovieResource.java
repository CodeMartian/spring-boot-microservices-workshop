package com.thoughtworks.movieinfoservice.resources;

import com.thoughtworks.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") int movieId) {
        return new Movie(1, "The Lion King");
    }
}