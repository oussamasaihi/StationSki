package com.example.stationski.stationski2.Services;

import com.example.stationski.stationski2.entities.Abonnement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbonnementService extends JpaRepository<Abonnement,Long> {
}
