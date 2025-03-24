package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ModelRequestService {

    private final ModelRequestRepository modelRequestRepository;

    // Injeção via construtor (boa prática)
    public ModelRequestService(ModelRequestRepository modelRequestRepository) {
        this.modelRequestRepository = modelRequestRepository;
    }

    // 🔹 Salvar uma nova solicitação
    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return modelRequestRepository.save(modelRequest);
    }

    // 🔹 Buscar todas as solicitações
    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestRepository.findAll();
    }

    // 🔹 Buscar uma solicitação por ID
    public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
        return modelRequestRepository.findById(id);
    }

    // 🔹 Excluir uma solicitação por ID
    public void excluirSolicitacao(Long id) {
        modelRequestRepository.deleteById(id);
    }

    // 🔹 Gerar e salvar solicitações fictícias
    public void salvarSolicitacoesCheias() {
        ModelRequest req1 = new ModelRequest(
                "Passageiro 1",
                "LATAM",
                LocalDateTime.parse("2025-04-10T10:00:00"),
                LocalDateTime.parse("2025-04-10T15:00:00"),
                "São Paulo",
                "Nova York",
                LocalDateTime.now()
        );

        ModelRequest req2 = new ModelRequest(
                "Passageiro 2",
                "GOL",
                LocalDateTime.parse("2025-04-12T12:00:00"),
                LocalDateTime.parse("2025-04-12T18:00:00"),
                "Rio de Janeiro",
                "Paris",
                LocalDateTime.now()
        );

        modelRequestRepository.saveAll(List.of(req1, req2));
    }

    // 🔹 Importar solicitações da Lemontech via SOAP
    public int importarSolicitacoesDaLemontech() {
        List<ModelRequest> solicitacoesImportadas = chamarWebServiceSoap();

        if (!solicitacoesImportadas.isEmpty()) {
            modelRequestRepository.saveAll(solicitacoesImportadas);
            return solicitacoesImportadas.size();
        }
        return 0;
    }

    // 🔹 Método para consumir Web Service SOAP (deve ser implementado corretamente)
    private List<ModelRequest> chamarWebServiceSoap() {
        // Aqui deve entrar a lógica real de chamada ao Web Service SOAP
        return List.of(); // Por enquanto, retorna uma lista vazia
    }
}
