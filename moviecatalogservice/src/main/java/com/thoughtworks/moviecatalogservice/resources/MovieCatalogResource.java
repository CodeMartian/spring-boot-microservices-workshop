package com.thoughtworks.moviecatalogservice.resources;

import com.thoughtworks.moviecatalogservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate template;

    @RequestMapping("/{userId}")
    public ResponseEntity<Catalog> getCatalog(@PathVariable("userId") int userId) {

        UserRating ratings = template.getForObject("http://ratings-data-service/ratings/users/" + userId, UserRating.class);

        Catalog catalog = new Catalog();
        catalog.setCatalogItems(ratings.getRatings().stream().map(rating -> {
            Movie movie = template.getForObject("http://movie-info-service/movies/" + rating.getMovieId(), Movie.class);
            return new CatalogItem(userId, movie, rating);
        }).collect(Collectors.toList()));

        return new ResponseEntity<>(catalog, HttpStatus.OK);
    }
}
