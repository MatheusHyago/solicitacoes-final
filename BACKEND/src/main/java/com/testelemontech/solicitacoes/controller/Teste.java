package com.testelemontech.solicitacoes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
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
        System.out.println(" Testando as variáveis de ambiente:");
        System.out.println("soap.keyClient = " + keyClient);
        System.out.println("soap.username = " + username);
        System.out.println("soap.password = " + password);
        System.out.println("soap.wsdlUrl = " + wsdlUrl);

        // Verifica a URL após o log das variáveis
        verificarUrlAcessibilidade(wsdlUrl);
    }

    // Método para verificar se a URL está acessível
    private void verificarUrlAcessibilidade(String urlString) {
        try {
            // Cria a URL
            URL url = new URL(urlString);

            // Abre uma conexão HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Configura o método de requisição (GET)
            connection.setRequestMethod("GET");

            // Define um timeout de conexão (opcional)
            connection.setConnectTimeout(5000); // 5 segundos
            connection.setReadTimeout(5000); // 5 segundos

            // Faz a requisição e verifica o código de resposta
            int responseCode = connection.getResponseCode();

            // Verifica se a resposta foi bem-sucedida (200 OK)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println(" A URL está acessível! Código de resposta: " + responseCode);
            } else {
                System.out.println(" Falha ao acessar a URL. Código de resposta: " + responseCode);
            }

        } catch (IOException e) {
            System.out.println(" Erro ao verificar a URL: " + e.getMessage());
        }
    }
}
