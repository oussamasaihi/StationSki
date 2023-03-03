package com.example.stationski.stationski2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    public long numSkieur ;
    public String nomS ;
    public String prenomS ;
    public LocalDate dateNaissance ;
    public String ville ;

    @OneToOne
    // @JoinColumn(name = "numAbon")
    private Abonnement abonnement;
    TypeAbonnement typeAbonnement ;
    @JsonIgnore
    @ManyToMany(mappedBy = "pistes")
   /* @JoinTable(name = "skieur_piste",
            joinColumns = @JoinColumn(name = "skieur_id"),
            inverseJoinColumns = @JoinColumn(name = "piste_id"))*/
    private List<Piste> pistes ;


    @OneToMany(mappedBy = "inscription")
    List<Inscription>inscriptionList;


}