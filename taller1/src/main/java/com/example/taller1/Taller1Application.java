package com.example.taller1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Taller1Application {
	@RequestMapping("/hola")
	public static void main(String[] args) {

		SpringApplication.run(Taller1Application.class, args);
	}

}
