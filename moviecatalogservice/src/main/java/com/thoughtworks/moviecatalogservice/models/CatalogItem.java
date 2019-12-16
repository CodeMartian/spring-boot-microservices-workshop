package com.thoughtworks.moviecatalogservice.models;

public class CatalogItem {
    private int userId;
    private final Movie movie;
    private final Rating rating;

    public CatalogItem(int userId, Movie movie, Rating rating) {
        this.userId = userId;
        this.movie = movie;
        this.rating = rating;
    }

    public int getUserId() {
        return userId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Rating getRating() {
        return rating;
    }
}
