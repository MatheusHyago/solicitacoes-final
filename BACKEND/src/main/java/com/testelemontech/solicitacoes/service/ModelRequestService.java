package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

    private final ModelRequestRepository modelRequestRepository;
    private final WsClient wsClient;

    public ModelRequestService(ModelRequestRepository modelRequestRepository, WsClient wsClient) {
        this.modelRequestRepository = modelRequestRepository;
        this.wsClient = wsClient;
    }

    /**
     * Importa solicitações da Lemontech via SOAP e salva os registros no banco.
     */
    public List<ModelRequest> importarSolicitacoesDaLemontech() {
        logger.info("🔄 Iniciando importação de solicitações da Lemontech...");
        // Define o intervalo, por exemplo, últimos 3 meses até agora
        LocalDateTime startDate = LocalDateTime.now().minusMonths(3);
        LocalDateTime endDate = LocalDateTime.now();
        List<ModelRequest> solicitacoesImportadas = wsClient.buscarProdutosAereos(startDate, endDate);

        if (!solicitacoesImportadas.isEmpty()) {
            modelRequestRepository.saveAll(solicitacoesImportadas);
            logger.info("✅ {} solicitações importadas e salvas no banco.", solicitacoesImportadas.size());
            return solicitacoesImportadas;
        }
        logger.warn("⚠️ Nenhuma nova solicitação foi encontrada para importar.");
        return List.of();
    }
}
