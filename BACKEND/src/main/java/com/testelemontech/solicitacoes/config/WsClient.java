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
import java.util.ArrayList;
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

    /**
     * Método para buscar produtos aéreos via SOAP,
     * recebendo como parâmetros o intervalo de datas desejado.
     */
    public List<ModelRequest> buscarProdutosAereos(LocalDateTime startDate, LocalDateTime endDate) {
        try {
            logger.info("📄 Iniciando requisição SOAP para {}", wsdlUrl);

            // Construção da requisição com intervalos de datas e namespace correto
            PesquisarSolicitacaoRequest request = buildRequest(startDate, endDate);

            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                // Define o namespace esperado pelo serviço SOAP
                String ns = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request";

                soapHeader.addHeaderElement(new QName(ns, "chaveCliente")).setText(keyClient);
                soapHeader.addHeaderElement(new QName(ns, "username")).setText(username);
                soapHeader.addHeaderElement(new QName(ns, "password")).setText(password);
            };

            // Envio da requisição e obtenção da resposta
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse)
                    webServiceTemplate.marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("✅ Resposta SOAP recebida com sucesso!");

            // Processa a resposta e converte os dados para ModelRequest
            return processarResposta(response);
        } catch (Exception e) {
            logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao integrar com o serviço SOAP", e);
        }
    }

    /**
     * Método para construir o request SOAP, definindo os intervalos de datas e outros parâmetros.
     */
    private PesquisarSolicitacaoRequest buildRequest(LocalDateTime startDate, LocalDateTime endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();

        // Namespace esperado para os elementos
        String ns = "http://lemontech.com.br/selfbooking/wsselfbooking/services/request";

        QName dataInicialQName = new QName(ns, "dataInicial");
        logger.debug("Definindo data de início: {}", startDate.format(formatter));
        request.getContent().add(new JAXBElement<>(dataInicialQName, String.class, startDate.format(formatter)));

        QName dataFinalQName = new QName(ns, "dataFinal");
        logger.debug("Definindo data de fim: {}", endDate.format(formatter));
        request.getContent().add(new JAXBElement<>(dataFinalQName, String.class, endDate.format(formatter)));

        QName registroInicialQName = new QName(ns, "registroInicial");
        request.getContent().add(new JAXBElement<>(registroInicialQName, Integer.class, 1));

        return request;
    }

    /**
     * Método para processar a resposta SOAP e converter os dados para uma lista de ModelRequest.
     */
    private List<ModelRequest> processarResposta(PesquisarSolicitacaoResponse response) {
        List<ModelRequest> modelRequests = new ArrayList<>();

        if (response == null || response.getSolicitacao() == null || response.getSolicitacao().isEmpty()) {
            logger.warn("⚠️ Nenhuma solicitação de viagem encontrada!");
            return modelRequests;
        }

        // Filtra e mapeia as solicitações, garantindo que os dados necessários estão presentes
        modelRequests = response.getSolicitacao().stream()
                .filter(solicitacao ->
                        solicitacao.getPassageiros() != null &&
                                !solicitacao.getPassageiros().getPassageiro().isEmpty() &&
                                solicitacao.getAereos() != null &&
                                !solicitacao.getAereos().getAereo().isEmpty() &&
                                !solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().isEmpty()
                )
                .map(solicitacao -> {
                    ModelRequest model = new ModelRequest();
                    model.setNomePassageiro(solicitacao.getPassageiros().getPassageiro().get(0).getNome());
                    model.setCiaAerea(solicitacao.getCodigoCliente());
                    model.setCidadeOrigem(solicitacao.getAereos().getAereo().get(0)
                            .getAereoSeguimento().get(0).getOrigem());
                    model.setCidadeDestino(solicitacao.getAereos().getAereo().get(0)
                            .getAereoSeguimento().get(0).getDestino());
                    model.setDataHoraSaida(
                            solicitacao.getAereos().getAereo().get(0)
                                    .getAereoSeguimento().get(0).getDataSaida()
                                    .toGregorianCalendar().toZonedDateTime().toLocalDateTime()
                    );
                    model.setDataHoraChegada(
                            solicitacao.getAereos().getAereo().get(0)
                                    .getAereoSeguimento().get(0).getDataChegada()
                                    .toGregorianCalendar().toZonedDateTime().toLocalDateTime()
                    );
                    return model;
                })
                .collect(Collectors.toList());

        logger.info("✅ Processados {} produtos aéreos.", modelRequests.size());
        return modelRequests;
    }
}
