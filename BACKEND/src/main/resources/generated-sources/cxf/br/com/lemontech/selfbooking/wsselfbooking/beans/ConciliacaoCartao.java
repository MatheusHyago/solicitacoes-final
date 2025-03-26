
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusAprovacaoConciliacao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de conciliacaoCartao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="conciliacaoCartao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroProtocolo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nomeFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cnpjFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataReferencia" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="statusAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusAprovacaoConciliacao" minOccurs="0"/&gt;
 *         &lt;element name="dataAprovacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="transacoesCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}transacoesCartao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conciliacaoCartao", propOrder = {
    "numeroProtocolo",
    "nomeFornecedor",
    "cnpjFornecedor",
    "dataReferencia",
    "dataVencimento",
    "statusAprovacao",
    "dataAprovacao",
    "numeroCartao",
    "nomeTitular",
    "transacoesCartao"
})
public class ConciliacaoCartao {

    protected Integer numeroProtocolo;
    protected String nomeFornecedor;
    protected String cnpjFornecedor;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataReferencia;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVencimento;
    @XmlSchemaType(name = "string")
    protected StatusAprovacaoConciliacao statusAprovacao;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAprovacao;
    protected String numeroCartao;
    protected String nomeTitular;
    protected TransacoesCartao transacoesCartao;

    /**
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroProtocolo(Integer value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade nomeFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    /**
     * Define o valor da propriedade nomeFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFornecedor(String value) {
        this.nomeFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade cnpjFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    /**
     * Define o valor da propriedade cnpjFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjFornecedor(String value) {
        this.cnpjFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade dataReferencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReferencia() {
        return dataReferencia;
    }

    /**
     * Define o valor da propriedade dataReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReferencia(XMLGregorianCalendar value) {
        this.dataReferencia = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Define o valor da propriedade dataVencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Obtém o valor da propriedade statusAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link StatusAprovacaoConciliacao }
     *     
     */
    public StatusAprovacaoConciliacao getStatusAprovacao() {
        return statusAprovacao;
    }

    /**
     * Define o valor da propriedade statusAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAprovacaoConciliacao }
     *     
     */
    public void setStatusAprovacao(StatusAprovacaoConciliacao value) {
        this.statusAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade dataAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAprovacao() {
        return dataAprovacao;
    }

    /**
     * Define o valor da propriedade dataAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAprovacao(XMLGregorianCalendar value) {
        this.dataAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Define o valor da propriedade numeroCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartao(String value) {
        this.numeroCartao = value;
    }

    /**
     * Obtém o valor da propriedade nomeTitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * Define o valor da propriedade nomeTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTitular(String value) {
        this.nomeTitular = value;
    }

    /**
     * Obtém o valor da propriedade transacoesCartao.
     * 
     * @return
     *     possible object is
     *     {@link TransacoesCartao }
     *     
     */
    public TransacoesCartao getTransacoesCartao() {
        return transacoesCartao;
    }

    /**
     * Define o valor da propriedade transacoesCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link TransacoesCartao }
     *     
     */
    public void setTransacoesCartao(TransacoesCartao value) {
        this.transacoesCartao = value;
    }

}
