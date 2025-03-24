package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ModelRequestService {

    private final ModelRequestRepository modelRequestRepository;
    private final WsClient wsClient;

    public ModelRequestService(ModelRequestRepository modelRequestRepository, WsClient wsClient) {
        this.modelRequestRepository = modelRequestRepository;
        this.wsClient = wsClient;
    }

    public List<ModelRequest> listarSolicitacoes() {
        return modelRequestRepository.findAll();
    }

    public List<ModelRequest> buscarESalvarSolicitacoes() {
        // Consumir o serviço SOAP para obter as solicitações
        PesquisarSolicitacaoResponse response = wsClient.buscarSolicitacoes("2024-12-14T00:00:00", "2025-03-01T00:00:00");

        // Processar a resposta e mapear para ModelRequest
        List<ModelRequest> solicitacoes = response.getSolicitacao().stream()
                .map(s -> {
                    ModelRequest modelRequest = new ModelRequest();
                    modelRequest.setCodigoSolicitacao(s.getCodigoSolicitacao());
                    modelRequest.setNomeSolicitante(s.getNomeSolicitante());
                    modelRequest.setIdSolicitacao(s.getIdSolicitacao());
                    modelRequest.setDataCriacao(s.getDataCriacao());
                    return modelRequest;
                })
                .collect(Collectors.toList());

        // Salvar no banco de dados
        modelRequestRepository.saveAll(solicitacoes);

        return solicitacoes;
    }
}
