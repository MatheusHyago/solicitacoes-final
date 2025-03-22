package com.testelemontech.solicitacoes.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "model_requests")
public class ModelRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePassageiro;
    private String ciaAerea;
    private LocalDateTime dataHoraSaida;
    private LocalDateTime dataHoraChegada;
    private String cidadeOrigem;
    private String cidadeDestino;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public LocalDateTime getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(LocalDateTime dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    @Override
    public String toString() {
        return "ModelRequest{" +
                "id=" + id +
                ", nomePassageiro='" + nomePassageiro + '\'' +
                ", ciaAerea='" + ciaAerea + '\'' +
                ", dataHoraSaida=" + dataHoraSaida +
                ", dataHoraChegada=" + dataHoraChegada +
                ", cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                '}';
    }
}