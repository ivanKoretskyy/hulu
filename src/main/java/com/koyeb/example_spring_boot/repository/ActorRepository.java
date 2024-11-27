package com.koyeb.example_spring_boot.repository;

import org.springframework.data.repository.CrudRepository;

import com.koyeb.example_spring_boot.pojo.Actor;

public interface ActorRepository extends CrudRepository<Actor,Long> {
    
}
