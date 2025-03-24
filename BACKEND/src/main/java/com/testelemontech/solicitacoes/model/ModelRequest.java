package com.testelemontech.solicitacoes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "model_requests")
public class ModelRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Código da solicitação é obrigatório")
    @Column(nullable = false, unique = true)
    private String codigoSolicitacao; // Identificador único da solicitação

    @NotBlank(message = "Nome do passageiro é obrigatório")
    @Column(nullable = false)
    private String nomePassageiro;

    @NotBlank(message = "Companhia aérea é obrigatória")
    @Column(nullable = false)
    private String ciaAerea;

    @NotNull(message = "Data e hora de saída são obrigatórias")
    @Column(nullable = false)
    private LocalDateTime dataHoraSaida;

    @NotNull(message = "Data e hora de chegada são obrigatórias")
    @Column(nullable = false)
    private LocalDateTime dataHoraChegada;

    @NotBlank(message = "Cidade de origem é obrigatória")
    @Column(nullable = false)
    private String cidadeOrigem;

    @NotBlank(message = "Cidade de destino é obrigatória")
    @Column(nullable = false)
    private String cidadeDestino;

    @NotNull(message = "Data de solicitação é obrigatória")
    @Column(nullable = false)
    private LocalDateTime dataSolicitacao;


    public ModelRequest() {}

    // Construtor com todos os atributos
    public ModelRequest(String codigoSolicitacao, String nomePassageiro, String ciaAerea, LocalDateTime dataHoraSaida,
                        LocalDateTime dataHoraChegada, String cidadeOrigem, String cidadeDestino,
                        LocalDateTime dataSolicitacao) {
        this.codigoSolicitacao = codigoSolicitacao;
        this.nomePassageiro = nomePassageiro;
        this.ciaAerea = ciaAerea;
        this.dataHoraSaida = dataHoraSaida;
        this.dataHoraChegada = dataHoraChegada;
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.dataSolicitacao = dataSolicitacao;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCodigoSolicitacao() { return codigoSolicitacao; }
    public void setCodigoSolicitacao(String codigoSolicitacao) { this.codigoSolicitacao = codigoSolicitacao; }

    public String getNomePassageiro() { return nomePassageiro; }
    public void setNomePassageiro(String nomePassageiro) { this.nomePassageiro = nomePassageiro; }

    public String getCiaAerea() { return ciaAerea; }
    public void setCiaAerea(String ciaAerea) { this.ciaAerea = ciaAerea; }

    public LocalDateTime getDataHoraSaida() { return dataHoraSaida; }
    public void setDataHoraSaida(LocalDateTime dataHoraSaida) { this.dataHoraSaida = dataHoraSaida; }

    public LocalDateTime getDataHoraChegada() { return dataHoraChegada; }
    public void setDataHoraChegada(LocalDateTime dataHoraChegada) { this.dataHoraChegada = dataHoraChegada; }

    public String getCidadeOrigem() { return cidadeOrigem; }
    public void setCidadeOrigem(String cidadeOrigem) { this.cidadeOrigem = cidadeOrigem; }

    public String getCidadeDestino() { return cidadeDestino; }
    public void setCidadeDestino(String cidadeDestino) { this.cidadeDestino = cidadeDestino; }

    public LocalDateTime getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDateTime dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }

    @Override
    public String toString() {
        return "ModelRequest{" +
                "id=" + id +
                ", codigoSolicitacao='" + codigoSolicitacao + '\'' +
                ", nomePassageiro='" + nomePassageiro + '\'' +
                ", ciaAerea='" + ciaAerea + '\'' +
                ", dataHoraSaida=" + dataHoraSaida +
                ", dataHoraChegada=" + dataHoraChegada +
                ", cidadeOrigem='" + cidadeOrigem + '\'' +
                ", cidadeDestino='" + cidadeDestino + '\'' +
                ", dataSolicitacao=" + dataSolicitacao +
                '}';
    }
}
