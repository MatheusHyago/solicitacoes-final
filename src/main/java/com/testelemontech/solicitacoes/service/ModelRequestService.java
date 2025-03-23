package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.config.WsClient;
import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.TipoSolicitacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    @Autowired
    private WsClient wsClient;

    @Value("${soap.keyClient}")
    private String keyClient;

    public ModelRequest salvarSolicitacao(ModelRequest modelRequest) {
        return modelRequestRepository.save(modelRequest);
    }

    public List<ModelRequest> buscarTodasSolicitacoes() {
        return modelRequestRepository.findAll();
    }

    public Optional<ModelRequest> buscarSolicitacaoPorId(Long id) {
        return modelRequestRepository.findById(id);
    }

    public void excluirSolicitacao(Long id) {
        modelRequestRepository.deleteById(id);
    }

    public void buscarESalvarProdutosAereos() {
        try {
            logger.info("Iniciando busca e salvamento de produtos aéreos com keyClient: {}", keyClient);

            PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();
            request.setChaveCliente(keyClient);

            // Definindo os valores dos filtros
            request.setVersion("2.3.1");

            GregorianCalendar dataInicial = new GregorianCalendar(2024, 11, 14, 0, 0, 0);
            XMLGregorianCalendar xmlDataInicial = DatatypeFactory.newInstance().newXMLGregorianCalendar(dataInicial);
            request.setDataInicial(xmlDataInicial);

            GregorianCalendar dataFinal = new GregorianCalendar(2025, 2, 1, 0, 0, 0);
            XMLGregorianCalendar xmlDataFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(dataFinal);
            request.setDataFinal(xmlDataFinal);

            request.setRegistroInicial(1);
            request.setQuantidadeRegistros(50);
            request.setSincronizado(false);
            request.setExibirRemarks(true);
            request.setExibirAprovadas(false);
            request.setTipoSolicitacao(TipoSolicitacao.TODOS);

            // Chamando o WebService
            List<ModelRequest> produtosAereos = wsClient.buscarProdutosAereos(request);

            if (!produtosAereos.isEmpty()) {
                modelRequestRepository.saveAll(produtosAereos);
                logger.info("✅ Produtos Aéreos salvos no banco!");
            } else {
                logger.warn("⚠️ Nenhum produto aéreo encontrado.");
            }
        } catch (Exception e) {
            logger.error("❌ Erro ao buscar produtos aéreos via SOAP: {}", e.getMessage(), e);
        }
    }

    @PostConstruct
    public void init() {
        buscarESalvarProdutosAereos();
    }
}