package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime; // Importando LocalDateTime

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    // Método para salvar uma nova solicitação de viagem
    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return modelRequestRepository.save(modelRequest);
    }

    // Método para buscar todas as solicitações salvas no banco
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

    // Método para gerar uma lista cheia de ModelRequests fictícias
    public List<ModelRequest> gerarSolicitacoesCheias() {
        List<ModelRequest> modelRequests = new ArrayList<>(); // Importando ArrayList

        // Gerar 10 solicitações fictícias
        for (int i = 1; i <= 10; i++) {
            ModelRequest modelRequest = new ModelRequest();
            modelRequest.setId((long) i);
            modelRequest.setNomePassageiro("Passageiro " + i);
            modelRequest.setCiaAerea("Cia " + i);
            modelRequest.setDataHoraSaida(LocalDateTime.now().plusDays(i)); // Atribui uma data futura
            modelRequest.setDataHoraChegada(LocalDateTime.now().plusDays(i + 1)); // Atribui data de chegada
            modelRequest.setCidadeOrigem("Cidade " + i);
            modelRequest.setCidadeDestino("Destino " + i);

            modelRequests.add(modelRequest);
        }

        return modelRequests;
    }

    // Método para salvar as solicitações geradas (caso precise salvar no banco)
    public void salvarSolicitacoesCheias() {
        List<ModelRequest> solicitacoes = gerarSolicitacoesCheias();
        modelRequestRepository.saveAll(solicitacoes);
        System.out.println("Solicitações geradas e prontas para serem salvas:");
        solicitacoes.forEach(solicitacao -> System.out.println(solicitacao.getNomePassageiro()));
    }
}
