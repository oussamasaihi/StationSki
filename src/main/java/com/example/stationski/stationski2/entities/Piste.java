package com.example.stationski.stationski2.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Slf4j
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numPiste ;
    String nomPiste ;
    Couleur couleur ;
    int longeur ;
    int pente ;
    @ManyToMany(mappedBy = "pistes")
    @JsonIgnore
    private Set<Skieur> skieurs;
}
