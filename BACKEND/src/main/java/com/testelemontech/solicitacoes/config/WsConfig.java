package com.testelemontech.solicitacoes.config;

import org.apache.http.impl.client.HttpClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class WsConfig {

    @Bean
    public WebServiceTemplate webServiceTemplate() {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        // Configurando o HttpClient para o envio SOAP
        webServiceTemplate.setMessageSender(new HttpComponentsMessageSender(HttpClients.createDefault()));
        return webServiceTemplate;
    }
}
