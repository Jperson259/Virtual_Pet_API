package com.example.virtualPetAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.virtualPetAPI.dao.VirtualPetRepository;
import com.example.virtualPetAPI.dao.VirtualPetShelterRepository;
import com.example.virtualPetAPI.entity.VirtualPetShelter;

@SpringBootApplication
public class VirtualPetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualPetApiApplication.class, args);
	}

	@Bean
	CommandLineRunner CommandLineRunner(VirtualPetRepository petRepo, VirtualPetShelterRepository virtualPetShelterRepo) {
		return arg -> {
			VirtualPetShelter shelter = new VirtualPetShelter(0L, "my cool shelter");
			shelter.admitPet(new VirtualPet(1L, "Cudo", "Dog"));
			shelter.admitPet(new VirtualPet(2L, "Pheobe", "Dog"));
			shelter.admitPet(new VirtualPet(3L, "Butter", "Cat"));
			virtualPetShelterRepo.save(shelter);
		
			};

		}

	}

