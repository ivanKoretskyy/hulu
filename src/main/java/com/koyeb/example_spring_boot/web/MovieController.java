package com.koyeb.example_spring_boot.web;

import org.springframework.web.bind.annotation.RestController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.koyeb.example_spring_boot.pojo.Movie;
import com.koyeb.example_spring_boot.pojo.Review;
import com.koyeb.example_spring_boot.service.MovieService;
import com.koyeb.example_spring_boot.service.ReviewService;


@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @Autowired
    ReviewService reviewService;

    @PostMapping("/movie/{id}/review")
    public ResponseEntity<HttpStatus> createMovie(@RequestBody Review entity, @PathVariable Long id) {
        //TODO: process POST request
        System.out.println("in add reveiw");
        reviewService.saveReview(entity,id);
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

    @PostMapping("/movie")
    public ResponseEntity<HttpStatus> createMovie(@RequestBody Movie entity) {
        //TODO: process POST request
        movieService.saveMovie(entity);
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.getMovies(), HttpStatus.OK); 
    }

    @GetMapping("/movie/{id}")
    public ResponseEntity<Movie> getMethodName(@PathVariable Long id) {
        return new ResponseEntity<>(movieService.getMovie(id), HttpStatus.OK);
    }
    
}
