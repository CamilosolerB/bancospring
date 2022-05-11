package com.proyectouno;

import com.proyectouno.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancospringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancospringApplication.class, args);
	}

	@Autowired
	private CLienteRepository cLienteRepository;
}
