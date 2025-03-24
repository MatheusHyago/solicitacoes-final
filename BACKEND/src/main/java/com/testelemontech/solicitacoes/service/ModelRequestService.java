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

        // Buscar as solicitações do Web Service SOAP
        List<ModelRequest> solicitacoesImportadas = wsClient.buscarProdutosAereos(
                LocalDateTime.now().minusMonths(3),  // Exemplo: buscar dos últimos 3 meses
                LocalDateTime.now()
        );

        // Verificar se há dados antes de salvar
        if (!solicitacoesImportadas.isEmpty()) {
            modelRequestRepository.saveAll(solicitacoesImportadas);
            logger.info("✅ {} solicitações foram importadas e salvas.", solicitacoesImportadas.size());
            return solicitacoesImportadas;  // Retorna os dados importados
        }

        logger.warn("⚠️ Nenhuma solicitação nova foi encontrada para importar.");
        return List.of();  // Retorna uma lista vazia se não houver novas solicitações
    }

}
