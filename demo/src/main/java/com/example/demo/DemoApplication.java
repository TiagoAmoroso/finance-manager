package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// Ensuring the environment variables are available in the environment used
		// PS: Set your GOOGLE_CLIENT_ID and GOOGLE_CLIENT_SECRET environment varaibles to the relevant values
		System.out.println("GOOGLE_CLIENT_ID: " + System.getenv("GOOGLE_CLIENT_ID"));
		System.out.println("GOOGLE_CLIENT_SECRET: " + System.getenv("GOOGLE_CLIENT_SECRET"));

		System.setProperty("GOOGLE_CLIENT_ID", System.getenv("GOOGLE_CLIENT_ID"));
        System.setProperty("GOOGLE_CLIENT_SECRET", System.getenv("GOOGLE_CLIENT_SECRET"));



		SpringApplication.run(DemoApplication.class, args);
	}

}
