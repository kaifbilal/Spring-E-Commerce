package com.project.Spring_E_Commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringECommerceApplication.class, args);
		Dev dev = new Dev();
		dev.build();
		
	}

}
