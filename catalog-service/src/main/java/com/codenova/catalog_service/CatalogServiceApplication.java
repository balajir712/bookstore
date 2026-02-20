package com.codenova.catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

	//This is the main class for the Catalog Service application. It uses the @SpringBootApplication annotation to indicate that it is a Spring Boot application. The main method starts the application by calling SpringApplication.run() with the CatalogServiceApplication class and the command-line arguments.
}
