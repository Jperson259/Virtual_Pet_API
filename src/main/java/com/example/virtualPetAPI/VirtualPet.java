package com.example.virtualPetAPI;

import jakarta.annotation.*;
import jakarta.persistence.*;



@Entity
@Table(name = "virtual_pet")
public class VirtualPet {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "hunger")
    private int hunger;
    


    public VirtualPet() {

    }

    public VirtualPet(long id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.hunger = 5;

    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return this.species;
    }

    public int getHunger() {
        return this.hunger;
    }

    public void feedPet(){
        hunger = hunger - 2;
    }
}
