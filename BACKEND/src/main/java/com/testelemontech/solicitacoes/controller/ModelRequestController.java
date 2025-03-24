package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitacoes")
public class ModelRequestController {

    @Autowired
    private ModelRequestService modelRequestService;

    // Endpoint para salvar uma solicitação
    @PostMapping
    public ModelRequest salvarSolicitacao(@RequestBody ModelRequest modelRequest) {
        return modelRequestService.salvarSolicitacao(modelRequest);
    }

    // Endpoint para buscar todas as solicitações
    @GetMapping
    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestService.buscarTodasSolicitacoes();
    }

    // Endpoint para buscar uma solicitação por ID
    @GetMapping("/{id}")
    public Optional<ModelRequest> buscarSolicitacaoPorId(@PathVariable Long id) {
        return modelRequestService.buscarSolicitacaoPorId(id);
    }

    // Endpoint para excluir uma solicitação por ID
    @DeleteMapping("/{id}")
    public void excluirSolicitacao(@PathVariable Long id) {
        modelRequestService.excluirSolicitacao(id);
    }

    // Endpoint para gerar e salvar solicitações fictícias
    @PostMapping("/gerar")
    public void gerarSolicitacoesCheias() {
        modelRequestService.salvarSolicitacoesCheias();
    }
}
