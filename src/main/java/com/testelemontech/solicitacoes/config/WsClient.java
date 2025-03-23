package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.model.ModelRequest;
import java.util.List;
import java.util.ArrayList;

public class WsClient {

    // Método sem parâmetros
    public List<ModelRequest> buscarProdutosAereos() {
        // Lógica para chamar a API SOAP sem parâmetros
        System.out.println("Buscando produtos aéreos...");

        // Simulando a resposta da API
        List<ModelRequest> produtos = new ArrayList<>();
        produtos.add(new ModelRequest()); // Adicionando um exemplo de produto
        return produtos;
    }
}
