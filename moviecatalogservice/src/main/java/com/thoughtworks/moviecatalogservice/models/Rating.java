package com.thoughtworks.moviecatalogservice.models;

public class Rating {
    private final int rating;
    private final int movieId;

    public Rating(int movieId, int rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getRating() {
        return rating;
    }
}
