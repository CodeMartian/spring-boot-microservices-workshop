package com.thoughtworks.ratingsdataservice.models;

public class Rating {
    private final int rating;
    private final String movieTitle;

    public Rating(String movieTitle, int rating) {
        this.movieTitle = movieTitle;
        this.rating = rating;
    }

    public String getmovieTitle() {
        return movieTitle;
    }

    public int getRating() {
        return rating;
    }
}
