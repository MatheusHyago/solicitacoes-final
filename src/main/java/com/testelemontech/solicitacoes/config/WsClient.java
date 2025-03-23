package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest; // Usando as classes geradas
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse; // Usando as classes geradas
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import com.testelemontech.solicitacoes.model.ModelRequest;

import java.util.List;

@Component
public class WsClient {

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    private final WebServiceTemplate webServiceTemplate;

    public WsClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public List<ModelRequest> buscarProdutosAereos() {
        // Cria a requisição
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
        // Preenche a requisição conforme a API SOAP (adicione os dados necessários aqui)

        // Faz a chamada à API SOAP
        PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse)
                webServiceTemplate.marshalSendAndReceive(wsdlUrl, request);

        // Processa a resposta e converte para ModelRequest
        List<ModelRequest> produtos = processarResposta(response);
        return produtos;
    }

    private List<ModelRequest> processarResposta(PesquisarSolicitacaoResponse response) {
        // Mapeia os dados da resposta para o ModelRequest (ajuste conforme necessário)
        return response.getProdutosAereos(); // Ajuste conforme os dados retornados pela resposta
    }
}
