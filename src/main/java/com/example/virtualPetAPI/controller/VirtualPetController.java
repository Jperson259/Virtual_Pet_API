package com.example.virtualPetAPI.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.virtualPetAPI.dao.VirtualPetRepository;
import com.example.virtualPetAPI.entity.VirtualPet;

@RestController
@RequestMapping("/api/pets")
public class VirtualPetController {
    @Autowired
    VirtualPetRepository virtualPetRepository;

    @GetMapping("/all")
    public ResponseEntity<List<VirtualPet>> getAllPets() {
        List<VirtualPet> pets = virtualPetRepository.findAll();

        if (pets.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<List<VirtualPet>>(pets, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<VirtualPet> getPet(@PathVariable("id") long id) {
        Optional<VirtualPet> pet = virtualPetRepository.findById(id);

        if (pet.isPresent()) {
            return new ResponseEntity<>(pet.get(), HttpStatus.OK);
        } else {
            System.out.println("Id not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @PostMapping("/add")
    public ResponseEntity<VirtualPet> createPet(@RequestBody VirtualPet pet) {
        VirtualPet _pets = virtualPetRepository
                .save(new VirtualPet(pet.getName(), pet.getSpecies(), pet.getHunger()));
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public VirtualPet updatePet(@PathVariable Long id, @RequestBody VirtualPet virtualPet) {
        VirtualPet update = virtualPetRepository.findById(id).orElse(null);

        if (update != null) {
            update.setName(virtualPet.getName());
            return virtualPetRepository.save(update);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<VirtualPet> deletePet(@PathVariable("id") long id) {
        Optional<VirtualPet> pet = virtualPetRepository.findById(id);

        if (pet.isPresent()) {
            VirtualPet p = new VirtualPet();
            p.setId(id);
            virtualPetRepository.delete(p);
            return new ResponseEntity<>(p, HttpStatus.OK);
        } else {
            System.out.println("Id not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
