
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPax;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aereoTarifaPax complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoTarifaPax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxaDu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="tipoPax" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoPax" minOccurs="0"/&gt;
 *         &lt;element name="quantidadePax" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tarifaSemAcordo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moedaBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tarifaBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cotacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="acordo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalTarifaPax" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorFullFare" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorTetoForaPolitica" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoTarifaPax", propOrder = {
    "tarifa",
    "taxa",
    "taxaDu",
    "tipoPax",
    "quantidadePax",
    "tarifaSemAcordo",
    "moeda",
    "moedaBase",
    "tarifaBase",
    "cotacao",
    "acordo",
    "totalTarifaPax",
    "taxaFee",
    "valorFullFare",
    "valorTetoForaPolitica"
})
public class AereoTarifaPax {

    protected Double tarifa;
    protected Double taxa;
    protected Double taxaDu;
    @XmlSchemaType(name = "string")
    protected TipoPax tipoPax;
    protected Integer quantidadePax;
    protected Double tarifaSemAcordo;
    protected String moeda;
    protected String moedaBase;
    protected Double tarifaBase;
    protected Double cotacao;
    protected String acordo;
    protected Double totalTarifaPax;
    protected Double taxaFee;
    protected Double valorFullFare;
    protected Double valorTetoForaPolitica;

    /**
     * Obtém o valor da propriedade tarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifa() {
        return tarifa;
    }

    /**
     * Define o valor da propriedade tarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifa(Double value) {
        this.tarifa = value;
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
     * Obtém o valor da propriedade taxaDu.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaDu() {
        return taxaDu;
    }

    /**
     * Define o valor da propriedade taxaDu.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaDu(Double value) {
        this.taxaDu = value;
    }

    /**
     * Obtém o valor da propriedade tipoPax.
     * 
     * @return
     *     possible object is
     *     {@link TipoPax }
     *     
     */
    public TipoPax getTipoPax() {
        return tipoPax;
    }

    /**
     * Define o valor da propriedade tipoPax.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPax }
     *     
     */
    public void setTipoPax(TipoPax value) {
        this.tipoPax = value;
    }

    /**
     * Obtém o valor da propriedade quantidadePax.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadePax() {
        return quantidadePax;
    }

    /**
     * Define o valor da propriedade quantidadePax.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadePax(Integer value) {
        this.quantidadePax = value;
    }

    /**
     * Obtém o valor da propriedade tarifaSemAcordo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaSemAcordo() {
        return tarifaSemAcordo;
    }

    /**
     * Define o valor da propriedade tarifaSemAcordo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaSemAcordo(Double value) {
        this.tarifaSemAcordo = value;
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
     * Obtém o valor da propriedade moedaBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoedaBase() {
        return moedaBase;
    }

    /**
     * Define o valor da propriedade moedaBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoedaBase(String value) {
        this.moedaBase = value;
    }

    /**
     * Obtém o valor da propriedade tarifaBase.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTarifaBase() {
        return tarifaBase;
    }

    /**
     * Define o valor da propriedade tarifaBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTarifaBase(Double value) {
        this.tarifaBase = value;
    }

    /**
     * Obtém o valor da propriedade cotacao.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCotacao() {
        return cotacao;
    }

    /**
     * Define o valor da propriedade cotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCotacao(Double value) {
        this.cotacao = value;
    }

    /**
     * Obtém o valor da propriedade acordo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcordo() {
        return acordo;
    }

    /**
     * Define o valor da propriedade acordo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcordo(String value) {
        this.acordo = value;
    }

    /**
     * Obtém o valor da propriedade totalTarifaPax.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalTarifaPax() {
        return totalTarifaPax;
    }

    /**
     * Define o valor da propriedade totalTarifaPax.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalTarifaPax(Double value) {
        this.totalTarifaPax = value;
    }

    /**
     * Obtém o valor da propriedade taxaFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Define o valor da propriedade taxaFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Obtém o valor da propriedade valorFullFare.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorFullFare() {
        return valorFullFare;
    }

    /**
     * Define o valor da propriedade valorFullFare.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorFullFare(Double value) {
        this.valorFullFare = value;
    }

    /**
     * Obtém o valor da propriedade valorTetoForaPolitica.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTetoForaPolitica() {
        return valorTetoForaPolitica;
    }

    /**
     * Define o valor da propriedade valorTetoForaPolitica.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTetoForaPolitica(Double value) {
        this.valorTetoForaPolitica = value;
    }

}
