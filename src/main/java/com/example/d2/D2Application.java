package com.example.d2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class D2Application {

	public static void main(String[] args) {
		SpringApplication.run(D2Application.class, args);
	}

}
