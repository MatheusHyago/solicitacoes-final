package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import com.testelemontech.solicitacoes.wsdl.Solicitacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;

@Service
@ConfigurationProperties(prefix = "soap")
public class WsClient {

    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);

    private final WebServiceTemplate webServiceTemplate;
    private String wsdlUrl;
    private String keyClient;
    private String username;
    private String password;

    @Autowired
    public WsClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public void setWsdlUrl(String wsdlUrl) {
        this.wsdlUrl = wsdlUrl;
        logger.info("Configuração da URL WSDL: {}", wsdlUrl);
    }

    public void setKeyClient(String keyClient) { this.keyClient = keyClient; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }

    public List<Solicitacao> pesquisarSolicitacoes(LocalDate dataInicial, LocalDate dataFinal) {
        PesquisarSolicitacaoRequest request = buildRequest(dataInicial, dataFinal);
        return sendRequest(request);
    }

    private List<Solicitacao> sendRequest(PesquisarSolicitacaoRequest request) {
        try {
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse)
                    webServiceTemplate.marshalSendAndReceive(wsdlUrl, request, this::addSoapHeaders);
            return response != null ? response.getSolicitacao() : List.of();
        } catch (Exception e) {
            logger.error("Erro ao buscar solicitações: {}", e.getMessage(), e);
            return List.of();
        }
    }

    private void addSoapHeaders(org.springframework.ws.WebServiceMessage message) {
        SoapHeader soapHeader = ((SoapMessage) message).getSoapHeader();
        String ns = "http://lemontech.com.br/selfbooking/wsselfbooking/services";
        soapHeader.addHeaderElement(new QName(ns, "userName")).setText(username);
        soapHeader.addHeaderElement(new QName(ns, "userPassword")).setText(password);
        soapHeader.addHeaderElement(new QName(ns, "keyClient")).setText(keyClient);
    }

    private PesquisarSolicitacaoRequest buildRequest(LocalDate dataInicial, LocalDate dataFinal) {
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
        request.getContent().add(createJAXBElement("dataInicial", convertToXMLGregorianCalendar(dataInicial)));
        request.getContent().add(createJAXBElement("dataFinal", convertToXMLGregorianCalendar(dataFinal)));
        request.getContent().add(createJAXBElement("registroInicial", 1));  // Valor fixo como exemplo
        return request;
    }

    private <T> JAXBElement<T> createJAXBElement(String name, T value) {
        String ns = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request";
        return new JAXBElement<>(new QName(ns, name), (Class<T>) value.getClass(), value);
    }

    private XMLGregorianCalendar convertToXMLGregorianCalendar(LocalDate localDate) {
        try {
            GregorianCalendar calendar = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        } catch (Exception e) {
            logger.error("Erro ao converter LocalDate para XMLGregorianCalendar", e);
            return null;
        }
    }
}
