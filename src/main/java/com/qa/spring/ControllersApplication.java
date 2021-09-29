package com.qa.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qa.spring.controller.PersonController;
import com.qa.spring.domain.Person;

@SpringBootApplication
public class ControllersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControllersApplication.class, args);


	}

}
