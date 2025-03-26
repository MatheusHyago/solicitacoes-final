package com.testelemontech.solicitacoes.config;

import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.soap.saaj.SaajSoapMessage;
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
            logger.info("Iniciando requisição SOAP para o período {} a {}", dataInicio, dataFim);

            // Criação da requisição com as datas de início e fim
            PesquisarSolicitacaoRequest request = criarRequest(dataInicio, dataFim);
            logger.debug("Request SOAP criado: {}", request);

            // Enviando a requisição SOAP com os cabeçalhos
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate.marshalSendAndReceive(
                    wsdlUrl.trim(),
                    request,
                    new SoapActionCallback("") {
                        @Override
                        public void doWithMessage(org.springframework.ws.WebServiceMessage message) {
                            try {
                                SaajSoapMessage saajSoapMessage = (SaajSoapMessage) message;
                                saajSoapMessage.getSoapHeader().addHeaderElement(new QName(NAMESPACE, "userPassword")).setText(password);
                                saajSoapMessage.getSoapHeader().addHeaderElement(new QName(NAMESPACE, "userName")).setText(username);
                                saajSoapMessage.getSoapHeader().addHeaderElement(new QName(NAMESPACE, "keyClient")).setText(keyClient);
                                logger.info("Cabeçalhos SOAP adicionados.");
                            } catch (Exception e) {
                                logger.error("Erro ao adicionar cabeçalhos SOAP", e);
                                throw new RuntimeException("Erro ao adicionar cabeçalhos SOAP", e);
                            }
                        }
                    }
            );

            // Processando a resposta e retornando a lista de solicitações
            if (response != null && response.getSolicitacao() != null) {
                logger.info("Número de solicitações recebidas: {}", response.getSolicitacao().size());
                return response.getSolicitacao();
            } else {
                logger.warn("A resposta SOAP não contém solicitações.");
                return List.of();
            }
        } catch (Exception e) {
            logger.error("Erro ao buscar solicitações via SOAP.", e);
            throw new RuntimeException("Erro na chamada SOAP", e);
        }
    }

    private PesquisarSolicitacaoRequest criarRequest(LocalDate dataInicio, LocalDate dataFim) {
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();

        // Convertendo LocalDate para XMLGregorianCalendar
        request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataInicial"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataInicio)));
        request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataFinal"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataFim)));

        // Adicionando outros parâmetros
        request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "registroInicial"), Integer.class, 1));
        request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "quantidadeRegistros"), Integer.class, 50));

        return request;
    }

    private XMLGregorianCalendar convertToXMLGregorianCalendar(LocalDate localDate) {
        try {
            GregorianCalendar gcal = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (Exception e) {
            logger.error("Erro convertendo LocalDate para XMLGregorianCalendar.", e);
            throw new RuntimeException("Falha na conversão de data.", e);
        }
    }
}
