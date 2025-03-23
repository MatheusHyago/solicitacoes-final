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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WsClient {

    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);
    private final WebServiceTemplate webServiceTemplate;

    // URL do serviço SOAP definida no application.properties
    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    // Dados de autenticação – devem corresponder aos usados com sucesso no SoapUI
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
     * Faz a requisição SOAP para buscar as solicitações.
     *
     * @param request Objeto PesquisarSolicitacaoRequest com os filtros da solicitação.
     * @return Lista de ModelRequest convertida da resposta SOAP.
     */
    public List<ModelRequest> buscarProdutosAereos(PesquisarSolicitacaoRequest request) {
        try {
            logger.info("📄 Iniciando requisição SOAP para {}", wsdlUrl);

            // Não é necessário adicionar keyClient no Body, pois ele deve estar apenas no Header

            // Callback para adicionar os cabeçalhos SOAP
            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                // Utilize o namespace conforme o SoapUI
                String namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services";

                // Se o serviço espera "username" (tudo minúsculo) ou "userName" pode ser ajustado aqui.
                // Conforme o exemplo do SoapUI, usamos "userName".
                soapHeader.addHeaderElement(new QName(namespace, "keyClient")).setText(keyClient);
                soapHeader.addHeaderElement(new QName(namespace, "userName")).setText(username);
                soapHeader.addHeaderElement(new QName(namespace, "userPassword")).setText(password);

                logger.info("🔑 Cabeçalhos SOAP adicionados: keyClient={}, userName={}, userPassword=********", keyClient, username);

                // Log da mensagem SOAP enviada
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                soapMessage.writeTo(out);
                logger.debug("📤 SOAP Request Enviada: \n{}", out.toString(StandardCharsets.UTF_8));

                // Se desejar, você pode verificar se há um Fault no body (embora normalmente seja retornado na resposta)
                if (soapMessage.getSoapBody().hasFault()) {
                    logger.error("❌ SOAP Fault: {}", soapMessage.getSoapBody().getFault().getFaultStringOrReason());
                }
            };

            // Envia a requisição SOAP
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse)
                    webServiceTemplate.marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("✅ Resposta SOAP recebida com sucesso!");

            if (response.getSolicitacao() == null || response.getSolicitacao().isEmpty()) {
                logger.warn("⚠️ Nenhuma solicitação encontrada!");
                return List.of();
            }

            return converterParaModelRequest(response);

        } catch (Exception e) {
            logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao integrar com o serviço SOAP", e);
        }
    }

    /**
     * Converte a resposta SOAP em uma lista de ModelRequest.
     *
     * @param response Resposta SOAP do serviço.
     * @return Lista de ModelRequest.
     */
    private List<ModelRequest> converterParaModelRequest(PesquisarSolicitacaoResponse response) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        return response.getSolicitacao()
                .stream()
                .map(solicitacao -> {
                    ModelRequest model = new ModelRequest();

                    if (solicitacao.getPassageiros() != null &&
                            !solicitacao.getPassageiros().getPassageiro().isEmpty()) {
                        model.setNomePassageiro(
                                solicitacao.getPassageiros().getPassageiro().get(0).getNome());
                    }

                    if (solicitacao.getAereos() != null &&
                            !solicitacao.getAereos().getAereo().isEmpty() &&
                            !solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().isEmpty()) {
                        model.setCidadeOrigem(
                                solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getOrigem());
                        try {
                            if (solicitacao.getAereos().getAereo().get(0)
                                    .getAereoSeguimento().get(0).getDataSaida() != null) {
                                model.setDataHoraSaida(solicitacao.getAereos().getAereo().get(0)
                                        .getAereoSeguimento().get(0).getDataSaida()
                                        .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                            }
                        } catch (Exception e) {
                            logger.warn("⚠️ Erro ao converter data de saída para a solicitação '{}': {}",
                                    solicitacao.getPassageiros().getPassageiro().get(0).getNome(), e.getMessage());
                            model.setDataHoraSaida(null);
                        }
                    }

                    model.setCiaAerea(solicitacao.getCodigoCliente());
                    model.setCidadeDestino(solicitacao.getCodigoUnidadeNegocio());

                    logger.info("📌 Solicitação convertida: {}", model);
                    return model;
                })
                .collect(Collectors.toList());
    }
}
