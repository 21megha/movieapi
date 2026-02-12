package com.example.movieapi.controller;

import com.example.movieapi.model.Movie;
import com.example.movieapi.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
//    Add new Movie
    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

//    Get movie by id
    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id){
        Movie movie = movieService.getMovieById(id);
        if(movie == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movie);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable int id ,@RequestBody Movie movie){
        Movie upMovie = movieService.updateMovie(id, movie);
        if(upMovie == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(upMovie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovieById(@PathVariable int id) {

        boolean deleted = movieService.deleteMovieById(id);

        if (!deleted) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok("Movie deleted successfully");
    }


}
