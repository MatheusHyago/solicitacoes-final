package com.testelemontech.solicitacoes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "model_requests")  // Mapeando explicitamente a tabela no banco de dados
public class ModelRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String codigoSolicitacao;

    @Column(nullable = false)
    private String nomeSolicitante;

    @Column(nullable = false)
    private Long idSolicitacao;

    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoSolicitacao() {
        return codigoSolicitacao;
    }

    public void setCodigoSolicitacao(String codigoSolicitacao) {
        this.codigoSolicitacao = codigoSolicitacao;
    }

    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
    }

    public Long getIdSolicitacao() {
        return idSolicitacao;
    }

    public void setIdSolicitacao(Long idSolicitacao) {
        this.idSolicitacao = idSolicitacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
