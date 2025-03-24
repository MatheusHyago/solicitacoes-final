
package com.testelemontech.solicitacoes.wsdl;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.testelemontech.solicitacoes.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _KeyClient_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "keyClient");
    private final static QName _UserName_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userName");
    private final static QName _UserPassword_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "userPassword");
    private final static QName _PesquisarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacao");
    private final static QName _PesquisarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarSolicitacaoResponse");
    private final static QName _SincronizarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "sincronizarSolicitacao");
    private final static QName _SincronizarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "sincronizarSolicitacaoResponse");
    private final static QName _CadastrarRegional_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarRegional");
    private final static QName _CadastrarRegionalResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarRegionalResponse");
    private final static QName _AlterarStatusRegional_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusRegional");
    private final static QName _AlterarStatusRegionalResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusRegionalResponse");
    private final static QName _CadastrarContaContabil_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarContaContabil");
    private final static QName _CadastrarContaContabilResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarContaContabilResponse");
    private final static QName _AlterarStatusContaContabil_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusContaContabil");
    private final static QName _AlterarStatusContaContabilResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusContaContabilResponse");
    private final static QName _CadastrarCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarCentroDeCusto");
    private final static QName _CadastrarCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarCentroDeCustoResponse");
    private final static QName _AlterarStatusCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusCentroDeCusto");
    private final static QName _AlterarStatusCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusCentroDeCustoResponse");
    private final static QName _CadastrarSubCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarSubCentroDeCusto");
    private final static QName _CadastrarSubCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarSubCentroDeCustoResponse");
    private final static QName _AlterarStatusSubCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusSubCentroDeCusto");
    private final static QName _AlterarStatusSubCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusSubCentroDeCustoResponse");
    private final static QName _CadastrarFuncionario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFuncionario");
    private final static QName _CadastrarFuncionarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFuncionarioResponse");
    private final static QName _PesquisarFuncionario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarFuncionario");
    private final static QName _PesquisarFuncionarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarFuncionarioResponse");
    private final static QName _AlterarStatusFuncionario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFuncionario");
    private final static QName _AlterarStatusFuncionarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFuncionarioResponse");
    private final static QName _CadastrarParametrizacaoCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoCentroDeCusto");
    private final static QName _CadastrarParametrizacaoCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoCentroDeCustoResponse");
    private final static QName _DeletarParametrizacaoCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoCentroDeCusto");
    private final static QName _DeletarParametrizacaoCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoCentroDeCustoResponse");
    private final static QName _CadastrarFornecedor_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedor");
    private final static QName _CadastrarFornecedorResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorResponse");
    private final static QName _AlterarStatusFornecedor_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFornecedor");
    private final static QName _AlterarStatusFornecedorResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusFornecedorResponse");
    private final static QName _CadastrarTarifario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTarifario");
    private final static QName _CadastrarTarifarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTarifarioResponse");
    private final static QName _AlterarStatusTarifario_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusTarifario");
    private final static QName _AlterarStatusTarifarioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusTarifarioResponse");
    private final static QName _AprovarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "aprovarSolicitacao");
    private final static QName _AprovarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "aprovarSolicitacaoResponse");
    private final static QName _ReprovarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "reprovarSolicitacao");
    private final static QName _ReprovarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "reprovarSolicitacaoResponse");
    private final static QName _InserirIdentificadorIntegracao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirIdentificadorIntegracao");
    private final static QName _InserirIdentificadorIntegracaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirIdentificadorIntegracaoResponse");
    private final static QName _CadastrarParametrizacaoViajante_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoViajante");
    private final static QName _CadastrarParametrizacaoViajanteResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParametrizacaoViajanteResponse");
    private final static QName _DeletarParametrizacaoViajante_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoViajante");
    private final static QName _DeletarParametrizacaoViajanteResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParametrizacaoViajanteResponse");
    private final static QName _PesquisarVendasConsolidadora_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarVendasConsolidadora");
    private final static QName _PesquisarVendasConsolidadoraResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarVendasConsolidadoraResponse");
    private final static QName _CadastrarFornecedorSource_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorSource");
    private final static QName _CadastrarFornecedorSourceResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarFornecedorSourceResponse");
    private final static QName _InserirItemDespesa_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirItemDespesa");
    private final static QName _InserirItemDespesaResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "inserirItemDespesaResponse");
    private final static QName _CadastrarProjeto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarProjeto");
    private final static QName _CadastrarProjetoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarProjetoResponse");
    private final static QName _AlterarStatusProjeto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusProjeto");
    private final static QName _AlterarStatusProjetoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "alterarStatusProjetoResponse");
    private final static QName _AtualizarBudget_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atualizarBudget");
    private final static QName _AtualizarBudgetResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atualizarBudgetResponse");
    private final static QName _ConsultaBilheteCia_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "consultaBilheteCia");
    private final static QName _ConsultaBilheteCiaResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "consultaBilheteCiaResponse");
    private final static QName _CadastrarHoteisHomologados_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarHoteisHomologados");
    private final static QName _CadastrarHoteisHomologadosResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarHoteisHomologadosResponse");
    private final static QName _AtrelarUsuarios_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atrelarUsuarios");
    private final static QName _AtrelarUsuariosResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "atrelarUsuariosResponse");
    private final static QName _FinalizarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "finalizarSolicitacao");
    private final static QName _FinalizarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "finalizarSolicitacaoResponse");
    private final static QName _CadastrarTreinamento_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTreinamento");
    private final static QName _CadastrarTreinamentoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarTreinamentoResponse");
    private final static QName _CadastrarParticipanteTreinamento_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParticipanteTreinamento");
    private final static QName _CadastrarParticipanteTreinamentoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarParticipanteTreinamentoResponse");
    private final static QName _DeletarTreinamento_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarTreinamento");
    private final static QName _DeletarTreinamentoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarTreinamentoResponse");
    private final static QName _DeletarParticipanteTreinamento_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParticipanteTreinamento");
    private final static QName _DeletarParticipanteTreinamentoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "deletarParticipanteTreinamentoResponse");
    private final static QName _CriarPreSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "criarPreSolicitacao");
    private final static QName _CriarPreSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "criarPreSolicitacaoResponse");
    private final static QName _ContaBancaria_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "contaBancaria");
    private final static QName _ContaBancariaResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "contaBancariaResponse");
    private final static QName _ImportarDelegacaoParametrizacaoCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "importarDelegacaoParametrizacaoCentroDeCusto");
    private final static QName _ImportarDelegacaoParametrizacaoCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "importarDelegacaoParametrizacaoCentroDeCustoResponse");
    private final static QName _CadastrarControleCliente_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarControleCliente");
    private final static QName _CadastrarControleClienteResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarControleClienteResponse");
    private final static QName _CadastrarUnidadeNegocio_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarUnidadeNegocio");
    private final static QName _CadastrarUnidadeNegocioResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cadastrarUnidadeNegocioResponse");
    private final static QName _ImportarFaturaCartaoCredito_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "importarFaturaCartaoCredito");
    private final static QName _ImportarFaturaCartaoCreditoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "importarFaturaCartaoCreditoResponse");
    private final static QName _PesquisarAdiantamento_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarAdiantamento");
    private final static QName _PesquisarAdiantamentoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarAdiantamentoResponse");
    private final static QName _PesquisarRelatorioDespesas_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarRelatorioDespesas");
    private final static QName _PesquisarRelatorioDespesasResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarRelatorioDespesasResponse");
    private final static QName _ImportarDespesa_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "importarDespesa");
    private final static QName _ImportarDespesaResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "importarDespesaResponse");
    private final static QName _LiberarAdiantamento_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "liberarAdiantamento");
    private final static QName _LiberarAdiantamentoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "liberarAdiantamentoResponse");
    private final static QName _ContabilizarRelatorioDespesas_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "contabilizarRelatorioDespesas");
    private final static QName _ContabilizarRelatorioDespesasResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "contabilizarRelatorioDespesasResponse");
    private final static QName _PesquisarLogsAcesso_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarLogsAcesso");
    private final static QName _PesquisarLogsAcessoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarLogsAcessoResponse");
    private final static QName _ListarCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "listarCentroDeCusto");
    private final static QName _ListarCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "listarCentroDeCustoResponse");
    private final static QName _ListarSubCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "listarSubCentroDeCusto");
    private final static QName _ListarSubCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "listarSubCentroDeCustoResponse");
    private final static QName _ListarParametrizacaoCentroDeCusto_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "listarParametrizacaoCentroDeCusto");
    private final static QName _ListarParametrizacaoCentroDeCustoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "listarParametrizacaoCentroDeCustoResponse");
    private final static QName _PesquisarConciliacaoCartao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarConciliacaoCartao");
    private final static QName _PesquisarConciliacaoCartaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarConciliacaoCartaoResponse");
    private final static QName _CancelarSolicitacao_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cancelarSolicitacao");
    private final static QName _CancelarSolicitacaoResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "cancelarSolicitacaoResponse");
    private final static QName _Ping_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "ping");
    private final static QName _PingResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pingResponse");
    private final static QName _PesquisarContaBancaria_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarContaBancaria");
    private final static QName _PesquisarContaBancariaResponse_QNAME = new QName("http://lemontech.com.br/selfbooking/wsselfbooking/services", "pesquisarContaBancariaResponse");
    private final static QName _SolicitacaoDataAlteracao_QNAME = new QName("", "dataAlteracao");
    private final static QName _ConfiguracaoCentroDeCustoDebitaBudget_QNAME = new QName("", "debitaBudget");
    private final static QName _PesquisarSolicitacaoRequestVersion_QNAME = new QName("", "version");
    private final static QName _PesquisarSolicitacaoRequestIdSolicitacaoRef_QNAME = new QName("", "idSolicitacaoRef");
    private final static QName _PesquisarSolicitacaoRequestExibirCancelados_QNAME = new QName("", "exibirCancelados");
    private final static QName _PesquisarSolicitacaoRequestExibirPendentesAprovacao_QNAME = new QName("", "exibirPendentesAprovacao");
    private final static QName _PesquisarSolicitacaoRequestDataInicial_QNAME = new QName("", "dataInicial");
    private final static QName _PesquisarSolicitacaoRequestDataFinal_QNAME = new QName("", "dataFinal");
    private final static QName _PesquisarSolicitacaoRequestRegistroInicial_QNAME = new QName("", "registroInicial");
    private final static QName _PesquisarSolicitacaoRequestQuantidadeRegistros_QNAME = new QName("", "quantidadeRegistros");
    private final static QName _PesquisarSolicitacaoRequestSincronizado_QNAME = new QName("", "sincronizado");
    private final static QName _PesquisarSolicitacaoRequestExibirRemarks_QNAME = new QName("", "exibirRemarks");
    private final static QName _PesquisarSolicitacaoRequestExibirAprovadas_QNAME = new QName("", "exibirAprovadas");
    private final static QName _PesquisarSolicitacaoRequestTipoSolicitacao_QNAME = new QName("", "tipoSolicitacao");
    private final static QName _PesquisarSolicitacaoRequestDataAlteracaoInicial_QNAME = new QName("", "dataAlteracaoInicial");
    private final static QName _PesquisarSolicitacaoRequestDataAlteracaoFinal_QNAME = new QName("", "dataAlteracaoFinal");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.testelemontech.solicitacoes.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PesquisarSolicitacaoRequest }
     * 
     */
    public PesquisarSolicitacaoRequest createPesquisarSolicitacaoRequest() {
        return new PesquisarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link PesquisarSolicitacaoResponse }
     * 
     */
    public PesquisarSolicitacaoResponse createPesquisarSolicitacaoResponse() {
        return new PesquisarSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link SincronizarSolicitacaoRequest }
     * 
     */
    public SincronizarSolicitacaoRequest createSincronizarSolicitacaoRequest() {
        return new SincronizarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link SincronizarSolicitacaoResponse }
     * 
     */
    public SincronizarSolicitacaoResponse createSincronizarSolicitacaoResponse() {
        return new SincronizarSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link CadastrarRegionalRequest }
     * 
     */
    public CadastrarRegionalRequest createCadastrarRegionalRequest() {
        return new CadastrarRegionalRequest();
    }

    /**
     * Create an instance of {@link CadastrarRegionalResponse }
     * 
     */
    public CadastrarRegionalResponse createCadastrarRegionalResponse() {
        return new CadastrarRegionalResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusRegionalRequest }
     * 
     */
    public AlterarStatusRegionalRequest createAlterarStatusRegionalRequest() {
        return new AlterarStatusRegionalRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusRegionalResponse }
     * 
     */
    public AlterarStatusRegionalResponse createAlterarStatusRegionalResponse() {
        return new AlterarStatusRegionalResponse();
    }

    /**
     * Create an instance of {@link CadastrarContaContabilRequest }
     * 
     */
    public CadastrarContaContabilRequest createCadastrarContaContabilRequest() {
        return new CadastrarContaContabilRequest();
    }

    /**
     * Create an instance of {@link CadastrarContaContabilResponse }
     * 
     */
    public CadastrarContaContabilResponse createCadastrarContaContabilResponse() {
        return new CadastrarContaContabilResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusContaContabilRequest }
     * 
     */
    public AlterarStatusContaContabilRequest createAlterarStatusContaContabilRequest() {
        return new AlterarStatusContaContabilRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusContaContabilResponse }
     * 
     */
    public AlterarStatusContaContabilResponse createAlterarStatusContaContabilResponse() {
        return new AlterarStatusContaContabilResponse();
    }

    /**
     * Create an instance of {@link CadastrarCentroDeCustoRequest }
     * 
     */
    public CadastrarCentroDeCustoRequest createCadastrarCentroDeCustoRequest() {
        return new CadastrarCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarCentroDeCustoResponse }
     * 
     */
    public CadastrarCentroDeCustoResponse createCadastrarCentroDeCustoResponse() {
        return new CadastrarCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusCentroDeCustoRequest }
     * 
     */
    public AlterarStatusCentroDeCustoRequest createAlterarStatusCentroDeCustoRequest() {
        return new AlterarStatusCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusCentroDeCustoResponse }
     * 
     */
    public AlterarStatusCentroDeCustoResponse createAlterarStatusCentroDeCustoResponse() {
        return new AlterarStatusCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link CadastrarSubCentroDeCustoRequest }
     * 
     */
    public CadastrarSubCentroDeCustoRequest createCadastrarSubCentroDeCustoRequest() {
        return new CadastrarSubCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarSubCentroDeCustoResponse }
     * 
     */
    public CadastrarSubCentroDeCustoResponse createCadastrarSubCentroDeCustoResponse() {
        return new CadastrarSubCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusSubCentroDeCustoRequest }
     * 
     */
    public AlterarStatusSubCentroDeCustoRequest createAlterarStatusSubCentroDeCustoRequest() {
        return new AlterarStatusSubCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusSubCentroDeCustoResponse }
     * 
     */
    public AlterarStatusSubCentroDeCustoResponse createAlterarStatusSubCentroDeCustoResponse() {
        return new AlterarStatusSubCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link CadastrarFuncionarioRequest }
     * 
     */
    public CadastrarFuncionarioRequest createCadastrarFuncionarioRequest() {
        return new CadastrarFuncionarioRequest();
    }

    /**
     * Create an instance of {@link CadastrarFuncionarioResponse }
     * 
     */
    public CadastrarFuncionarioResponse createCadastrarFuncionarioResponse() {
        return new CadastrarFuncionarioResponse();
    }

    /**
     * Create an instance of {@link PesquisarFuncionarioRequest }
     * 
     */
    public PesquisarFuncionarioRequest createPesquisarFuncionarioRequest() {
        return new PesquisarFuncionarioRequest();
    }

    /**
     * Create an instance of {@link PesquisarFuncionarioResponse }
     * 
     */
    public PesquisarFuncionarioResponse createPesquisarFuncionarioResponse() {
        return new PesquisarFuncionarioResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusFuncionarioRequest }
     * 
     */
    public AlterarStatusFuncionarioRequest createAlterarStatusFuncionarioRequest() {
        return new AlterarStatusFuncionarioRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusFuncionarioResponse }
     * 
     */
    public AlterarStatusFuncionarioResponse createAlterarStatusFuncionarioResponse() {
        return new AlterarStatusFuncionarioResponse();
    }

    /**
     * Create an instance of {@link CadastrarParametrizacaoCentroDeCustoRequest }
     * 
     */
    public CadastrarParametrizacaoCentroDeCustoRequest createCadastrarParametrizacaoCentroDeCustoRequest() {
        return new CadastrarParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarParametrizacaoCentroDeCustoResponse }
     * 
     */
    public CadastrarParametrizacaoCentroDeCustoResponse createCadastrarParametrizacaoCentroDeCustoResponse() {
        return new CadastrarParametrizacaoCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link DeletarParametrizacaoCentroDeCustoRequest }
     * 
     */
    public DeletarParametrizacaoCentroDeCustoRequest createDeletarParametrizacaoCentroDeCustoRequest() {
        return new DeletarParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link DeletarParametrizacaoCentroDeCustoResponse }
     * 
     */
    public DeletarParametrizacaoCentroDeCustoResponse createDeletarParametrizacaoCentroDeCustoResponse() {
        return new DeletarParametrizacaoCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link CadastrarFornecedorRequest }
     * 
     */
    public CadastrarFornecedorRequest createCadastrarFornecedorRequest() {
        return new CadastrarFornecedorRequest();
    }

    /**
     * Create an instance of {@link CadastrarFornecedorResponse }
     * 
     */
    public CadastrarFornecedorResponse createCadastrarFornecedorResponse() {
        return new CadastrarFornecedorResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusFornecedorRequest }
     * 
     */
    public AlterarStatusFornecedorRequest createAlterarStatusFornecedorRequest() {
        return new AlterarStatusFornecedorRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusFornecedorResponse }
     * 
     */
    public AlterarStatusFornecedorResponse createAlterarStatusFornecedorResponse() {
        return new AlterarStatusFornecedorResponse();
    }

    /**
     * Create an instance of {@link CadastrarTarifarioRequest }
     * 
     */
    public CadastrarTarifarioRequest createCadastrarTarifarioRequest() {
        return new CadastrarTarifarioRequest();
    }

    /**
     * Create an instance of {@link CadastrarTarifarioResponse }
     * 
     */
    public CadastrarTarifarioResponse createCadastrarTarifarioResponse() {
        return new CadastrarTarifarioResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusTarifarioRequest }
     * 
     */
    public AlterarStatusTarifarioRequest createAlterarStatusTarifarioRequest() {
        return new AlterarStatusTarifarioRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusTarifarioResponse }
     * 
     */
    public AlterarStatusTarifarioResponse createAlterarStatusTarifarioResponse() {
        return new AlterarStatusTarifarioResponse();
    }

    /**
     * Create an instance of {@link AprovarSolicitacaoRequest }
     * 
     */
    public AprovarSolicitacaoRequest createAprovarSolicitacaoRequest() {
        return new AprovarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link AprovarSolicitacaoResponse }
     * 
     */
    public AprovarSolicitacaoResponse createAprovarSolicitacaoResponse() {
        return new AprovarSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link ReprovarSolicitacaoRequest }
     * 
     */
    public ReprovarSolicitacaoRequest createReprovarSolicitacaoRequest() {
        return new ReprovarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link ReprovarSolicitacaoResponse }
     * 
     */
    public ReprovarSolicitacaoResponse createReprovarSolicitacaoResponse() {
        return new ReprovarSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link InserirIdentificadorIntegracaoRequest }
     * 
     */
    public InserirIdentificadorIntegracaoRequest createInserirIdentificadorIntegracaoRequest() {
        return new InserirIdentificadorIntegracaoRequest();
    }

    /**
     * Create an instance of {@link InserirIdentificadorIntegracaoResponse }
     * 
     */
    public InserirIdentificadorIntegracaoResponse createInserirIdentificadorIntegracaoResponse() {
        return new InserirIdentificadorIntegracaoResponse();
    }

    /**
     * Create an instance of {@link CadastrarParametrizacaoViajanteRequest }
     * 
     */
    public CadastrarParametrizacaoViajanteRequest createCadastrarParametrizacaoViajanteRequest() {
        return new CadastrarParametrizacaoViajanteRequest();
    }

    /**
     * Create an instance of {@link CadastrarParametrizacaoViajanteResponse }
     * 
     */
    public CadastrarParametrizacaoViajanteResponse createCadastrarParametrizacaoViajanteResponse() {
        return new CadastrarParametrizacaoViajanteResponse();
    }

    /**
     * Create an instance of {@link DeletarParametrizacaoViajanteRequest }
     * 
     */
    public DeletarParametrizacaoViajanteRequest createDeletarParametrizacaoViajanteRequest() {
        return new DeletarParametrizacaoViajanteRequest();
    }

    /**
     * Create an instance of {@link DeletarParametrizacaoViajanteResponse }
     * 
     */
    public DeletarParametrizacaoViajanteResponse createDeletarParametrizacaoViajanteResponse() {
        return new DeletarParametrizacaoViajanteResponse();
    }

    /**
     * Create an instance of {@link PesquisarVendasConsolidadoraRequest }
     * 
     */
    public PesquisarVendasConsolidadoraRequest createPesquisarVendasConsolidadoraRequest() {
        return new PesquisarVendasConsolidadoraRequest();
    }

    /**
     * Create an instance of {@link PesquisarVendasConsolidadoraResponse }
     * 
     */
    public PesquisarVendasConsolidadoraResponse createPesquisarVendasConsolidadoraResponse() {
        return new PesquisarVendasConsolidadoraResponse();
    }

    /**
     * Create an instance of {@link CadastrarFornecedorSourceRequest }
     * 
     */
    public CadastrarFornecedorSourceRequest createCadastrarFornecedorSourceRequest() {
        return new CadastrarFornecedorSourceRequest();
    }

    /**
     * Create an instance of {@link CadastrarFornecedorSourceResponse }
     * 
     */
    public CadastrarFornecedorSourceResponse createCadastrarFornecedorSourceResponse() {
        return new CadastrarFornecedorSourceResponse();
    }

    /**
     * Create an instance of {@link InserirItemDespesaRequest }
     * 
     */
    public InserirItemDespesaRequest createInserirItemDespesaRequest() {
        return new InserirItemDespesaRequest();
    }

    /**
     * Create an instance of {@link InserirItemDespesaResponse }
     * 
     */
    public InserirItemDespesaResponse createInserirItemDespesaResponse() {
        return new InserirItemDespesaResponse();
    }

    /**
     * Create an instance of {@link CadastrarProjetoRequest }
     * 
     */
    public CadastrarProjetoRequest createCadastrarProjetoRequest() {
        return new CadastrarProjetoRequest();
    }

    /**
     * Create an instance of {@link CadastrarProjetoResponse }
     * 
     */
    public CadastrarProjetoResponse createCadastrarProjetoResponse() {
        return new CadastrarProjetoResponse();
    }

    /**
     * Create an instance of {@link AlterarStatusProjetoRequest }
     * 
     */
    public AlterarStatusProjetoRequest createAlterarStatusProjetoRequest() {
        return new AlterarStatusProjetoRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusProjetoResponse }
     * 
     */
    public AlterarStatusProjetoResponse createAlterarStatusProjetoResponse() {
        return new AlterarStatusProjetoResponse();
    }

    /**
     * Create an instance of {@link AtualizarBudgetRequest }
     * 
     */
    public AtualizarBudgetRequest createAtualizarBudgetRequest() {
        return new AtualizarBudgetRequest();
    }

    /**
     * Create an instance of {@link AtualizarBudgetResponse }
     * 
     */
    public AtualizarBudgetResponse createAtualizarBudgetResponse() {
        return new AtualizarBudgetResponse();
    }

    /**
     * Create an instance of {@link ConsultaBilheteCiaRequest }
     * 
     */
    public ConsultaBilheteCiaRequest createConsultaBilheteCiaRequest() {
        return new ConsultaBilheteCiaRequest();
    }

    /**
     * Create an instance of {@link ConsultaBilheteCiaResponse }
     * 
     */
    public ConsultaBilheteCiaResponse createConsultaBilheteCiaResponse() {
        return new ConsultaBilheteCiaResponse();
    }

    /**
     * Create an instance of {@link CadastrarHoteisHomologadosRequest }
     * 
     */
    public CadastrarHoteisHomologadosRequest createCadastrarHoteisHomologadosRequest() {
        return new CadastrarHoteisHomologadosRequest();
    }

    /**
     * Create an instance of {@link CadastrarHoteisHomologadosResponse }
     * 
     */
    public CadastrarHoteisHomologadosResponse createCadastrarHoteisHomologadosResponse() {
        return new CadastrarHoteisHomologadosResponse();
    }

    /**
     * Create an instance of {@link AtrelarUsuariosRequest }
     * 
     */
    public AtrelarUsuariosRequest createAtrelarUsuariosRequest() {
        return new AtrelarUsuariosRequest();
    }

    /**
     * Create an instance of {@link AtrelarUsuariosResponse }
     * 
     */
    public AtrelarUsuariosResponse createAtrelarUsuariosResponse() {
        return new AtrelarUsuariosResponse();
    }

    /**
     * Create an instance of {@link FinalizarSolicitacaoRequest }
     * 
     */
    public FinalizarSolicitacaoRequest createFinalizarSolicitacaoRequest() {
        return new FinalizarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link FinalizarSolicitacaoResponse }
     * 
     */
    public FinalizarSolicitacaoResponse createFinalizarSolicitacaoResponse() {
        return new FinalizarSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link CadastrarTreinamentoRequest }
     * 
     */
    public CadastrarTreinamentoRequest createCadastrarTreinamentoRequest() {
        return new CadastrarTreinamentoRequest();
    }

    /**
     * Create an instance of {@link CadastrarTreinamentoResponse }
     * 
     */
    public CadastrarTreinamentoResponse createCadastrarTreinamentoResponse() {
        return new CadastrarTreinamentoResponse();
    }

    /**
     * Create an instance of {@link CadastrarParticipanteTreinamentoRequest }
     * 
     */
    public CadastrarParticipanteTreinamentoRequest createCadastrarParticipanteTreinamentoRequest() {
        return new CadastrarParticipanteTreinamentoRequest();
    }

    /**
     * Create an instance of {@link CadastrarParticipanteTreinamentoResponse }
     * 
     */
    public CadastrarParticipanteTreinamentoResponse createCadastrarParticipanteTreinamentoResponse() {
        return new CadastrarParticipanteTreinamentoResponse();
    }

    /**
     * Create an instance of {@link DeletarTreinamentoRequest }
     * 
     */
    public DeletarTreinamentoRequest createDeletarTreinamentoRequest() {
        return new DeletarTreinamentoRequest();
    }

    /**
     * Create an instance of {@link DeletarTreinamentoResponse }
     * 
     */
    public DeletarTreinamentoResponse createDeletarTreinamentoResponse() {
        return new DeletarTreinamentoResponse();
    }

    /**
     * Create an instance of {@link DeletarParticipanteTreinamentoRequest }
     * 
     */
    public DeletarParticipanteTreinamentoRequest createDeletarParticipanteTreinamentoRequest() {
        return new DeletarParticipanteTreinamentoRequest();
    }

    /**
     * Create an instance of {@link DeletarParticipanteTreinamentoResponse }
     * 
     */
    public DeletarParticipanteTreinamentoResponse createDeletarParticipanteTreinamentoResponse() {
        return new DeletarParticipanteTreinamentoResponse();
    }

    /**
     * Create an instance of {@link CriarPreSolicitacaoRequest }
     * 
     */
    public CriarPreSolicitacaoRequest createCriarPreSolicitacaoRequest() {
        return new CriarPreSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link CriarPreSolicitacaoResponse }
     * 
     */
    public CriarPreSolicitacaoResponse createCriarPreSolicitacaoResponse() {
        return new CriarPreSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link ContaBancariaRequest }
     * 
     */
    public ContaBancariaRequest createContaBancariaRequest() {
        return new ContaBancariaRequest();
    }

    /**
     * Create an instance of {@link ContaBancariaResponse }
     * 
     */
    public ContaBancariaResponse createContaBancariaResponse() {
        return new ContaBancariaResponse();
    }

    /**
     * Create an instance of {@link ImportarDelegacaoParametrizacaoCentroDeCustoRequest }
     * 
     */
    public ImportarDelegacaoParametrizacaoCentroDeCustoRequest createImportarDelegacaoParametrizacaoCentroDeCustoRequest() {
        return new ImportarDelegacaoParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link ImportarDelegacaoParametrizacaoCentroDeCustoResponse }
     * 
     */
    public ImportarDelegacaoParametrizacaoCentroDeCustoResponse createImportarDelegacaoParametrizacaoCentroDeCustoResponse() {
        return new ImportarDelegacaoParametrizacaoCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link CadastrarControleClienteRequest }
     * 
     */
    public CadastrarControleClienteRequest createCadastrarControleClienteRequest() {
        return new CadastrarControleClienteRequest();
    }

    /**
     * Create an instance of {@link CadastrarControleClienteResponse }
     * 
     */
    public CadastrarControleClienteResponse createCadastrarControleClienteResponse() {
        return new CadastrarControleClienteResponse();
    }

    /**
     * Create an instance of {@link CadastrarUnidadeNegocioRequest }
     * 
     */
    public CadastrarUnidadeNegocioRequest createCadastrarUnidadeNegocioRequest() {
        return new CadastrarUnidadeNegocioRequest();
    }

    /**
     * Create an instance of {@link CadastrarUnidadeNegocioResponse }
     * 
     */
    public CadastrarUnidadeNegocioResponse createCadastrarUnidadeNegocioResponse() {
        return new CadastrarUnidadeNegocioResponse();
    }

    /**
     * Create an instance of {@link ImportarFaturaCartaoCreditoRequest }
     * 
     */
    public ImportarFaturaCartaoCreditoRequest createImportarFaturaCartaoCreditoRequest() {
        return new ImportarFaturaCartaoCreditoRequest();
    }

    /**
     * Create an instance of {@link ImportarFaturaCartaoCreditoResponse }
     * 
     */
    public ImportarFaturaCartaoCreditoResponse createImportarFaturaCartaoCreditoResponse() {
        return new ImportarFaturaCartaoCreditoResponse();
    }

    /**
     * Create an instance of {@link PesquisarAdiantamentoRequest }
     * 
     */
    public PesquisarAdiantamentoRequest createPesquisarAdiantamentoRequest() {
        return new PesquisarAdiantamentoRequest();
    }

    /**
     * Create an instance of {@link PesquisarAdiantamentoResponse }
     * 
     */
    public PesquisarAdiantamentoResponse createPesquisarAdiantamentoResponse() {
        return new PesquisarAdiantamentoResponse();
    }

    /**
     * Create an instance of {@link PesquisarRelatorioDespesasRequest }
     * 
     */
    public PesquisarRelatorioDespesasRequest createPesquisarRelatorioDespesasRequest() {
        return new PesquisarRelatorioDespesasRequest();
    }

    /**
     * Create an instance of {@link PesquisarRelatorioDespesasResponse }
     * 
     */
    public PesquisarRelatorioDespesasResponse createPesquisarRelatorioDespesasResponse() {
        return new PesquisarRelatorioDespesasResponse();
    }

    /**
     * Create an instance of {@link ImportarDespesaRequest }
     * 
     */
    public ImportarDespesaRequest createImportarDespesaRequest() {
        return new ImportarDespesaRequest();
    }

    /**
     * Create an instance of {@link ImportarDespesaResponse }
     * 
     */
    public ImportarDespesaResponse createImportarDespesaResponse() {
        return new ImportarDespesaResponse();
    }

    /**
     * Create an instance of {@link LiberarAdiantamentoRequest }
     * 
     */
    public LiberarAdiantamentoRequest createLiberarAdiantamentoRequest() {
        return new LiberarAdiantamentoRequest();
    }

    /**
     * Create an instance of {@link LiberarAdiantamentoResponse }
     * 
     */
    public LiberarAdiantamentoResponse createLiberarAdiantamentoResponse() {
        return new LiberarAdiantamentoResponse();
    }

    /**
     * Create an instance of {@link ContabilizarRelatorioDespesasRequest }
     * 
     */
    public ContabilizarRelatorioDespesasRequest createContabilizarRelatorioDespesasRequest() {
        return new ContabilizarRelatorioDespesasRequest();
    }

    /**
     * Create an instance of {@link ContabilizarRelatorioDespesasResponse }
     * 
     */
    public ContabilizarRelatorioDespesasResponse createContabilizarRelatorioDespesasResponse() {
        return new ContabilizarRelatorioDespesasResponse();
    }

    /**
     * Create an instance of {@link PesquisarLogsAcessoRequest }
     * 
     */
    public PesquisarLogsAcessoRequest createPesquisarLogsAcessoRequest() {
        return new PesquisarLogsAcessoRequest();
    }

    /**
     * Create an instance of {@link PesquisarLogsAcessoResponse }
     * 
     */
    public PesquisarLogsAcessoResponse createPesquisarLogsAcessoResponse() {
        return new PesquisarLogsAcessoResponse();
    }

    /**
     * Create an instance of {@link ListarCentroDeCustoRequest }
     * 
     */
    public ListarCentroDeCustoRequest createListarCentroDeCustoRequest() {
        return new ListarCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link ListarCentroDeCustoResponse }
     * 
     */
    public ListarCentroDeCustoResponse createListarCentroDeCustoResponse() {
        return new ListarCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link ListarSubCentroDeCustoRequest }
     * 
     */
    public ListarSubCentroDeCustoRequest createListarSubCentroDeCustoRequest() {
        return new ListarSubCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link ListarSubCentroDeCustoResponse }
     * 
     */
    public ListarSubCentroDeCustoResponse createListarSubCentroDeCustoResponse() {
        return new ListarSubCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link ListarParametrizacaoCentroDeCustoRequest }
     * 
     */
    public ListarParametrizacaoCentroDeCustoRequest createListarParametrizacaoCentroDeCustoRequest() {
        return new ListarParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link ListarParametrizacaoCentroDeCustoResponse }
     * 
     */
    public ListarParametrizacaoCentroDeCustoResponse createListarParametrizacaoCentroDeCustoResponse() {
        return new ListarParametrizacaoCentroDeCustoResponse();
    }

    /**
     * Create an instance of {@link PesquisarConciliacaoCartaoRequest }
     * 
     */
    public PesquisarConciliacaoCartaoRequest createPesquisarConciliacaoCartaoRequest() {
        return new PesquisarConciliacaoCartaoRequest();
    }

    /**
     * Create an instance of {@link PesquisarConciliacaoCartaoResponse }
     * 
     */
    public PesquisarConciliacaoCartaoResponse createPesquisarConciliacaoCartaoResponse() {
        return new PesquisarConciliacaoCartaoResponse();
    }

    /**
     * Create an instance of {@link CancelarSolicitacaoRequest }
     * 
     */
    public CancelarSolicitacaoRequest createCancelarSolicitacaoRequest() {
        return new CancelarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link CancelarSolicitacaoResponse }
     * 
     */
    public CancelarSolicitacaoResponse createCancelarSolicitacaoResponse() {
        return new CancelarSolicitacaoResponse();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link PesquisarContaBancariaRequest }
     * 
     */
    public PesquisarContaBancariaRequest createPesquisarContaBancariaRequest() {
        return new PesquisarContaBancariaRequest();
    }

    /**
     * Create an instance of {@link PesquisarContaBancariaResponse }
     * 
     */
    public PesquisarContaBancariaResponse createPesquisarContaBancariaResponse() {
        return new PesquisarContaBancariaResponse();
    }

    /**
     * Create an instance of {@link RegionalRef }
     * 
     */
    public RegionalRef createRegionalRef() {
        return new RegionalRef();
    }

    /**
     * Create an instance of {@link Regional }
     * 
     */
    public Regional createRegional() {
        return new Regional();
    }

    /**
     * Create an instance of {@link CentroDeCustoRef }
     * 
     */
    public CentroDeCustoRef createCentroDeCustoRef() {
        return new CentroDeCustoRef();
    }

    /**
     * Create an instance of {@link CentroDeCusto }
     * 
     */
    public CentroDeCusto createCentroDeCusto() {
        return new CentroDeCusto();
    }

    /**
     * Create an instance of {@link SubCentroDeCustoRef }
     * 
     */
    public SubCentroDeCustoRef createSubCentroDeCustoRef() {
        return new SubCentroDeCustoRef();
    }

    /**
     * Create an instance of {@link SubCentroDeCusto }
     * 
     */
    public SubCentroDeCusto createSubCentroDeCusto() {
        return new SubCentroDeCusto();
    }

    /**
     * Create an instance of {@link ConfiguracaoCentroDeCusto }
     * 
     */
    public ConfiguracaoCentroDeCusto createConfiguracaoCentroDeCusto() {
        return new ConfiguracaoCentroDeCusto();
    }

    /**
     * Create an instance of {@link ContaContabilRef }
     * 
     */
    public ContaContabilRef createContaContabilRef() {
        return new ContaContabilRef();
    }

    /**
     * Create an instance of {@link ContaContabil }
     * 
     */
    public ContaContabil createContaContabil() {
        return new ContaContabil();
    }

    /**
     * Create an instance of {@link Funcionarios }
     * 
     */
    public Funcionarios createFuncionarios() {
        return new Funcionarios();
    }

    /**
     * Create an instance of {@link FuncionarioRef }
     * 
     */
    public FuncionarioRef createFuncionarioRef() {
        return new FuncionarioRef();
    }

    /**
     * Create an instance of {@link FuncionarioContaBancariaRef }
     * 
     */
    public FuncionarioContaBancariaRef createFuncionarioContaBancariaRef() {
        return new FuncionarioContaBancariaRef();
    }

    /**
     * Create an instance of {@link AcompanhanteRef }
     * 
     */
    public AcompanhanteRef createAcompanhanteRef() {
        return new AcompanhanteRef();
    }

    /**
     * Create an instance of {@link Funcionario }
     * 
     */
    public Funcionario createFuncionario() {
        return new Funcionario();
    }

    /**
     * Create an instance of {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     * 
     */
    public ParametrizacaoCentroDeCustoAprovacaoRef createParametrizacaoCentroDeCustoAprovacaoRef() {
        return new ParametrizacaoCentroDeCustoAprovacaoRef();
    }

    /**
     * Create an instance of {@link ParametrizacaoCentroDeCustoAprovacao }
     * 
     */
    public ParametrizacaoCentroDeCustoAprovacao createParametrizacaoCentroDeCustoAprovacao() {
        return new ParametrizacaoCentroDeCustoAprovacao();
    }

    /**
     * Create an instance of {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     * 
     */
    public ParametrizacaoCentroDeCustoSolicitacaoRef createParametrizacaoCentroDeCustoSolicitacaoRef() {
        return new ParametrizacaoCentroDeCustoSolicitacaoRef();
    }

    /**
     * Create an instance of {@link ParametrizacaoCentroDeCustoSolicitacao }
     * 
     */
    public ParametrizacaoCentroDeCustoSolicitacao createParametrizacaoCentroDeCustoSolicitacao() {
        return new ParametrizacaoCentroDeCustoSolicitacao();
    }

    /**
     * Create an instance of {@link ParametrizacaoCentroDeCustoDebitoRef }
     * 
     */
    public ParametrizacaoCentroDeCustoDebitoRef createParametrizacaoCentroDeCustoDebitoRef() {
        return new ParametrizacaoCentroDeCustoDebitoRef();
    }

    /**
     * Create an instance of {@link ParametrizacaoCentroDeCustoDebito }
     * 
     */
    public ParametrizacaoCentroDeCustoDebito createParametrizacaoCentroDeCustoDebito() {
        return new ParametrizacaoCentroDeCustoDebito();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Contato }
     * 
     */
    public Contato createContato() {
        return new Contato();
    }

    /**
     * Create an instance of {@link ConfiguracaoFuncionario }
     * 
     */
    public ConfiguracaoFuncionario createConfiguracaoFuncionario() {
        return new ConfiguracaoFuncionario();
    }

    /**
     * Create an instance of {@link Solicitacao }
     * 
     */
    public Solicitacao createSolicitacao() {
        return new Solicitacao();
    }

    /**
     * Create an instance of {@link Passageiros }
     * 
     */
    public Passageiros createPassageiros() {
        return new Passageiros();
    }

    /**
     * Create an instance of {@link Passageiro }
     * 
     */
    public Passageiro createPassageiro() {
        return new Passageiro();
    }

    /**
     * Create an instance of {@link LogAs }
     * 
     */
    public LogAs createLogAs() {
        return new LogAs();
    }

    /**
     * Create an instance of {@link Atendimento }
     * 
     */
    public Atendimento createAtendimento() {
        return new Atendimento();
    }

    /**
     * Create an instance of {@link Totais }
     * 
     */
    public Totais createTotais() {
        return new Totais();
    }

    /**
     * Create an instance of {@link IdentificadorIntegracaoRef }
     * 
     */
    public IdentificadorIntegracaoRef createIdentificadorIntegracaoRef() {
        return new IdentificadorIntegracaoRef();
    }

    /**
     * Create an instance of {@link ParametrizacaoViajanteAprovacaoRef }
     * 
     */
    public ParametrizacaoViajanteAprovacaoRef createParametrizacaoViajanteAprovacaoRef() {
        return new ParametrizacaoViajanteAprovacaoRef();
    }

    /**
     * Create an instance of {@link ParametrizacaoViajanteAprovacaoDeletarTodosRef }
     * 
     */
    public ParametrizacaoViajanteAprovacaoDeletarTodosRef createParametrizacaoViajanteAprovacaoDeletarTodosRef() {
        return new ParametrizacaoViajanteAprovacaoDeletarTodosRef();
    }

    /**
     * Create an instance of {@link ParametrizacaoViajanteAprovacao }
     * 
     */
    public ParametrizacaoViajanteAprovacao createParametrizacaoViajanteAprovacao() {
        return new ParametrizacaoViajanteAprovacao();
    }

    /**
     * Create an instance of {@link Agencia }
     * 
     */
    public Agencia createAgencia() {
        return new Agencia();
    }

    /**
     * Create an instance of {@link Filial }
     * 
     */
    public Filial createFilial() {
        return new Filial();
    }

    /**
     * Create an instance of {@link InstrucoesFaturamento }
     * 
     */
    public InstrucoesFaturamento createInstrucoesFaturamento() {
        return new InstrucoesFaturamento();
    }

    /**
     * Create an instance of {@link Produtos }
     * 
     */
    public Produtos createProdutos() {
        return new Produtos();
    }

    /**
     * Create an instance of {@link PontoVenda }
     * 
     */
    public PontoVenda createPontoVenda() {
        return new PontoVenda();
    }

    /**
     * Create an instance of {@link Deslocamento }
     * 
     */
    public Deslocamento createDeslocamento() {
        return new Deslocamento();
    }

    /**
     * Create an instance of {@link ProjetoRef }
     * 
     */
    public ProjetoRef createProjetoRef() {
        return new ProjetoRef();
    }

    /**
     * Create an instance of {@link Projeto }
     * 
     */
    public Projeto createProjeto() {
        return new Projeto();
    }

    /**
     * Create an instance of {@link Budget }
     * 
     */
    public Budget createBudget() {
        return new Budget();
    }

    /**
     * Create an instance of {@link ConsultaBilheteCia }
     * 
     */
    public ConsultaBilheteCia createConsultaBilheteCia() {
        return new ConsultaBilheteCia();
    }

    /**
     * Create an instance of {@link CadastrarHoteisHomologados }
     * 
     */
    public CadastrarHoteisHomologados createCadastrarHoteisHomologados() {
        return new CadastrarHoteisHomologados();
    }

    /**
     * Create an instance of {@link AereoFinalizar }
     * 
     */
    public AereoFinalizar createAereoFinalizar() {
        return new AereoFinalizar();
    }

    /**
     * Create an instance of {@link HotelFinalizar }
     * 
     */
    public HotelFinalizar createHotelFinalizar() {
        return new HotelFinalizar();
    }

    /**
     * Create an instance of {@link CarroFinalizar }
     * 
     */
    public CarroFinalizar createCarroFinalizar() {
        return new CarroFinalizar();
    }

    /**
     * Create an instance of {@link CadastrarTreinamento }
     * 
     */
    public CadastrarTreinamento createCadastrarTreinamento() {
        return new CadastrarTreinamento();
    }

    /**
     * Create an instance of {@link CadastrarParticipanteTreinamento }
     * 
     */
    public CadastrarParticipanteTreinamento createCadastrarParticipanteTreinamento() {
        return new CadastrarParticipanteTreinamento();
    }

    /**
     * Create an instance of {@link DeletarTreinamento }
     * 
     */
    public DeletarTreinamento createDeletarTreinamento() {
        return new DeletarTreinamento();
    }

    /**
     * Create an instance of {@link DeletarParticipanteTreinamento }
     * 
     */
    public DeletarParticipanteTreinamento createDeletarParticipanteTreinamento() {
        return new DeletarParticipanteTreinamento();
    }

    /**
     * Create an instance of {@link CamposAdicionais }
     * 
     */
    public CamposAdicionais createCamposAdicionais() {
        return new CamposAdicionais();
    }

    /**
     * Create an instance of {@link CampoAdicional }
     * 
     */
    public CampoAdicional createCampoAdicional() {
        return new CampoAdicional();
    }

    /**
     * Create an instance of {@link DelegarTodasParametrizacoes }
     * 
     */
    public DelegarTodasParametrizacoes createDelegarTodasParametrizacoes() {
        return new DelegarTodasParametrizacoes();
    }

    /**
     * Create an instance of {@link ParametrizacoesEspecificas }
     * 
     */
    public ParametrizacoesEspecificas createParametrizacoesEspecificas() {
        return new ParametrizacoesEspecificas();
    }

    /**
     * Create an instance of {@link ParametrizacoesSolicitacao }
     * 
     */
    public ParametrizacoesSolicitacao createParametrizacoesSolicitacao() {
        return new ParametrizacoesSolicitacao();
    }

    /**
     * Create an instance of {@link ParametrizacoesAprovacao }
     * 
     */
    public ParametrizacoesAprovacao createParametrizacoesAprovacao() {
        return new ParametrizacoesAprovacao();
    }

    /**
     * Create an instance of {@link InstituicaoBancariaRef }
     * 
     */
    public InstituicaoBancariaRef createInstituicaoBancariaRef() {
        return new InstituicaoBancariaRef();
    }

    /**
     * Create an instance of {@link LogDeAcesso }
     * 
     */
    public LogDeAcesso createLogDeAcesso() {
        return new LogDeAcesso();
    }

    /**
     * Create an instance of {@link SvsAtreladas }
     * 
     */
    public SvsAtreladas createSvsAtreladas() {
        return new SvsAtreladas();
    }

    /**
     * Create an instance of {@link ConciliacoesCartao }
     * 
     */
    public ConciliacoesCartao createConciliacoesCartao() {
        return new ConciliacoesCartao();
    }

    /**
     * Create an instance of {@link ConciliacaoCartao }
     * 
     */
    public ConciliacaoCartao createConciliacaoCartao() {
        return new ConciliacaoCartao();
    }

    /**
     * Create an instance of {@link TransacoesCartao }
     * 
     */
    public TransacoesCartao createTransacoesCartao() {
        return new TransacoesCartao();
    }

    /**
     * Create an instance of {@link TransacaoCartao }
     * 
     */
    public TransacaoCartao createTransacaoCartao() {
        return new TransacaoCartao();
    }

    /**
     * Create an instance of {@link Fluxo }
     * 
     */
    public Fluxo createFluxo() {
        return new Fluxo();
    }

    /**
     * Create an instance of {@link Fluxos }
     * 
     */
    public Fluxos createFluxos() {
        return new Fluxos();
    }

    /**
     * Create an instance of {@link ContaBancaria }
     * 
     */
    public ContaBancaria createContaBancaria() {
        return new ContaBancaria();
    }

    /**
     * Create an instance of {@link ContasBancaria }
     * 
     */
    public ContasBancaria createContasBancaria() {
        return new ContasBancaria();
    }

    /**
     * Create an instance of {@link FormaPagamento }
     * 
     */
    public FormaPagamento createFormaPagamento() {
        return new FormaPagamento();
    }

    /**
     * Create an instance of {@link ResultadoOperacao }
     * 
     */
    public ResultadoOperacao createResultadoOperacao() {
        return new ResultadoOperacao();
    }

    /**
     * Create an instance of {@link ItensFaturamentoHotel }
     * 
     */
    public ItensFaturamentoHotel createItensFaturamentoHotel() {
        return new ItensFaturamentoHotel();
    }

    /**
     * Create an instance of {@link Remarks }
     * 
     */
    public Remarks createRemarks() {
        return new Remarks();
    }

    /**
     * Create an instance of {@link Remark }
     * 
     */
    public Remark createRemark() {
        return new Remark();
    }

    /**
     * Create an instance of {@link IdentificadoresIntegracao }
     * 
     */
    public IdentificadoresIntegracao createIdentificadoresIntegracao() {
        return new IdentificadoresIntegracao();
    }

    /**
     * Create an instance of {@link Identificador }
     * 
     */
    public Identificador createIdentificador() {
        return new Identificador();
    }

    /**
     * Create an instance of {@link Coberturas }
     * 
     */
    public Coberturas createCoberturas() {
        return new Coberturas();
    }

    /**
     * Create an instance of {@link Cobertura }
     * 
     */
    public Cobertura createCobertura() {
        return new Cobertura();
    }

    /**
     * Create an instance of {@link Consolidadora }
     * 
     */
    public Consolidadora createConsolidadora() {
        return new Consolidadora();
    }

    /**
     * Create an instance of {@link DeslocamentoTerrestre }
     * 
     */
    public DeslocamentoTerrestre createDeslocamentoTerrestre() {
        return new DeslocamentoTerrestre();
    }

    /**
     * Create an instance of {@link PontoVendaOrcamento }
     * 
     */
    public PontoVendaOrcamento createPontoVendaOrcamento() {
        return new PontoVendaOrcamento();
    }

    /**
     * Create an instance of {@link Rateios }
     * 
     */
    public Rateios createRateios() {
        return new Rateios();
    }

    /**
     * Create an instance of {@link Rateio }
     * 
     */
    public Rateio createRateio() {
        return new Rateio();
    }

    /**
     * Create an instance of {@link Ancillary }
     * 
     */
    public Ancillary createAncillary() {
        return new Ancillary();
    }

    /**
     * Create an instance of {@link Aereos }
     * 
     */
    public Aereos createAereos() {
        return new Aereos();
    }

    /**
     * Create an instance of {@link Aereo }
     * 
     */
    public Aereo createAereo() {
        return new Aereo();
    }

    /**
     * Create an instance of {@link AereoTarifa }
     * 
     */
    public AereoTarifa createAereoTarifa() {
        return new AereoTarifa();
    }

    /**
     * Create an instance of {@link AereoTarifaPax }
     * 
     */
    public AereoTarifaPax createAereoTarifaPax() {
        return new AereoTarifaPax();
    }

    /**
     * Create an instance of {@link AereoSeguimento }
     * 
     */
    public AereoSeguimento createAereoSeguimento() {
        return new AereoSeguimento();
    }

    /**
     * Create an instance of {@link AereoVoo }
     * 
     */
    public AereoVoo createAereoVoo() {
        return new AereoVoo();
    }

    /**
     * Create an instance of {@link Cia }
     * 
     */
    public Cia createCia() {
        return new Cia();
    }

    /**
     * Create an instance of {@link AereoDetalheParada }
     * 
     */
    public AereoDetalheParada createAereoDetalheParada() {
        return new AereoDetalheParada();
    }

    /**
     * Create an instance of {@link AereoVooAssento }
     * 
     */
    public AereoVooAssento createAereoVooAssento() {
        return new AereoVooAssento();
    }

    /**
     * Create an instance of {@link AereoDetalheBaseTarifa }
     * 
     */
    public AereoDetalheBaseTarifa createAereoDetalheBaseTarifa() {
        return new AereoDetalheBaseTarifa();
    }

    /**
     * Create an instance of {@link AereoBilhete }
     * 
     */
    public AereoBilhete createAereoBilhete() {
        return new AereoBilhete();
    }

    /**
     * Create an instance of {@link Reemissao }
     * 
     */
    public Reemissao createReemissao() {
        return new Reemissao();
    }

    /**
     * Create an instance of {@link Credencial }
     * 
     */
    public Credencial createCredencial() {
        return new Credencial();
    }

    /**
     * Create an instance of {@link PedidosAereos }
     * 
     */
    public PedidosAereos createPedidosAereos() {
        return new PedidosAereos();
    }

    /**
     * Create an instance of {@link PedidoAereo }
     * 
     */
    public PedidoAereo createPedidoAereo() {
        return new PedidoAereo();
    }

    /**
     * Create an instance of {@link SolicitacaoAeroporto }
     * 
     */
    public SolicitacaoAeroporto createSolicitacaoAeroporto() {
        return new SolicitacaoAeroporto();
    }

    /**
     * Create an instance of {@link BaseAtendimento }
     * 
     */
    public BaseAtendimento createBaseAtendimento() {
        return new BaseAtendimento();
    }

    /**
     * Create an instance of {@link Hoteis }
     * 
     */
    public Hoteis createHoteis() {
        return new Hoteis();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link PedidosHoteis }
     * 
     */
    public PedidosHoteis createPedidosHoteis() {
        return new PedidosHoteis();
    }

    /**
     * Create an instance of {@link PedidoHotel }
     * 
     */
    public PedidoHotel createPedidoHotel() {
        return new PedidoHotel();
    }

    /**
     * Create an instance of {@link Carros }
     * 
     */
    public Carros createCarros() {
        return new Carros();
    }

    /**
     * Create an instance of {@link Carro }
     * 
     */
    public Carro createCarro() {
        return new Carro();
    }

    /**
     * Create an instance of {@link PedidosCarros }
     * 
     */
    public PedidosCarros createPedidosCarros() {
        return new PedidosCarros();
    }

    /**
     * Create an instance of {@link PedidoCarro }
     * 
     */
    public PedidoCarro createPedidoCarro() {
        return new PedidoCarro();
    }

    /**
     * Create an instance of {@link Outros }
     * 
     */
    public Outros createOutros() {
        return new Outros();
    }

    /**
     * Create an instance of {@link Outro }
     * 
     */
    public Outro createOutro() {
        return new Outro();
    }

    /**
     * Create an instance of {@link FornecedorRef }
     * 
     */
    public FornecedorRef createFornecedorRef() {
        return new FornecedorRef();
    }

    /**
     * Create an instance of {@link FornecedorClienteRef }
     * 
     */
    public FornecedorClienteRef createFornecedorClienteRef() {
        return new FornecedorClienteRef();
    }

    /**
     * Create an instance of {@link Fornecedor }
     * 
     */
    public Fornecedor createFornecedor() {
        return new Fornecedor();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorHotelRef }
     * 
     */
    public TarifarioFornecedorHotelRef createTarifarioFornecedorHotelRef() {
        return new TarifarioFornecedorHotelRef();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorHotel }
     * 
     */
    public TarifarioFornecedorHotel createTarifarioFornecedorHotel() {
        return new TarifarioFornecedorHotel();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorCarroRef }
     * 
     */
    public TarifarioFornecedorCarroRef createTarifarioFornecedorCarroRef() {
        return new TarifarioFornecedorCarroRef();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorCarro }
     * 
     */
    public TarifarioFornecedorCarro createTarifarioFornecedorCarro() {
        return new TarifarioFornecedorCarro();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorOutroRef }
     * 
     */
    public TarifarioFornecedorOutroRef createTarifarioFornecedorOutroRef() {
        return new TarifarioFornecedorOutroRef();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorOutro }
     * 
     */
    public TarifarioFornecedorOutro createTarifarioFornecedorOutro() {
        return new TarifarioFornecedorOutro();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorRodoviarioRef }
     * 
     */
    public TarifarioFornecedorRodoviarioRef createTarifarioFornecedorRodoviarioRef() {
        return new TarifarioFornecedorRodoviarioRef();
    }

    /**
     * Create an instance of {@link TarifarioFornecedorRodoviario }
     * 
     */
    public TarifarioFornecedorRodoviario createTarifarioFornecedorRodoviario() {
        return new TarifarioFornecedorRodoviario();
    }

    /**
     * Create an instance of {@link Seguros }
     * 
     */
    public Seguros createSeguros() {
        return new Seguros();
    }

    /**
     * Create an instance of {@link Seguro }
     * 
     */
    public Seguro createSeguro() {
        return new Seguro();
    }

    /**
     * Create an instance of {@link Traslados }
     * 
     */
    public Traslados createTraslados() {
        return new Traslados();
    }

    /**
     * Create an instance of {@link Traslado }
     * 
     */
    public Traslado createTraslado() {
        return new Traslado();
    }

    /**
     * Create an instance of {@link Expense }
     * 
     */
    public Expense createExpense() {
        return new Expense();
    }

    /**
     * Create an instance of {@link Adiantamento }
     * 
     */
    public Adiantamento createAdiantamento() {
        return new Adiantamento();
    }

    /**
     * Create an instance of {@link AdiantamentoItens }
     * 
     */
    public AdiantamentoItens createAdiantamentoItens() {
        return new AdiantamentoItens();
    }

    /**
     * Create an instance of {@link AdiantamentoItem }
     * 
     */
    public AdiantamentoItem createAdiantamentoItem() {
        return new AdiantamentoItem();
    }

    /**
     * Create an instance of {@link ContaBancariaAdiantamento }
     * 
     */
    public ContaBancariaAdiantamento createContaBancariaAdiantamento() {
        return new ContaBancariaAdiantamento();
    }

    /**
     * Create an instance of {@link PrestacaoContas }
     * 
     */
    public PrestacaoContas createPrestacaoContas() {
        return new PrestacaoContas();
    }

    /**
     * Create an instance of {@link PrestacaoContaItens }
     * 
     */
    public PrestacaoContaItens createPrestacaoContaItens() {
        return new PrestacaoContaItens();
    }

    /**
     * Create an instance of {@link PrestacaoContaItem }
     * 
     */
    public PrestacaoContaItem createPrestacaoContaItem() {
        return new PrestacaoContaItem();
    }

    /**
     * Create an instance of {@link Fluxo2 }
     * 
     */
    public Fluxo2 createFluxo2() {
        return new Fluxo2();
    }

    /**
     * Create an instance of {@link Fluxos2 }
     * 
     */
    public Fluxos2 createFluxos2() {
        return new Fluxos2();
    }

    /**
     * Create an instance of {@link Imagem }
     * 
     */
    public Imagem createImagem() {
        return new Imagem();
    }

    /**
     * Create an instance of {@link Imagens }
     * 
     */
    public Imagens createImagens() {
        return new Imagens();
    }

    /**
     * Create an instance of {@link Rodoviarios }
     * 
     */
    public Rodoviarios createRodoviarios() {
        return new Rodoviarios();
    }

    /**
     * Create an instance of {@link Rodoviario }
     * 
     */
    public Rodoviario createRodoviario() {
        return new Rodoviario();
    }

    /**
     * Create an instance of {@link SolicitacaoToListarCentroDeCusto }
     * 
     */
    public SolicitacaoToListarCentroDeCusto createSolicitacaoToListarCentroDeCusto() {
        return new SolicitacaoToListarCentroDeCusto();
    }

    /**
     * Create an instance of {@link CentroDeCustoToListarCentroDeCusto }
     * 
     */
    public CentroDeCustoToListarCentroDeCusto createCentroDeCustoToListarCentroDeCusto() {
        return new CentroDeCustoToListarCentroDeCusto();
    }

    /**
     * Create an instance of {@link SolicitacaoListarParametrizacaoCentroDeCusto }
     * 
     */
    public SolicitacaoListarParametrizacaoCentroDeCusto createSolicitacaoListarParametrizacaoCentroDeCusto() {
        return new SolicitacaoListarParametrizacaoCentroDeCusto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "keyClient")
    public JAXBElement<String> createKeyClient(String value) {
        return new JAXBElement<String>(_KeyClient_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "userName")
    public JAXBElement<String> createUserName(String value) {
        return new JAXBElement<String>(_UserName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "userPassword")
    public JAXBElement<String> createUserPassword(String value) {
        return new JAXBElement<String>(_UserPassword_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarSolicitacao")
    public JAXBElement<PesquisarSolicitacaoRequest> createPesquisarSolicitacao(PesquisarSolicitacaoRequest value) {
        return new JAXBElement<PesquisarSolicitacaoRequest>(_PesquisarSolicitacao_QNAME, PesquisarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarSolicitacaoResponse")
    public JAXBElement<PesquisarSolicitacaoResponse> createPesquisarSolicitacaoResponse(PesquisarSolicitacaoResponse value) {
        return new JAXBElement<PesquisarSolicitacaoResponse>(_PesquisarSolicitacaoResponse_QNAME, PesquisarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SincronizarSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SincronizarSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "sincronizarSolicitacao")
    public JAXBElement<SincronizarSolicitacaoRequest> createSincronizarSolicitacao(SincronizarSolicitacaoRequest value) {
        return new JAXBElement<SincronizarSolicitacaoRequest>(_SincronizarSolicitacao_QNAME, SincronizarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SincronizarSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SincronizarSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "sincronizarSolicitacaoResponse")
    public JAXBElement<SincronizarSolicitacaoResponse> createSincronizarSolicitacaoResponse(SincronizarSolicitacaoResponse value) {
        return new JAXBElement<SincronizarSolicitacaoResponse>(_SincronizarSolicitacaoResponse_QNAME, SincronizarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarRegionalRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarRegionalRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarRegional")
    public JAXBElement<CadastrarRegionalRequest> createCadastrarRegional(CadastrarRegionalRequest value) {
        return new JAXBElement<CadastrarRegionalRequest>(_CadastrarRegional_QNAME, CadastrarRegionalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarRegionalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarRegionalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarRegionalResponse")
    public JAXBElement<CadastrarRegionalResponse> createCadastrarRegionalResponse(CadastrarRegionalResponse value) {
        return new JAXBElement<CadastrarRegionalResponse>(_CadastrarRegionalResponse_QNAME, CadastrarRegionalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusRegionalRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusRegionalRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusRegional")
    public JAXBElement<AlterarStatusRegionalRequest> createAlterarStatusRegional(AlterarStatusRegionalRequest value) {
        return new JAXBElement<AlterarStatusRegionalRequest>(_AlterarStatusRegional_QNAME, AlterarStatusRegionalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusRegionalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusRegionalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusRegionalResponse")
    public JAXBElement<AlterarStatusRegionalResponse> createAlterarStatusRegionalResponse(AlterarStatusRegionalResponse value) {
        return new JAXBElement<AlterarStatusRegionalResponse>(_AlterarStatusRegionalResponse_QNAME, AlterarStatusRegionalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarContaContabilRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarContaContabilRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarContaContabil")
    public JAXBElement<CadastrarContaContabilRequest> createCadastrarContaContabil(CadastrarContaContabilRequest value) {
        return new JAXBElement<CadastrarContaContabilRequest>(_CadastrarContaContabil_QNAME, CadastrarContaContabilRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarContaContabilResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarContaContabilResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarContaContabilResponse")
    public JAXBElement<CadastrarContaContabilResponse> createCadastrarContaContabilResponse(CadastrarContaContabilResponse value) {
        return new JAXBElement<CadastrarContaContabilResponse>(_CadastrarContaContabilResponse_QNAME, CadastrarContaContabilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusContaContabilRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusContaContabilRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusContaContabil")
    public JAXBElement<AlterarStatusContaContabilRequest> createAlterarStatusContaContabil(AlterarStatusContaContabilRequest value) {
        return new JAXBElement<AlterarStatusContaContabilRequest>(_AlterarStatusContaContabil_QNAME, AlterarStatusContaContabilRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusContaContabilResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusContaContabilResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusContaContabilResponse")
    public JAXBElement<AlterarStatusContaContabilResponse> createAlterarStatusContaContabilResponse(AlterarStatusContaContabilResponse value) {
        return new JAXBElement<AlterarStatusContaContabilResponse>(_AlterarStatusContaContabilResponse_QNAME, AlterarStatusContaContabilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarCentroDeCusto")
    public JAXBElement<CadastrarCentroDeCustoRequest> createCadastrarCentroDeCusto(CadastrarCentroDeCustoRequest value) {
        return new JAXBElement<CadastrarCentroDeCustoRequest>(_CadastrarCentroDeCusto_QNAME, CadastrarCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarCentroDeCustoResponse")
    public JAXBElement<CadastrarCentroDeCustoResponse> createCadastrarCentroDeCustoResponse(CadastrarCentroDeCustoResponse value) {
        return new JAXBElement<CadastrarCentroDeCustoResponse>(_CadastrarCentroDeCustoResponse_QNAME, CadastrarCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusCentroDeCusto")
    public JAXBElement<AlterarStatusCentroDeCustoRequest> createAlterarStatusCentroDeCusto(AlterarStatusCentroDeCustoRequest value) {
        return new JAXBElement<AlterarStatusCentroDeCustoRequest>(_AlterarStatusCentroDeCusto_QNAME, AlterarStatusCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusCentroDeCustoResponse")
    public JAXBElement<AlterarStatusCentroDeCustoResponse> createAlterarStatusCentroDeCustoResponse(AlterarStatusCentroDeCustoResponse value) {
        return new JAXBElement<AlterarStatusCentroDeCustoResponse>(_AlterarStatusCentroDeCustoResponse_QNAME, AlterarStatusCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarSubCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarSubCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarSubCentroDeCusto")
    public JAXBElement<CadastrarSubCentroDeCustoRequest> createCadastrarSubCentroDeCusto(CadastrarSubCentroDeCustoRequest value) {
        return new JAXBElement<CadastrarSubCentroDeCustoRequest>(_CadastrarSubCentroDeCusto_QNAME, CadastrarSubCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarSubCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarSubCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarSubCentroDeCustoResponse")
    public JAXBElement<CadastrarSubCentroDeCustoResponse> createCadastrarSubCentroDeCustoResponse(CadastrarSubCentroDeCustoResponse value) {
        return new JAXBElement<CadastrarSubCentroDeCustoResponse>(_CadastrarSubCentroDeCustoResponse_QNAME, CadastrarSubCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusSubCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusSubCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusSubCentroDeCusto")
    public JAXBElement<AlterarStatusSubCentroDeCustoRequest> createAlterarStatusSubCentroDeCusto(AlterarStatusSubCentroDeCustoRequest value) {
        return new JAXBElement<AlterarStatusSubCentroDeCustoRequest>(_AlterarStatusSubCentroDeCusto_QNAME, AlterarStatusSubCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusSubCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusSubCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusSubCentroDeCustoResponse")
    public JAXBElement<AlterarStatusSubCentroDeCustoResponse> createAlterarStatusSubCentroDeCustoResponse(AlterarStatusSubCentroDeCustoResponse value) {
        return new JAXBElement<AlterarStatusSubCentroDeCustoResponse>(_AlterarStatusSubCentroDeCustoResponse_QNAME, AlterarStatusSubCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFuncionarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarFuncionarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFuncionario")
    public JAXBElement<CadastrarFuncionarioRequest> createCadastrarFuncionario(CadastrarFuncionarioRequest value) {
        return new JAXBElement<CadastrarFuncionarioRequest>(_CadastrarFuncionario_QNAME, CadastrarFuncionarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFuncionarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarFuncionarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFuncionarioResponse")
    public JAXBElement<CadastrarFuncionarioResponse> createCadastrarFuncionarioResponse(CadastrarFuncionarioResponse value) {
        return new JAXBElement<CadastrarFuncionarioResponse>(_CadastrarFuncionarioResponse_QNAME, CadastrarFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarFuncionarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarFuncionarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarFuncionario")
    public JAXBElement<PesquisarFuncionarioRequest> createPesquisarFuncionario(PesquisarFuncionarioRequest value) {
        return new JAXBElement<PesquisarFuncionarioRequest>(_PesquisarFuncionario_QNAME, PesquisarFuncionarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarFuncionarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarFuncionarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarFuncionarioResponse")
    public JAXBElement<PesquisarFuncionarioResponse> createPesquisarFuncionarioResponse(PesquisarFuncionarioResponse value) {
        return new JAXBElement<PesquisarFuncionarioResponse>(_PesquisarFuncionarioResponse_QNAME, PesquisarFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFuncionarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusFuncionarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFuncionario")
    public JAXBElement<AlterarStatusFuncionarioRequest> createAlterarStatusFuncionario(AlterarStatusFuncionarioRequest value) {
        return new JAXBElement<AlterarStatusFuncionarioRequest>(_AlterarStatusFuncionario_QNAME, AlterarStatusFuncionarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFuncionarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusFuncionarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFuncionarioResponse")
    public JAXBElement<AlterarStatusFuncionarioResponse> createAlterarStatusFuncionarioResponse(AlterarStatusFuncionarioResponse value) {
        return new JAXBElement<AlterarStatusFuncionarioResponse>(_AlterarStatusFuncionarioResponse_QNAME, AlterarStatusFuncionarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoCentroDeCusto")
    public JAXBElement<CadastrarParametrizacaoCentroDeCustoRequest> createCadastrarParametrizacaoCentroDeCusto(CadastrarParametrizacaoCentroDeCustoRequest value) {
        return new JAXBElement<CadastrarParametrizacaoCentroDeCustoRequest>(_CadastrarParametrizacaoCentroDeCusto_QNAME, CadastrarParametrizacaoCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoCentroDeCustoResponse")
    public JAXBElement<CadastrarParametrizacaoCentroDeCustoResponse> createCadastrarParametrizacaoCentroDeCustoResponse(CadastrarParametrizacaoCentroDeCustoResponse value) {
        return new JAXBElement<CadastrarParametrizacaoCentroDeCustoResponse>(_CadastrarParametrizacaoCentroDeCustoResponse_QNAME, CadastrarParametrizacaoCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoCentroDeCusto")
    public JAXBElement<DeletarParametrizacaoCentroDeCustoRequest> createDeletarParametrizacaoCentroDeCusto(DeletarParametrizacaoCentroDeCustoRequest value) {
        return new JAXBElement<DeletarParametrizacaoCentroDeCustoRequest>(_DeletarParametrizacaoCentroDeCusto_QNAME, DeletarParametrizacaoCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoCentroDeCustoResponse")
    public JAXBElement<DeletarParametrizacaoCentroDeCustoResponse> createDeletarParametrizacaoCentroDeCustoResponse(DeletarParametrizacaoCentroDeCustoResponse value) {
        return new JAXBElement<DeletarParametrizacaoCentroDeCustoResponse>(_DeletarParametrizacaoCentroDeCustoResponse_QNAME, DeletarParametrizacaoCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedor")
    public JAXBElement<CadastrarFornecedorRequest> createCadastrarFornecedor(CadastrarFornecedorRequest value) {
        return new JAXBElement<CadastrarFornecedorRequest>(_CadastrarFornecedor_QNAME, CadastrarFornecedorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedorResponse")
    public JAXBElement<CadastrarFornecedorResponse> createCadastrarFornecedorResponse(CadastrarFornecedorResponse value) {
        return new JAXBElement<CadastrarFornecedorResponse>(_CadastrarFornecedorResponse_QNAME, CadastrarFornecedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFornecedorRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusFornecedorRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFornecedor")
    public JAXBElement<AlterarStatusFornecedorRequest> createAlterarStatusFornecedor(AlterarStatusFornecedorRequest value) {
        return new JAXBElement<AlterarStatusFornecedorRequest>(_AlterarStatusFornecedor_QNAME, AlterarStatusFornecedorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusFornecedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusFornecedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusFornecedorResponse")
    public JAXBElement<AlterarStatusFornecedorResponse> createAlterarStatusFornecedorResponse(AlterarStatusFornecedorResponse value) {
        return new JAXBElement<AlterarStatusFornecedorResponse>(_AlterarStatusFornecedorResponse_QNAME, AlterarStatusFornecedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarTarifarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarTarifarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarTarifario")
    public JAXBElement<CadastrarTarifarioRequest> createCadastrarTarifario(CadastrarTarifarioRequest value) {
        return new JAXBElement<CadastrarTarifarioRequest>(_CadastrarTarifario_QNAME, CadastrarTarifarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarTarifarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarTarifarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarTarifarioResponse")
    public JAXBElement<CadastrarTarifarioResponse> createCadastrarTarifarioResponse(CadastrarTarifarioResponse value) {
        return new JAXBElement<CadastrarTarifarioResponse>(_CadastrarTarifarioResponse_QNAME, CadastrarTarifarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusTarifarioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusTarifarioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusTarifario")
    public JAXBElement<AlterarStatusTarifarioRequest> createAlterarStatusTarifario(AlterarStatusTarifarioRequest value) {
        return new JAXBElement<AlterarStatusTarifarioRequest>(_AlterarStatusTarifario_QNAME, AlterarStatusTarifarioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusTarifarioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusTarifarioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusTarifarioResponse")
    public JAXBElement<AlterarStatusTarifarioResponse> createAlterarStatusTarifarioResponse(AlterarStatusTarifarioResponse value) {
        return new JAXBElement<AlterarStatusTarifarioResponse>(_AlterarStatusTarifarioResponse_QNAME, AlterarStatusTarifarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AprovarSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AprovarSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "aprovarSolicitacao")
    public JAXBElement<AprovarSolicitacaoRequest> createAprovarSolicitacao(AprovarSolicitacaoRequest value) {
        return new JAXBElement<AprovarSolicitacaoRequest>(_AprovarSolicitacao_QNAME, AprovarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AprovarSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AprovarSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "aprovarSolicitacaoResponse")
    public JAXBElement<AprovarSolicitacaoResponse> createAprovarSolicitacaoResponse(AprovarSolicitacaoResponse value) {
        return new JAXBElement<AprovarSolicitacaoResponse>(_AprovarSolicitacaoResponse_QNAME, AprovarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReprovarSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReprovarSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "reprovarSolicitacao")
    public JAXBElement<ReprovarSolicitacaoRequest> createReprovarSolicitacao(ReprovarSolicitacaoRequest value) {
        return new JAXBElement<ReprovarSolicitacaoRequest>(_ReprovarSolicitacao_QNAME, ReprovarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReprovarSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReprovarSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "reprovarSolicitacaoResponse")
    public JAXBElement<ReprovarSolicitacaoResponse> createReprovarSolicitacaoResponse(ReprovarSolicitacaoResponse value) {
        return new JAXBElement<ReprovarSolicitacaoResponse>(_ReprovarSolicitacaoResponse_QNAME, ReprovarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirIdentificadorIntegracaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirIdentificadorIntegracaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirIdentificadorIntegracao")
    public JAXBElement<InserirIdentificadorIntegracaoRequest> createInserirIdentificadorIntegracao(InserirIdentificadorIntegracaoRequest value) {
        return new JAXBElement<InserirIdentificadorIntegracaoRequest>(_InserirIdentificadorIntegracao_QNAME, InserirIdentificadorIntegracaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirIdentificadorIntegracaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirIdentificadorIntegracaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirIdentificadorIntegracaoResponse")
    public JAXBElement<InserirIdentificadorIntegracaoResponse> createInserirIdentificadorIntegracaoResponse(InserirIdentificadorIntegracaoResponse value) {
        return new JAXBElement<InserirIdentificadorIntegracaoResponse>(_InserirIdentificadorIntegracaoResponse_QNAME, InserirIdentificadorIntegracaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoViajanteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoViajanteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoViajante")
    public JAXBElement<CadastrarParametrizacaoViajanteRequest> createCadastrarParametrizacaoViajante(CadastrarParametrizacaoViajanteRequest value) {
        return new JAXBElement<CadastrarParametrizacaoViajanteRequest>(_CadastrarParametrizacaoViajante_QNAME, CadastrarParametrizacaoViajanteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoViajanteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarParametrizacaoViajanteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParametrizacaoViajanteResponse")
    public JAXBElement<CadastrarParametrizacaoViajanteResponse> createCadastrarParametrizacaoViajanteResponse(CadastrarParametrizacaoViajanteResponse value) {
        return new JAXBElement<CadastrarParametrizacaoViajanteResponse>(_CadastrarParametrizacaoViajanteResponse_QNAME, CadastrarParametrizacaoViajanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoViajanteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoViajanteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoViajante")
    public JAXBElement<DeletarParametrizacaoViajanteRequest> createDeletarParametrizacaoViajante(DeletarParametrizacaoViajanteRequest value) {
        return new JAXBElement<DeletarParametrizacaoViajanteRequest>(_DeletarParametrizacaoViajante_QNAME, DeletarParametrizacaoViajanteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoViajanteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarParametrizacaoViajanteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParametrizacaoViajanteResponse")
    public JAXBElement<DeletarParametrizacaoViajanteResponse> createDeletarParametrizacaoViajanteResponse(DeletarParametrizacaoViajanteResponse value) {
        return new JAXBElement<DeletarParametrizacaoViajanteResponse>(_DeletarParametrizacaoViajanteResponse_QNAME, DeletarParametrizacaoViajanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarVendasConsolidadoraRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarVendasConsolidadoraRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarVendasConsolidadora")
    public JAXBElement<PesquisarVendasConsolidadoraRequest> createPesquisarVendasConsolidadora(PesquisarVendasConsolidadoraRequest value) {
        return new JAXBElement<PesquisarVendasConsolidadoraRequest>(_PesquisarVendasConsolidadora_QNAME, PesquisarVendasConsolidadoraRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarVendasConsolidadoraResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarVendasConsolidadoraResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarVendasConsolidadoraResponse")
    public JAXBElement<PesquisarVendasConsolidadoraResponse> createPesquisarVendasConsolidadoraResponse(PesquisarVendasConsolidadoraResponse value) {
        return new JAXBElement<PesquisarVendasConsolidadoraResponse>(_PesquisarVendasConsolidadoraResponse_QNAME, PesquisarVendasConsolidadoraResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorSourceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorSourceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedorSource")
    public JAXBElement<CadastrarFornecedorSourceRequest> createCadastrarFornecedorSource(CadastrarFornecedorSourceRequest value) {
        return new JAXBElement<CadastrarFornecedorSourceRequest>(_CadastrarFornecedorSource_QNAME, CadastrarFornecedorSourceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorSourceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarFornecedorSourceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarFornecedorSourceResponse")
    public JAXBElement<CadastrarFornecedorSourceResponse> createCadastrarFornecedorSourceResponse(CadastrarFornecedorSourceResponse value) {
        return new JAXBElement<CadastrarFornecedorSourceResponse>(_CadastrarFornecedorSourceResponse_QNAME, CadastrarFornecedorSourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirItemDespesaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirItemDespesaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirItemDespesa")
    public JAXBElement<InserirItemDespesaRequest> createInserirItemDespesa(InserirItemDespesaRequest value) {
        return new JAXBElement<InserirItemDespesaRequest>(_InserirItemDespesa_QNAME, InserirItemDespesaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InserirItemDespesaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InserirItemDespesaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "inserirItemDespesaResponse")
    public JAXBElement<InserirItemDespesaResponse> createInserirItemDespesaResponse(InserirItemDespesaResponse value) {
        return new JAXBElement<InserirItemDespesaResponse>(_InserirItemDespesaResponse_QNAME, InserirItemDespesaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProjetoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarProjetoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarProjeto")
    public JAXBElement<CadastrarProjetoRequest> createCadastrarProjeto(CadastrarProjetoRequest value) {
        return new JAXBElement<CadastrarProjetoRequest>(_CadastrarProjeto_QNAME, CadastrarProjetoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarProjetoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarProjetoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarProjetoResponse")
    public JAXBElement<CadastrarProjetoResponse> createCadastrarProjetoResponse(CadastrarProjetoResponse value) {
        return new JAXBElement<CadastrarProjetoResponse>(_CadastrarProjetoResponse_QNAME, CadastrarProjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusProjetoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusProjetoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusProjeto")
    public JAXBElement<AlterarStatusProjetoRequest> createAlterarStatusProjeto(AlterarStatusProjetoRequest value) {
        return new JAXBElement<AlterarStatusProjetoRequest>(_AlterarStatusProjeto_QNAME, AlterarStatusProjetoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlterarStatusProjetoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlterarStatusProjetoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "alterarStatusProjetoResponse")
    public JAXBElement<AlterarStatusProjetoResponse> createAlterarStatusProjetoResponse(AlterarStatusProjetoResponse value) {
        return new JAXBElement<AlterarStatusProjetoResponse>(_AlterarStatusProjetoResponse_QNAME, AlterarStatusProjetoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarBudgetRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtualizarBudgetRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "atualizarBudget")
    public JAXBElement<AtualizarBudgetRequest> createAtualizarBudget(AtualizarBudgetRequest value) {
        return new JAXBElement<AtualizarBudgetRequest>(_AtualizarBudget_QNAME, AtualizarBudgetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtualizarBudgetResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtualizarBudgetResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "atualizarBudgetResponse")
    public JAXBElement<AtualizarBudgetResponse> createAtualizarBudgetResponse(AtualizarBudgetResponse value) {
        return new JAXBElement<AtualizarBudgetResponse>(_AtualizarBudgetResponse_QNAME, AtualizarBudgetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaBilheteCiaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaBilheteCiaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "consultaBilheteCia")
    public JAXBElement<ConsultaBilheteCiaRequest> createConsultaBilheteCia(ConsultaBilheteCiaRequest value) {
        return new JAXBElement<ConsultaBilheteCiaRequest>(_ConsultaBilheteCia_QNAME, ConsultaBilheteCiaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaBilheteCiaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultaBilheteCiaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "consultaBilheteCiaResponse")
    public JAXBElement<ConsultaBilheteCiaResponse> createConsultaBilheteCiaResponse(ConsultaBilheteCiaResponse value) {
        return new JAXBElement<ConsultaBilheteCiaResponse>(_ConsultaBilheteCiaResponse_QNAME, ConsultaBilheteCiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarHoteisHomologadosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarHoteisHomologadosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarHoteisHomologados")
    public JAXBElement<CadastrarHoteisHomologadosRequest> createCadastrarHoteisHomologados(CadastrarHoteisHomologadosRequest value) {
        return new JAXBElement<CadastrarHoteisHomologadosRequest>(_CadastrarHoteisHomologados_QNAME, CadastrarHoteisHomologadosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarHoteisHomologadosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarHoteisHomologadosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarHoteisHomologadosResponse")
    public JAXBElement<CadastrarHoteisHomologadosResponse> createCadastrarHoteisHomologadosResponse(CadastrarHoteisHomologadosResponse value) {
        return new JAXBElement<CadastrarHoteisHomologadosResponse>(_CadastrarHoteisHomologadosResponse_QNAME, CadastrarHoteisHomologadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtrelarUsuariosRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtrelarUsuariosRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "atrelarUsuarios")
    public JAXBElement<AtrelarUsuariosRequest> createAtrelarUsuarios(AtrelarUsuariosRequest value) {
        return new JAXBElement<AtrelarUsuariosRequest>(_AtrelarUsuarios_QNAME, AtrelarUsuariosRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtrelarUsuariosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AtrelarUsuariosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "atrelarUsuariosResponse")
    public JAXBElement<AtrelarUsuariosResponse> createAtrelarUsuariosResponse(AtrelarUsuariosResponse value) {
        return new JAXBElement<AtrelarUsuariosResponse>(_AtrelarUsuariosResponse_QNAME, AtrelarUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalizarSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinalizarSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "finalizarSolicitacao")
    public JAXBElement<FinalizarSolicitacaoRequest> createFinalizarSolicitacao(FinalizarSolicitacaoRequest value) {
        return new JAXBElement<FinalizarSolicitacaoRequest>(_FinalizarSolicitacao_QNAME, FinalizarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalizarSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FinalizarSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "finalizarSolicitacaoResponse")
    public JAXBElement<FinalizarSolicitacaoResponse> createFinalizarSolicitacaoResponse(FinalizarSolicitacaoResponse value) {
        return new JAXBElement<FinalizarSolicitacaoResponse>(_FinalizarSolicitacaoResponse_QNAME, FinalizarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarTreinamentoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarTreinamentoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarTreinamento")
    public JAXBElement<CadastrarTreinamentoRequest> createCadastrarTreinamento(CadastrarTreinamentoRequest value) {
        return new JAXBElement<CadastrarTreinamentoRequest>(_CadastrarTreinamento_QNAME, CadastrarTreinamentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarTreinamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarTreinamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarTreinamentoResponse")
    public JAXBElement<CadastrarTreinamentoResponse> createCadastrarTreinamentoResponse(CadastrarTreinamentoResponse value) {
        return new JAXBElement<CadastrarTreinamentoResponse>(_CadastrarTreinamentoResponse_QNAME, CadastrarTreinamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParticipanteTreinamentoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarParticipanteTreinamentoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParticipanteTreinamento")
    public JAXBElement<CadastrarParticipanteTreinamentoRequest> createCadastrarParticipanteTreinamento(CadastrarParticipanteTreinamentoRequest value) {
        return new JAXBElement<CadastrarParticipanteTreinamentoRequest>(_CadastrarParticipanteTreinamento_QNAME, CadastrarParticipanteTreinamentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarParticipanteTreinamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarParticipanteTreinamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarParticipanteTreinamentoResponse")
    public JAXBElement<CadastrarParticipanteTreinamentoResponse> createCadastrarParticipanteTreinamentoResponse(CadastrarParticipanteTreinamentoResponse value) {
        return new JAXBElement<CadastrarParticipanteTreinamentoResponse>(_CadastrarParticipanteTreinamentoResponse_QNAME, CadastrarParticipanteTreinamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarTreinamentoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarTreinamentoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarTreinamento")
    public JAXBElement<DeletarTreinamentoRequest> createDeletarTreinamento(DeletarTreinamentoRequest value) {
        return new JAXBElement<DeletarTreinamentoRequest>(_DeletarTreinamento_QNAME, DeletarTreinamentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarTreinamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarTreinamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarTreinamentoResponse")
    public JAXBElement<DeletarTreinamentoResponse> createDeletarTreinamentoResponse(DeletarTreinamentoResponse value) {
        return new JAXBElement<DeletarTreinamentoResponse>(_DeletarTreinamentoResponse_QNAME, DeletarTreinamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParticipanteTreinamentoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarParticipanteTreinamentoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParticipanteTreinamento")
    public JAXBElement<DeletarParticipanteTreinamentoRequest> createDeletarParticipanteTreinamento(DeletarParticipanteTreinamentoRequest value) {
        return new JAXBElement<DeletarParticipanteTreinamentoRequest>(_DeletarParticipanteTreinamento_QNAME, DeletarParticipanteTreinamentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletarParticipanteTreinamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeletarParticipanteTreinamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "deletarParticipanteTreinamentoResponse")
    public JAXBElement<DeletarParticipanteTreinamentoResponse> createDeletarParticipanteTreinamentoResponse(DeletarParticipanteTreinamentoResponse value) {
        return new JAXBElement<DeletarParticipanteTreinamentoResponse>(_DeletarParticipanteTreinamentoResponse_QNAME, DeletarParticipanteTreinamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarPreSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CriarPreSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "criarPreSolicitacao")
    public JAXBElement<CriarPreSolicitacaoRequest> createCriarPreSolicitacao(CriarPreSolicitacaoRequest value) {
        return new JAXBElement<CriarPreSolicitacaoRequest>(_CriarPreSolicitacao_QNAME, CriarPreSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CriarPreSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CriarPreSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "criarPreSolicitacaoResponse")
    public JAXBElement<CriarPreSolicitacaoResponse> createCriarPreSolicitacaoResponse(CriarPreSolicitacaoResponse value) {
        return new JAXBElement<CriarPreSolicitacaoResponse>(_CriarPreSolicitacaoResponse_QNAME, CriarPreSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaBancariaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContaBancariaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "contaBancaria")
    public JAXBElement<ContaBancariaRequest> createContaBancaria(ContaBancariaRequest value) {
        return new JAXBElement<ContaBancariaRequest>(_ContaBancaria_QNAME, ContaBancariaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContaBancariaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContaBancariaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "contaBancariaResponse")
    public JAXBElement<ContaBancariaResponse> createContaBancariaResponse(ContaBancariaResponse value) {
        return new JAXBElement<ContaBancariaResponse>(_ContaBancariaResponse_QNAME, ContaBancariaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarDelegacaoParametrizacaoCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportarDelegacaoParametrizacaoCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "importarDelegacaoParametrizacaoCentroDeCusto")
    public JAXBElement<ImportarDelegacaoParametrizacaoCentroDeCustoRequest> createImportarDelegacaoParametrizacaoCentroDeCusto(ImportarDelegacaoParametrizacaoCentroDeCustoRequest value) {
        return new JAXBElement<ImportarDelegacaoParametrizacaoCentroDeCustoRequest>(_ImportarDelegacaoParametrizacaoCentroDeCusto_QNAME, ImportarDelegacaoParametrizacaoCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarDelegacaoParametrizacaoCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportarDelegacaoParametrizacaoCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "importarDelegacaoParametrizacaoCentroDeCustoResponse")
    public JAXBElement<ImportarDelegacaoParametrizacaoCentroDeCustoResponse> createImportarDelegacaoParametrizacaoCentroDeCustoResponse(ImportarDelegacaoParametrizacaoCentroDeCustoResponse value) {
        return new JAXBElement<ImportarDelegacaoParametrizacaoCentroDeCustoResponse>(_ImportarDelegacaoParametrizacaoCentroDeCustoResponse_QNAME, ImportarDelegacaoParametrizacaoCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarControleClienteRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarControleClienteRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarControleCliente")
    public JAXBElement<CadastrarControleClienteRequest> createCadastrarControleCliente(CadastrarControleClienteRequest value) {
        return new JAXBElement<CadastrarControleClienteRequest>(_CadastrarControleCliente_QNAME, CadastrarControleClienteRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarControleClienteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarControleClienteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarControleClienteResponse")
    public JAXBElement<CadastrarControleClienteResponse> createCadastrarControleClienteResponse(CadastrarControleClienteResponse value) {
        return new JAXBElement<CadastrarControleClienteResponse>(_CadastrarControleClienteResponse_QNAME, CadastrarControleClienteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUnidadeNegocioRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarUnidadeNegocioRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarUnidadeNegocio")
    public JAXBElement<CadastrarUnidadeNegocioRequest> createCadastrarUnidadeNegocio(CadastrarUnidadeNegocioRequest value) {
        return new JAXBElement<CadastrarUnidadeNegocioRequest>(_CadastrarUnidadeNegocio_QNAME, CadastrarUnidadeNegocioRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarUnidadeNegocioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CadastrarUnidadeNegocioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cadastrarUnidadeNegocioResponse")
    public JAXBElement<CadastrarUnidadeNegocioResponse> createCadastrarUnidadeNegocioResponse(CadastrarUnidadeNegocioResponse value) {
        return new JAXBElement<CadastrarUnidadeNegocioResponse>(_CadastrarUnidadeNegocioResponse_QNAME, CadastrarUnidadeNegocioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarFaturaCartaoCreditoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportarFaturaCartaoCreditoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "importarFaturaCartaoCredito")
    public JAXBElement<ImportarFaturaCartaoCreditoRequest> createImportarFaturaCartaoCredito(ImportarFaturaCartaoCreditoRequest value) {
        return new JAXBElement<ImportarFaturaCartaoCreditoRequest>(_ImportarFaturaCartaoCredito_QNAME, ImportarFaturaCartaoCreditoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarFaturaCartaoCreditoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportarFaturaCartaoCreditoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "importarFaturaCartaoCreditoResponse")
    public JAXBElement<ImportarFaturaCartaoCreditoResponse> createImportarFaturaCartaoCreditoResponse(ImportarFaturaCartaoCreditoResponse value) {
        return new JAXBElement<ImportarFaturaCartaoCreditoResponse>(_ImportarFaturaCartaoCreditoResponse_QNAME, ImportarFaturaCartaoCreditoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarAdiantamentoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarAdiantamentoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarAdiantamento")
    public JAXBElement<PesquisarAdiantamentoRequest> createPesquisarAdiantamento(PesquisarAdiantamentoRequest value) {
        return new JAXBElement<PesquisarAdiantamentoRequest>(_PesquisarAdiantamento_QNAME, PesquisarAdiantamentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarAdiantamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarAdiantamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarAdiantamentoResponse")
    public JAXBElement<PesquisarAdiantamentoResponse> createPesquisarAdiantamentoResponse(PesquisarAdiantamentoResponse value) {
        return new JAXBElement<PesquisarAdiantamentoResponse>(_PesquisarAdiantamentoResponse_QNAME, PesquisarAdiantamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarRelatorioDespesasRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarRelatorioDespesasRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarRelatorioDespesas")
    public JAXBElement<PesquisarRelatorioDespesasRequest> createPesquisarRelatorioDespesas(PesquisarRelatorioDespesasRequest value) {
        return new JAXBElement<PesquisarRelatorioDespesasRequest>(_PesquisarRelatorioDespesas_QNAME, PesquisarRelatorioDespesasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarRelatorioDespesasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarRelatorioDespesasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarRelatorioDespesasResponse")
    public JAXBElement<PesquisarRelatorioDespesasResponse> createPesquisarRelatorioDespesasResponse(PesquisarRelatorioDespesasResponse value) {
        return new JAXBElement<PesquisarRelatorioDespesasResponse>(_PesquisarRelatorioDespesasResponse_QNAME, PesquisarRelatorioDespesasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarDespesaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportarDespesaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "importarDespesa")
    public JAXBElement<ImportarDespesaRequest> createImportarDespesa(ImportarDespesaRequest value) {
        return new JAXBElement<ImportarDespesaRequest>(_ImportarDespesa_QNAME, ImportarDespesaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportarDespesaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportarDespesaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "importarDespesaResponse")
    public JAXBElement<ImportarDespesaResponse> createImportarDespesaResponse(ImportarDespesaResponse value) {
        return new JAXBElement<ImportarDespesaResponse>(_ImportarDespesaResponse_QNAME, ImportarDespesaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiberarAdiantamentoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LiberarAdiantamentoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "liberarAdiantamento")
    public JAXBElement<LiberarAdiantamentoRequest> createLiberarAdiantamento(LiberarAdiantamentoRequest value) {
        return new JAXBElement<LiberarAdiantamentoRequest>(_LiberarAdiantamento_QNAME, LiberarAdiantamentoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LiberarAdiantamentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LiberarAdiantamentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "liberarAdiantamentoResponse")
    public JAXBElement<LiberarAdiantamentoResponse> createLiberarAdiantamentoResponse(LiberarAdiantamentoResponse value) {
        return new JAXBElement<LiberarAdiantamentoResponse>(_LiberarAdiantamentoResponse_QNAME, LiberarAdiantamentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContabilizarRelatorioDespesasRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContabilizarRelatorioDespesasRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "contabilizarRelatorioDespesas")
    public JAXBElement<ContabilizarRelatorioDespesasRequest> createContabilizarRelatorioDespesas(ContabilizarRelatorioDespesasRequest value) {
        return new JAXBElement<ContabilizarRelatorioDespesasRequest>(_ContabilizarRelatorioDespesas_QNAME, ContabilizarRelatorioDespesasRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContabilizarRelatorioDespesasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContabilizarRelatorioDespesasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "contabilizarRelatorioDespesasResponse")
    public JAXBElement<ContabilizarRelatorioDespesasResponse> createContabilizarRelatorioDespesasResponse(ContabilizarRelatorioDespesasResponse value) {
        return new JAXBElement<ContabilizarRelatorioDespesasResponse>(_ContabilizarRelatorioDespesasResponse_QNAME, ContabilizarRelatorioDespesasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarLogsAcessoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarLogsAcessoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarLogsAcesso")
    public JAXBElement<PesquisarLogsAcessoRequest> createPesquisarLogsAcesso(PesquisarLogsAcessoRequest value) {
        return new JAXBElement<PesquisarLogsAcessoRequest>(_PesquisarLogsAcesso_QNAME, PesquisarLogsAcessoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarLogsAcessoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarLogsAcessoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarLogsAcessoResponse")
    public JAXBElement<PesquisarLogsAcessoResponse> createPesquisarLogsAcessoResponse(PesquisarLogsAcessoResponse value) {
        return new JAXBElement<PesquisarLogsAcessoResponse>(_PesquisarLogsAcessoResponse_QNAME, PesquisarLogsAcessoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "listarCentroDeCusto")
    public JAXBElement<ListarCentroDeCustoRequest> createListarCentroDeCusto(ListarCentroDeCustoRequest value) {
        return new JAXBElement<ListarCentroDeCustoRequest>(_ListarCentroDeCusto_QNAME, ListarCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "listarCentroDeCustoResponse")
    public JAXBElement<ListarCentroDeCustoResponse> createListarCentroDeCustoResponse(ListarCentroDeCustoResponse value) {
        return new JAXBElement<ListarCentroDeCustoResponse>(_ListarCentroDeCustoResponse_QNAME, ListarCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSubCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarSubCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "listarSubCentroDeCusto")
    public JAXBElement<ListarSubCentroDeCustoRequest> createListarSubCentroDeCusto(ListarSubCentroDeCustoRequest value) {
        return new JAXBElement<ListarSubCentroDeCustoRequest>(_ListarSubCentroDeCusto_QNAME, ListarSubCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarSubCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarSubCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "listarSubCentroDeCustoResponse")
    public JAXBElement<ListarSubCentroDeCustoResponse> createListarSubCentroDeCustoResponse(ListarSubCentroDeCustoResponse value) {
        return new JAXBElement<ListarSubCentroDeCustoResponse>(_ListarSubCentroDeCustoResponse_QNAME, ListarSubCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarParametrizacaoCentroDeCustoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarParametrizacaoCentroDeCustoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "listarParametrizacaoCentroDeCusto")
    public JAXBElement<ListarParametrizacaoCentroDeCustoRequest> createListarParametrizacaoCentroDeCusto(ListarParametrizacaoCentroDeCustoRequest value) {
        return new JAXBElement<ListarParametrizacaoCentroDeCustoRequest>(_ListarParametrizacaoCentroDeCusto_QNAME, ListarParametrizacaoCentroDeCustoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarParametrizacaoCentroDeCustoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarParametrizacaoCentroDeCustoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "listarParametrizacaoCentroDeCustoResponse")
    public JAXBElement<ListarParametrizacaoCentroDeCustoResponse> createListarParametrizacaoCentroDeCustoResponse(ListarParametrizacaoCentroDeCustoResponse value) {
        return new JAXBElement<ListarParametrizacaoCentroDeCustoResponse>(_ListarParametrizacaoCentroDeCustoResponse_QNAME, ListarParametrizacaoCentroDeCustoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarConciliacaoCartaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarConciliacaoCartaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarConciliacaoCartao")
    public JAXBElement<PesquisarConciliacaoCartaoRequest> createPesquisarConciliacaoCartao(PesquisarConciliacaoCartaoRequest value) {
        return new JAXBElement<PesquisarConciliacaoCartaoRequest>(_PesquisarConciliacaoCartao_QNAME, PesquisarConciliacaoCartaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarConciliacaoCartaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarConciliacaoCartaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarConciliacaoCartaoResponse")
    public JAXBElement<PesquisarConciliacaoCartaoResponse> createPesquisarConciliacaoCartaoResponse(PesquisarConciliacaoCartaoResponse value) {
        return new JAXBElement<PesquisarConciliacaoCartaoResponse>(_PesquisarConciliacaoCartaoResponse_QNAME, PesquisarConciliacaoCartaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarSolicitacaoRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarSolicitacaoRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cancelarSolicitacao")
    public JAXBElement<CancelarSolicitacaoRequest> createCancelarSolicitacao(CancelarSolicitacaoRequest value) {
        return new JAXBElement<CancelarSolicitacaoRequest>(_CancelarSolicitacao_QNAME, CancelarSolicitacaoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelarSolicitacaoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelarSolicitacaoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "cancelarSolicitacaoResponse")
    public JAXBElement<CancelarSolicitacaoResponse> createCancelarSolicitacaoResponse(CancelarSolicitacaoResponse value) {
        return new JAXBElement<CancelarSolicitacaoResponse>(_CancelarSolicitacaoResponse_QNAME, CancelarSolicitacaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PingRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "ping")
    public JAXBElement<PingRequest> createPing(PingRequest value) {
        return new JAXBElement<PingRequest>(_Ping_QNAME, PingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pingResponse")
    public JAXBElement<PingResponse> createPingResponse(PingResponse value) {
        return new JAXBElement<PingResponse>(_PingResponse_QNAME, PingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarContaBancariaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarContaBancariaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarContaBancaria")
    public JAXBElement<PesquisarContaBancariaRequest> createPesquisarContaBancaria(PesquisarContaBancariaRequest value) {
        return new JAXBElement<PesquisarContaBancariaRequest>(_PesquisarContaBancaria_QNAME, PesquisarContaBancariaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesquisarContaBancariaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PesquisarContaBancariaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/services", name = "pesquisarContaBancariaResponse")
    public JAXBElement<PesquisarContaBancariaResponse> createPesquisarContaBancariaResponse(PesquisarContaBancariaResponse value) {
        return new JAXBElement<PesquisarContaBancariaResponse>(_PesquisarContaBancariaResponse_QNAME, PesquisarContaBancariaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dataAlteracao", scope = Solicitacao.class)
    public JAXBElement<XMLGregorianCalendar> createSolicitacaoDataAlteracao(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SolicitacaoDataAlteracao_QNAME, XMLGregorianCalendar.class, Solicitacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "debitaBudget", scope = ConfiguracaoCentroDeCusto.class)
    public JAXBElement<Boolean> createConfiguracaoCentroDeCustoDebitaBudget(Boolean value) {
        return new JAXBElement<Boolean>(_ConfiguracaoCentroDeCustoDebitaBudget_QNAME, Boolean.class, ConfiguracaoCentroDeCusto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "version", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<String> createPesquisarSolicitacaoRequestVersion(String value) {
        return new JAXBElement<String>(_PesquisarSolicitacaoRequestVersion_QNAME, String.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "idSolicitacaoRef", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<Integer> createPesquisarSolicitacaoRequestIdSolicitacaoRef(Integer value) {
        return new JAXBElement<Integer>(_PesquisarSolicitacaoRequestIdSolicitacaoRef_QNAME, Integer.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exibirCancelados", scope = PesquisarSolicitacaoRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createPesquisarSolicitacaoRequestExibirCancelados(Boolean value) {
        return new JAXBElement<Boolean>(_PesquisarSolicitacaoRequestExibirCancelados_QNAME, Boolean.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exibirPendentesAprovacao", scope = PesquisarSolicitacaoRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createPesquisarSolicitacaoRequestExibirPendentesAprovacao(Boolean value) {
        return new JAXBElement<Boolean>(_PesquisarSolicitacaoRequestExibirPendentesAprovacao_QNAME, Boolean.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dataInicial", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPesquisarSolicitacaoRequestDataInicial(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PesquisarSolicitacaoRequestDataInicial_QNAME, XMLGregorianCalendar.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dataFinal", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPesquisarSolicitacaoRequestDataFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PesquisarSolicitacaoRequestDataFinal_QNAME, XMLGregorianCalendar.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "registroInicial", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<Integer> createPesquisarSolicitacaoRequestRegistroInicial(Integer value) {
        return new JAXBElement<Integer>(_PesquisarSolicitacaoRequestRegistroInicial_QNAME, Integer.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "quantidadeRegistros", scope = PesquisarSolicitacaoRequest.class, defaultValue = "50")
    public JAXBElement<Integer> createPesquisarSolicitacaoRequestQuantidadeRegistros(Integer value) {
        return new JAXBElement<Integer>(_PesquisarSolicitacaoRequestQuantidadeRegistros_QNAME, Integer.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "sincronizado", scope = PesquisarSolicitacaoRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createPesquisarSolicitacaoRequestSincronizado(Boolean value) {
        return new JAXBElement<Boolean>(_PesquisarSolicitacaoRequestSincronizado_QNAME, Boolean.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exibirRemarks", scope = PesquisarSolicitacaoRequest.class, defaultValue = "true")
    public JAXBElement<Boolean> createPesquisarSolicitacaoRequestExibirRemarks(Boolean value) {
        return new JAXBElement<Boolean>(_PesquisarSolicitacaoRequestExibirRemarks_QNAME, Boolean.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exibirAprovadas", scope = PesquisarSolicitacaoRequest.class, defaultValue = "false")
    public JAXBElement<Boolean> createPesquisarSolicitacaoRequestExibirAprovadas(Boolean value) {
        return new JAXBElement<Boolean>(_PesquisarSolicitacaoRequestExibirAprovadas_QNAME, Boolean.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoSolicitacao }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoSolicitacao }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tipoSolicitacao", scope = PesquisarSolicitacaoRequest.class, defaultValue = "TODOS")
    public JAXBElement<TipoSolicitacao> createPesquisarSolicitacaoRequestTipoSolicitacao(TipoSolicitacao value) {
        return new JAXBElement<TipoSolicitacao>(_PesquisarSolicitacaoRequestTipoSolicitacao_QNAME, TipoSolicitacao.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dataAlteracaoInicial", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPesquisarSolicitacaoRequestDataAlteracaoInicial(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PesquisarSolicitacaoRequestDataAlteracaoInicial_QNAME, XMLGregorianCalendar.class, PesquisarSolicitacaoRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dataAlteracaoFinal", scope = PesquisarSolicitacaoRequest.class)
    public JAXBElement<XMLGregorianCalendar> createPesquisarSolicitacaoRequestDataAlteracaoFinal(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PesquisarSolicitacaoRequestDataAlteracaoFinal_QNAME, XMLGregorianCalendar.class, PesquisarSolicitacaoRequest.class, value);
    }

}
