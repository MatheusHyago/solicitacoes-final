package com.testelemontech.solicitacoes.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Permite todas as rotas
                .allowedOrigins("http://localhost:8080")  // Permite o frontend na porta 8080
                .allowedMethods("GET", "POST", "DELETE", "PUT");  // Permite métodos GET, POST, DELETE e PUT
    }
}
