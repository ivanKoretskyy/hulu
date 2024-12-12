package com.koyeb.example_spring_boot.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koyeb.example_spring_boot.pojo.Actor;
import com.koyeb.example_spring_boot.pojo.Movie;
import com.koyeb.example_spring_boot.repository.ActorRepository;
import com.koyeb.example_spring_boot.repository.MovieRepository;


@Service
public class MovieService {

    @Autowired
    private ActorRepository actorRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ActorService actorService;

    public void saveMovie(Movie movie){
        movieRepository.save(movie);
    }

    public Movie getMovie(Long id) {
        Optional<Movie> movie= movieRepository.findById(id);
        return unwrapMovie(movie, id);
    }

    public List<Movie> getMovies() {
        return (List<Movie>)movieRepository.findAll();
    }

    public Movie addActorToMovie(Long movieId, Long actorId) {
        Optional<Movie> movie = movieRepository.findById(movieId);
        Optional<Actor> actor = actorRepository.findById(actorId);
        Movie unwrapedMovie = unwrapMovie(movie, movieId);
        Actor unwrapedActor = ActorService.unwrapActor(actor, actorId);

        unwrapedMovie.getActors().add(unwrapedActor);
        return movieRepository.save(unwrapedMovie);

    }

    public List<Actor> getActors(Long id) {
        Movie movie = getMovie(id);
        return movie.getActors();

    }

    static Movie unwrapMovie(Optional<Movie> entity, Long id) {
        if(entity.isPresent()) return entity.get();
        else throw new Error("Movie not found");
    }


}
