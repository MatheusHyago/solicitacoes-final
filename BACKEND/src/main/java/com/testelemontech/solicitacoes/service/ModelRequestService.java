    package com.testelemontech.solicitacoes.service;

    import com.testelemontech.solicitacoes.config.WsClient;
    import com.testelemontech.solicitacoes.model.ModelRequest;
    import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
    import com.testelemontech.solicitacoes.wsdl.Solicitacao;
    import jakarta.xml.bind.JAXBElement;
    import javax.xml.datatype.XMLGregorianCalendar;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.util.List;
    import java.util.Optional;
    import java.util.stream.Collectors;
    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    import org.springframework.stereotype.Service;

    @Service
    public class ModelRequestService {

        private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

        private final WsClient wsClient;
        private final ModelRequestRepository repository;

        public ModelRequestService(WsClient wsClient, ModelRequestRepository repository) {
            this.wsClient = wsClient;
            this.repository = repository;
        }

        /**
         * Importa as solicitações de viagem dos últimos três meses através do WS,
         * converte os dados para ModelRequest, persiste os dados no repositório e retorna a lista importada.
         *
         * @return Lista de ModelRequest importadas.
         */
        public List<ModelRequest> importarSolicitacoesDaLemontech() {
            LocalDateTime endDate = LocalDateTime.now();
            LocalDateTime startDate = endDate.minusMonths(3);

            logger.info("Buscando solicitações entre {} e {}", startDate, endDate);

            // Chama o método do WsClient para buscar as solicitações; esse método retorna List<Solicitacao>
            List<Solicitacao> solicitacoesWS = wsClient.pesquisarSolicitacoes(startDate.toLocalDate(), endDate.toLocalDate());

            // Converte cada objeto Solicitacao para a entidade ModelRequest
            List<ModelRequest> models = solicitacoesWS.stream()
                    .map(this::converterSolicitacaoParaModel)
                    .collect(Collectors.toList());

            if (!models.isEmpty()) {
                repository.saveAll(models);
                logger.info("Importação concluída com sucesso: {} solicitações salvas.", models.size());
            } else {
                logger.warn("Nenhuma solicitação encontrada para importar.");
            }
            return models;
        }

        /**
         * Salva uma solicitação no repositório.
         *
         * @param modelRequest a solicitação a ser salva.
         * @return a solicitação salva.
         */
        public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
            return repository.save(modelRequest);
        }

        /**
         * Retorna todas as solicitações persistidas.
         *
         * @return Lista de ModelRequest.
         */
        public List<ModelRequest> buscarTodasSolicitacoes() {
            return repository.findAll();
        }

        /**
         * Busca uma solicitação pelo ID.
         *
         * @param id o ID da solicitação.
         * @return Optional contendo a solicitação, se encontrada.
         */
        public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
            return repository.findById(id);
        }

        /**
         * Exclui uma solicitação pelo ID.
         *
         * @param id o ID da solicitação a ser excluída.
         */
        public void excluirSolicitacao(Long id) {
            repository.deleteById(id);
        }

        /**
         * Converte um objeto Solicitacao (retornado pelo WS) para a entidade ModelRequest.
         * Essa implementação itera sobre a lista de conteúdo (getContent()) para extrair os valores.
         *
         * Ajuste os case do switch conforme os nomes reais dos elementos definidos no seu WSDL.
         *
         * @param sol objeto Solicitacao proveniente do WS.
         * @return a entidade ModelRequest mapeada.
         */
        private ModelRequest converterSolicitacaoParaModel(Solicitacao sol) {
            ModelRequest model = new ModelRequest();

            // Itera sobre os elementos do conteúdo da Solicitacao
            for (JAXBElement<?> element : sol.getContent()) {
                String key = element.getName().getLocalPart();
                Object value = element.getValue();
                if (value == null) continue;

                switch (key.toLowerCase()) {
                    case "codigo":
                    case "codigosolicitacao":
                        model.setCodigoSolicitacao(value.toString());
                        break;
                    case "nomepassageiro":
                        model.setNomePassageiro(value.toString());
                        break;
                    case "ciaaerea":
                        model.setCiaAerea(value.toString());
                        break;
                    case "cidadeorigem":
                        model.setCidadeOrigem(value.toString());
                        break;
                    case "cidadedestino":
                        model.setCidadeDestino(value.toString());
                        break;
                    case "datacriacaosv":
                        if (value instanceof XMLGregorianCalendar) {
                            model.setDataSolicitacao(toLocalDateTime((XMLGregorianCalendar) value));
                        }
                        break;
                    default:
                        // Pode logar ou ignorar outros campos
                        break;
                }
            }
            return model;
        }

        private LocalDateTime toLocalDateTime(XMLGregorianCalendar xmlCalendar) {
            return xmlCalendar.toGregorianCalendar().toZonedDateTime().toLocalDateTime();
        }
    }
