
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de centroDeCustoRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="centroDeCustoRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50"/&gt;
 *         &lt;element name="regionalRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regionalRef"/&gt;
 *         &lt;element name="descricaoCentroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *         &lt;element name="subCentroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centroDeCustoRef", propOrder = {
    "codigo",
    "regionalRef",
    "descricaoCentroDeCusto",
    "subCentroDeCusto"
})
@XmlSeeAlso({
    CentroDeCusto.class
})
public class CentroDeCustoRef {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected RegionalRef regionalRef;
    protected String descricaoCentroDeCusto;
    protected SubCentroDeCustoRef subCentroDeCusto;

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
     *     {@link RegionalRef }
     *     
     */
    public RegionalRef getRegionalRef() {
        return regionalRef;
    }

    /**
     * Define o valor da propriedade regionalRef.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalRef }
     *     
     */
    public void setRegionalRef(RegionalRef value) {
        this.regionalRef = value;
    }

    /**
     * Obtém o valor da propriedade descricaoCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCentroDeCusto() {
        return descricaoCentroDeCusto;
    }

    /**
     * Define o valor da propriedade descricaoCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCentroDeCusto(String value) {
        this.descricaoCentroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade subCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCusto() {
        return subCentroDeCusto;
    }

    /**
     * Define o valor da propriedade subCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCusto(SubCentroDeCustoRef value) {
        this.subCentroDeCusto = value;
    }

}
