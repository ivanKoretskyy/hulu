package com.koyeb.example_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.koyeb.example_spring_boot.pojo.Review;


public interface ReviewRepository extends CrudRepository<Review,Long> {
    
}
