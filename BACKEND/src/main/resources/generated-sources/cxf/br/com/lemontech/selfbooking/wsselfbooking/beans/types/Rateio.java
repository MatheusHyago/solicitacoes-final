
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de rateio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="rateio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nomeCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorPorcentagem" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nomeSubCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoSubCentroCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateio", propOrder = {
    "nomeCentroCusto",
    "nomeRegional",
    "valorPorcentagem",
    "nomeSubCentroCusto",
    "descricaoCentroCusto",
    "descricaoSubCentroCusto",
    "codigoRegional"
})
public class Rateio {

    protected String nomeCentroCusto;
    protected String nomeRegional;
    protected Double valorPorcentagem;
    protected String nomeSubCentroCusto;
    protected String descricaoCentroCusto;
    protected String descricaoSubCentroCusto;
    protected String codigoRegional;

    /**
     * Obtém o valor da propriedade nomeCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCentroCusto() {
        return nomeCentroCusto;
    }

    /**
     * Define o valor da propriedade nomeCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCentroCusto(String value) {
        this.nomeCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade nomeRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRegional() {
        return nomeRegional;
    }

    /**
     * Define o valor da propriedade nomeRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRegional(String value) {
        this.nomeRegional = value;
    }

    /**
     * Obtém o valor da propriedade valorPorcentagem.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorPorcentagem() {
        return valorPorcentagem;
    }

    /**
     * Define o valor da propriedade valorPorcentagem.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorPorcentagem(Double value) {
        this.valorPorcentagem = value;
    }

    /**
     * Obtém o valor da propriedade nomeSubCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSubCentroCusto() {
        return nomeSubCentroCusto;
    }

    /**
     * Define o valor da propriedade nomeSubCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSubCentroCusto(String value) {
        this.nomeSubCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade descricaoCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCentroCusto() {
        return descricaoCentroCusto;
    }

    /**
     * Define o valor da propriedade descricaoCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCentroCusto(String value) {
        this.descricaoCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade descricaoSubCentroCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoSubCentroCusto() {
        return descricaoSubCentroCusto;
    }

    /**
     * Define o valor da propriedade descricaoSubCentroCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoSubCentroCusto(String value) {
        this.descricaoSubCentroCusto = value;
    }

    /**
     * Obtém o valor da propriedade codigoRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegional() {
        return codigoRegional;
    }

    /**
     * Define o valor da propriedade codigoRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegional(String value) {
        this.codigoRegional = value;
    }

}
