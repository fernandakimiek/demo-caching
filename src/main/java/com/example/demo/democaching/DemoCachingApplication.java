package com.example.demo.democaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DemoCachingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCachingApplication.class, args);

	}

}
