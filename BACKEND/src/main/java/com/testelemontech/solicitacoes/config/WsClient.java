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

    import jakarta.xml.bind.JAXBElement;
    import javax.xml.namespace.QName;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;
    import java.util.List;
    import java.util.ArrayList;
    import java.util.stream.Collectors;

    // SLF4J para logs
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

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

        public List<ModelRequest> buscarProdutosAereos(LocalDateTime startDate, LocalDateTime endDate) {
            try {
                logger.info("📄 Iniciando requisição SOAP para {}", wsdlUrl);

                // Construção da requisição com intervalos de datas
                PesquisarSolicitacaoRequest request = buildRequest(startDate, endDate);

                WebServiceMessageCallback callback = message -> {
                    SoapMessage soapMessage = (SoapMessage) message;
                    SoapHeader soapHeader = soapMessage.getSoapHeader();

                    // Adiciona chaveCliente no cabeçalho SOAP
                    soapHeader.addHeaderElement(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "chaveCliente"))
                            .setText(keyClient);
                    soapHeader.addHeaderElement(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "username"))
                            .setText(username);
                    soapHeader.addHeaderElement(new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services/request", "password"))
                            .setText(password);
                };

                // Envio da requisição SOAP e obtenção da resposta
                PesquisarSolicitacaoResponse response = (PesquisarSolicitacaoResponse) webServiceTemplate
                        .marshalSendAndReceive(wsdlUrl, request, callback);

                logger.info("✅ Resposta SOAP recebida com sucesso!");

                // Processamento da resposta
                return processarResposta(response);
            } catch (Exception e) {
                logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
                throw new RuntimeException("Erro ao integrar com o serviço SOAP", e);
            }
        }

        // Método para construir a requisição SOAP com intervalos de datas
        private PesquisarSolicitacaoRequest buildRequest(LocalDateTime startDate, LocalDateTime endDate) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");

            PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();

            logger.debug("Definindo data de início: {}", startDate.format(formatter));
            request.getContent().add(new JAXBElement<>(new QName("dataInicial"), String.class, startDate.format(formatter)));

            logger.debug("Definindo data de fim: {}", endDate.format(formatter));
            request.getContent().add(new JAXBElement<>(new QName("dataFinal"), String.class, endDate.format(formatter)));

            // Definindo parâmetros adicionais, como registro inicial (pode ser ajustado conforme necessidade)
            request.getContent().add(new JAXBElement<>(new QName("registroInicial"), Integer.class, 1));

            return request;
        }

        // Método para processar a resposta e converter os dados para ModelRequest
        private List<ModelRequest> processarResposta(PesquisarSolicitacaoResponse response) {
            List<ModelRequest> modelRequests = new ArrayList<>();

            if (response == null || response.getSolicitacao() == null) {
                logger.warn("⚠️ Nenhuma solicitação de viagem encontrada!");
                return modelRequests;
            }

            // Processamento da resposta
            modelRequests = response.getSolicitacao()
                    .stream()
                    .map(solicitacao -> {
                        ModelRequest model = new ModelRequest();
                        model.setNomePassageiro(solicitacao.getPassageiros().getPassageiro().get(0).getNome());
                        model.setCiaAerea(solicitacao.getCodigoCliente());
                        model.setCidadeOrigem(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getOrigem());
                        model.setCidadeDestino(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDestino());
                        model.setDataHoraSaida(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataSaida().toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                        model.setDataHoraChegada(solicitacao.getAereos().getAereo().get(0).getAereoSeguimento().get(0).getDataChegada().toGregorianCalendar().toZonedDateTime().toLocalDateTime());
                        return model;
                    })
                    .collect(Collectors.toList());

            logger.info("✅ Processados {} produtos aéreos.", modelRequests.size());
            return modelRequests;
        }
    }
