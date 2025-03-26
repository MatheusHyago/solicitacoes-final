
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="formaPagamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="formaPagameno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vencimentoCartao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numeroRequisicaoGov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumTipoFormaPagamento" minOccurs="0"/&gt;
 *         &lt;element name="VCN" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fornecedorVCN" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumFornecedorVCN" minOccurs="0"/&gt;
 *         &lt;element name="VCNAgencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="codigoConvenioVCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titularCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenciaCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCartaoMascarado6d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formaPagamento", propOrder = {
    "autorizacao",
    "numero",
    "parcelas",
    "valor",
    "formaPagameno",
    "vencimentoCartao",
    "numeroRequisicaoGov",
    "tipo",
    "vcn",
    "fornecedorVCN",
    "vcnAgencia",
    "codigoConvenioVCN",
    "titularCartao",
    "referenciaCartao",
    "numeroCartaoMascarado6D"
})
public class FormaPagamento {

    protected String autorizacao;
    protected String numero;
    protected Integer parcelas;
    protected Double valor;
    @XmlElement(required = true)
    protected String formaPagameno;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vencimentoCartao;
    protected String numeroRequisicaoGov;
    @XmlSchemaType(name = "string")
    protected EnumTipoFormaPagamento tipo;
    @XmlElement(name = "VCN")
    protected Boolean vcn;
    @XmlSchemaType(name = "string")
    protected EnumFornecedorVCN fornecedorVCN;
    @XmlElement(name = "VCNAgencia")
    protected Boolean vcnAgencia;
    protected String codigoConvenioVCN;
    protected String titularCartao;
    protected String referenciaCartao;
    @XmlElement(name = "numeroCartaoMascarado6d")
    protected String numeroCartaoMascarado6D;

    /**
     * Obtém o valor da propriedade autorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacao() {
        return autorizacao;
    }

    /**
     * Define o valor da propriedade autorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacao(String value) {
        this.autorizacao = value;
    }

    /**
     * Obtém o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obtém o valor da propriedade parcelas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParcelas() {
        return parcelas;
    }

    /**
     * Define o valor da propriedade parcelas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParcelas(Integer value) {
        this.parcelas = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

    /**
     * Obtém o valor da propriedade formaPagameno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagameno() {
        return formaPagameno;
    }

    /**
     * Define o valor da propriedade formaPagameno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagameno(String value) {
        this.formaPagameno = value;
    }

    /**
     * Obtém o valor da propriedade vencimentoCartao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoCartao() {
        return vencimentoCartao;
    }

    /**
     * Define o valor da propriedade vencimentoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoCartao(XMLGregorianCalendar value) {
        this.vencimentoCartao = value;
    }

    /**
     * Obtém o valor da propriedade numeroRequisicaoGov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRequisicaoGov() {
        return numeroRequisicaoGov;
    }

    /**
     * Define o valor da propriedade numeroRequisicaoGov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRequisicaoGov(String value) {
        this.numeroRequisicaoGov = value;
    }

    /**
     * Obtém o valor da propriedade tipo.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoFormaPagamento }
     *     
     */
    public EnumTipoFormaPagamento getTipo() {
        return tipo;
    }

    /**
     * Define o valor da propriedade tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoFormaPagamento }
     *     
     */
    public void setTipo(EnumTipoFormaPagamento value) {
        this.tipo = value;
    }

    /**
     * Obtém o valor da propriedade vcn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVCN() {
        return vcn;
    }

    /**
     * Define o valor da propriedade vcn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVCN(Boolean value) {
        this.vcn = value;
    }

    /**
     * Obtém o valor da propriedade fornecedorVCN.
     * 
     * @return
     *     possible object is
     *     {@link EnumFornecedorVCN }
     *     
     */
    public EnumFornecedorVCN getFornecedorVCN() {
        return fornecedorVCN;
    }

    /**
     * Define o valor da propriedade fornecedorVCN.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumFornecedorVCN }
     *     
     */
    public void setFornecedorVCN(EnumFornecedorVCN value) {
        this.fornecedorVCN = value;
    }

    /**
     * Obtém o valor da propriedade vcnAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVCNAgencia() {
        return vcnAgencia;
    }

    /**
     * Define o valor da propriedade vcnAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVCNAgencia(Boolean value) {
        this.vcnAgencia = value;
    }

    /**
     * Obtém o valor da propriedade codigoConvenioVCN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoConvenioVCN() {
        return codigoConvenioVCN;
    }

    /**
     * Define o valor da propriedade codigoConvenioVCN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoConvenioVCN(String value) {
        this.codigoConvenioVCN = value;
    }

    /**
     * Obtém o valor da propriedade titularCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitularCartao() {
        return titularCartao;
    }

    /**
     * Define o valor da propriedade titularCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitularCartao(String value) {
        this.titularCartao = value;
    }

    /**
     * Obtém o valor da propriedade referenciaCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCartao() {
        return referenciaCartao;
    }

    /**
     * Define o valor da propriedade referenciaCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCartao(String value) {
        this.referenciaCartao = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartaoMascarado6D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartaoMascarado6D() {
        return numeroCartaoMascarado6D;
    }

    /**
     * Define o valor da propriedade numeroCartaoMascarado6D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartaoMascarado6D(String value) {
        this.numeroCartaoMascarado6D = value;
    }

}
