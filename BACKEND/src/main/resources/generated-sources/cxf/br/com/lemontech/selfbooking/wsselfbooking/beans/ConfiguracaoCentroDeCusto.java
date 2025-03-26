
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de configuracaoCentroDeCusto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="configuracaoCentroDeCusto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="autoAprovavel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="debitaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configuracaoCentroDeCusto", propOrder = {
    "autoAprovavel",
    "debitaBudget",
    "identificadorBackofficeCliente"
})
public class ConfiguracaoCentroDeCusto {

    protected boolean autoAprovavel;
    @XmlElementRef(name = "debitaBudget", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> debitaBudget;
    protected String identificadorBackofficeCliente;

    /**
     * Obtém o valor da propriedade autoAprovavel.
     * 
     */
    public boolean isAutoAprovavel() {
        return autoAprovavel;
    }

    /**
     * Define o valor da propriedade autoAprovavel.
     * 
     */
    public void setAutoAprovavel(boolean value) {
        this.autoAprovavel = value;
    }

    /**
     * Obtém o valor da propriedade debitaBudget.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDebitaBudget() {
        return debitaBudget;
    }

    /**
     * Define o valor da propriedade debitaBudget.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDebitaBudget(JAXBElement<Boolean> value) {
        this.debitaBudget = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackofficeCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Define o valor da propriedade identificadorBackofficeCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

}
