package com.altplusplus.marvel.controller;

import com.altplusplus.marvel.model.Avengers;
import com.altplusplus.marvel.service.MarvelService;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class MarvelController {

    private final MarvelService marvelService;

    @RequestMapping("/slogan")
    public String HelloWorld(){
        return "Avengers. Assemble";
    }

    @GetMapping
    public List<Avengers> getAllAvengersList(){
        return marvelService.getAllAvengers();
    }

    // NOT WORKING
    @GetMapping("{id}")
    public Avengers getAvenger(@PathVariable long id){
        return marvelService.getAvenger(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Avengers> addAvenger(@RequestBody Avengers avengers){
        return new ResponseEntity<Avengers>(marvelService.addAvenger(avengers), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public void deleteAvenger(@PathVariable long id){
        marvelService.deleteAvenger(id);
    }
}
