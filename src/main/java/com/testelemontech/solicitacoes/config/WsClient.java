package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.SoapHeader;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.namespace.QName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class WsClient {

    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);
    private final WebServiceTemplate webServiceTemplate;

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    @Value("${soap.keyClient}")
    private String keyClient;

    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    public WsClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
        this.webServiceTemplate.setFaultMessageResolver(new CustomSoapFaultMessageResolver());
    }

    public List<ModelRequest> buscarProdutosAereos(PesquisarSolicitacaoRequest request) {
        try {
            logger.info("🔍 Iniciando requisição SOAP para {}", wsdlUrl);
            logger.info("🔑 Credenciais: keyClient={}, username={}, password={}", keyClient, username, password);

            if (keyClient == null || username == null || password == null) {
                logger.error("❌ Credenciais inválidas! Verifique application.properties");
                throw new RuntimeException("Credenciais SOAP estão nulas!");
            }

            request.setChaveCliente(keyClient);

            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                if (soapHeader == null) {
                    logger.error("❌ SOAP Header está nulo! Verifique a implementação.");
                    throw new RuntimeException("SOAP Header está nulo!");
                }

                // Adicionando os elementos no cabeçalho SOAP com namespace correto
                addSoapHeaderElement(soapHeader, "keyClient", keyClient);
                addSoapHeaderElement(soapHeader, "userName", username);
                addSoapHeaderElement(soapHeader, "userPassword", password);

                // Log da mensagem SOAP antes do envio
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                soapMessage.writeTo(out);
                logger.info("📨 Mensagem SOAP enviada:\n{}", out.toString(StandardCharsets.UTF_8));
            };

            if (webServiceTemplate == null) {
                logger.error("❌ WebServiceTemplate não foi injetado corretamente.");
                throw new RuntimeException("WebServiceTemplate não foi injetado corretamente.");
            }

            // Enviando a requisição
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate
                    .marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("✅ Resposta SOAP recebida com sucesso!");

            if (response == null || response.getSolicitacao() == null || response.getSolicitacao().isEmpty()) {
                logger.warn("⚠️ Nenhuma solicitação de viagem encontrada!");
                return List.of();
            }

            return converterParaModelRequest(response);
        } catch (Exception e) {
            logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao integrar com o serviço SOAP", e);
        }
    }

    private void addSoapHeaderElement(SoapHeader soapHeader, String name, String value) {
        try {
            // Namespace conforme definido no WSDL
            String namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services";
            QName qName = new QName(namespace, name, "ser");
            soapHeader.addHeaderElement(qName).setText(value);

            logger.info("✅ Cabeçalho SOAP atualizado -> {} = {}", name, value);
        } catch (Exception e) {
            logger.error("❌ Erro ao adicionar elemento ao cabeçalho SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao adicionar elemento ao cabeçalho SOAP", e);
        }
    }

    private List<ModelRequest> converterParaModelRequest(PesquisarSolicitacaoResponse response) {
        return response.getSolicitacao()
                .stream()
                .map(solicitacao -> {
                    ModelRequest model = new ModelRequest();

                    if (solicitacao.getPassageiros() != null && !solicitacao.getPassageiros().getPassageiro().isEmpty()) {
                        model.setNomePassageiro(solicitacao.getPassageiros().getPassageiro().get(0).getNome());
                    }

                    if (solicitacao.getAereos() != null && !solicitacao.getAereos().getAereo().isEmpty()) {
                        if (!solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().isEmpty()) {
                            model.setCidadeOrigem(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getOrigem());
                            try {
                                if (solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataSaida() != null) {
                                    model.setDataHoraSaida(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataSaida()
                                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                                }
                                if (solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataChegada() != null) {
                                    model.setDataHoraChegada(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataChegada()
                                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                                }
                            } catch (Exception e) {
                                logger.warn("⚠️ Erro ao converter datas para a solicitação '{}': {}",
                                        solicitacao.getPassageiros().getPassageiro().get(0).getNome(), e.getMessage());
                                model.setDataHoraSaida(null);
                                model.setDataHoraChegada(null);
                            }
                        }
                    }

                    model.setCiaAerea(solicitacao.getCodigoCliente());
                    model.setCidadeDestino(solicitacao.getCodigoUnidadeNegocio());

                    logger.info("📌 Solicitação convertida: {}", model);
                    return model;
                })
                .collect(Collectors.toList());
    }
}