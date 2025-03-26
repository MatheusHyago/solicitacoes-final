
package br.com.lemontech.selfbooking.wsselfbooking.beans.centrodecustotolistarcentrodecusto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de centroDeCustoToListarCentroDeCusto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="centroDeCustoToListarCentroDeCusto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regionalRef" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="autoAprovavel" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="debitaBudget" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centroDeCustoToListarCentroDeCusto", propOrder = {
    "codigo",
    "regionalRef",
    "descricao",
    "autoAprovavel",
    "debitaBudget"
})
public class CentroDeCustoToListarCentroDeCusto {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String regionalRef;
    @XmlElement(required = true)
    protected String descricao;
    protected boolean autoAprovavel;
    protected boolean debitaBudget;

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade regionalRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalRef() {
        return regionalRef;
    }

    /**
     * Define o valor da propriedade regionalRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionalRef(String value) {
        this.regionalRef = value;
    }

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
     */
    public boolean isDebitaBudget() {
        return debitaBudget;
    }

    /**
     * Define o valor da propriedade debitaBudget.
     * 
     */
    public void setDebitaBudget(boolean value) {
        this.debitaBudget = value;
    }

}
