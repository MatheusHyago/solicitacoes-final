package com.testelemontech.solicitacoes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
public class SoapConfig {

    // URL real do WebService
    private static final String SOAP_ENDPOINT_URL = "https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // Defina o pacote onde as classes JAXB geradas estão localizadas
        marshaller.setContextPath("com.testelemontech.solicitacoes.wsdl");  // Verifique o pacote correto das classes JAXB geradas
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setDefaultUri(SOAP_ENDPOINT_URL); // URL do endpoint SOAP

        return webServiceTemplate;
    }
}
