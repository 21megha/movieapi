package com.example.movieapi.model;

import jakarta.validation.constraints.NotBlank;
public class Movie {
    private int id;
    @NotBlank(message = "Movie name is required.")
    private String name;

    @NotBlank
    private String description;
    private String genre;

    public Movie(){

    }
    public Movie(int id , String name , String des , String genre){
        this.id = id;
        this.name = name;
        this.description = des;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
