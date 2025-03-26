package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.service.ModelRequestService;
import com.testelemontech.solicitacoes.model.ModelRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class ModelRequestController {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestController.class);
    private final ModelRequestService modelRequestService;

    public ModelRequestController(ModelRequestService modelRequestService) {
        this.modelRequestService = modelRequestService;
    }

    @GetMapping("/requisicoes")
    public ResponseEntity<List<ModelRequest>> importarSolicitacoes() {
        try {
            logger.info("Iniciando importação das solicitações...");

            // Import solicitations from the service
            List<ModelRequest> solicitacoes = modelRequestService.getModelRequest();

            if (solicitacoes.isEmpty()) {
                logger.warn("Nenhuma solicitação importada.");
                return ResponseEntity.noContent().build();
            }

            // Returning the imported solicitations as a response with a 200 OK status
            logger.info("Importação concluída. {} solicitações importadas.", solicitacoes.size());
            return ResponseEntity.ok(solicitacoes);

        } catch (Exception e) {
            logger.error("Erro ao importar solicitações: {}", e.getMessage(), e);
            return ResponseEntity.status(500).body(null);
        }
    }
}
