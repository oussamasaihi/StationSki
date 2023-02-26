package com.example.stationski.stationski2.Controller;

import com.example.stationski.stationski2.Services.ISkieurService;
import com.example.stationski.stationski2.entities.Skieur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieur")

public class SkieurController {
    private ISkieurService iSkieurService ;
    @GetMapping
    public List<Skieur> findAll(){
        return iSkieurService.findAll() ;
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        return findById(id) ;
    }
    @DeleteMapping("/{id}")
    public void remove(@RequestBody long id){
        iSkieurService.remove();
    }
    @PostMapping
    void add(@RequestBody Skieur skieur){
        iSkieurService.add(skieur);
    }

    @PutMapping
    public Skieur update(@RequestBody Skieur skieur){
        iSkieurService.update(skieur);
        return skieur ;
    }
}
