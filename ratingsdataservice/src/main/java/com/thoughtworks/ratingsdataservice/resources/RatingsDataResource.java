package com.thoughtworks.ratingsdataservice.resources;

import com.thoughtworks.ratingsdataservice.models.Rating;
import com.thoughtworks.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") int movieId) {
        return new Rating(1, movieId, 5);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") int userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating(userId, 1, 3),
                new Rating(userId, 2, 4),
                new Rating(userId, 3, 2),
                new Rating(userId, 4, 5));
        return new UserRating(ratings);
    }
}
