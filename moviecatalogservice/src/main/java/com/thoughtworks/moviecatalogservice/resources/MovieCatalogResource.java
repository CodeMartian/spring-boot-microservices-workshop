package com.thoughtworks.moviecatalogservice.resources;

import com.thoughtworks.moviecatalogservice.models.CatalogItem;
import com.thoughtworks.moviecatalogservice.models.Movie;
import com.thoughtworks.moviecatalogservice.models.Rating;
import com.thoughtworks.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.catalog.Catalog;
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
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        UserRating ratings = template.getForObject("http://localhost:8082/ratings/users/" + userId, UserRating.class);

        return ratings.getRatings().stream().map(rating -> {
            Movie movie = template.getForObject("http://localhost:8080/movies/" + rating.getMovieTitle(), Movie.class);
            return new CatalogItem(movie.getTitle(), movie.getDescription(), rating.getRating());
        }).collect(Collectors.toList());

    }
}
