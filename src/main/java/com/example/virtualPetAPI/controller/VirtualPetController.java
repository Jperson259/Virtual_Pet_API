package com.example.virtualPetAPI.controller;


import java.util.*;
import com.example.virtualPetAPI.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.virtualPetAPI.dao.VirtualPetRepository;

import jakarta.annotation.Resource;




@RestController
// @RequestMapping("/api/shelter/pet")
public class VirtualPetController {
    @Autowired
    VirtualPetRepository virtualPetRepository;

    

    @Resource
    private VirtualPetRepository petRepo;

    @GetMapping("/api/pets/")
    public ResponseEntity<List<VirtualPet>> getAllPets() {
        List<VirtualPet> pets = virtualPetRepository.findAll();

        if (pets.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<VirtualPet>>(pets, HttpStatus.OK);
        }
    }

    @GetMapping("/api/pets/{id}")
    public ResponseEntity<VirtualPet> getPet(@PathVariable("id") long id) {
        Optional<VirtualPet> pet = virtualPetRepository.findById(id);

        if (pet.isPresent()) {
            return new ResponseEntity<>(pet.get(), HttpStatus.OK);
        } else {
            System.out.println("Id not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
           
        }
    }
   
    @PostMapping("/api/pets/add")
    public ResponseEntity<VirtualPet> createPet(@RequestBody VirtualPet pet) {
        VirtualPet _pets = virtualPetRepository
                .save(new VirtualPet(pet.getId(), pet.getName(), pet.getSpecies(), pet.getHunger()));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/api/pets/delete/{id}")
    public ResponseEntity<VirtualPet> deletePet(@PathVariable("id") long id) {
        Optional<VirtualPet> pet = virtualPetRepository.findById(id);

        if (pet.isPresent()) {
            VirtualPet p = new VirtualPet(); p.setId(id);
           virtualPetRepository.delete(p);
           return new ResponseEntity<>(p, HttpStatus.OK);
        } else {
            System.out.println("Id not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
           
        }

    }

   
    
}

