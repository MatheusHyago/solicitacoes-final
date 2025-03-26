package com.testelemontech.solicitacoes.config;

import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import com.testelemontech.solicitacoes.wsdl.Solicitacao;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;

import jakarta.xml.bind.JAXBElement;  // Usando jakarta.xml.bind
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class WsClient {

    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);

    // Namespace conforme o WSDL – ajuste se necessário.
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

    /**
     * Realiza a chamada SOAP para buscar as solicitações entre duas datas.
     *
     * @param dataInicio Data inicial da pesquisa.
     * @param dataFim    Data final da pesquisa.
     * @return Lista de objetos Solicitacao retornados no response.
     */
    public List<Solicitacao> pesquisarSolicitacoes(LocalDate dataInicio, LocalDate dataFim) {
        try {
            logger.info("Preparando requisição SOAP para o período {} a {}", dataInicio, dataFim);

            // Cria e configura o request
            PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();

            // Adicionando os campos na lista content usando Jakarta JAXB
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataInicial"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataInicio)));
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataFinal"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataFim)));
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "registroInicial"), Integer.class, 1));
            request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "quantidadeRegistros"), Integer.class, 50));

            // Callback para injetar os headers SOAP
            WebServiceMessageCallback callback = new WebServiceMessageCallback() {
                @Override
                public void doWithMessage(WebServiceMessage message) throws IOException {
                    if (message instanceof SoapMessage) {
                        SoapMessage soapMessage = (SoapMessage) message;
                        SoapHeader header = soapMessage.getSoapHeader();
                        header.addHeaderElement(new QName(NAMESPACE, "userName")).setText(username);
                        header.addHeaderElement(new QName(NAMESPACE, "userPassword")).setText(password);
                        header.addHeaderElement(new QName(NAMESPACE, "keyClient")).setText(keyClient);
                        logger.info("Headers SOAP adicionados.");
                    }
                }
            };

            logger.info("Enviando requisição SOAP para {}", wsdlUrl);
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse)
                    webServiceTemplate.marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("Resposta SOAP recebida com sucesso.");
            return response.getSolicitacao();
        } catch (Exception e) {
            logger.error("Erro na chamada SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao buscar solicitações via SOAP.", e);
        }
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