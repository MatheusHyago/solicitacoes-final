package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.config.WsClient;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    @Autowired
    private WsClient wsClient; // Cliente que consome a API SOAP

    // Método para salvar uma nova solicitação de viagem manualmente
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

    // Método para buscar os produtos Aéreos da API SOAP e salvar no banco automaticamente
    public void buscarESalvarProdutosAereos() {
        List<ModelRequest> produtosAereos = wsClient.buscarProdutosAereos(); // Chama a API SOAP

        if (!produtosAereos.isEmpty()) {
            modelRequestRepository.saveAll(produtosAereos); // Salva os dados no banco
            System.out.println("✅ Produtos Aéreos salvos no banco!");
        } else {
            System.out.println("⚠️ Nenhum produto aéreo encontrado.");
        }
    }

    // Chamar o método automaticamente ao iniciar a aplicação
    @PostConstruct
    public void init() {
        buscarESalvarProdutosAereos();
    }
}
