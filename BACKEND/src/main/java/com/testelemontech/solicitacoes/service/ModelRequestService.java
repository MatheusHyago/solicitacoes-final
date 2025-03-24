package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;


import java.util.List;
import java.util.Optional;

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    // Método para salvar uma solicitação
    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return modelRequestRepository.save(modelRequest);
    }

    // Método para buscar todas as solicitações
    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestRepository.findAll();
    }

    // Método para buscar uma solicitação por ID
    public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
        return modelRequestRepository.findById(id);
    }

    // Método para excluir uma solicitação por ID
    public void excluirSolicitacao(Long id) {
        modelRequestRepository.deleteById(id);
    }

    // Método para gerar e salvar solicitações fictícias
    public void salvarSolicitacoesCheias() {
        // Aqui você pode gerar solicitações fictícias e salvá-las
        ModelRequest solicitacao1 = new ModelRequest();
        solicitacao1.setNomePassageiro("João Silva");
        solicitacao1.setCiaAerea("LATAM");
        solicitacao1.setCidadeOrigem("São Paulo");
        solicitacao1.setCidadeDestino("Rio de Janeiro");
        solicitacao1.setDataHoraSaida(LocalDateTime.now().plusDays(1));
        solicitacao1.setDataHoraChegada(LocalDateTime.now().plusDays(1).plusHours(2));

        modelRequestRepository.save(solicitacao1);

        // Adicione mais solicitações fictícias conforme necessário
    }
}
