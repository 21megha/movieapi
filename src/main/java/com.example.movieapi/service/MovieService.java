package com.example.movieapi.service;

import com.example.movieapi.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private final List<Movie> movies = new ArrayList<>();
    private int currId = 1;

    public Movie addMovie(Movie movie){
        movie.setId(this.currId++);
        movies.add(movie);
        return movie;
    }
    public Movie getMovieById(int id){
        return movies.stream().filter(movie -> movie.getId()==id).findFirst().orElse(null);
    }
    public List<Movie> getAllMovies(){
        return movies;
    }
    public boolean deleteMovieById(int id){
        return movies.removeIf(movie -> movie.getId() ==id);
    }
    public Movie updateMovie(int id , Movie updateMovie){
        for(Movie movie: movies){
            if(id == movie.getId()){
                movie.setName(updateMovie.getName());
                movie.setDescription(updateMovie.getDescription());
                movie.setGenre(updateMovie.getGenre());
                return movie;
            }
        }
        return null;
    }
}
