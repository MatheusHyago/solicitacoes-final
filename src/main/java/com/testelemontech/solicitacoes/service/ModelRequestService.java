package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.config.SoapConfig;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    @Autowired
    private SoapConfig soapConfig;

    @Autowired
    private WebServiceTemplate webServiceTemplate;

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
            soapConfig.enviarComCabecalho(webServiceTemplate, request);

            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate.marshalSendAndReceive(
                    soapConfig.getWsdlUrl(), request);

            List<ModelRequest> produtosAereos = converterParaModelRequest(response);

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

    private List<ModelRequest> converterParaModelRequest(PesquisarSolicitacaoResponse response) {
        // Implementar a lógica de conversão aqui
        return null; // Substituir pela lista convertida de ModelRequest
    }

    @PostConstruct
    public void init() {
        buscarESalvarProdutosAereos();
    }
}