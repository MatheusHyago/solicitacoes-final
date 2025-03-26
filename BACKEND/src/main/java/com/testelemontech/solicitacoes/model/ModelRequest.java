package com.testelemontech.solicitacoes.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "DB_VIAGENS")  // Table name in the database
public class ModelRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Automatically generated ID
    private Long id;

    @Column(name = "codigo_solicitacao", nullable = false)  // Ensuring it's not null in DB
    private String codigoSolicitacao;

    @Column(name = "nome_passageiro", nullable = false)  // Ensuring it's not null in DB
    private String nomePassageiro;

    @Column(name = "cia_aerea")
    private String ciaAerea;

    @Column(name = "cidade_origem")
    private String cidadeOrigem;

    @Column(name = "cidade_destino")
    private String cidadeDestino;

    @Column(name = "data_hora_saida")
    private LocalDateTime dataHoraSaida;

    @Column(name = "data_hora_chegada")
    private LocalDateTime dataHoraChegada;

    @Column(name = "data_solicitacao", nullable = false)  // Ensuring it's not null in DB
    private LocalDateTime dataSolicitacao;

    // Getters and Setters

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

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    @Override
    public String toString() {
        return "ModelRequest{" +
                "id=" + id +
                ", codigoSolicitacao='" + codigoSolicitacao + '\'' +
                ", nomePassageiro='" + nomePassageiro + '\'' +
                ", ciaAerea='" + ciaAerea + '\'' +
                ", cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", dataHoraSaida=" + dataHoraSaida +
                ", dataHoraChegada=" + dataHoraChegada +
                ", dataSolicitacao=" + dataSolicitacao +
                '}';
    }
}
