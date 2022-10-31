package com.pruebatecnica.pruebatecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
//@ComponentScan("com.pruebatecnica.pruebatecnica.repositories")
public class PruebatecnicaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PruebatecnicaApplication.class, args);
	}
}

