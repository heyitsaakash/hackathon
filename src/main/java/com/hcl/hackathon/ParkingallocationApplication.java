package com.hcl.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hcl.hackathon.model.Slot;

@SpringBootApplication
public class ParkingallocationApplication {

	public static void main(String[] args) {
		Slot.setMultimap();
		SpringApplication.run(ParkingallocationApplication.class, args);
	}

}
