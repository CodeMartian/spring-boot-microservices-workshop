package com.thoughtworks.movieinfoservice.models;

public class Movie {

    private final String  title;
    private final int id;

    public Movie(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
