
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoSolicitacao;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.lemontech.selfbooking.wsselfbooking.services.request package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.lemontech.selfbooking.wsselfbooking.services.request
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
     * Create an instance of {@link SincronizarSolicitacaoRequest }
     * 
     */
    public SincronizarSolicitacaoRequest createSincronizarSolicitacaoRequest() {
        return new SincronizarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link CadastrarRegionalRequest }
     * 
     */
    public CadastrarRegionalRequest createCadastrarRegionalRequest() {
        return new CadastrarRegionalRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusRegionalRequest }
     * 
     */
    public AlterarStatusRegionalRequest createAlterarStatusRegionalRequest() {
        return new AlterarStatusRegionalRequest();
    }

    /**
     * Create an instance of {@link CadastrarContaContabilRequest }
     * 
     */
    public CadastrarContaContabilRequest createCadastrarContaContabilRequest() {
        return new CadastrarContaContabilRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusContaContabilRequest }
     * 
     */
    public AlterarStatusContaContabilRequest createAlterarStatusContaContabilRequest() {
        return new AlterarStatusContaContabilRequest();
    }

    /**
     * Create an instance of {@link CadastrarCentroDeCustoRequest }
     * 
     */
    public CadastrarCentroDeCustoRequest createCadastrarCentroDeCustoRequest() {
        return new CadastrarCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusCentroDeCustoRequest }
     * 
     */
    public AlterarStatusCentroDeCustoRequest createAlterarStatusCentroDeCustoRequest() {
        return new AlterarStatusCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarSubCentroDeCustoRequest }
     * 
     */
    public CadastrarSubCentroDeCustoRequest createCadastrarSubCentroDeCustoRequest() {
        return new CadastrarSubCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusSubCentroDeCustoRequest }
     * 
     */
    public AlterarStatusSubCentroDeCustoRequest createAlterarStatusSubCentroDeCustoRequest() {
        return new AlterarStatusSubCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarFuncionarioRequest }
     * 
     */
    public CadastrarFuncionarioRequest createCadastrarFuncionarioRequest() {
        return new CadastrarFuncionarioRequest();
    }

    /**
     * Create an instance of {@link PesquisarFuncionarioRequest }
     * 
     */
    public PesquisarFuncionarioRequest createPesquisarFuncionarioRequest() {
        return new PesquisarFuncionarioRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusFuncionarioRequest }
     * 
     */
    public AlterarStatusFuncionarioRequest createAlterarStatusFuncionarioRequest() {
        return new AlterarStatusFuncionarioRequest();
    }

    /**
     * Create an instance of {@link CadastrarParametrizacaoCentroDeCustoRequest }
     * 
     */
    public CadastrarParametrizacaoCentroDeCustoRequest createCadastrarParametrizacaoCentroDeCustoRequest() {
        return new CadastrarParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link DeletarParametrizacaoCentroDeCustoRequest }
     * 
     */
    public DeletarParametrizacaoCentroDeCustoRequest createDeletarParametrizacaoCentroDeCustoRequest() {
        return new DeletarParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarFornecedorRequest }
     * 
     */
    public CadastrarFornecedorRequest createCadastrarFornecedorRequest() {
        return new CadastrarFornecedorRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusFornecedorRequest }
     * 
     */
    public AlterarStatusFornecedorRequest createAlterarStatusFornecedorRequest() {
        return new AlterarStatusFornecedorRequest();
    }

    /**
     * Create an instance of {@link CadastrarTarifarioRequest }
     * 
     */
    public CadastrarTarifarioRequest createCadastrarTarifarioRequest() {
        return new CadastrarTarifarioRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusTarifarioRequest }
     * 
     */
    public AlterarStatusTarifarioRequest createAlterarStatusTarifarioRequest() {
        return new AlterarStatusTarifarioRequest();
    }

    /**
     * Create an instance of {@link AprovarSolicitacaoRequest }
     * 
     */
    public AprovarSolicitacaoRequest createAprovarSolicitacaoRequest() {
        return new AprovarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link ReprovarSolicitacaoRequest }
     * 
     */
    public ReprovarSolicitacaoRequest createReprovarSolicitacaoRequest() {
        return new ReprovarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link InserirIdentificadorIntegracaoRequest }
     * 
     */
    public InserirIdentificadorIntegracaoRequest createInserirIdentificadorIntegracaoRequest() {
        return new InserirIdentificadorIntegracaoRequest();
    }

    /**
     * Create an instance of {@link CadastrarParametrizacaoViajanteRequest }
     * 
     */
    public CadastrarParametrizacaoViajanteRequest createCadastrarParametrizacaoViajanteRequest() {
        return new CadastrarParametrizacaoViajanteRequest();
    }

    /**
     * Create an instance of {@link DeletarParametrizacaoViajanteRequest }
     * 
     */
    public DeletarParametrizacaoViajanteRequest createDeletarParametrizacaoViajanteRequest() {
        return new DeletarParametrizacaoViajanteRequest();
    }

    /**
     * Create an instance of {@link PesquisarVendasConsolidadoraRequest }
     * 
     */
    public PesquisarVendasConsolidadoraRequest createPesquisarVendasConsolidadoraRequest() {
        return new PesquisarVendasConsolidadoraRequest();
    }

    /**
     * Create an instance of {@link CadastrarFornecedorSourceRequest }
     * 
     */
    public CadastrarFornecedorSourceRequest createCadastrarFornecedorSourceRequest() {
        return new CadastrarFornecedorSourceRequest();
    }

    /**
     * Create an instance of {@link InserirItemDespesaRequest }
     * 
     */
    public InserirItemDespesaRequest createInserirItemDespesaRequest() {
        return new InserirItemDespesaRequest();
    }

    /**
     * Create an instance of {@link CadastrarProjetoRequest }
     * 
     */
    public CadastrarProjetoRequest createCadastrarProjetoRequest() {
        return new CadastrarProjetoRequest();
    }

    /**
     * Create an instance of {@link AlterarStatusProjetoRequest }
     * 
     */
    public AlterarStatusProjetoRequest createAlterarStatusProjetoRequest() {
        return new AlterarStatusProjetoRequest();
    }

    /**
     * Create an instance of {@link AtualizarBudgetRequest }
     * 
     */
    public AtualizarBudgetRequest createAtualizarBudgetRequest() {
        return new AtualizarBudgetRequest();
    }

    /**
     * Create an instance of {@link ConsultaBilheteCiaRequest }
     * 
     */
    public ConsultaBilheteCiaRequest createConsultaBilheteCiaRequest() {
        return new ConsultaBilheteCiaRequest();
    }

    /**
     * Create an instance of {@link CadastrarHoteisHomologadosRequest }
     * 
     */
    public CadastrarHoteisHomologadosRequest createCadastrarHoteisHomologadosRequest() {
        return new CadastrarHoteisHomologadosRequest();
    }

    /**
     * Create an instance of {@link AtrelarUsuariosRequest }
     * 
     */
    public AtrelarUsuariosRequest createAtrelarUsuariosRequest() {
        return new AtrelarUsuariosRequest();
    }

    /**
     * Create an instance of {@link FinalizarSolicitacaoRequest }
     * 
     */
    public FinalizarSolicitacaoRequest createFinalizarSolicitacaoRequest() {
        return new FinalizarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link CadastrarTreinamentoRequest }
     * 
     */
    public CadastrarTreinamentoRequest createCadastrarTreinamentoRequest() {
        return new CadastrarTreinamentoRequest();
    }

    /**
     * Create an instance of {@link CadastrarParticipanteTreinamentoRequest }
     * 
     */
    public CadastrarParticipanteTreinamentoRequest createCadastrarParticipanteTreinamentoRequest() {
        return new CadastrarParticipanteTreinamentoRequest();
    }

    /**
     * Create an instance of {@link DeletarTreinamentoRequest }
     * 
     */
    public DeletarTreinamentoRequest createDeletarTreinamentoRequest() {
        return new DeletarTreinamentoRequest();
    }

    /**
     * Create an instance of {@link DeletarParticipanteTreinamentoRequest }
     * 
     */
    public DeletarParticipanteTreinamentoRequest createDeletarParticipanteTreinamentoRequest() {
        return new DeletarParticipanteTreinamentoRequest();
    }

    /**
     * Create an instance of {@link CriarPreSolicitacaoRequest }
     * 
     */
    public CriarPreSolicitacaoRequest createCriarPreSolicitacaoRequest() {
        return new CriarPreSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link ContaBancariaRequest }
     * 
     */
    public ContaBancariaRequest createContaBancariaRequest() {
        return new ContaBancariaRequest();
    }

    /**
     * Create an instance of {@link ImportarDelegacaoParametrizacaoCentroDeCustoRequest }
     * 
     */
    public ImportarDelegacaoParametrizacaoCentroDeCustoRequest createImportarDelegacaoParametrizacaoCentroDeCustoRequest() {
        return new ImportarDelegacaoParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link CadastrarControleClienteRequest }
     * 
     */
    public CadastrarControleClienteRequest createCadastrarControleClienteRequest() {
        return new CadastrarControleClienteRequest();
    }

    /**
     * Create an instance of {@link CadastrarUnidadeNegocioRequest }
     * 
     */
    public CadastrarUnidadeNegocioRequest createCadastrarUnidadeNegocioRequest() {
        return new CadastrarUnidadeNegocioRequest();
    }

    /**
     * Create an instance of {@link ImportarFaturaCartaoCreditoRequest }
     * 
     */
    public ImportarFaturaCartaoCreditoRequest createImportarFaturaCartaoCreditoRequest() {
        return new ImportarFaturaCartaoCreditoRequest();
    }

    /**
     * Create an instance of {@link PesquisarAdiantamentoRequest }
     * 
     */
    public PesquisarAdiantamentoRequest createPesquisarAdiantamentoRequest() {
        return new PesquisarAdiantamentoRequest();
    }

    /**
     * Create an instance of {@link PesquisarRelatorioDespesasRequest }
     * 
     */
    public PesquisarRelatorioDespesasRequest createPesquisarRelatorioDespesasRequest() {
        return new PesquisarRelatorioDespesasRequest();
    }

    /**
     * Create an instance of {@link ImportarDespesaRequest }
     * 
     */
    public ImportarDespesaRequest createImportarDespesaRequest() {
        return new ImportarDespesaRequest();
    }

    /**
     * Create an instance of {@link LiberarAdiantamentoRequest }
     * 
     */
    public LiberarAdiantamentoRequest createLiberarAdiantamentoRequest() {
        return new LiberarAdiantamentoRequest();
    }

    /**
     * Create an instance of {@link ContabilizarRelatorioDespesasRequest }
     * 
     */
    public ContabilizarRelatorioDespesasRequest createContabilizarRelatorioDespesasRequest() {
        return new ContabilizarRelatorioDespesasRequest();
    }

    /**
     * Create an instance of {@link PesquisarLogsAcessoRequest }
     * 
     */
    public PesquisarLogsAcessoRequest createPesquisarLogsAcessoRequest() {
        return new PesquisarLogsAcessoRequest();
    }

    /**
     * Create an instance of {@link ListarCentroDeCustoRequest }
     * 
     */
    public ListarCentroDeCustoRequest createListarCentroDeCustoRequest() {
        return new ListarCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link ListarSubCentroDeCustoRequest }
     * 
     */
    public ListarSubCentroDeCustoRequest createListarSubCentroDeCustoRequest() {
        return new ListarSubCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link ListarParametrizacaoCentroDeCustoRequest }
     * 
     */
    public ListarParametrizacaoCentroDeCustoRequest createListarParametrizacaoCentroDeCustoRequest() {
        return new ListarParametrizacaoCentroDeCustoRequest();
    }

    /**
     * Create an instance of {@link PesquisarConciliacaoCartaoRequest }
     * 
     */
    public PesquisarConciliacaoCartaoRequest createPesquisarConciliacaoCartaoRequest() {
        return new PesquisarConciliacaoCartaoRequest();
    }

    /**
     * Create an instance of {@link CancelarSolicitacaoRequest }
     * 
     */
    public CancelarSolicitacaoRequest createCancelarSolicitacaoRequest() {
        return new CancelarSolicitacaoRequest();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link PesquisarContaBancariaRequest }
     * 
     */
    public PesquisarContaBancariaRequest createPesquisarContaBancariaRequest() {
        return new PesquisarContaBancariaRequest();
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
