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

import javax.xml.namespace.QName;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

// SLF4J para logs
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class WsClient {

    private static final Logger logger = LoggerFactory.getLogger(WsClient.class);
    private final WebServiceTemplate webServiceTemplate;

    // URL do serviço SOAP definida no application.properties
    @Value("${soap.wsdlUrl}")
    private String wsdlUrl;

    // Chave do cliente para autenticação no cabeçalho SOAP
    @Value("${soap.keyClient}")
    private String keyClient;

    // Username e Password para autenticação
    @Value("${soap.username}")
    private String username;

    @Value("${soap.password}")
    private String password;

    public WsClient(WebServiceTemplate webServiceTemplate) {
        this.webServiceTemplate = webServiceTemplate;
    }

    /**
     * Método responsável por fazer a requisição SOAP para buscar as solicitações de viagem.
     *
     * @return Lista de ModelRequest contendo os dados das solicitações.
     */
    public List<ModelRequest> buscarProdutosAereos(PesquisarSolicitacaoRequest request) {
        try {
            logger.info("📄 Iniciando requisição SOAP para {}", wsdlUrl);

            // Adicionando a chave do cliente no corpo da requisição
            request.setChaveCliente(keyClient);

            // Callback para adicionar o cabeçalho SOAP
            WebServiceMessageCallback callback = message -> {
                SoapMessage soapMessage = (SoapMessage) message;
                SoapHeader soapHeader = soapMessage.getSoapHeader();

                // Adicionando elementos no cabeçalho SOAP
                QName keyClientQName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "chaveCliente");
                soapHeader.addHeaderElement(keyClientQName).setText(keyClient);

                QName usernameQName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "username");
                soapHeader.addHeaderElement(usernameQName).setText(username);

                QName passwordQName = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "password");
                soapHeader.addHeaderElement(passwordQName).setText(password);

                logger.info("📝 Cabeçalho SOAP configurado: chaveCliente={}, username={}, password={}", keyClient, username, password);

                // Log da Mensagem SOAP completa
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                soapMessage.writeTo(out);
                logger.info("🔍 Mensagem SOAP enviada: {}", out.toString(StandardCharsets.UTF_8));
            };

            // Enviando a requisição SOAP com o callback do cabeçalho
            PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate
                    .marshalSendAndReceive(wsdlUrl, request, callback);

            logger.info("✅ Resposta SOAP recebida com sucesso!");

            // Log da Resposta SOAP
            if (response != null) {
                logger.info("🔍 Resposta SOAP: {}", response);
            }

            if (response.getSolicitacao() == null || response.getSolicitacao().isEmpty()) {
                logger.warn("⚠️ Nenhuma solicitação de viagem encontrada!");
                return List.of();
            }

            return converterParaModelRequest(response);
        } catch (Exception e) {
            logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
            throw new RuntimeException("Erro ao integrar com o serviço SOAP", e);
        }
    }

    /**
     * Converte os dados da resposta SOAP para objetos ModelRequest.
     *
     * @param response Resposta SOAP recebida do serviço.
     * @return Lista de ModelRequest com os dados convertidos.
     */
    private List<ModelRequest> converterParaModelRequest(PesquisarSolicitacaoResponse response) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        return response.getSolicitacao()
                .stream()
                .map(solicitacao -> {
                    ModelRequest model = new ModelRequest();

                    if (solicitacao.getPassageiros() != null && !solicitacao.getPassageiros().getPassageiro().isEmpty()) {
                        model.setNomePassageiro(solicitacao.getPassageiros().getPassageiro().get(0).getNome());
                    }

                    if (solicitacao.getAereos() != null && !solicitacao.getAereos().getAereo().isEmpty()) {
                        if (!solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().isEmpty()) {
                            model.setCidadeOrigem(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getOrigem());
                            try {
                                if (solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataSaida() != null) {
                                    model.setDataHoraSaida(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataSaida()
                                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                                }
                                if (solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataChegada() != null) {
                                    model.setDataHoraChegada(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataChegada()
                                            .toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                                }
                            } catch (Exception e) {
                                logger.warn("⚠️ Erro ao converter datas para a solicitação '{}': {}",
                                        solicitacao.getPassageiros().getPassageiro().get(0).getNome(), e.getMessage());
                                model.setDataHoraSaida(null);
                                model.setDataHoraChegada(null);
                            }
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