package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.Repos.SkieurRepo;
import com.example.stationski.stationski2.entities.Skieur;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class SkieurService implements ISkieurService {
    private ISkieurService iSkieurService ;

    @Override
    public List<Skieur> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Object> findById(Long id) {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void add(Skieur skieur) {

    }

    @Override
    public Skieur update(Skieur skieur) {
        return null;
    }
}