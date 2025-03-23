package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.model.ModelRequest;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

@Component // Adicionando essa anotação para que o Spring reconheça como um Bean
public class WsClient {

    public List<ModelRequest> buscarProdutosAereos() {
        System.out.println("Buscando produtos aéreos...");

        // Simulando a resposta da API
        List<ModelRequest> produtos = new ArrayList<>();
        produtos.add(new ModelRequest()); // Adicionando um exemplo de produto
        return produtos;
    }
}
