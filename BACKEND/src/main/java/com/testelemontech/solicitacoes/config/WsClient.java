package com.testelemontech.solicitacoes.config;

import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeaderElement;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;

import jakarta.xml.bind.JAXBElement;
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

    private static final String NAMESPACE = "http://lemontech.com.br/selfbooking/wsselfbooking/services";

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    @Value("${soap.keyClient}")
    private String keyClient;

    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    private final WebServiceTemplate webServiceTemplate;

    public WsClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public List<Solicitacao> pesquisarSolicitacoes(LocalDate dataInicio, LocalDate dataFim) {
        try {
            logger.info("Preparando requisição SOAP para o período {} a {}", dataInicio, dataFim);

            if (keyClient == null || username == null || password == null) {
                logger.error("As variáveis de configuração não podem ser nulas. keyClient: {}, username: {}, password: {}",
                        keyClient, username, password);
                throw new IllegalArgumentException("As variáveis de configuração não podem ser nulas.");
            }

            PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataInicial"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataInicio)));
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataFinal"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataFim)));
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "registroInicial"), Integer.class, 1));
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "quantidadeRegistros"), Integer.class, 50));

            logger.info("Request SOAP criado: {}", request);

            JAXBElement<PesquisarSolicitacaoRequest> requestElement = new JAXBElement<>(
                    new QName(NAMESPACE, "PesquisarSolicitacaoRequest"),
                    PesquisarSolicitacaoRequest.class,
                    request
            );

            SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory();
            messageFactory.afterPropertiesSet();

            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate.marshalSendAndReceive(
                    wsdlUrl.trim(), requestElement, new SoapActionCallback("") {
                        @Override
                        public void doWithMessage(org.springframework.ws.WebServiceMessage message) {
                            try {
                                super.doWithMessage(message);
                                org.springframework.ws.soap.saaj.SaajSoapMessage saajSoapMessage = (org.springframework.ws.soap.saaj.SaajSoapMessage) message;
                                org.w3c.dom.Document document = saajSoapMessage.getSaajMessage().getSOAPPart().getEnvelope().getOwnerDocument();

                                SoapHeaderElement passwordHeader = saajSoapMessage.getSoapHeader().addHeaderElement(new QName(NAMESPACE, "userPassword"));
                                passwordHeader.setText(password);

                                SoapHeaderElement usernameHeader = saajSoapMessage.getSoapHeader().addHeaderElement(new QName(NAMESPACE, "userName"));
                                usernameHeader.setText(username);

                                SoapHeaderElement keyClientHeader = saajSoapMessage.getSoapHeader().addHeaderElement(new QName(NAMESPACE, "keyClient"));
                                keyClientHeader.setText(keyClient);
                            } catch (Exception e) {
                                logger.error("Erro ao adicionar cabeçalho SOAP", e);
                                throw new RuntimeException("Erro ao adicionar cabeçalho SOAP", e);
                            }
                        }
                    });

            logger.info("Resposta SOAP recebida com sucesso: {}", response);

            if (response != null && response.getSolicitacao() != null) {
                logger.info("Número de solicitações recebidas: {}", response.getSolicitacao().size());
                for (Solicitacao sol : response.getSolicitacao()) {
                    logger.info("Solicitação ID: {}, Local de Venda: {}, Data Criação: {}",
                            sol.getIdSolicitacao(), sol.getLocalVenda(), sol.getDataCriacaoSv());
                }
                return response.getSolicitacao();
            } else {
                logger.warn("A resposta SOAP está nula ou não contém solicitações.");
                return List.of();
            }
        } catch (Exception e) {
            logger.error("Erro na chamada SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao buscar solicitações via SOAP.", e);
        }
    }

    public List<Solicitacao> buscarSolicitacoes(LocalDate dataInicio, LocalDate dataFim) {
        return pesquisarSolicitacoes(dataInicio, dataFim);
    }

    private XMLGregorianCalendar convertToXMLGregorianCalendar(LocalDate localDate) {
        try {
            GregorianCalendar gcal = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (Exception e) {
            logger.error("Erro convertendo LocalDate para XMLGregorianCalendar: {}", e.getMessage(), e);
            throw new RuntimeException("Falha na conversão de data.", e);
        }
    }
}