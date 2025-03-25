package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.testelemontech.solicitacoes.wsdl.Solicitacao;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

    private final WsClient wsClient;
    private final ModelRequestRepository repository;

    public ModelRequestService(com.testelemontech.solicitacoes.config.WsClient wsClient, ModelRequestRepository repository) {
        this.wsClient = wsClient;
        this.repository = repository;
    }

    public List<ModelRequest> getModelRequest() {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusMonths(3);

        logger.info("Fetching travel requests from SOAP service between {} and {}", startDate, endDate);
        List<Solicitacao> solicitacoesWS = wsClient.pesquisarSolicitacoes(startDate, endDate);

        List<ModelRequest> travelRequests = solicitacoesWS.stream()
                .map(this::convertToTravelRequest)
                .collect(Collectors.toList());

        if (!travelRequests.isEmpty()) {
            repository.saveAll(travelRequests);
            logger.info("Salva {} Requisições", getModelRequest().size());
        } else {
            logger.warn("No travel requests found to save.");
        }
        return travelRequests;
    }

    private ModelRequest convertToTravelRequest(Solicitacao solicitacao) {
        ModelRequest travelRequest = new ModelRequest();

        travelRequest.setCodigoSolicitacao(String.valueOf(solicitacao.getIdSolicitacao()));  // Correct setter
        travelRequest.setNomePassageiro(solicitacao.getSolicitante() != null ? solicitacao.getSolicitante().getNome() : "Unknown"); // Correct setter
        travelRequest.setDataSolicitacao(LocalDate.now().atStartOfDay());  // Assuming you're using LocalDateTime for dataSolicitacao

        return travelRequest;
    }
}
