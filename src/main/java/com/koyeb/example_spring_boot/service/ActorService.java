package com.koyeb.example_spring_boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koyeb.example_spring_boot.pojo.Actor;
import com.koyeb.example_spring_boot.repository.ActorRepository;

@Service
public class ActorService {
    
    @Autowired
    private ActorRepository actorRepository;

    public List<Actor> getActors() {
        return (List<Actor>) actorRepository.findAll();
    }

    public void save(Actor actor){
        actorRepository.save(actor);
    }

    public void deleteActor(Long id){
        actorRepository.deleteById(id);
    }

    public Actor getActor(Long id){
        Optional<Actor> actor = actorRepository.findById(id);
        return unwrapActor(actor, id);
    }

    static Actor unwrapActor(Optional<Actor> entity, Long id){
        if(entity.isPresent()) return entity.get();
        else throw new Error("actor not found");
    }
}

