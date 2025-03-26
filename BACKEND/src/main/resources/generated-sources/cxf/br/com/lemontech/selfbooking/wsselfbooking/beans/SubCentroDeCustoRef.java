
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de subCentroDeCustoRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="subCentroDeCustoRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50"/&gt;
 *         &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef" minOccurs="0"/&gt;
 *         &lt;element name="descricaoSubCentroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subCentroDeCustoRef", propOrder = {
    "codigo",
    "centroDeCustoRef",
    "descricaoSubCentroDeCusto"
})
@XmlSeeAlso({
    SubCentroDeCusto.class
})
public class SubCentroDeCustoRef {

    @XmlElement(required = true)
    protected String codigo;
    protected CentroDeCustoRef centroDeCustoRef;
    protected String descricaoSubCentroDeCusto;

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
     * Obtém o valor da propriedade centroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Define o valor da propriedade centroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade descricaoSubCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoSubCentroDeCusto() {
        return descricaoSubCentroDeCusto;
    }

    /**
     * Define o valor da propriedade descricaoSubCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoSubCentroDeCusto(String value) {
        this.descricaoSubCentroDeCusto = value;
    }

}
