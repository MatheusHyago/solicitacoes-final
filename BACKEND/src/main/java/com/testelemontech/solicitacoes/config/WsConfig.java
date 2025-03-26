package com.testelemontech.solicitacoes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class WsConfig {

    // Inicialização do logger
    private static final Logger logger = LoggerFactory.getLogger(WsConfig.class);

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // Adiciona os pacotes necessários para os beans SOAP
        marshaller.setPackagesToScan("br.com.lemontech.selfbooking.wsselfbooking.beans",
                "br.com.lemontech.selfbooking.wsselfbooking.services.request");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);

        // Logando a configuração do WebServiceTemplate
        logger.info("WebServiceTemplate configurado com marshaller/unmarshaller.");

        return webServiceTemplate;
    }
}
