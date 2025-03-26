
package br.com.lemontech.selfbooking.wsselfbooking.services;

import javax.xml.namespace.QName;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusContaContabilRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFornecedorRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusFuncionarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusProjetoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusRegionalRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusSubCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AlterarStatusTarifarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AprovarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AtrelarUsuariosRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.AtualizarBudgetRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarContaContabilRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarControleClienteRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFornecedorSourceRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarFuncionarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarHoteisHomologadosRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParametrizacaoViajanteRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarParticipanteTreinamentoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarProjetoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarRegionalRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarSubCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTarifarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarTreinamentoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CadastrarUnidadeNegocioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CancelarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ConsultaBilheteCiaRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ContaBancariaRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ContabilizarRelatorioDespesasRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.CriarPreSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParametrizacaoViajanteRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarParticipanteTreinamentoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.DeletarTreinamentoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.FinalizarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ImportarDelegacaoParametrizacaoCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ImportarDespesaRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ImportarFaturaCartaoCreditoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirIdentificadorIntegracaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.InserirItemDespesaRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.LiberarAdiantamentoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ListarCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ListarParametrizacaoCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ListarSubCentroDeCustoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarAdiantamentoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarConciliacaoCartaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarContaBancariaRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarFuncionarioRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarLogsAcessoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarRelatorioDespesasRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PesquisarVendasConsolidadoraRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.PingRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.ReprovarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.request.SincronizarSolicitacaoRequest;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusContaContabilResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFornecedorResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusFuncionarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusProjetoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusRegionalResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusSubCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AlterarStatusTarifarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AprovarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AtrelarUsuariosResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.AtualizarBudgetResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarContaContabilResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarControleClienteResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFornecedorSourceResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarFuncionarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarHoteisHomologadosResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParametrizacaoViajanteResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarParticipanteTreinamentoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarProjetoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarRegionalResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarSubCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTarifarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarTreinamentoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CadastrarUnidadeNegocioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CancelarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ConsultaBilheteCiaResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ContaBancariaResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ContabilizarRelatorioDespesasResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.CriarPreSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParametrizacaoViajanteResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarParticipanteTreinamentoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.DeletarTreinamentoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.FinalizarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ImportarDelegacaoParametrizacaoCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ImportarDespesaResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ImportarFaturaCartaoCreditoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirIdentificadorIntegracaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.InserirItemDespesaResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.LiberarAdiantamentoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ListarCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ListarParametrizacaoCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ListarSubCentroDeCustoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarAdiantamentoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarConciliacaoCartaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarContaBancariaResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarFuncionarioResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarLogsAcessoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarRelatorioDespesasResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PesquisarVendasConsolidadoraResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.PingResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.ReprovarSolicitacaoResponse;
import br.com.lemontech.selfbooking.wsselfbooking.services.response.SincronizarSolicitacaoResponse;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.lemontech.selfbooking.wsselfbooking.services package. 
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

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.lemontech.selfbooking.wsselfbooking.services
     * 
     */
    public ObjectFactory() {
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

}
