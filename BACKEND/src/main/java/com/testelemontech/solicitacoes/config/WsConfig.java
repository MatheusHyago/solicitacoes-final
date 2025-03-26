package com.testelemontech.solicitacoes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

@Configuration
public class WsConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // Pacotes que o JAXB usará para gerar a marshalling
        marshaller.setPackagesToScan("br.com.lemontech.selfbooking.wsselfbooking.beans",
                "br.com.lemontech.selfbooking.wsselfbooking.services.request");
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
        messageFactory.afterPropertiesSet();
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        return webServiceTemplate;
    }

    // Defina o bean para o WsSelfBookingService
    @Bean
    public WsSelfBookingService wsSelfBookingService() {
        return new WsSelfBookingService();
    }
}
