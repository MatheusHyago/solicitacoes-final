package com.testelemontech.solicitacoes.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;

@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

    @Autowired
    private WsClient wsClient; // Cliente SOAP para buscar dados

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    /**
     * 🔍 Lista todas as solicitações salvas no banco.
     * @return Lista de ModelRequest.
     */
    public List<ModelRequest> listarTodas() {
        logger.info("📥 Buscando todas as solicitações salvas no banco.");
        return modelRequestRepository.findAll();
    }

    /**
     * 🔄 Importa solicitações da Lemontech via SOAP e salva no banco.
     * @return Lista de ModelRequest importadas.
     */
    public List<ModelRequest> importarSolicitacoesDaLemontech() {
        logger.info("🔄 Iniciando importação de solicitações da Lemontech...");

        // Define a data inicial como 3 meses atrás e a final como hoje
        LocalDateTime dataInicial = LocalDateTime.now().minusMonths(3);
        LocalDateTime dataFinal = LocalDateTime.now();

        // Busca as solicitações através do WebService SOAP
        List<ModelRequest> solicitacoes = wsClient.buscarProdutosAereos(dataInicial, dataFinal);

        if (!solicitacoes.isEmpty()) {
            modelRequestRepository.saveAll(solicitacoes);
            logger.info("✅ {} solicitações foram importadas e salvas.", solicitacoes.size());
        } else {
            logger.warn("⚠️ Nenhuma solicitação nova foi encontrada para importar.");
        }

        return solicitacoes;
    }
}
