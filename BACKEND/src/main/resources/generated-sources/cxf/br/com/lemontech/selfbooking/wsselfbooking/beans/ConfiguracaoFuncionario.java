
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.LinguaPadrao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilAereo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilFuncionario;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCadastroFuncionario;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de configuracaoFuncionario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="configuracaoFuncionario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoAprova" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="solicitaParaTodos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="preAprovaTodos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="forcaDeVenda" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nivelHierarquico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoCadastro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCadastroFuncionario" minOccurs="0"/&gt;
 *         &lt;element name="categoriaHospedagem" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="perfilFuncionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilFuncionario"/&gt;
 *         &lt;element name="perfilAereo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilAereo" minOccurs="0"/&gt;
 *         &lt;element name="perfilHospedagem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilHospedagem" minOccurs="0"/&gt;
 *         &lt;element name="visualizaSaldoBudgetAprovacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="aprovaBudgetNegativo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="usuarioTerceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="antecedenciaViagemNacional" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="antecedenciaViagemInternacional" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="politicaDespesa" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="bloqueiaSolicitarViagem" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="podeSerAprovadoSemSaldoBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bloqueiaSolicitarViagemAdiantamento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="permiteSolicitarCarro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="politicaPercurso" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maximoSvAdiantamentoAberto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="recebeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="permiteNotificacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="utilizaUsuarioLogado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="permiteCadastrarClienteProjetoReembolsavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="excecaoRegraRestricaoHotelRegional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bloqueiaUsuarioParaViajar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="permiteSelecionarAgencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bloqueiaSolicitarViagemPrestacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bloqueiaAutoAprovacaoDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="linguaPadrao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}linguaPadrao" minOccurs="0"/&gt;
 *         &lt;element name="emailEnvioCopiaDeVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bypassAprovacaoNacionalSomenteDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="comprarBagagens" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="comprarAssentos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="categoriaLocacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuracaoFuncionario", propOrder = {
    "autoAprova",
    "solicitaParaTodos",
    "preAprovaTodos",
    "forcaDeVenda",
    "nivelHierarquico",
    "tipoCadastro",
    "categoriaHospedagem",
    "perfilFuncionario",
    "perfilAereo",
    "perfilHospedagem",
    "visualizaSaldoBudgetAprovacao",
    "aprovaBudgetNegativo",
    "usuarioTerceiro",
    "antecedenciaViagemNacional",
    "antecedenciaViagemInternacional",
    "politicaDespesa",
    "bloqueiaSolicitarViagem",
    "podeSerAprovadoSemSaldoBudget",
    "bloqueiaSolicitarViagemAdiantamento",
    "permiteSolicitarCarro",
    "politicaPercurso",
    "maximoSvAdiantamentoAberto",
    "recebeEmail",
    "permiteNotificacaoFinanceiro",
    "utilizaUsuarioLogado",
    "permiteCadastrarClienteProjetoReembolsavel",
    "excecaoRegraRestricaoHotelRegional",
    "bloqueiaUsuarioParaViajar",
    "permiteSelecionarAgencia",
    "bloqueiaSolicitarViagemPrestacao",
    "bloqueiaAutoAprovacaoDentroDaPolitica",
    "linguaPadrao",
    "emailEnvioCopiaDeVoucher",
    "bypassAprovacaoNacionalSomenteDentroDaPolitica",
    "comprarBagagens",
    "comprarAssentos",
    "categoriaLocacao"
})
public class ConfiguracaoFuncionario {

    protected Boolean autoAprova;
    protected Boolean solicitaParaTodos;
    protected Boolean preAprovaTodos;
    @XmlElement(defaultValue = "false")
    protected Boolean forcaDeVenda;
    @XmlElement(defaultValue = "0")
    protected Integer nivelHierarquico;
    @XmlElement(defaultValue = "SELF_BOOKING")
    @XmlSchemaType(name = "string")
    protected TipoCadastroFuncionario tipoCadastro;
    protected String categoriaHospedagem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PerfilFuncionario perfilFuncionario;
    @XmlSchemaType(name = "string")
    protected PerfilAereo perfilAereo;
    @XmlSchemaType(name = "string")
    protected PerfilHospedagem perfilHospedagem;
    @XmlElement(defaultValue = "false")
    protected Boolean visualizaSaldoBudgetAprovacao;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaBudgetNegativo;
    @XmlElement(defaultValue = "false")
    protected Boolean usuarioTerceiro;
    protected Integer antecedenciaViagemNacional;
    protected Integer antecedenciaViagemInternacional;
    protected String politicaDespesa;
    protected Boolean bloqueiaSolicitarViagem;
    @XmlElement(defaultValue = "false")
    protected Boolean podeSerAprovadoSemSaldoBudget;
    protected Boolean bloqueiaSolicitarViagemAdiantamento;
    protected Boolean permiteSolicitarCarro;
    protected String politicaPercurso;
    @XmlElement(defaultValue = "0")
    protected Integer maximoSvAdiantamentoAberto;
    protected Boolean recebeEmail;
    protected Boolean permiteNotificacaoFinanceiro;
    protected Boolean utilizaUsuarioLogado;
    protected Boolean permiteCadastrarClienteProjetoReembolsavel;
    protected Boolean excecaoRegraRestricaoHotelRegional;
    protected Boolean bloqueiaUsuarioParaViajar;
    protected Boolean permiteSelecionarAgencia;
    protected Boolean bloqueiaSolicitarViagemPrestacao;
    protected Boolean bloqueiaAutoAprovacaoDentroDaPolitica;
    @XmlSchemaType(name = "string")
    protected LinguaPadrao linguaPadrao;
    protected String emailEnvioCopiaDeVoucher;
    protected Boolean bypassAprovacaoNacionalSomenteDentroDaPolitica;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarBagagens;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarAssentos;
    protected String categoriaLocacao;

    /**
     * Obtém o valor da propriedade autoAprova.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAprova() {
        return autoAprova;
    }

    /**
     * Define o valor da propriedade autoAprova.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAprova(Boolean value) {
        this.autoAprova = value;
    }

    /**
     * Obtém o valor da propriedade solicitaParaTodos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitaParaTodos() {
        return solicitaParaTodos;
    }

    /**
     * Define o valor da propriedade solicitaParaTodos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitaParaTodos(Boolean value) {
        this.solicitaParaTodos = value;
    }

    /**
     * Obtém o valor da propriedade preAprovaTodos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreAprovaTodos() {
        return preAprovaTodos;
    }

    /**
     * Define o valor da propriedade preAprovaTodos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreAprovaTodos(Boolean value) {
        this.preAprovaTodos = value;
    }

    /**
     * Obtém o valor da propriedade forcaDeVenda.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcaDeVenda() {
        return forcaDeVenda;
    }

    /**
     * Define o valor da propriedade forcaDeVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcaDeVenda(Boolean value) {
        this.forcaDeVenda = value;
    }

    /**
     * Obtém o valor da propriedade nivelHierarquico.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelHierarquico() {
        return nivelHierarquico;
    }

    /**
     * Define o valor da propriedade nivelHierarquico.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelHierarquico(Integer value) {
        this.nivelHierarquico = value;
    }

    /**
     * Obtém o valor da propriedade tipoCadastro.
     * 
     * @return
     *     possible object is
     *     {@link TipoCadastroFuncionario }
     *     
     */
    public TipoCadastroFuncionario getTipoCadastro() {
        return tipoCadastro;
    }

    /**
     * Define o valor da propriedade tipoCadastro.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCadastroFuncionario }
     *     
     */
    public void setTipoCadastro(TipoCadastroFuncionario value) {
        this.tipoCadastro = value;
    }

    /**
     * Obtém o valor da propriedade categoriaHospedagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaHospedagem() {
        return categoriaHospedagem;
    }

    /**
     * Define o valor da propriedade categoriaHospedagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaHospedagem(String value) {
        this.categoriaHospedagem = value;
    }

    /**
     * Obtém o valor da propriedade perfilFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link PerfilFuncionario }
     *     
     */
    public PerfilFuncionario getPerfilFuncionario() {
        return perfilFuncionario;
    }

    /**
     * Define o valor da propriedade perfilFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilFuncionario }
     *     
     */
    public void setPerfilFuncionario(PerfilFuncionario value) {
        this.perfilFuncionario = value;
    }

    /**
     * Obtém o valor da propriedade perfilAereo.
     * 
     * @return
     *     possible object is
     *     {@link PerfilAereo }
     *     
     */
    public PerfilAereo getPerfilAereo() {
        return perfilAereo;
    }

    /**
     * Define o valor da propriedade perfilAereo.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilAereo }
     *     
     */
    public void setPerfilAereo(PerfilAereo value) {
        this.perfilAereo = value;
    }

    /**
     * Obtém o valor da propriedade perfilHospedagem.
     * 
     * @return
     *     possible object is
     *     {@link PerfilHospedagem }
     *     
     */
    public PerfilHospedagem getPerfilHospedagem() {
        return perfilHospedagem;
    }

    /**
     * Define o valor da propriedade perfilHospedagem.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilHospedagem }
     *     
     */
    public void setPerfilHospedagem(PerfilHospedagem value) {
        this.perfilHospedagem = value;
    }

    /**
     * Obtém o valor da propriedade visualizaSaldoBudgetAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisualizaSaldoBudgetAprovacao() {
        return visualizaSaldoBudgetAprovacao;
    }

    /**
     * Define o valor da propriedade visualizaSaldoBudgetAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisualizaSaldoBudgetAprovacao(Boolean value) {
        this.visualizaSaldoBudgetAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade aprovaBudgetNegativo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaBudgetNegativo() {
        return aprovaBudgetNegativo;
    }

    /**
     * Define o valor da propriedade aprovaBudgetNegativo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaBudgetNegativo(Boolean value) {
        this.aprovaBudgetNegativo = value;
    }

    /**
     * Obtém o valor da propriedade usuarioTerceiro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsuarioTerceiro() {
        return usuarioTerceiro;
    }

    /**
     * Define o valor da propriedade usuarioTerceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsuarioTerceiro(Boolean value) {
        this.usuarioTerceiro = value;
    }

    /**
     * Obtém o valor da propriedade antecedenciaViagemNacional.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntecedenciaViagemNacional() {
        return antecedenciaViagemNacional;
    }

    /**
     * Define o valor da propriedade antecedenciaViagemNacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntecedenciaViagemNacional(Integer value) {
        this.antecedenciaViagemNacional = value;
    }

    /**
     * Obtém o valor da propriedade antecedenciaViagemInternacional.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntecedenciaViagemInternacional() {
        return antecedenciaViagemInternacional;
    }

    /**
     * Define o valor da propriedade antecedenciaViagemInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntecedenciaViagemInternacional(Integer value) {
        this.antecedenciaViagemInternacional = value;
    }

    /**
     * Obtém o valor da propriedade politicaDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticaDespesa() {
        return politicaDespesa;
    }

    /**
     * Define o valor da propriedade politicaDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticaDespesa(String value) {
        this.politicaDespesa = value;
    }

    /**
     * Obtém o valor da propriedade bloqueiaSolicitarViagem.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaSolicitarViagem() {
        return bloqueiaSolicitarViagem;
    }

    /**
     * Define o valor da propriedade bloqueiaSolicitarViagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaSolicitarViagem(Boolean value) {
        this.bloqueiaSolicitarViagem = value;
    }

    /**
     * Obtém o valor da propriedade podeSerAprovadoSemSaldoBudget.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPodeSerAprovadoSemSaldoBudget() {
        return podeSerAprovadoSemSaldoBudget;
    }

    /**
     * Define o valor da propriedade podeSerAprovadoSemSaldoBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPodeSerAprovadoSemSaldoBudget(Boolean value) {
        this.podeSerAprovadoSemSaldoBudget = value;
    }

    /**
     * Obtém o valor da propriedade bloqueiaSolicitarViagemAdiantamento.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaSolicitarViagemAdiantamento() {
        return bloqueiaSolicitarViagemAdiantamento;
    }

    /**
     * Define o valor da propriedade bloqueiaSolicitarViagemAdiantamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaSolicitarViagemAdiantamento(Boolean value) {
        this.bloqueiaSolicitarViagemAdiantamento = value;
    }

    /**
     * Obtém o valor da propriedade permiteSolicitarCarro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteSolicitarCarro() {
        return permiteSolicitarCarro;
    }

    /**
     * Define o valor da propriedade permiteSolicitarCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteSolicitarCarro(Boolean value) {
        this.permiteSolicitarCarro = value;
    }

    /**
     * Obtém o valor da propriedade politicaPercurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoliticaPercurso() {
        return politicaPercurso;
    }

    /**
     * Define o valor da propriedade politicaPercurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoliticaPercurso(String value) {
        this.politicaPercurso = value;
    }

    /**
     * Obtém o valor da propriedade maximoSvAdiantamentoAberto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximoSvAdiantamentoAberto() {
        return maximoSvAdiantamentoAberto;
    }

    /**
     * Define o valor da propriedade maximoSvAdiantamentoAberto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximoSvAdiantamentoAberto(Integer value) {
        this.maximoSvAdiantamentoAberto = value;
    }

    /**
     * Obtém o valor da propriedade recebeEmail.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecebeEmail() {
        return recebeEmail;
    }

    /**
     * Define o valor da propriedade recebeEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecebeEmail(Boolean value) {
        this.recebeEmail = value;
    }

    /**
     * Obtém o valor da propriedade permiteNotificacaoFinanceiro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteNotificacaoFinanceiro() {
        return permiteNotificacaoFinanceiro;
    }

    /**
     * Define o valor da propriedade permiteNotificacaoFinanceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteNotificacaoFinanceiro(Boolean value) {
        this.permiteNotificacaoFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade utilizaUsuarioLogado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtilizaUsuarioLogado() {
        return utilizaUsuarioLogado;
    }

    /**
     * Define o valor da propriedade utilizaUsuarioLogado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtilizaUsuarioLogado(Boolean value) {
        this.utilizaUsuarioLogado = value;
    }

    /**
     * Obtém o valor da propriedade permiteCadastrarClienteProjetoReembolsavel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteCadastrarClienteProjetoReembolsavel() {
        return permiteCadastrarClienteProjetoReembolsavel;
    }

    /**
     * Define o valor da propriedade permiteCadastrarClienteProjetoReembolsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteCadastrarClienteProjetoReembolsavel(Boolean value) {
        this.permiteCadastrarClienteProjetoReembolsavel = value;
    }

    /**
     * Obtém o valor da propriedade excecaoRegraRestricaoHotelRegional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcecaoRegraRestricaoHotelRegional() {
        return excecaoRegraRestricaoHotelRegional;
    }

    /**
     * Define o valor da propriedade excecaoRegraRestricaoHotelRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcecaoRegraRestricaoHotelRegional(Boolean value) {
        this.excecaoRegraRestricaoHotelRegional = value;
    }

    /**
     * Obtém o valor da propriedade bloqueiaUsuarioParaViajar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaUsuarioParaViajar() {
        return bloqueiaUsuarioParaViajar;
    }

    /**
     * Define o valor da propriedade bloqueiaUsuarioParaViajar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaUsuarioParaViajar(Boolean value) {
        this.bloqueiaUsuarioParaViajar = value;
    }

    /**
     * Obtém o valor da propriedade permiteSelecionarAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteSelecionarAgencia() {
        return permiteSelecionarAgencia;
    }

    /**
     * Define o valor da propriedade permiteSelecionarAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteSelecionarAgencia(Boolean value) {
        this.permiteSelecionarAgencia = value;
    }

    /**
     * Obtém o valor da propriedade bloqueiaSolicitarViagemPrestacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaSolicitarViagemPrestacao() {
        return bloqueiaSolicitarViagemPrestacao;
    }

    /**
     * Define o valor da propriedade bloqueiaSolicitarViagemPrestacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaSolicitarViagemPrestacao(Boolean value) {
        this.bloqueiaSolicitarViagemPrestacao = value;
    }

    /**
     * Obtém o valor da propriedade bloqueiaAutoAprovacaoDentroDaPolitica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBloqueiaAutoAprovacaoDentroDaPolitica() {
        return bloqueiaAutoAprovacaoDentroDaPolitica;
    }

    /**
     * Define o valor da propriedade bloqueiaAutoAprovacaoDentroDaPolitica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBloqueiaAutoAprovacaoDentroDaPolitica(Boolean value) {
        this.bloqueiaAutoAprovacaoDentroDaPolitica = value;
    }

    /**
     * Obtém o valor da propriedade linguaPadrao.
     * 
     * @return
     *     possible object is
     *     {@link LinguaPadrao }
     *     
     */
    public LinguaPadrao getLinguaPadrao() {
        return linguaPadrao;
    }

    /**
     * Define o valor da propriedade linguaPadrao.
     * 
     * @param value
     *     allowed object is
     *     {@link LinguaPadrao }
     *     
     */
    public void setLinguaPadrao(LinguaPadrao value) {
        this.linguaPadrao = value;
    }

    /**
     * Obtém o valor da propriedade emailEnvioCopiaDeVoucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEnvioCopiaDeVoucher() {
        return emailEnvioCopiaDeVoucher;
    }

    /**
     * Define o valor da propriedade emailEnvioCopiaDeVoucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEnvioCopiaDeVoucher(String value) {
        this.emailEnvioCopiaDeVoucher = value;
    }

    /**
     * Obtém o valor da propriedade bypassAprovacaoNacionalSomenteDentroDaPolitica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAprovacaoNacionalSomenteDentroDaPolitica() {
        return bypassAprovacaoNacionalSomenteDentroDaPolitica;
    }

    /**
     * Define o valor da propriedade bypassAprovacaoNacionalSomenteDentroDaPolitica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAprovacaoNacionalSomenteDentroDaPolitica(Boolean value) {
        this.bypassAprovacaoNacionalSomenteDentroDaPolitica = value;
    }

    /**
     * Obtém o valor da propriedade comprarBagagens.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComprarBagagens() {
        return comprarBagagens;
    }

    /**
     * Define o valor da propriedade comprarBagagens.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComprarBagagens(Boolean value) {
        this.comprarBagagens = value;
    }

    /**
     * Obtém o valor da propriedade comprarAssentos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComprarAssentos() {
        return comprarAssentos;
    }

    /**
     * Define o valor da propriedade comprarAssentos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComprarAssentos(Boolean value) {
        this.comprarAssentos = value;
    }

    /**
     * Obtém o valor da propriedade categoriaLocacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaLocacao() {
        return categoriaLocacao;
    }

    /**
     * Define o valor da propriedade categoriaLocacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaLocacao(String value) {
        this.categoriaLocacao = value;
    }

}
