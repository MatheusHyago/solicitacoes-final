package com.testelemontech.solicitacoes.repository;

import com.testelemontech.solicitacoes.model.ModelRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRequestRepository extends JpaRepository<ModelRequest, Long> {
    // Aqui você pode adicionar consultas personalizadas, se necessário
}
