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

    private final ModelRequestService modelRequestService;
    private static final Logger logger = LoggerFactory.getLogger(ModelRequestController.class);

    public ModelRequestController(ModelRequestService modelRequestService) {
        this.modelRequestService = modelRequestService;
    }

    @GetMapping("/importar")
    public ResponseEntity<List<ModelRequest>> importarSolicitacoes() {
        logger.info("Iniciando a importação das solicitações.");
        List<ModelRequest> solicitacoes = modelRequestService.buscarESalvarSolicitacoes();
        logger.info("Solicitações importadas: " + solicitacoes.size());
        return ResponseEntity.ok(solicitacoes);
    }

    @GetMapping
    public ResponseEntity<List<ModelRequest>> listarSolicitacoes() {
        logger.info("Listando todas as solicitações.");
        List<ModelRequest> solicitacoes = modelRequestService.listarSolicitacoes();
        logger.info("Solicitações encontradas: " + solicitacoes.size());
        return ResponseEntity.ok(solicitacoes);
    }
}
