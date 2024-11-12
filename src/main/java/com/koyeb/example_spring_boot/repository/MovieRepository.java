package com.koyeb.example_spring_boot.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.koyeb.example_spring_boot.pojo.Movie;

@Repository
public class MovieRepository {
    
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void saveMovie(Movie movie) {
        movies.add(movie);
    }

    public Movie getMovie(int index){
        return movies.get(index);
    } 
    
}
