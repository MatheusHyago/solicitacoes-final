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
        // Define o intervalo de datas: de três meses atrás até a data atual
        LocalDateTime dataFim = LocalDateTime.now();
        LocalDateTime dataInicio = dataFim.minusMonths(3);

        // Busca solicitações de uma API externa
        List<Solicitacao> solicitacoesExternas = wsClient.buscarSolicitacoes(dataInicio.toLocalDate(), dataFim.toLocalDate());

        // Converte a lista de Solicitacao para uma lista de ModelRequest
        List<ModelRequest> solicitacoes = solicitacoesExternas.stream()
                .map(this::convertSolicitacaoToModelRequest)
                .collect(Collectors.toList());

        // Salva as solicitações buscadas no repositório
        if (!solicitacoes.isEmpty()) {
            modelRequestRepository.saveAll(solicitacoes);
            logger.info("Salvou com sucesso {} solicitações no repositório", solicitacoes.size());
        } else {
            logger.warn("Nenhuma solicitação encontrada para salvar");
        }

        return solicitacoes;
    }

    private ModelRequest convertSolicitacaoToModelRequest(Solicitacao solicitacao) {
        ModelRequest modelRequest = new ModelRequest();
        modelRequest.setCodigoSolicitacao(String.valueOf(solicitacao.getIdSolicitacao()));
        // Adicione outros mapeamentos necessários aqui
        return modelRequest;
    }
}