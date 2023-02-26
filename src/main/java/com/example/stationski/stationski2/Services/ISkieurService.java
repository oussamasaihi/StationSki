package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Skieur;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ISkieurService  {

    List<Skieur> findAll();

    ResponseEntity<Object> findById(Long id);

    void remove();

    void add(Skieur skieur);


    Skieur update(Skieur skieur);
}
