package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class ModelRequestController {

    @Autowired
    private ModelRequestService modelRequestService;

    // 🔹 Salvar uma nova solicitação
    @PostMapping
    public ResponseEntity<ModelRequest> salvarSolicitacao(@RequestBody ModelRequest modelRequest) {
        ModelRequest saved = modelRequestService.salvarSolicitacao(modelRequest);
        return ResponseEntity.ok(saved);
    }

    // 🔹 Buscar todas as solicitações
    @GetMapping
    public ResponseEntity<List<ModelRequest>> buscarTodasSolicitacoes() {
        List<ModelRequest> solicitacoes = modelRequestService.buscarTodasSolicitacoes();
        return ResponseEntity.ok(solicitacoes);
    }

    // 🔹 Buscar uma solicitação por ID
    @GetMapping("/{id}")
    public ResponseEntity<ModelRequest> buscarSolicitacaoPorId(@PathVariable Long id) {
        // Verifica se a solicitação existe
        return modelRequestService.buscarSolicitacaoPorId(id)
                .map(solicitacao -> ResponseEntity.ok(solicitacao)) // Caso encontrado
                .orElse(ResponseEntity.notFound().build()); // Caso não encontrado
    }

    // 🔹 Excluir uma solicitação por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluirSolicitacao(@PathVariable Long id) {
        modelRequestService.excluirSolicitacao(id);
        return ResponseEntity.ok("Solicitação excluída com sucesso!");
    }

    // 🔹 Gerar e salvar solicitações fictícias
    @PostMapping("/gerar")
    public ResponseEntity<String> gerarSolicitacoesCheias() {
        modelRequestService.salvarSolicitacoesCheias();
        return ResponseEntity.ok("Solicitações fictícias geradas e salvas com sucesso!");
    }

    // 🔹 Importar solicitações da Lemontech via SOAP
    @PostMapping("/importar")
    public ResponseEntity<String> importarSolicitacoes() {
        modelRequestService.importarSolicitacoesDaLemontech();
        return ResponseEntity.ok("Importação das solicitações concluída com sucesso!");
    }
}
