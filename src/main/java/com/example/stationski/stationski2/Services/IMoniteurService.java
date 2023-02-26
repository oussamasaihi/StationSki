package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Moniteur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMoniteurService extends JpaRepository<Moniteur,Long>
{
    List<Moniteur> retrieveAllMoniteurs ();
    Moniteur addMoniteur (Moniteur moniteur) ;
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);

    void delete(Long numMoniteur);
}
