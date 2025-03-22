package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    @Autowired
    private WsClient wsClient;

    @Value("${soap.keyClient}")
    private String keyClient;

    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return modelRequestRepository.save(modelRequest);
    }

    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestRepository.findAll();
    }

    public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
        return modelRequestRepository.findById(id);
    }

    public void excluirSolicitacao(Long id) {
        modelRequestRepository.deleteById(id);
    }

    public void buscarESalvarProdutosAereos() {
        try {
            PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
            request.setChaveCliente(keyClient); // Ajuste conforme necessário

            List<ModelRequest> produtosAereos = wsClient.buscarProdutosAereos(request);

            if (!produtosAereos.isEmpty()) {
                modelRequestRepository.saveAll(produtosAereos);
                System.out.println("✅ Produtos Aéreos salvos no banco!");
            } else {
                System.out.println("⚠️ Nenhum produto aéreo encontrado.");
            }
        } catch (Exception e) {
            System.err.println("❌ Erro ao buscar produtos aéreos via SOAP: " + e.getMessage());
        }
    }

    @PostConstruct
    public void init() {
        buscarESalvarProdutosAereos();
    }
}