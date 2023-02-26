package com.example.stationski.stationski2.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numMoniteur ;
    String nomM ;
    String prenomM ;
    LocalDate dateRecru ;

    @OneToMany
    List<Cours> cours;

}