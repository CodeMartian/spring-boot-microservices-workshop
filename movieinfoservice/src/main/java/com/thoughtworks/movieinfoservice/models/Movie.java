package com.thoughtworks.movieinfoservice.models;

public class Movie {

    private final String  title;
    private final int id;
    private final String description;

    public Movie(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
