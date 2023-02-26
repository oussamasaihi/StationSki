package com.example.stationski.stationski2.entities;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Slf4j
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCours ;
    int niveau ;
    TypeCours typeCours ;
    Support support ;
    float prix ;
    int creneau ;

    @OneToMany(mappedBy = "cour")
    List<Inscription> inscriptions;


}