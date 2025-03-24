package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.model.ModelRequest;
import com.testelemontech.solicitacoes.repository.ModelRequestRepository;
import com.testelemontech.solicitacoes.config.WsClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ModelRequestService {

    private static final Logger logger = LoggerFactory.getLogger(ModelRequestService.class);

    @Autowired
    private WsClient wsClient; // Cliente SOAP para buscar dados

    @Autowired
    private ModelRequestRepository modelRequestRepository;

    /**
     * 🔍 Lista todas as solicitações salvas no banco.
     * @return Lista de ModelRequest.
     */
    public List<ModelRequest> listarTodas() {
        logger.info("📥 Buscando todas as solicitações salvas no banco.");
        return modelRequestRepository.findAll();
    }

    /**
     * 🔄 Importa solicitações da Lemontech via SOAP e salva no banco.
     * @return Lista de ModelRequest importadas.
     */
    public List<ModelRequest> importarSolicitacoesDaLemontech() {
        logger.info("🔄 Iniciando importação de solicitações da Lemontech...");

        // Define a data inicial como 3 meses atrás e a final como hoje
        LocalDateTime dataInicial = LocalDateTime.now().minusMonths(3);
        LocalDateTime dataFinal = LocalDateTime.now();

        // Busca as solicitações através do WebService SOAP
        List<ModelRequest> solicitacoes = wsClient.buscarProdutosAereos(dataInicial, dataFinal);

        if (!solicitacoes.isEmpty()) {
            modelRequestRepository.saveAll(solicitacoes);
            logger.info("✅ {} solicitações foram importadas e salvas.", solicitacoes.size());
        } else {
            logger.warn("⚠️ Nenhuma solicitação nova foi encontrada para importar.");
        }

        return solicitacoes;
    }

    /**
     * 🔄 Sincroniza as solicitações existentes no banco com as informações do serviço SOAP.
     * @return Lista de ModelRequest sincronizadas.
     */
    public List<ModelRequest> sincronizarSolicitacoesDaLemontech() {
        logger.info("🔄 Iniciando sincronização de solicitações da Lemontech...");

        // Define a data inicial como 3 meses atrás e a final como hoje
        LocalDateTime dataInicial = LocalDateTime.now().minusMonths(3);
        LocalDateTime dataFinal = LocalDateTime.now();

        // Busca as solicitações existentes através do WebService SOAP
        List<ModelRequest> solicitacoesLemontech = wsClient.buscarProdutosAereos(dataInicial, dataFinal);

        if (!solicitacoesLemontech.isEmpty()) {
            for (ModelRequest novaSolicitacao : solicitacoesLemontech) {
                // Verifica se a solicitação já existe no banco de dados (baseado no codigoSolicitacao)
                ModelRequest solicitacaoExistente = modelRequestRepository.findByCodigoSolicitacao(novaSolicitacao.getCodigoSolicitacao());

                if (solicitacaoExistente != null) {
                    // Solicitação já existe, então atualiza os dados
                    solicitacaoExistente.setNomePassageiro(novaSolicitacao.getNomePassageiro());
                    solicitacaoExistente.setCiaAerea(novaSolicitacao.getCiaAerea());
                    solicitacaoExistente.setCidadeOrigem(novaSolicitacao.getCidadeOrigem());
                    solicitacaoExistente.setCidadeDestino(novaSolicitacao.getCidadeDestino());
                    solicitacaoExistente.setDataHoraSaida(novaSolicitacao.getDataHoraSaida());
                    solicitacaoExistente.setDataHoraChegada(novaSolicitacao.getDataHoraChegada());
                    solicitacaoExistente.setDataSolicitacao(novaSolicitacao.getDataSolicitacao());

                    modelRequestRepository.save(solicitacaoExistente); // Atualiza no banco
                    logger.info("✅ Solicitação com código {} atualizada.", novaSolicitacao.getCodigoSolicitacao());
                } else {
                    // Solicitação não existe, então insere uma nova
                    modelRequestRepository.save(novaSolicitacao);
                    logger.info("✅ Solicitação com código {} inserida no banco.", novaSolicitacao.getCodigoSolicitacao());
                }
            }
            logger.info("🔄 Sincronização concluída. {} solicitações foram sincronizadas.", solicitacoesLemontech.size());
        } else {
            logger.warn("⚠️ Nenhuma solicitação foi encontrada para sincronizar.");
        }

        return solicitacoesLemontech;
    }
}
