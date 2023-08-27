package com.example.virtualPetAPI.entity;



import jakarta.persistence.*;




@Entity
@Table(name = "virtual_pet")
public class VirtualPet {

    @Id
    @GeneratedValue
   @Column(name = "id", nullable = true)
    private long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "species", nullable = true)
    private String species;

    @Column(name = "hunger", nullable = true)
    private int hunger;

    
    
    


    public VirtualPet() {

    }

    public VirtualPet(String name, String species, int hunger) {
        
        this.name = name;
        this.species = species;
        this.hunger = 5;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }



}
