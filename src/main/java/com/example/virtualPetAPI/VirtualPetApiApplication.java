package com.example.virtualPetAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.virtualPetAPI.dao.VirtualPetRepository;



@SpringBootApplication
public class VirtualPetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualPetApiApplication.class, args);
	}

	@Bean
	CommandLineRunner CommandLineRunner(VirtualPetRepository petRepo) {
		return arg -> {
			
			VirtualPet roxy = new VirtualPet(1L, "Roxy", "Dog", 5);
			petRepo.save(roxy);

			VirtualPet blue = new VirtualPet(2L, "Blue", "Dog", 5);
			petRepo.save(blue);

			VirtualPet buddy = new VirtualPet(3L, "Buddy", "Cat", 5);
			petRepo.save(buddy);
		
			};

		}

	}

