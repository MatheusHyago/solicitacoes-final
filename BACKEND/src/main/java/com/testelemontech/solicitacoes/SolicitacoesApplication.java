package com.testelemontech.solicitacoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.testelemontech.solicitacoes")  // 🔹 Garante que os controllers serão encontrados
public class SolicitacoesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SolicitacoesApplication.class, args);
	}
}
