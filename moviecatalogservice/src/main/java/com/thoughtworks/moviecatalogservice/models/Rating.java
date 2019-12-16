package com.thoughtworks.moviecatalogservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Rating {
    private int userId;
    private int movieId;
    private int rating;


    public Rating() {

    }
    public Rating(int userId, int movieId, int rating) {
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
    }

    @JsonIgnore
    public int getUserId() {
        return userId;
    }

    @JsonIgnore
    public int getMovieId() {
        return movieId;
    }

    public int getRating() {
        return rating;
    }
}

