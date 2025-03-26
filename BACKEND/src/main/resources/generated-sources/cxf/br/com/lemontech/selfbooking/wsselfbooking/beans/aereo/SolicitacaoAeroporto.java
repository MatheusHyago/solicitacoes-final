
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiro;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacaoAeroporto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacaoAeroporto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSolicitacaoAeroporto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="usuarioCriador" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/&gt;
 *         &lt;element name="usuarioConcluiu" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/&gt;
 *         &lt;element name="usuarioCancelou" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" minOccurs="0"/&gt;
 *         &lt;element name="baseAtendimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}baseAtendimento" minOccurs="0"/&gt;
 *         &lt;element name="statusSolicitacaoAeroporto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}statusSolicitacaoAeroporto" minOccurs="0"/&gt;
 *         &lt;element name="tipoAtendimentoAeroporto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}tipoAtendimentoAeroporto" minOccurs="0"/&gt;
 *         &lt;element name="obsConsultor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsAtendente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCriacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataFinalizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="opcaoAtendimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/aereo}opcaoAtendimento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaoAeroporto", propOrder = {
    "idSolicitacaoAeroporto",
    "usuarioCriador",
    "usuarioConcluiu",
    "usuarioCancelou",
    "baseAtendimento",
    "statusSolicitacaoAeroporto",
    "tipoAtendimentoAeroporto",
    "obsConsultor",
    "obsAtendente",
    "dataCriacao",
    "dataFinalizacao",
    "dataCancelamento",
    "opcaoAtendimento"
})
public class SolicitacaoAeroporto {

    protected Integer idSolicitacaoAeroporto;
    protected Passageiro usuarioCriador;
    protected Passageiro usuarioConcluiu;
    protected Passageiro usuarioCancelou;
    protected BaseAtendimento baseAtendimento;
    @XmlSchemaType(name = "string")
    protected StatusSolicitacaoAeroporto statusSolicitacaoAeroporto;
    @XmlSchemaType(name = "string")
    protected TipoAtendimentoAeroporto tipoAtendimentoAeroporto;
    protected String obsConsultor;
    protected String obsAtendente;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinalizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamento;
    @XmlSchemaType(name = "string")
    protected OpcaoAtendimento opcaoAtendimento;

    /**
     * Obtém o valor da propriedade idSolicitacaoAeroporto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitacaoAeroporto() {
        return idSolicitacaoAeroporto;
    }

    /**
     * Define o valor da propriedade idSolicitacaoAeroporto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitacaoAeroporto(Integer value) {
        this.idSolicitacaoAeroporto = value;
    }

    /**
     * Obtém o valor da propriedade usuarioCriador.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getUsuarioCriador() {
        return usuarioCriador;
    }

    /**
     * Define o valor da propriedade usuarioCriador.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setUsuarioCriador(Passageiro value) {
        this.usuarioCriador = value;
    }

    /**
     * Obtém o valor da propriedade usuarioConcluiu.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getUsuarioConcluiu() {
        return usuarioConcluiu;
    }

    /**
     * Define o valor da propriedade usuarioConcluiu.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setUsuarioConcluiu(Passageiro value) {
        this.usuarioConcluiu = value;
    }

    /**
     * Obtém o valor da propriedade usuarioCancelou.
     * 
     * @return
     *     possible object is
     *     {@link Passageiro }
     *     
     */
    public Passageiro getUsuarioCancelou() {
        return usuarioCancelou;
    }

    /**
     * Define o valor da propriedade usuarioCancelou.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiro }
     *     
     */
    public void setUsuarioCancelou(Passageiro value) {
        this.usuarioCancelou = value;
    }

    /**
     * Obtém o valor da propriedade baseAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link BaseAtendimento }
     *     
     */
    public BaseAtendimento getBaseAtendimento() {
        return baseAtendimento;
    }

    /**
     * Define o valor da propriedade baseAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseAtendimento }
     *     
     */
    public void setBaseAtendimento(BaseAtendimento value) {
        this.baseAtendimento = value;
    }

    /**
     * Obtém o valor da propriedade statusSolicitacaoAeroporto.
     * 
     * @return
     *     possible object is
     *     {@link StatusSolicitacaoAeroporto }
     *     
     */
    public StatusSolicitacaoAeroporto getStatusSolicitacaoAeroporto() {
        return statusSolicitacaoAeroporto;
    }

    /**
     * Define o valor da propriedade statusSolicitacaoAeroporto.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusSolicitacaoAeroporto }
     *     
     */
    public void setStatusSolicitacaoAeroporto(StatusSolicitacaoAeroporto value) {
        this.statusSolicitacaoAeroporto = value;
    }

    /**
     * Obtém o valor da propriedade tipoAtendimentoAeroporto.
     * 
     * @return
     *     possible object is
     *     {@link TipoAtendimentoAeroporto }
     *     
     */
    public TipoAtendimentoAeroporto getTipoAtendimentoAeroporto() {
        return tipoAtendimentoAeroporto;
    }

    /**
     * Define o valor da propriedade tipoAtendimentoAeroporto.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAtendimentoAeroporto }
     *     
     */
    public void setTipoAtendimentoAeroporto(TipoAtendimentoAeroporto value) {
        this.tipoAtendimentoAeroporto = value;
    }

    /**
     * Obtém o valor da propriedade obsConsultor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsConsultor() {
        return obsConsultor;
    }

    /**
     * Define o valor da propriedade obsConsultor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsConsultor(String value) {
        this.obsConsultor = value;
    }

    /**
     * Obtém o valor da propriedade obsAtendente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsAtendente() {
        return obsAtendente;
    }

    /**
     * Define o valor da propriedade obsAtendente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsAtendente(String value) {
        this.obsAtendente = value;
    }

    /**
     * Obtém o valor da propriedade dataCriacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Define o valor da propriedade dataCriacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Obtém o valor da propriedade dataFinalizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    /**
     * Define o valor da propriedade dataFinalizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalizacao(XMLGregorianCalendar value) {
        this.dataFinalizacao = value;
    }

    /**
     * Obtém o valor da propriedade dataCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * Define o valor da propriedade dataCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamento(XMLGregorianCalendar value) {
        this.dataCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade opcaoAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link OpcaoAtendimento }
     *     
     */
    public OpcaoAtendimento getOpcaoAtendimento() {
        return opcaoAtendimento;
    }

    /**
     * Define o valor da propriedade opcaoAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcaoAtendimento }
     *     
     */
    public void setOpcaoAtendimento(OpcaoAtendimento value) {
        this.opcaoAtendimento = value;
    }

}
