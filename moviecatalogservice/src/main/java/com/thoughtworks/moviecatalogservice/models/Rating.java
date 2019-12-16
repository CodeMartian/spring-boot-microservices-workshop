package com.thoughtworks.moviecatalogservice.models;

public class Rating {
    private int rating;
    private String movieTitle;

    public Rating() {

    }
    public Rating(String movieTitle, int rating) {
        this.movieTitle = movieTitle;
        this.rating = rating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getRating() {
        return rating;
    }
}
