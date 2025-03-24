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
     * 🔍 Retorna todas as solicitações salvas no banco de dados.
     * @return Lista de ModelRequest.
     */
    @GetMapping
    public ResponseEntity<List<ModelRequest>> listarTodas() {
        logger.info("📨 Requisição para listar todas as solicitações recebida.");
        List<ModelRequest> solicitacoes = modelRequestService.listarTodas();

        if (solicitacoes.isEmpty()) {
            logger.warn("⚠️ Nenhuma solicitação encontrada no banco.");
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(solicitacoes);
    }

    /**
     * 🔄 Importa novas solicitações via SOAP e salva no banco.
     * @return Lista de ModelRequest importadas.
     */
    @PostMapping("/importar")
    public ResponseEntity<List<ModelRequest>> importarSolicitacoes() {
        logger.info("📨 Requisição para importar solicitações recebida.");
        List<ModelRequest> importadas = modelRequestService.importarSolicitacoesDaLemontech();

        if (importadas.isEmpty()) {
            logger.warn("⚠️ Nenhuma nova solicitação importada.");
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(importadas);
    }
}
