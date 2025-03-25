package com.testelemontech.solicitacoes.controller;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.service.ModelRequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller para gerenciar as solicitações.
 *
 * Endpoints:
 * - GET /api/model-requests/sincronizar: Sincroniza as solicitações do WS (busca, salva e retorna)
 * - GET /api/model-requests: Retorna todas as solicitações persistidas no banco
 */
@RestController
@RequestMapping("solicitacoes")
public class ModelRequestController {

    private final ModelRequestService service;

    public ModelRequestController(ModelRequestService service) {
        this.service = service;
    }


    @GetMapping("/sincronizar")
    public List<ModelRequest> sincronizarSolicitacoes() {
        return service.buscarESalvarSolicitacoes();
    }

    @GetMapping
    public List<ModelRequest> getAllModelRequests() {
        return service.listarSolicitacoes();
    }
}
