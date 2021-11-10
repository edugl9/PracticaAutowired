package com.example.springcoredojo.services;

import com.example.springcoredojo.autowired.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemeService {
    @Autowired
    private Joke joke;

    public String theJoke(){
        return joke.lineFromJoke();
    }
}
