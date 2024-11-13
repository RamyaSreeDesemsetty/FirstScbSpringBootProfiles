package com.scb.FirstScbSpringBootProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.capg.entity.Vehicle;


@SpringBootApplication
@ComponentScan(basePackages = { "com.capg.entity" })

public class FirstScbSpringBootProfilesApplication implements CommandLineRunner {
//	@Autowired
//	Animal animal;
	@Autowired
	Vehicle vehicle;
	public static void main(String[] args) {
		SpringApplication.run(FirstScbSpringBootProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		animal.makeSound();
		vehicle.vehicleType();
	}

}
