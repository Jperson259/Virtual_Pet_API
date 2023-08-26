package com.example.virtualPetAPI;




import jakarta.persistence.*;




@Entity
@Table(name = "virtual_pet")
public class VirtualPet {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false, columnDefinition = "TEXT")
    private long id;

    @Column(name = "name", nullable = false, columnDefinition = "TEXT")
    private String name;

    @Column(name = "species", nullable = false, columnDefinition = "TEXT")
    private String species;

    @Column(name = "hunger", nullable = false, columnDefinition = "TEXT")
    private int hunger;

    @ManyToOne()
    @JoinColumn(name="uniqueId", nullable = false)
    private VirtualPet virtualPet;
    


    public VirtualPet() {

    }

    public VirtualPet(long id, String name, String species, int hunger) {
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
