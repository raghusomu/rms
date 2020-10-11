package com.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class RateManagementSystemApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(RateManagementSystemApplication.class, args);
		System.out.println("RateManagementSystemApplication.main()");
	
	}

}
