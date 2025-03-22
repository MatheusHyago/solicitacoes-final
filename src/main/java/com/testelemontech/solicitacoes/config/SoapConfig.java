package com.testelemontech.solicitacoes.config;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.HttpRequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.soap.saaj.SaajSoapMessageFactory;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.client.core.WebServiceMessageCallback;

import javax.xml.namespace.QName;

@Configuration
public class SoapConfig {

    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    @Value("${soap.keyClient}")
    private String keyClient;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setClassesToBeBound(
                com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest.class,
                com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse.class
        );
        return marshaller;
    }

    @Bean
    public CloseableHttpClient httpClient() {
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        credsProvider.setCredentials(
                AuthScope.ANY,
                new UsernamePasswordCredentials(username, password)
        );
        return HttpClients.custom()
                .setDefaultCredentialsProvider(credsProvider)
                .addInterceptorFirst((HttpRequestInterceptor) (request, context) -> {
                    request.removeHeaders("Content-Length");
                })
                .build();
    }

    @Bean
    public HttpComponentsMessageSender messageSender() {
        HttpComponentsMessageSender messageSender = new HttpComponentsMessageSender();
        messageSender.setHttpClient(httpClient());
        return messageSender;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller marshaller) throws SOAPException {
        SaajSoapMessageFactory messageFactory = new SaajSoapMessageFactory(MessageFactory.newInstance());
        messageFactory.afterPropertiesSet();

        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(messageFactory);
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        webServiceTemplate.setMessageSender(messageSender());

        return webServiceTemplate;
    }

    public void enviarComCabecalho(WebServiceTemplate webServiceTemplate, com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest request) {
        WebServiceMessageCallback callback = message -> {
            if (message instanceof SoapMessage) {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                soapHeader.addHeaderElement(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "keyClient"))
                        .setText(keyClient);
                soapHeader.addHeaderElement(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "username"))
                        .setText(username);
                soapHeader.addHeaderElement(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "password"))
                        .setText(password);
            } else {
                throw new IllegalArgumentException("Mensagem não é do tipo SoapMessage");
            }
        };

        webServiceTemplate.marshalSendAndReceive(wsdlUrl, request, callback);
    }

    public String getWsdlUrl() {
        return wsdlUrl;
    }
}