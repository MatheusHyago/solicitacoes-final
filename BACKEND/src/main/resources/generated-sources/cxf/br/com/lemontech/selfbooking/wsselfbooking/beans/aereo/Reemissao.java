
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoColetaMulta;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de reemissao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="reemissao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilheteOriginal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bilheteReemissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="credito" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="multa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="documentoMulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="documentoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoColetaMulta" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoColetaMulta" minOccurs="0"/&gt;
 *         &lt;element name="taxaColeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reemissao", propOrder = {
    "bilheteOriginal",
    "bilheteReemissao",
    "credito",
    "multa",
    "documentoMulta",
    "documentoCredito",
    "tipoColetaMulta",
    "taxaColeta"
})
public class Reemissao {

    protected String bilheteOriginal;
    protected String bilheteReemissao;
    protected Double credito;
    protected Double multa;
    protected String documentoMulta;
    protected String documentoCredito;
    @XmlSchemaType(name = "string")
    protected TipoColetaMulta tipoColetaMulta;
    protected String taxaColeta;

    /**
     * Obtém o valor da propriedade bilheteOriginal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilheteOriginal() {
        return bilheteOriginal;
    }

    /**
     * Define o valor da propriedade bilheteOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilheteOriginal(String value) {
        this.bilheteOriginal = value;
    }

    /**
     * Obtém o valor da propriedade bilheteReemissao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilheteReemissao() {
        return bilheteReemissao;
    }

    /**
     * Define o valor da propriedade bilheteReemissao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilheteReemissao(String value) {
        this.bilheteReemissao = value;
    }

    /**
     * Obtém o valor da propriedade credito.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCredito() {
        return credito;
    }

    /**
     * Define o valor da propriedade credito.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCredito(Double value) {
        this.credito = value;
    }

    /**
     * Obtém o valor da propriedade multa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMulta() {
        return multa;
    }

    /**
     * Define o valor da propriedade multa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMulta(Double value) {
        this.multa = value;
    }

    /**
     * Obtém o valor da propriedade documentoMulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoMulta() {
        return documentoMulta;
    }

    /**
     * Define o valor da propriedade documentoMulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoMulta(String value) {
        this.documentoMulta = value;
    }

    /**
     * Obtém o valor da propriedade documentoCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoCredito() {
        return documentoCredito;
    }

    /**
     * Define o valor da propriedade documentoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoCredito(String value) {
        this.documentoCredito = value;
    }

    /**
     * Obtém o valor da propriedade tipoColetaMulta.
     * 
     * @return
     *     possible object is
     *     {@link TipoColetaMulta }
     *     
     */
    public TipoColetaMulta getTipoColetaMulta() {
        return tipoColetaMulta;
    }

    /**
     * Define o valor da propriedade tipoColetaMulta.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoColetaMulta }
     *     
     */
    public void setTipoColetaMulta(TipoColetaMulta value) {
        this.tipoColetaMulta = value;
    }

    /**
     * Obtém o valor da propriedade taxaColeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxaColeta() {
        return taxaColeta;
    }

    /**
     * Define o valor da propriedade taxaColeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxaColeta(String value) {
        this.taxaColeta = value;
    }

}
