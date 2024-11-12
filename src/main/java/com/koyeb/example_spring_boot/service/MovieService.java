package com.koyeb.example_spring_boot.service;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koyeb.example_spring_boot.pojo.Movie;
import com.koyeb.example_spring_boot.repository.MovieRepository;

@Service
public class MovieService {
    
    @Autowired
    private MovieRepository movieRepository;

    public void saveMovie(Movie movie){
        movieRepository.saveMovie(movie);
    }

    public List<Movie> getMovies() {
        return movieRepository.getMovies();
    }

    public Movie getMovie(String id){
        return movieRepository.getMovie(findIndexById(id));
    }

    private int findIndexById(String id){
        return IntStream.range(0, movieRepository.getMovies().size())
                .filter(index -> movieRepository.getMovies().get(index).getId().equals(id))
                .findFirst()
                .orElseThrow();
    }
}
