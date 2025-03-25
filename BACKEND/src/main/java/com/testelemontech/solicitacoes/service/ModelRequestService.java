package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.wsdl.PesquisarConciliacaoCartaoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);
    private final WsClient wsClient;
    private final ModelRequestRepository repository;

    public ModelRequestService(WsClient wsClient, ModelRequestRepository repository) {
        this.wsClient = wsClient;
        this.repository = repository;
    }

    // Salva uma nova solicitação
    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return repository.save(modelRequest);
    }

    // Retorna todas as solicitações salvas
    public List<ModelRequest> listarSolicitacoes() {
        return repository.findAll();
    }

    // Retorna uma solicitação pelo ID
    public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
        return repository.findById(id);
    }

    // Exclui uma solicitação pelo ID
    public void excluirSolicitacao(Long id) {
        repository.deleteById(id);
    }

    // Importa solicitações via SOAP e salva no banco
    @Transactional
    public List<ModelRequest> buscarESalvarSolicitacoes() {
        logger.info("Iniciando importação de solicitações da Lemontech...");

        // ✅ Corrigido para usar Integer e LocalDate
        Integer codigoEmpresa = 12345;
        LocalDate dataAtual = LocalDate.now();
        String uf = "SP";

        List<PesquisarConciliacaoCartaoResponse> responses = wsClient.buscarConciliacaoCartao(codigoEmpresa, dataAtual, uf);

        List<ModelRequest> modelRequests = responses.stream()
                .map(this::toModelRequest)
                .collect(Collectors.toList());

        if (!modelRequests.isEmpty()) {
            repository.saveAll(modelRequests);
            logger.info("Importação concluída com sucesso. {} solicitações importadas.", modelRequests.size());
        } else {
            logger.warn("Nenhuma solicitação importada.");
        }

        return modelRequests;
    }

    // Converte resposta do WS para ModelRequest
    private ModelRequest toModelRequest(PesquisarConciliacaoCartaoResponse response) {
        LocalDateTime agora = LocalDateTime.now();

        ModelRequest model = new ModelRequest();

        // ✅ Corrigido para usar `setCodigoSolicitacao`
        model.setCodigoSolicitacao(response.getNumeroConciliacoes() != null
                ? response.getNumeroConciliacoes().toString()
                : "N/A");
        model.setNomePassageiro("Nome Exemplo");
        model.setCiaAerea("Cia Exemplo");
        model.setCidadeOrigem("Origem Exemplo");
        model.setCidadeDestino("Destino Exemplo");
        model.setDataHoraSaida(agora);
        model.setDataHoraChegada(agora);
        model.setDataSolicitacao(agora);
        return model;
    }
}