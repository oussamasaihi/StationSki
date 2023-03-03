package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Moniteur;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMoniteurService
{
    List<Moniteur> retrieveAllMoniteurs ();
    Moniteur addMoniteur (Moniteur moniteur) ;
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

    void delete(Long numMoniteur);

    Page<Moniteur> findAll(Pageable pageable);

    List<Moniteur> findAllById(Iterable<Long> longs);

    long count();

    void deleteById(Long aLong);

    void delete(Moniteur entity);
}
