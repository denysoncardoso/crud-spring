package com.teste.crudspring;

import com.teste.crudspring.model.Corte;
import com.teste.crudspring.repository.CorteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner init(CorteRepository corteRepository) {
		return args -> {
			//corteRepository.deleteAll();

			Corte corte = new Corte();
			corte.setNome("Corte Masculino");
			corte.setDescricao("Corte de cabelo masculino");
			corte.setCategoria("Corte");
			corteRepository.save(corte);
		};
	}

}
