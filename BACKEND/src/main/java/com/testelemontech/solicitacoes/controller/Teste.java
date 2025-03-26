package com.testelemontech.solicitacoes.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
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
        // Exibindo as variáveis de ambiente
        System.out.println("Testando as variáveis de ambiente:");
        System.out.println("soap.keyClient = " + keyClient);
        System.out.println("soap.username = " + username);
        // Atenção: Exibir a senha no log não é recomendado em produção
        System.out.println("soap.password = " + password);
        System.out.println("soap.wsdlUrl = " + wsdlUrl);

        // Verificando se as variáveis de ambiente foram configuradas corretamente
        if (keyClient == null || username == null || password == null || wsdlUrl == null) {
            System.out.println("Erro: Uma ou mais variáveis de ambiente estão faltando.");
        } else {
            // Se as variáveis estiverem corretas, tenta acessar a URL do WSDL
            verificarUrlAcessibilidade(wsdlUrl);
        }
    }

    // Método para verificar se a URL está acessível
    private void verificarUrlAcessibilidade(String urlString) {
        try {
            // Criando a URL e abrindo a conexão HTTP
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000); // Timeout de 5 segundos
            connection.setReadTimeout(5000);

            // Fazendo a requisição e verificando o código de resposta
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                System.out.println("A URL está acessível! Código de resposta: " + responseCode);
            } else {
                System.out.println("Falha ao acessar a URL. Código de resposta: " + responseCode);
            }

            // Aqui podemos adicionar mais verificações como validar o tipo de resposta (ex: XML ou WSDL)
            if (connection.getContentType().contains("xml") || connection.getContentType().contains("wsdl")) {
                System.out.println("O tipo de conteúdo da resposta é válido: " + connection.getContentType());
            } else {
                System.out.println("Tipo de conteúdo inesperado: " + connection.getContentType());
            }

        } catch (IOException e) {
            System.out.println("Erro ao verificar a URL: " + e.getMessage());
        }
    }
}
