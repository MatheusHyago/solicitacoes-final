package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.wsdl.PesquisarConciliacaoCartaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarConciliacaoCartaoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;

@Service
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

    public List<PesquisarConciliacaoCartaoResponse> buscarConciliacaoCartao(Integer numeroProtocolo, LocalDate dataVencimento, String codRegional) {
        try {
            logger.info("🔍 Enviando requisição SOAP para {} | Protocolo: {}, Data Vencimento: {}", wsdlUrl, numeroProtocolo, dataVencimento);

            PesquisarConciliacaoCartaoRequest request = buildRequest(numeroProtocolo, dataVencimento, codRegional);

            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();
                String ns = "http://lemontech.com.br/selfbooking/wsselfbooking/services";

                soapHeader.addHeaderElement(new QName(ns, "userName")).setText(username);
                soapHeader.addHeaderElement(new QName(ns, "userPassword")).setText(password);
                soapHeader.addHeaderElement(new QName(ns, "keyClient")).setText(keyClient);
            };

            PesquisarConciliacaoCartaoResponse response = (PesquisarConciliacaoCartaoResponse)
                    webServiceTemplate.marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("✅ Resposta SOAP recebida com sucesso!");
            return List.of(response);
        } catch (Exception e) {
            logger.error("❌ Erro ao buscar conciliação de cartão via SOAP: {}", e.getMessage(), e);
            return List.of();
        }
    }

    private PesquisarConciliacaoCartaoRequest buildRequest(Integer numeroProtocolo, LocalDate dataVencimento, String codRegional) {
        PesquisarConciliacaoCartaoRequest request = new PesquisarConciliacaoCartaoRequest();

        if (numeroProtocolo != null) {
            request.setNumeroProtocolo(numeroProtocolo);
        }

        if (dataVencimento != null) {
            request.setDataVencimento(convertToXMLGregorianCalendar(dataVencimento));
        }

        if (codRegional != null) {
            request.setCodRegional(codRegional);
        }

        request.setRegistroInicial(1);
        request.setQuantidadeRegistros(50);

        return request;
    }

    private XMLGregorianCalendar convertToXMLGregorianCalendar(LocalDate localDate) {
        try {
            GregorianCalendar gcal = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (Exception e) {
            logger.error("Erro ao converter LocalDate para XMLGregorianCalendar", e);
            return null;
        }
    }
}
