package com.testelemontech.solicitacoes.config;

import jakarta.annotation.PostConstruct;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.client.config.RequestConfig;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class WsConfig {

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    // Ensure WSDL URL is configured
    @PostConstruct
    public void init() {
        if (wsdlUrl == null || wsdlUrl.isEmpty()) {
            throw new IllegalArgumentException("WSDL URL is not configured correctly.");
        }
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.testelemontech.solicitacoes.wsdl"); // Set the correct generated package
        return marshaller;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(marshaller);
        webServiceTemplate.setDefaultUri(wsdlUrl); // Set the WSDL URL for the SOAP service
        webServiceTemplate.setMessageSender(httpComponentsMessageSender());
        return webServiceTemplate;
    }

    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() {
        // Create HttpClient with connection and socket timeouts
        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(5000) // 5 seconds connection timeout
                .setSocketTimeout(10000) // 10 seconds socket (read) timeout
                .build();

        CloseableHttpClient httpClient = HttpClients.custom()
                .setDefaultRequestConfig(requestConfig)
                .build();

        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setHttpClient(httpClient);  // Attach HttpClient to message sender
        return messageSender;
    }
}
