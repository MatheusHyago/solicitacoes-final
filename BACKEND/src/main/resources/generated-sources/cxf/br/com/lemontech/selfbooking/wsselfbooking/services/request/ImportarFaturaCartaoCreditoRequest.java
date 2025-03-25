
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoTransacaoCartao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de importarFaturaCartaoCreditoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="importarFaturaCartaoCreditoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoTransacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoTransacaoCartao"/&gt;
 *         &lt;element name="dataTransacao" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="valorTransacao" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="numeroAutorizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codCia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bilhete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorBilhete" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorTaxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campoGerencial1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campoGerencial2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campoGerencial3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campoGerencial4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="campoGerencial5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importarFaturaCartaoCreditoRequest", propOrder = {
    "tipoTransacao",
    "dataTransacao",
    "valorTransacao",
    "numeroAutorizacao",
    "codCia",
    "bilhete",
    "valorBilhete",
    "valorTaxa",
    "numeroCartao",
    "campoGerencial1",
    "campoGerencial2",
    "campoGerencial3",
    "campoGerencial4",
    "campoGerencial5"
})
public class ImportarFaturaCartaoCreditoRequest {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TipoTransacaoCartao tipoTransacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTransacao;
    protected double valorTransacao;
    protected Integer numeroAutorizacao;
    protected String codCia;
    protected String bilhete;
    protected Double valorBilhete;
    protected Double valorTaxa;
    protected String numeroCartao;
    protected String campoGerencial1;
    protected String campoGerencial2;
    protected String campoGerencial3;
    protected String campoGerencial4;
    protected String campoGerencial5;

    /**
     * Obtém o valor da propriedade tipoTransacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoTransacaoCartao }
     *     
     */
    public TipoTransacaoCartao getTipoTransacao() {
        return tipoTransacao;
    }

    /**
     * Define o valor da propriedade tipoTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTransacaoCartao }
     *     
     */
    public void setTipoTransacao(TipoTransacaoCartao value) {
        this.tipoTransacao = value;
    }

    /**
     * Obtém o valor da propriedade dataTransacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Define o valor da propriedade dataTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransacao(XMLGregorianCalendar value) {
        this.dataTransacao = value;
    }

    /**
     * Obtém o valor da propriedade valorTransacao.
     * 
     */
    public double getValorTransacao() {
        return valorTransacao;
    }

    /**
     * Define o valor da propriedade valorTransacao.
     * 
     */
    public void setValorTransacao(double value) {
        this.valorTransacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    /**
     * Define o valor da propriedade numeroAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroAutorizacao(Integer value) {
        this.numeroAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade codCia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCia() {
        return codCia;
    }

    /**
     * Define o valor da propriedade codCia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCia(String value) {
        this.codCia = value;
    }

    /**
     * Obtém o valor da propriedade bilhete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilhete() {
        return bilhete;
    }

    /**
     * Define o valor da propriedade bilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilhete(String value) {
        this.bilhete = value;
    }

    /**
     * Obtém o valor da propriedade valorBilhete.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorBilhete() {
        return valorBilhete;
    }

    /**
     * Define o valor da propriedade valorBilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorBilhete(Double value) {
        this.valorBilhete = value;
    }

    /**
     * Obtém o valor da propriedade valorTaxa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTaxa() {
        return valorTaxa;
    }

    /**
     * Define o valor da propriedade valorTaxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTaxa(Double value) {
        this.valorTaxa = value;
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
     * Obtém o valor da propriedade campoGerencial1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial1() {
        return campoGerencial1;
    }

    /**
     * Define o valor da propriedade campoGerencial1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial1(String value) {
        this.campoGerencial1 = value;
    }

    /**
     * Obtém o valor da propriedade campoGerencial2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial2() {
        return campoGerencial2;
    }

    /**
     * Define o valor da propriedade campoGerencial2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial2(String value) {
        this.campoGerencial2 = value;
    }

    /**
     * Obtém o valor da propriedade campoGerencial3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial3() {
        return campoGerencial3;
    }

    /**
     * Define o valor da propriedade campoGerencial3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial3(String value) {
        this.campoGerencial3 = value;
    }

    /**
     * Obtém o valor da propriedade campoGerencial4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial4() {
        return campoGerencial4;
    }

    /**
     * Define o valor da propriedade campoGerencial4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial4(String value) {
        this.campoGerencial4 = value;
    }

    /**
     * Obtém o valor da propriedade campoGerencial5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampoGerencial5() {
        return campoGerencial5;
    }

    /**
     * Define o valor da propriedade campoGerencial5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampoGerencial5(String value) {
        this.campoGerencial5 = value;
    }

}
