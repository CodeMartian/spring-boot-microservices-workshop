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

    @RequestMapping("/{movieTitle}")
    public Rating getRating(@PathVariable("movieTitle") String movieTitle) {
        return new Rating("The Lion King", 5);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") int userId) {
        List<Rating> ratings = Arrays.asList(new Rating("The Lion King", 5), new Rating("Frozen", 4), new Rating("The Mist", 1), new Rating("Avatar", 5));
        return new UserRating(ratings);
    }
}
