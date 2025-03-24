package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class ModelRequestController {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestController.class);

    @Autowired
    private ModelRequestService modelRequestService;

    // 🔹 Salvar uma nova solicitação
    @PostMapping
    public ResponseEntity<ModelRequest> salvarSolicitacao(@RequestBody ModelRequest modelRequest) {
        logger.info("🔹 Salvando nova solicitação: {}", modelRequest);
        ModelRequest savedRequest = modelRequestService.salvarSolicitacao(modelRequest);
        return ResponseEntity.ok(savedRequest);
    }

    // 🔹 Buscar todas as solicitações
    @GetMapping
    public ResponseEntity<List<ModelRequest>> buscarTodasSolicitacoes() {
        logger.info("📋 Buscando todas as solicitações...");
        List<ModelRequest> solicitacoes = modelRequestService.buscarTodasSolicitacoes();
        return ResponseEntity.ok(solicitacoes);
    }

    // 🔹 Buscar uma solicitação por ID
    @GetMapping("/{id}")
    public ResponseEntity<ModelRequest> buscarSolicitacaoPorId(@PathVariable Long id) {
        logger.info("🔍 Buscando solicitação com ID: {}", id);
        return modelRequestService.buscarSolicitacaoPorId(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> {
                    logger.warn("⚠️ Solicitação com ID {} não encontrada!", id);
                    return ResponseEntity.notFound().build();
                });
    }

    // 🔹 Excluir uma solicitação por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirSolicitacao(@PathVariable Long id) {
        logger.info("🗑️ Excluindo solicitação com ID: {}", id);
        modelRequestService.excluirSolicitacao(id);
        return ResponseEntity.noContent().build();
    }

    // 🔹 Gerar e salvar solicitações fictícias
    @PostMapping("/gerar")
    public ResponseEntity<String> gerarSolicitacoesCheias() {
        logger.info("📌 Gerando solicitações fictícias...");
        modelRequestService.salvarSolicitacoesCheias();
        return ResponseEntity.ok("✅ Solicitações fictícias geradas com sucesso!");
    }

    // 🔹 Importar solicitações da Lemontech via SOAP
    @PostMapping("/importar")
    public ResponseEntity<String> importarSolicitacoes() {
        try {
            logger.info("🔄 Importando solicitações da Lemontech...");
            int quantidadeImportada = modelRequestService.importarSolicitacoesDaLemontech();

            if (quantidadeImportada > 0) {
                return ResponseEntity.ok("✅ Importação concluída com sucesso! " + quantidadeImportada + " solicitações foram salvas.");
            } else {
                return ResponseEntity.ok("⚠️ Nenhuma solicitação nova foi encontrada para importar.");
            }
        } catch (Exception e) {
            logger.error("❌ Erro ao importar solicitações da Lemontech: {}", e.getMessage(), e);
            return ResponseEntity.internalServerError().body("❌ Erro ao importar as solicitações: " + e.getMessage());
        }
    }
}
