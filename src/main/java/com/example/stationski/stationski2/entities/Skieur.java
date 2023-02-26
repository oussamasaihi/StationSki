package com.example.stationski.stationski2.entities;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Slf4j
public class Skieur {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSkieur ;
    String nomS ;
    String prenomS ;
    LocalDate dateNaissance ;
    String ville ;

    @OneToOne
    // @JoinColumn(name = "numAbon")
    private Abonnement abonnement;

    @ManyToMany
   /* @JoinTable(name = "skieur_piste",
            joinColumns = @JoinColumn(name = "skieur_id"),
            inverseJoinColumns = @JoinColumn(name = "piste_id"))*/
    private List<Piste> pistes ;

    @OneToMany(mappedBy = "skieur")
    List<Inscription>inscriptionList;

}