package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.wsdl.PesquisarConciliacaoCartaoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
    public List<ModelRequest> buscarTodasSolicitacoes() {
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

    // Importa solicitações via SOAP (utiliza WsClient e converte as respostas em ModelRequest)
    public void importarSolicitacoesDaLemontech() {
        logger.info("Iniciando importação de solicitações da Lemontech...");

        // Exemplo: número de protocolo 12345, data atual e código regional "SP"
        List<PesquisarConciliacaoCartaoResponse> responses = wsClient.buscarConciliacaoCartao(12345, LocalDate.now(), "SP");

        List<ModelRequest> modelRequests = responses.stream()
                .map(this::toModelRequest)
                .collect(Collectors.toList());

        if (!modelRequests.isEmpty()) {
            repository.saveAll(modelRequests);
            logger.info("Importação concluída com sucesso. {} solicitações importadas.", modelRequests.size());
        } else {
            logger.warn("Nenhuma solicitação importada.");
        }
    }

    // Método de conversão: utiliza campos disponíveis na resposta para compor o ModelRequest.
    private ModelRequest toModelRequest(PesquisarConciliacaoCartaoResponse response) {
        LocalDateTime agora = LocalDateTime.now();
        // Como não temos getNumeroProtocolo(), usamos getNumeroConciliacoes() como exemplo
        String codigo = response.getNumeroConciliacoes() != null
                ? response.getNumeroConciliacoes().toString()
                : "N/A";

        ModelRequest model = new ModelRequest();
        model.setCodigoSolicitacao(codigo);
        model.setNomePassageiro("Nome Exemplo");    // Ajuste conforme os dados reais
        model.setCiaAerea("Cia Exemplo");             // Ajuste conforme os dados reais
        model.setCidadeOrigem("Origem Exemplo");        // Ajuste conforme os dados reais
        model.setCidadeDestino("Destino Exemplo");      // Ajuste conforme os dados reais
        model.setDataHoraSaida(agora);
        model.setDataHoraChegada(agora);
        model.setDataSolicitacao(agora);
        return model;
    }
}
