package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaProjectTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaProjectTwoApplication.class, args);
		System.out.println("Hello JPA");
	}

}
