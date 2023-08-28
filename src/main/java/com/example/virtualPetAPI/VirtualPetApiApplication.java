package com.example.virtualPetAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.virtualPetAPI.dao.VirtualPetRepository;
import com.example.virtualPetAPI.entity.VirtualPet;

@SpringBootApplication
public class VirtualPetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualPetApiApplication.class, args);
	}

	@Bean
	CommandLineRunner CommandLineRunner(VirtualPetRepository virtualPetRepository) {
		return arg -> {

			VirtualPet roxy = new VirtualPet("Roxy", "Dog", 5);
			virtualPetRepository.save(roxy);

			VirtualPet blue = new VirtualPet("Blue", "Dog", 5);
			virtualPetRepository.save(blue);

			VirtualPet buddy = new VirtualPet("Buddy", "Cat", 5);
			virtualPetRepository.save(buddy);

		};

	}

}
