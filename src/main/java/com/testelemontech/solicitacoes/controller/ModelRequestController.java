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

    @PostMapping
    public ModelRequest salvarSolicitacao(@RequestBody ModelRequest modelRequest) {
        return modelRequestService.salvarSolicitacao(modelRequest);
    }

    @GetMapping
    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestService.buscarTodasSolicitacoes();
    }

    @GetMapping("/{id}")
    public Optional<ModelRequest> buscarSolicitacaoPorId(@PathVariable Long id) {
        return modelRequestService.buscarSolicitacaoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void excluirSolicitacao(@PathVariable Long id) {
        modelRequestService.excluirSolicitacao(id);
    }
}