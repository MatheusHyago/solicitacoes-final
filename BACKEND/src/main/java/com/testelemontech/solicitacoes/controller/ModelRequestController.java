package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitacoes")
public class ModelRequestController {

    private final ModelRequestService modelRequestService;
    private static final Logger logger = LoggerFactory.getLogger(ModelRequestController.class);

    public ModelRequestController(ModelRequestService modelRequestService) {
        this.modelRequestService = modelRequestService;
    }

    // Importa e salva solicitações
    @GetMapping("/importar")
    public ResponseEntity<List<ModelRequest>> importarSolicitacoes() {
        logger.info("Iniciando a importação das solicitações.");
        List<ModelRequest> solicitacoes = modelRequestService.buscarESalvarSolicitacoes();
        logger.info("Solicitações importadas: {}", solicitacoes.size());
        return ResponseEntity.ok(solicitacoes);
    }

    // Lista todas as solicitações
    @GetMapping
    public ResponseEntity<List<ModelRequest>> listarSolicitacoes() {
        logger.info("Listando todas as solicitações.");
        List<ModelRequest> solicitacoes = modelRequestService.listarSolicitacoes();
        logger.info("Solicitações encontradas: {}", solicitacoes.size());
        return ResponseEntity.ok(solicitacoes);
    }

    // Buscar solicitação por ID
    @GetMapping("/{id}")
    public ResponseEntity<ModelRequest> buscarSolicitacaoPorId(@PathVariable Long id) {
        logger.info("Buscando solicitação com ID: {}", id);
        Optional<ModelRequest> solicitacao = modelRequestService.buscarSolicitacaoPorId(id);
        return solicitacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Criar uma nova solicitação
    @PostMapping
    public ResponseEntity<ModelRequest> criarSolicitacao(@RequestBody ModelRequest modelRequest) {
        logger.info("Criando nova solicitação.");
        ModelRequest saved = modelRequestService.salvarSolicitacao(modelRequest);
        return ResponseEntity.ok(saved);
    }

    // Deletar uma solicitação por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirSolicitacao(@PathVariable Long id) {
        logger.info("Excluindo solicitação com ID: {}", id);
        modelRequestService.excluirSolicitacao(id);
        return ResponseEntity.noContent().build();
    }
}
