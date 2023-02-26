package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IpisteService extends JpaRepository<Piste,Long> {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    void deletePiste(Long numPiste);
}
