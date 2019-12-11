package com.thoughtworks.ratingsdataservice.models;

public class Rating {
    private final int rating;
    private final String movieId;

    public Rating(String movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public int getRating() {
        return rating;
    }
}
