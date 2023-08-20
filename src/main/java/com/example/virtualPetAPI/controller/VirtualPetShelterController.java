package com.example.virtualPetAPI.controller;




import org.springframework.web.bind.annotation.*;
import com.example.virtualPetAPI.dao.VirtualPetShelterRepository;
import com.example.virtualPetAPI.entity.VirtualPetShelter;

import jakarta.annotation.*;


@RestController
@RequestMapping("/api/shelters")
public class VirtualPetShelterController {

    @Resource
    private VirtualPetShelterRepository virtualPetShelterRepo; 

    @GetMapping("/api/shelters/{id}")
    public VirtualPetShelter getShelterById(@PathVariable long id) {
     return virtualPetShelterRepo.findById(id).get();
    }
    
}
