package com.testelemontech.solicitacoes.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class teste {

    @Value("${soap.keyClient}")
    private String keyClient;

    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    @PostConstruct
    public void logVariaveis() {
        System.out.println("🚀 Testando as variáveis de ambiente:");
        System.out.println("soap.keyClient = " + keyClient);
        System.out.println("soap.username = " + username);
        System.out.println("soap.password = " + password);
        System.out.println("soap.wsdlUrl = " + wsdlUrl);
    }
}

