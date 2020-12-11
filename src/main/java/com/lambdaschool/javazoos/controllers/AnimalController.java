package com.lambdaschool.javazoos.controllers;

import com.lambdaschool.javazoos.services.AnimalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animals")
public class AnimalController
{
    @Autowired
    private AnimalServices animalServices;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> listAnimalsAndZooCount()
    {
        return new ResponseEntity<>(animalServices.getCountAnimalInZoo(), HttpStatus.OK);
    }
}
