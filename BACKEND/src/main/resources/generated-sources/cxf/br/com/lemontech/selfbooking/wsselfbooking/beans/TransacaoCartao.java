
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.StatusTransacaoCartao;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de transacaoCartao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="transacaoCartao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idSv" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="itemSV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="seguimentoContabil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataTransacaoCartao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="transacaoCartaoBilhete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="statusTransacaoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}statusTransacaoCartao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transacaoCartao", propOrder = {
    "idSv",
    "itemSV",
    "seguimentoContabil",
    "codRegional",
    "dataTransacaoCartao",
    "transacaoCartaoBilhete",
    "localizador",
    "moeda",
    "valorTotal",
    "statusTransacaoCartao"
})
public class TransacaoCartao {

    protected Integer idSv;
    protected Integer itemSV;
    protected String seguimentoContabil;
    protected String codRegional;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTransacaoCartao;
    protected String transacaoCartaoBilhete;
    protected String localizador;
    protected String moeda;
    protected Double valorTotal;
    @XmlSchemaType(name = "string")
    protected StatusTransacaoCartao statusTransacaoCartao;

    /**
     * Obtém o valor da propriedade idSv.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSv() {
        return idSv;
    }

    /**
     * Define o valor da propriedade idSv.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSv(Integer value) {
        this.idSv = value;
    }

    /**
     * Obtém o valor da propriedade itemSV.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemSV() {
        return itemSV;
    }

    /**
     * Define o valor da propriedade itemSV.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemSV(Integer value) {
        this.itemSV = value;
    }

    /**
     * Obtém o valor da propriedade seguimentoContabil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeguimentoContabil() {
        return seguimentoContabil;
    }

    /**
     * Define o valor da propriedade seguimentoContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeguimentoContabil(String value) {
        this.seguimentoContabil = value;
    }

    /**
     * Obtém o valor da propriedade codRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRegional() {
        return codRegional;
    }

    /**
     * Define o valor da propriedade codRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRegional(String value) {
        this.codRegional = value;
    }

    /**
     * Obtém o valor da propriedade dataTransacaoCartao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransacaoCartao() {
        return dataTransacaoCartao;
    }

    /**
     * Define o valor da propriedade dataTransacaoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransacaoCartao(XMLGregorianCalendar value) {
        this.dataTransacaoCartao = value;
    }

    /**
     * Obtém o valor da propriedade transacaoCartaoBilhete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacaoCartaoBilhete() {
        return transacaoCartaoBilhete;
    }

    /**
     * Define o valor da propriedade transacaoCartaoBilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacaoCartaoBilhete(String value) {
        this.transacaoCartaoBilhete = value;
    }

    /**
     * Obtém o valor da propriedade localizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Define o valor da propriedade localizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotal(Double value) {
        this.valorTotal = value;
    }

    /**
     * Obtém o valor da propriedade statusTransacaoCartao.
     * 
     * @return
     *     possible object is
     *     {@link StatusTransacaoCartao }
     *     
     */
    public StatusTransacaoCartao getStatusTransacaoCartao() {
        return statusTransacaoCartao;
    }

    /**
     * Define o valor da propriedade statusTransacaoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusTransacaoCartao }
     *     
     */
    public void setStatusTransacaoCartao(StatusTransacaoCartao value) {
        this.statusTransacaoCartao = value;
    }

}
