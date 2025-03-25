
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ancillary complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ancillary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoAncillary" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}enumTipoAncillary" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moedaTaxa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="idExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ancillary", propOrder = {
    "descricao",
    "tipoAncillary",
    "valor",
    "moeda",
    "taxa",
    "moedaTaxa",
    "idExterno",
    "status"
})
public class Ancillary {

    protected String descricao;
    @XmlSchemaType(name = "string")
    protected EnumTipoAncillary tipoAncillary;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected Double taxa;
    @XmlSchemaType(name = "string")
    protected Moeda moedaTaxa;
    protected String idExterno;
    protected String status;

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade tipoAncillary.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoAncillary }
     *     
     */
    public EnumTipoAncillary getTipoAncillary() {
        return tipoAncillary;
    }

    /**
     * Define o valor da propriedade tipoAncillary.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoAncillary }
     *     
     */
    public void setTipoAncillary(EnumTipoAncillary value) {
        this.tipoAncillary = value;
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
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxa(Double value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade moedaTaxa.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaTaxa() {
        return moedaTaxa;
    }

    /**
     * Define o valor da propriedade moedaTaxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaTaxa(Moeda value) {
        this.moedaTaxa = value;
    }

    /**
     * Obtém o valor da propriedade idExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdExterno() {
        return idExterno;
    }

    /**
     * Define o valor da propriedade idExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdExterno(String value) {
        this.idExterno = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
