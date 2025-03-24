package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
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

    /**
     * Endpoint para importar solicitações da Lemontech.
     */
    @PostMapping("/importar")
    public ResponseEntity<List<ModelRequest>> importarSolicitacoes() {
        logger.info("🔄 Requisição para importar solicitações recebida.");
        List<ModelRequest> importadas = modelRequestService.importarSolicitacoesDaLemontech();
        if (!importadas.isEmpty()) {
            return ResponseEntity.ok(importadas);
        }
        return ResponseEntity.noContent().build();
    }
}
