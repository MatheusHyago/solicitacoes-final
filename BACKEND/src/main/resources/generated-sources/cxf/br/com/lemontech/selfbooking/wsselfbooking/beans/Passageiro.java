
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Sexo;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDocumento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de passageiro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="passageiro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idPassageiro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sobrenome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="matricula" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}matricula" minOccurs="0"/&gt;
 *         &lt;element name="departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPassageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoPassageiro" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoDocumento" minOccurs="0"/&gt;
 *         &lt;element name="valorDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}email" minOccurs="0"/&gt;
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="sexo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}sexo" minOccurs="0"/&gt;
 *         &lt;element name="empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dddTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dddCel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="terceiro" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="acompanhante" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeCompleto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logAs" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}logAs" minOccurs="0"/&gt;
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="centrocusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef" minOccurs="0"/&gt;
 *         &lt;element name="nivelHierarquico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="politicaDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="possuiCartao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="comprarBagagens" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="comprarAssentos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passageiro", propOrder = {
    "idPassageiro",
    "nome",
    "sobrenome",
    "matricula",
    "departamento",
    "tipoPassageiro",
    "tipoDocumento",
    "valorDocumento",
    "email",
    "dataNascimento",
    "sexo",
    "empresa",
    "telefone",
    "celular",
    "dddTel",
    "dddCel",
    "terceiro",
    "acompanhante",
    "cpf",
    "nomeCompleto",
    "logAs",
    "vip",
    "cargo",
    "rg",
    "centrocusto",
    "nivelHierarquico",
    "username",
    "atividade",
    "politicaDespesa",
    "possuiCartao",
    "comprarBagagens",
    "comprarAssentos"
})
public class Passageiro {

    protected int idPassageiro;
    protected String nome;
    protected String sobrenome;
    protected String matricula;
    protected String departamento;
    @XmlSchemaType(name = "string")
    protected TipoPassageiro tipoPassageiro;
    @XmlSchemaType(name = "string")
    protected TipoDocumento tipoDocumento;
    protected String valorDocumento;
    protected String email;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    @XmlSchemaType(name = "string")
    protected Sexo sexo;
    protected String empresa;
    protected String telefone;
    protected String celular;
    protected String dddTel;
    protected String dddCel;
    protected Boolean terceiro;
    protected Boolean acompanhante;
    protected String cpf;
    protected String nomeCompleto;
    protected LogAs logAs;
    protected Boolean vip;
    protected String cargo;
    protected String rg;
    protected CentroDeCustoRef centrocusto;
    protected Integer nivelHierarquico;
    protected String username;
    protected String atividade;
    protected String politicaDespesa;
    protected Boolean possuiCartao;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarBagagens;
    @XmlElement(defaultValue = "false")
    protected Boolean comprarAssentos;

    /**
     * Obtém o valor da propriedade idPassageiro.
     * 
     */
    public int getIdPassageiro() {
        return idPassageiro;
    }

    /**
     * Define o valor da propriedade idPassageiro.
     * 
     */
    public void setIdPassageiro(int value) {
        this.idPassageiro = value;
    }

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
     * Obtém o valor da propriedade sobrenome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Define o valor da propriedade sobrenome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobrenome(String value) {
        this.sobrenome = value;
    }

    /**
     * Obtém o valor da propriedade matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
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
     * Obtém o valor da propriedade tipoPassageiro.
     * 
     * @return
     *     possible object is
     *     {@link TipoPassageiro }
     *     
     */
    public TipoPassageiro getTipoPassageiro() {
        return tipoPassageiro;
    }

    /**
     * Define o valor da propriedade tipoPassageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPassageiro }
     *     
     */
    public void setTipoPassageiro(TipoPassageiro value) {
        this.tipoPassageiro = value;
    }

    /**
     * Obtém o valor da propriedade tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumento }
     *     
     */
    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define o valor da propriedade tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumento }
     *     
     */
    public void setTipoDocumento(TipoDocumento value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtém o valor da propriedade valorDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorDocumento() {
        return valorDocumento;
    }

    /**
     * Define o valor da propriedade valorDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorDocumento(String value) {
        this.valorDocumento = value;
    }

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Obtém o valor da propriedade empresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Define o valor da propriedade empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

    /**
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o valor da propriedade celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtém o valor da propriedade dddTel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddTel() {
        return dddTel;
    }

    /**
     * Define o valor da propriedade dddTel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddTel(String value) {
        this.dddTel = value;
    }

    /**
     * Obtém o valor da propriedade dddCel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddCel() {
        return dddCel;
    }

    /**
     * Define o valor da propriedade dddCel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddCel(String value) {
        this.dddCel = value;
    }

    /**
     * Obtém o valor da propriedade terceiro.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerceiro() {
        return terceiro;
    }

    /**
     * Define o valor da propriedade terceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerceiro(Boolean value) {
        this.terceiro = value;
    }

    /**
     * Obtém o valor da propriedade acompanhante.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcompanhante() {
        return acompanhante;
    }

    /**
     * Define o valor da propriedade acompanhante.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcompanhante(Boolean value) {
        this.acompanhante = value;
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
     * Obtém o valor da propriedade nomeCompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Define o valor da propriedade nomeCompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCompleto(String value) {
        this.nomeCompleto = value;
    }

    /**
     * Obtém o valor da propriedade logAs.
     * 
     * @return
     *     possible object is
     *     {@link LogAs }
     *     
     */
    public LogAs getLogAs() {
        return logAs;
    }

    /**
     * Define o valor da propriedade logAs.
     * 
     * @param value
     *     allowed object is
     *     {@link LogAs }
     *     
     */
    public void setLogAs(LogAs value) {
        this.logAs = value;
    }

    /**
     * Obtém o valor da propriedade vip.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVip() {
        return vip;
    }

    /**
     * Define o valor da propriedade vip.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVip(Boolean value) {
        this.vip = value;
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
     * Obtém o valor da propriedade rg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRg() {
        return rg;
    }

    /**
     * Define o valor da propriedade rg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRg(String value) {
        this.rg = value;
    }

    /**
     * Obtém o valor da propriedade centrocusto.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentrocusto() {
        return centrocusto;
    }

    /**
     * Define o valor da propriedade centrocusto.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentrocusto(CentroDeCustoRef value) {
        this.centrocusto = value;
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
     * Obtém o valor da propriedade username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Define o valor da propriedade username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
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

}
