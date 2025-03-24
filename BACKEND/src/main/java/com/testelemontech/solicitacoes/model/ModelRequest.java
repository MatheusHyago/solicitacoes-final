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

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

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
}
