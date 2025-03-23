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

import javax.xml.namespace.QName;
import java.nio.charset.StandardCharsets;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.stream.Collectors;
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
    }

    public List<ModelRequest> buscarProdutosAereos(PesquisarSolicitacaoRequest request) {
        try {
            logger.info("📄 Iniciando requisição SOAP para {}", wsdlUrl);
            request.setChaveCliente(keyClient);

            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                adicionarElementoHeader(soapHeader, "keyClient", keyClient);
                adicionarElementoHeader(soapHeader, "userName", username);
                adicionarElementoHeader(soapHeader, "userPassword", password);

                logger.info("🔑 Cabeçalhos SOAP adicionados: keyClient={}, userName={}, userPassword=********",
                        keyClient, username);

                ByteArrayOutputStream out = new ByteArrayOutputStream();
                soapMessage.writeTo(out);
                logger.info("🔍 Mensagem SOAP enviada: {}", out.toString(StandardCharsets.UTF_8));
            };

            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate
                    .marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("✅ Resposta SOAP recebida com sucesso!");

            if (response.getSolicitacao() == null || response.getSolicitacao().isEmpty()) {
                logger.warn("⚠️ Nenhuma solicitação de viagem encontrada!");
                return List.of();
            }

            return converterParaModelRequest(response);
        } catch (Exception e) {
            logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao integrar com o serviço SOAP", e);
        }
    }

    private void adicionarElementoHeader(SoapHeader soapHeader, String nome, String valor) {
        try {
            QName qName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", nome);
            soapHeader.addHeaderElement(qName).setText(valor);
        } catch (Exception e) {
            logger.error("❌ Erro ao adicionar cabeçalho SOAP: {}", nome, e);
        }
    }

    private List<ModelRequest> converterParaModelRequest(PesquisarSolicitacaoResponse response) {
        return response.getSolicitacao()
                .stream()
                .map(solicitacao -> {
                    ModelRequest model = new ModelRequest();
                    model.setCiaAerea(solicitacao.getCodigoCliente());
                    model.setCidadeDestino(solicitacao.getCodigoUnidadeNegocio());
                    return model;
                })
                .collect(Collectors.toList());
    }
}
