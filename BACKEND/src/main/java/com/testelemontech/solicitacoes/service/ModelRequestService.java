package com.testelemontech.solicitacoes.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Classe de serviço responsável por lidar com a lógica de negócios relacionada a solicitações.
 */
@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

    @Autowired
    private WsClient wsClient;

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    /**
     * Recupera solicitações dos últimos três meses, salva no repositório
     * e retorna a lista de solicitações.
     *
     * @return uma lista de solicitações dos últimos três meses.
     */
    public List<ModelRequest> getSolicitacoesUltimosTresMeses() {
        try {
            // Define o intervalo de datas: de três meses atrás até a data atual
            LocalDateTime dataFim = LocalDateTime.now();
            LocalDateTime dataInicio = dataFim.minusMonths(3);

            // Busca solicitações de uma API externa
            // Use o método correto da WsClient
            List<Solicitacao> solicitacoesExternas = wsClient.pesquisarSolicitacoes(dataInicio.toLocalDate(), dataFim.toLocalDate());

            if (solicitacoesExternas == null || solicitacoesExternas.isEmpty()) {
                logger.warn("Nenhuma solicitação recebida da API externa.");
                return List.of();  // Retorna uma lista vazia caso não haja solicitações
            }

            // Converte a lista de Solicitacao para uma lista de ModelRequest
            List<ModelRequest> solicitacoes = solicitacoesExternas.stream()
                    .map(this::convertSolicitacaoToModelRequest)
                    .collect(Collectors.toList());

            // Salva as solicitações buscadas no repositório
            modelRequestRepository.saveAll(solicitacoes);
            logger.info("Salvou com sucesso {} solicitações no repositório", solicitacoes.size());

            return solicitacoes;

        } catch (Exception e) {
            logger.error("Erro ao recuperar ou salvar solicitações: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao recuperar solicitações.", e);  // Exceção personalizada
        }
    }

    private ModelRequest convertSolicitacaoToModelRequest(Solicitacao solicitacao) {
        // Conversão da Solicitacao para ModelRequest
        ModelRequest modelRequest = new ModelRequest();
        modelRequest.setCodigoSolicitacao(String.valueOf(solicitacao.getIdSolicitacao()));
        // Adicione outros mapeamentos necessários aqui

        return modelRequest;
    }
}
