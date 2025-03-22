package com.testelemontech.solicitacoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.testelemontech.solicitacoes")
@EnableJpaRepositories(basePackages = "com.testelemontech.solicitacoes.repository")
public class SolicitacoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolicitacoesApplication.class, args);
	}
}