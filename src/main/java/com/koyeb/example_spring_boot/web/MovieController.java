package com.koyeb.example_spring_boot.web;

import org.springframework.web.bind.annotation.RestController;

import com.koyeb.example_spring_boot.pojo.Movie;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MovieController {

    @PostMapping("/movie")
    public ResponseEntity<HttpStatus> createMovie(@RequestBody Movie entity) {
        //TODO: process POST request
        
        return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    }
    
    
}
