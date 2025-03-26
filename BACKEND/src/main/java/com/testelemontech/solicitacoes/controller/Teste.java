package com.testelemontech.solicitacoes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;  // Alterado para Jakarta
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class Teste {

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
        System.out.println("Testando as variáveis de ambiente:");
        System.out.println("soap.keyClient = " + keyClient);
        System.out.println("soap.username = " + username);
        // Atenção: Exibir a senha no log não é recomendado em produção
        System.out.println("soap.password = " + password);
        System.out.println("soap.wsdlUrl = " + wsdlUrl);

        // Verifica a acessibilidade da URL do WS
        verificarUrlAcessibilidade(wsdlUrl);
    }

    // Método para verificar se a URL está acessível
    private void verificarUrlAcessibilidade(String urlString) {
        try {
            // Cria a URL e abre a conexão HTTP
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); // Timeout de 5 segundos
            connection.setReadTimeout(5000);

            // Faz a requisição e verifica o código de resposta
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("A URL está acessível! Código de resposta: " + responseCode);
            } else {
                System.out.println("Falha ao acessar a URL. Código de resposta: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("Erro ao verificar a URL: " + e.getMessage());
        }
    }
}
