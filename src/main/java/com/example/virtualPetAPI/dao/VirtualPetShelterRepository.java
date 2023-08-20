package com.example.virtualPetAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtualPetAPI.entity.VirtualPetShelter;

public interface VirtualPetShelterRepository extends JpaRepository<VirtualPetShelter, Long> {

    Object fingById(long id);
    
}
