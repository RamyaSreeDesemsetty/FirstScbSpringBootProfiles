package com.capg.entity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("car")
public class Car implements Vehicle {

	@Override
	public void vehicleType() {
		System.out.println("Four Wheeler");

	}

}
