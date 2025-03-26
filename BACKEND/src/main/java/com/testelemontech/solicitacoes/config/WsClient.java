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
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.SoapHeader;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class WsClient {

    // Inicialização do Logger
    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);
    private static final String NAMESPACE = "http://lemontech.com.br/selfbooking/wsselfbooking/services";

    private final WebServiceTemplate webServiceTemplate;

    // Variáveis de ambiente carregadas do application.properties
    @Value("${soap.keyClient}")
    private String keyClient;

    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    public WsClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    public List<Solicitacao> pesquisarSolicitacoes(LocalDate dataInicio, LocalDate dataFim) {
        try {
            // Logs detalhados para depuração
            logger.info("Iniciando requisição SOAP para o período {} a {}", dataInicio, dataFim);
            PesquisarSolicitacaoRequest request = criarRequest(dataInicio, dataFim);
            logger.info("Request SOAP criado: {}", request);

            // Garantir que a URL não tenha espaços extras
            String sanitizedWsdlUrl = wsdlUrl.trim();
            logger.info("URL WSDL sendo utilizada: {}", sanitizedWsdlUrl);

            // Enviando a requisição com cabeçalho
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate.marshalSendAndReceive(
                    sanitizedWsdlUrl,  // URL do WSDL carregada do arquivo properties
                    request,
                    new SoapActionCallback("") {
                        @Override
                        public void doWithMessage(WebServiceMessage message) {
                            SoapMessage soapMessage = (SoapMessage) message;
                            SoapHeader header = soapMessage.getSoapHeader();

                            // Adicionando os cabeçalhos SOAP com as credenciais
                            QName keyClientQName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient");
                            header.addHeaderElement(keyClientQName).setText(keyClient);

                            QName usernameQName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "username");
                            header.addHeaderElement(usernameQName).setText(username);

                            QName passwordQName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "password");
                            header.addHeaderElement(passwordQName).setText(password);

                            logger.info("Cabeçalhos SOAP enviados: keyClient={}, username={}", keyClient, username);
                        }
                    });

            if (response != null && response.getSolicitacao() != null) {
                logger.info("Número de solicitações recebidas: {}", response.getSolicitacao().size());
                return response.getSolicitacao();
            } else {
                logger.warn("A resposta SOAP não contém solicitações.");
                return List.of(); // Retorna uma lista vazia
            }
        } catch (Exception e) {
            logger.error("Erro ao buscar solicitações via SOAP: ", e);
            throw new RuntimeException("Erro na chamada SOAP", e);
        }
    }

    private PesquisarSolicitacaoRequest criarRequest(LocalDate dataInicio, LocalDate dataFim) {
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
        request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataInicial"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataInicio)));
        request.getContent().add(new JAXBElement<>(new QName(NAMESPACE, "dataFinal"), XMLGregorianCalendar.class, convertToXMLGregorianCalendar(dataFim)));
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
