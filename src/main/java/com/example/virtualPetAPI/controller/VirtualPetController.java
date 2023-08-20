package com.example.virtualPetAPI.controller;


import java.util.*;
import com.example.virtualPetAPI.*;
import jakarta.annotation.*;
import org.springframework.web.bind.annotation.*;
import com.example.virtualPetAPI.dao.VirtualPetRepository;




@RestController
@RequestMapping("/api/shelter/pet")
public class VirtualPetController {

    @Resource
    private VirtualPetRepository petRepo;

    @GetMapping("/")
    public List<VirtualPet> getAllPets() {
        return petRepo.findAll();
    }
    
}
