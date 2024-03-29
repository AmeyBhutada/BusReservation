package com.example.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class BusReservationProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusReservationProjectApplication.class, args);
		
	}

}
