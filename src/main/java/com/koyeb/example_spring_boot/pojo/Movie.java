package com.koyeb.example_spring_boot.pojo;

import java.util.UUID;

public class Movie {

    private String id;
    private String title;
    // private Number rating;
    //private Number cast;

    public Movie() {
        this.id = UUID.randomUUID().toString();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    
}
