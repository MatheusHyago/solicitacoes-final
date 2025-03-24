package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/solicitacoes")
public class ModelRequestController {

    private final ModelRequestService modelRequestService;

    public ModelRequestController(ModelRequestService modelRequestService) {
        this.modelRequestService = modelRequestService;
    }

    @PostMapping
    public ResponseEntity<ModelRequest> salvarSolicitacao(@RequestBody ModelRequest modelRequest) {
        return ResponseEntity.ok(modelRequestService.salvarSolicitacao(modelRequest));
    }

    @GetMapping
    public ResponseEntity<List<ModelRequest>> buscarTodasSolicitacoes() {
        List<ModelRequest> solicitacoes = modelRequestService.buscarTodasSolicitacoes();
        return solicitacoes.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(solicitacoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModelRequest> buscarSolicitacaoPorId(@PathVariable Long id) {
        return modelRequestService.buscarSolicitacaoPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirSolicitacao(@PathVariable Long id) {
        modelRequestService.excluirSolicitacao(id);
        return ResponseEntity.noContent().build();
    }

    // Removido o endpoint "/gerar" que chamava salvarSolicitacoesCheias()

    @PostMapping("/importar")
    public ResponseEntity<String> importarSolicitacoes() {
        modelRequestService.importarSolicitacoesDaLemontech();
        return ResponseEntity.ok("Importação concluída com sucesso!");
    }
}
