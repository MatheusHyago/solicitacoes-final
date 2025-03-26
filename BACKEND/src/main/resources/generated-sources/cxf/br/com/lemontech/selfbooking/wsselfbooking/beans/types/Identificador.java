
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de identificador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="identificador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoIntegracao" minOccurs="0"/&gt;
 *         &lt;element name="nomeConectorLemontech" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificador", propOrder = {
    "conector",
    "codigo",
    "tipoIntegracao",
    "nomeConectorLemontech"
})
public class Identificador {

    protected String conector;
    protected String codigo;
    @XmlSchemaType(name = "string")
    protected TipoIntegracao tipoIntegracao;
    protected String nomeConectorLemontech;

    /**
     * Obtém o valor da propriedade conector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConector() {
        return conector;
    }

    /**
     * Define o valor da propriedade conector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConector(String value) {
        this.conector = value;
    }

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
     * Obtém o valor da propriedade tipoIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link TipoIntegracao }
     *     
     */
    public TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }

    /**
     * Define o valor da propriedade tipoIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIntegracao }
     *     
     */
    public void setTipoIntegracao(TipoIntegracao value) {
        this.tipoIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade nomeConectorLemontech.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConectorLemontech() {
        return nomeConectorLemontech;
    }

    /**
     * Define o valor da propriedade nomeConectorLemontech.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConectorLemontech(String value) {
        this.nomeConectorLemontech = value;
    }

}
