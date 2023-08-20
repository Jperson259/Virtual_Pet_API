package com.example.virtualPetAPI.entity;

import java.util.*;
import jakarta.annotation.*;
import com.example.virtualPetAPI.VirtualPet;
import jakarta.persistence.*;



@Entity
@Table(name = "virtual_pet_shelters")  
public class VirtualPetShelter {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "pets")
    private List<VirtualPet> pets;

    @Column(name = "name")
    private String name;

    public VirtualPetShelter() {

    }

    public VirtualPetShelter(long id, String name) {
        this.id = id;
        this.name = name;
        this.pets = new ArrayList<VirtualPet>();
    }

    public void admitPet(VirtualPet virtualPet) {
        this.pets.add(virtualPet);
    }

    public void removePet(VirtualPet pet) {
        this.pets.remove(pet);
    }

    public VirtualPet getPetById(long id) {
        for(VirtualPet pet : this.pets) {
            if(id == pet.getId()) {
                return pet;
            }
        }
        return null;

    }

   





    
}
