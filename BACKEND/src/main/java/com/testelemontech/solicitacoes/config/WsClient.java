package com.testelemontech.solicitacoes.service;

import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacao;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoRequest;
import com.testelemontech.solicitacoes.wsdl.PesquisarSolicitacaoResponse;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.stereotype.Service;

@Service
public class WsClient {

    private static final String WSDL_URL = "https://treinamento.lemontech.com.br/wsselfbooking/WsSelfBookingService?wsdl";

    public PesquisarSolicitacaoResponse buscarSolicitacoes(String dataInicial, String dataFinal) {
        // Criação do cliente para consumir o serviço SOAP
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(PesquisarSolicitacao.class);  // A classe de interface gerada do WSDL
        factoryBean.setAddress(WSDL_URL);  // Endereço do serviço SOAP

        // Criando o cliente do serviço SOAP
        PesquisarSolicitacao service = (PesquisarSolicitacao) factoryBean.create();

        // Preparando a requisição SOAP
        PesquisarSolicitacaoRequest request = new PesquisarSolicitacaoRequest();

        // Preenchendo os parâmetros na requisição
        // Certifique-se de que esses métodos existem nas classes geradas
        request.setDataInicial(dataInicial);  // Exemplo de preenchimento
        request.setDataFinal(dataFinal);  // Exemplo de preenchimento
        request.setQuantidadeRegistros(50);  // Exemplo de valor
        request.setTipoSolicitacao("TODOS");  // Exemplo de valor

        // Chamando o serviço e recebendo a resposta
        PesquisarSolicitacaoResponse response = service.pesquisarSolicitacao(request);

        return response;
    }
}
