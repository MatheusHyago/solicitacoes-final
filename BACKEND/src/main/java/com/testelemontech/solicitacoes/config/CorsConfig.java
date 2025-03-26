package com.testelemontech.solicitacoes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Permite todas as rotas
                .allowedOrigins("http://127.0.0.1:5500", "http://localhost:3000")  // Adicione mais domínios conforme necessário
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("Authorization", "Content-Type")  // Permite cabeçalhos essenciais
                .allowCredentials(true);
    }
}