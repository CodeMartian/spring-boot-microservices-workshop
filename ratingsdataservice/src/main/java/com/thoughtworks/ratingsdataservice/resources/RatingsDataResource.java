package com.thoughtworks.ratingsdataservice.resources;

import com.thoughtworks.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating("The Lion King", 5);
    }
}
