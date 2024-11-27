package com.koyeb.example_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koyeb.example_spring_boot.pojo.Movie;
import com.koyeb.example_spring_boot.pojo.Review;
import com.koyeb.example_spring_boot.repository.MovieRepository;
import com.koyeb.example_spring_boot.repository.ReviewRepository;

@Service
public class ReviewService {
    
    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MovieRepository movieRepository;

    public List<Review> getReviews() {
        return (List<Review>)reviewRepository.findAll();
    }

    public void saveReview(Review review, Long movieId) {
        Movie movie = movieRepository.findById(movieId).get();
        review.setMovie(movie);
        reviewRepository.save(review);
    }

    public Review getReview(Long id){
        Optional<Review> review = reviewRepository.findById(id);
        return unwrapReview(review, id);
    }

    static Review unwrapReview(Optional<Review> entity, Long id) {
        if(entity.isPresent()) return entity.get();
        else throw new Error("review not found");
    }
}
