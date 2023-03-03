package com.example.stationski.stationski2.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Abonnement {

    //  @OneToOne(cascade =CascadeType.ALL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    TypeAbonnement typeAbonnement ;

    public LocalDate getId() {
        return null;
    }
}