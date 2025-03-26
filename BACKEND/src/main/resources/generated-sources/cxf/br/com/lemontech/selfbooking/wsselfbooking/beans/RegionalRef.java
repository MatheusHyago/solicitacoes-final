
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de regionalRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="regionalRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigo" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50"/&gt;
 *         &lt;element name="descricaoRegional" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regionalRef", propOrder = {
    "codigo",
    "descricaoRegional"
})
@XmlSeeAlso({
    Regional.class
})
public class RegionalRef {

    @XmlElement(required = true)
    protected String codigo;
    protected String descricaoRegional;

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
     * Obtém o valor da propriedade descricaoRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoRegional() {
        return descricaoRegional;
    }

    /**
     * Define o valor da propriedade descricaoRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoRegional(String value) {
        this.descricaoRegional = value;
    }

}
