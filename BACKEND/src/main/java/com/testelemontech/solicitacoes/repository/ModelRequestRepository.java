package com.testelemontech.solicitacoes.repository;

import com.testelemontech.solicitacoes.model.ModelRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRequestRepository extends JpaRepository<ModelRequest, Long> {
    // Métodos customizados podem ser adicionados aqui
}