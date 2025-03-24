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

    // 🔹 Método para salvar uma nova solicitação
    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return modelRequestRepository.save(modelRequest);
    }

    // 🔹 Método para buscar todas as solicitações salvas no banco
    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestRepository.findAll();
    }

    // 🔹 Método para buscar uma solicitação por ID
    public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
        return modelRequestRepository.findById(id);
    }

    // 🔹 Método para excluir uma solicitação por ID
    public void excluirSolicitacao(Long id) {
        modelRequestRepository.deleteById(id);
    }

    // 🔹 Método para gerar e salvar solicitações fictícias
    public void salvarSolicitacoesCheias() {
        List<ModelRequest> solicitacoesFicticias = gerarSolicitacoesFicticias();
        modelRequestRepository.saveAll(solicitacoesFicticias);
        System.out.println("✅ Solicitações fictícias geradas e salvas com sucesso!");
    }

    // 🔹 Método auxiliar para gerar solicitações fictícias
    private List<ModelRequest> gerarSolicitacoesFicticias() {
        // Exemplo simples de dados fictícios
        ModelRequest solicitacao1 = new ModelRequest();
        solicitacao1.setNomePassageiro("Passageiro 1");
        solicitacao1.setDataSolicitacao(LocalDateTime.now().minusDays(10));

        ModelRequest solicitacao2 = new ModelRequest();
        solicitacao2.setNomePassageiro("Passageiro 2");
        solicitacao2.setDataSolicitacao(LocalDateTime.now().minusDays(5));

        ModelRequest solicitacao3 = new ModelRequest();
        solicitacao3.setNomePassageiro("Passageiro 3");
        solicitacao3.setDataSolicitacao(LocalDateTime.now().minusDays(3));

        return List.of(solicitacao1, solicitacao2, solicitacao3);
    }

    // 🔹 Método para importar solicitações da Lemontech via SOAP
    public void importarSolicitacoesDaLemontech() {
        // A implementação dessa lógica depende da sua integração com o SOAP.
        // Deixe um código de exemplo para importar.
    }
}
