package com.testelemontech.solicitacoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;

import java.util.List;

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    // Método que sincroniza as solicitações do WebService e salva no banco
    public List<ModelRequest> importarSolicitacoesDaLemontech() {
        // Lógica para importar solicitações (já fornecido anteriormente)
        return null; // Retorno temporário, ajuste conforme necessário
    }

    // Método que busca todas as solicitações no banco de dados
    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestRepository.findAll(); // Busca todas as solicitações no banco de dados
    }
}
