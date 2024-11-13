package com.capg.entity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("bike")
public class Bike implements Vehicle {
	@Override
	public void vehicleType() {
		System.out.println("Two Wheeler");

	}
}
