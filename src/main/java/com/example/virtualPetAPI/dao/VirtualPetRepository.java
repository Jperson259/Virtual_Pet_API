package com.example.virtualPetAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.virtualPetAPI.entity.VirtualPet;

public interface VirtualPetRepository extends JpaRepository<VirtualPet, Long> {

}
