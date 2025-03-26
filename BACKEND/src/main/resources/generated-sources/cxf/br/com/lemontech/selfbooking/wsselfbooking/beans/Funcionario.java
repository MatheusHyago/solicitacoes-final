
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de funcionario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="funcionario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nome" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/&gt;
 *         &lt;element name="departamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *         &lt;element name="cargo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *         &lt;element name="cpf" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="11"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="passaporte" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}sexo"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/&gt;
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="contato" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contato"/&gt;
 *         &lt;element name="login" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}login" minOccurs="0"/&gt;
 *         &lt;element name="bypassAprovacaoNacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="bypassAprovacaoInternacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="configuracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}configuracaoFuncionario"/&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="nomeaAgenciaPreferencial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *         &lt;element name="atividade" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="dataAdmissao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nomeSocial" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *         &lt;element name="saldoFundoFixo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="possuiCartao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funcionario", propOrder = {
    "nome",
    "departamento",
    "cargo",
    "cpf",
    "passaporte",
    "dataNascimento",
    "sexo",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "contato",
    "login",
    "bypassAprovacaoNacional",
    "bypassAprovacaoInternacional",
    "configuracao",
    "ativo",
    "nomeaAgenciaPreferencial",
    "atividade",
    "idUsuario",
    "dataAdmissao",
    "nomeSocial",
    "saldoFundoFixo",
    "nacionalidade",
    "possuiCartao"
})
public class Funcionario
    extends FuncionarioRef
{

    @XmlElement(required = true)
    protected String nome;
    protected String departamento;
    protected String cargo;
    protected String cpf;
    protected String passaporte;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Sexo sexo;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    @XmlElement(required = true)
    protected Contato contato;
    protected Login login;
    protected Boolean bypassAprovacaoNacional;
    protected Boolean bypassAprovacaoInternacional;
    @XmlElement(required = true)
    protected ConfiguracaoFuncionario configuracao;
    protected boolean ativo;
    protected String nomeaAgenciaPreferencial;
    protected String atividade;
    protected Integer idUsuario;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAdmissao;
    protected String nomeSocial;
    protected Double saldoFundoFixo;
    protected String nacionalidade;
    @XmlElement(defaultValue = "false")
    protected Boolean possuiCartao;

    /**
     * Obtém o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obtém o valor da propriedade departamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Define o valor da propriedade departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Obtém o valor da propriedade cargo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o valor da propriedade cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * Obtém o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Obtém o valor da propriedade passaporte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassaporte() {
        return passaporte;
    }

    /**
     * Define o valor da propriedade passaporte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassaporte(String value) {
        this.passaporte = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Define o valor da propriedade dataNascimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Obtém o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link Sexo }
     *     
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link Sexo }
     *     
     */
    public void setSexo(Sexo value) {
        this.sexo = value;
    }

    /**
     * Obtém o valor da propriedade centroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Define o valor da propriedade centroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade subCentroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Define o valor da propriedade subCentroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade contato.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * Define o valor da propriedade contato.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContato(Contato value) {
        this.contato = value;
    }

    /**
     * Obtém o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link Login }
     *     
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link Login }
     *     
     */
    public void setLogin(Login value) {
        this.login = value;
    }

    /**
     * Obtém o valor da propriedade bypassAprovacaoNacional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAprovacaoNacional() {
        return bypassAprovacaoNacional;
    }

    /**
     * Define o valor da propriedade bypassAprovacaoNacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAprovacaoNacional(Boolean value) {
        this.bypassAprovacaoNacional = value;
    }

    /**
     * Obtém o valor da propriedade bypassAprovacaoInternacional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBypassAprovacaoInternacional() {
        return bypassAprovacaoInternacional;
    }

    /**
     * Define o valor da propriedade bypassAprovacaoInternacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBypassAprovacaoInternacional(Boolean value) {
        this.bypassAprovacaoInternacional = value;
    }

    /**
     * Obtém o valor da propriedade configuracao.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoFuncionario }
     *     
     */
    public ConfiguracaoFuncionario getConfiguracao() {
        return configuracao;
    }

    /**
     * Define o valor da propriedade configuracao.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoFuncionario }
     *     
     */
    public void setConfiguracao(ConfiguracaoFuncionario value) {
        this.configuracao = value;
    }

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade nomeaAgenciaPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeaAgenciaPreferencial() {
        return nomeaAgenciaPreferencial;
    }

    /**
     * Define o valor da propriedade nomeaAgenciaPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeaAgenciaPreferencial(String value) {
        this.nomeaAgenciaPreferencial = value;
    }

    /**
     * Obtém o valor da propriedade atividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtividade() {
        return atividade;
    }

    /**
     * Define o valor da propriedade atividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtividade(String value) {
        this.atividade = value;
    }

    /**
     * Obtém o valor da propriedade idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define o valor da propriedade idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuario(Integer value) {
        this.idUsuario = value;
    }

    /**
     * Obtém o valor da propriedade dataAdmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAdmissao() {
        return dataAdmissao;
    }

    /**
     * Define o valor da propriedade dataAdmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAdmissao(XMLGregorianCalendar value) {
        this.dataAdmissao = value;
    }

    /**
     * Obtém o valor da propriedade nomeSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSocial() {
        return nomeSocial;
    }

    /**
     * Define o valor da propriedade nomeSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSocial(String value) {
        this.nomeSocial = value;
    }

    /**
     * Obtém o valor da propriedade saldoFundoFixo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSaldoFundoFixo() {
        return saldoFundoFixo;
    }

    /**
     * Define o valor da propriedade saldoFundoFixo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSaldoFundoFixo(Double value) {
        this.saldoFundoFixo = value;
    }

    /**
     * Obtém o valor da propriedade nacionalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Define o valor da propriedade nacionalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidade(String value) {
        this.nacionalidade = value;
    }

    /**
     * Obtém o valor da propriedade possuiCartao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPossuiCartao() {
        return possuiCartao;
    }

    /**
     * Define o valor da propriedade possuiCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPossuiCartao(Boolean value) {
        this.possuiCartao = value;
    }

}
