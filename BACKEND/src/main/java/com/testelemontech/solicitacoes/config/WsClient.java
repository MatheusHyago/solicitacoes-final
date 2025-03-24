package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<ModelRequest> buscarProdutosAereos(LocalDateTime startDate, LocalDateTime endDate) {
        try {
            logger.info("Enviando requisição SOAP para {} com datas: {} a {}", wsdlUrl, startDate, endDate);
            PesquisarSolicitacaoRequest request = buildRequest(startDate, endDate);
            QName qName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacao");
            JAXBElement<PesquisarSolicitacaoRequest> jaxbRequest = new JAXBElement<>(qName, PesquisarSolicitacaoRequest.class, request);

            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();
                String ns = "http://lemontech.com.br/selfbooking/wsselfbooking/services";
                soapHeader.addHeaderElement(new QName(ns, "userPassword", "ser")).setText(password);
                soapHeader.addHeaderElement(new QName(ns, "userName", "ser")).setText(username);
                soapHeader.addHeaderElement(new QName(ns, "keyClient", "ser")).setText(keyClient);
            };

            JAXBElement<PesquisarSolicitacaoResponse> response = (JAXBElement<PesquisarSolicitacaoResponse>)
                    webServiceTemplate.marshalSendAndReceive(wsdlUrl, jaxbRequest, callback);

            logger.info("Resposta SOAP recebida com sucesso!");
            return processarResposta(response.getValue());
        } catch (Exception e) {
            logger.error("Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
            return List.of();
        }
    }

    private PesquisarSolicitacaoRequest buildRequest(LocalDateTime startDate, LocalDateTime endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
        request.getContent().add(new JAXBElement<>(new QName("dataInicial"), String.class, startDate.format(formatter)));
        request.getContent().add(new JAXBElement<>(new QName("dataFinal"), String.class, endDate.format(formatter)));
        request.getContent().add(new JAXBElement<>(new QName("registroInicial"), Integer.class, 1));
        request.getContent().add(new JAXBElement<>(new QName("quantidadeRegistros"), Integer.class, 50));
        request.getContent().add(new JAXBElement<>(new QName("sincronizado"), Boolean.class, false));
        request.getContent().add(new JAXBElement<>(new QName("exibirRemarks"), Boolean.class, true));
        request.getContent().add(new JAXBElement<>(new QName("exibirAprovadas"), Boolean.class, false));
        request.getContent().add(new JAXBElement<>(new QName("tipoSolicitacao"), String.class, "TODOS"));
        request.getContent().add(new JAXBElement<>(new QName("version"), String.class, "2.3.1"));
        return request;
    }

    private List<ModelRequest> processarResposta(PesquisarSolicitacaoResponse response) {
        if (response == null || response.getSolicitacao() == null || response.getSolicitacao().isEmpty()) {
            logger.warn("Nenhuma solicitação de viagem encontrada!");
            return List.of();
        }

        return response.getSolicitacao().stream()
                .map(solicitacao -> {
                    ModelRequest model = new ModelRequest();
                    model.setNomePassageiro(solicitacao.getPassageiros().getPassageiro().get(0).getNome());
                    model.setCiaAerea(solicitacao.getCodigoCliente());
                    model.setCidadeOrigem(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getOrigem());
                    model.setCidadeDestino(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDestino());
                    model.setDataHoraSaida(solicitacao.getAereos().getAereo().get(0)
                            .getAereoSeguimento().get(0).getDataSaida()
                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                    model.setDataHoraChegada(solicitacao.getAereos().getAereo().get(0)
                            .getAereoSeguimento().get(0).getDataChegada()
                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                    model.setDataSolicitacao(solicitacao.getDataCriacaoSv()
                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                    return model;
                })
                .collect(Collectors.toList());
    }
}