package com.koyeb.example_spring_boot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.koyeb.example_spring_boot.pojo.Actor;
import com.koyeb.example_spring_boot.service.ActorService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ActorController {
    
    @Autowired
    ActorService actorService;

    @GetMapping("/actors")
    public ResponseEntity<List<Actor>> getMethodName() {
        return new ResponseEntity<>(actorService.getActors(), HttpStatus.OK);
    }
    
    @GetMapping("/actor/{id}")
    public ResponseEntity<Actor> getActor(@PathVariable Long id) {
        return new ResponseEntity<>(actorService.getActor(id), HttpStatus.OK);
    }

    @DeleteMapping("/actor/{id}")
    public ResponseEntity<HttpStatus> deleteActor(@PathVariable Long id) {
        actorService.deleteActor(id);

        return new ResponseEntity<HttpStatus>( HttpStatus.OK);
    }

    @PostMapping("/actor")
    public ResponseEntity<HttpStatus> postMethodName(@RequestBody Actor entity) {
        //TODO: process POST request
        actorService.save(entity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
}
