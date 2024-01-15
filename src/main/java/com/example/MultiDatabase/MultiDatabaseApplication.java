package com.example.MultiDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MultiDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiDatabaseApplication.class, args);
	}

}
