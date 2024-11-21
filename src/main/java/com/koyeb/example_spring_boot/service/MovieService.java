package com.koyeb.example_spring_boot.service;

import java.util.List;
import java.util.Optional;
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
        movieRepository.save(movie);
    }

    public List<Movie> getMovies() {
        return (List<Movie>)movieRepository.findAll();
    }

    public Movie getMovie(Long id){
        Optional<Movie> movie = movieRepository.findById(id);
        return unwrapMovie(movie, id);
    }

    static Movie unwrapMovie(Optional<Movie> entity, Long id) {
        if(entity.isPresent()) return entity.get();
        else throw new Error("Movie not found");
    }


}
