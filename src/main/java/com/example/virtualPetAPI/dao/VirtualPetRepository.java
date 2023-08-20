package com.example.virtualPetAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.virtualPetAPI.*;

public interface VirtualPetRepository extends JpaRepository<VirtualPet, Long> {
    
}
