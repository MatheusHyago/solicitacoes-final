
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de contato complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contato"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="email" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}email"/&gt;
 *         &lt;element name="ddiTelefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddi" minOccurs="0"/&gt;
 *         &lt;element name="dddTelefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddd" minOccurs="0"/&gt;
 *         &lt;element name="telefone" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}telefone" minOccurs="0"/&gt;
 *         &lt;element name="ddiCelular" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddi" minOccurs="0"/&gt;
 *         &lt;element name="dddCelular" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}ddd" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}telefone" minOccurs="0"/&gt;
 *         &lt;element name="forcaAtualizacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contato", propOrder = {
    "email",
    "ddiTelefone",
    "dddTelefone",
    "telefone",
    "ddiCelular",
    "dddCelular",
    "celular",
    "forcaAtualizacao"
})
public class Contato {

    @XmlElement(required = true)
    protected String email;
    protected String ddiTelefone;
    protected String dddTelefone;
    protected String telefone;
    protected String ddiCelular;
    protected String dddCelular;
    protected String celular;
    protected Boolean forcaAtualizacao;

    /**
     * Obtém o valor da propriedade email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o valor da propriedade email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtém o valor da propriedade ddiTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdiTelefone() {
        return ddiTelefone;
    }

    /**
     * Define o valor da propriedade ddiTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdiTelefone(String value) {
        this.ddiTelefone = value;
    }

    /**
     * Obtém o valor da propriedade dddTelefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddTelefone() {
        return dddTelefone;
    }

    /**
     * Define o valor da propriedade dddTelefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddTelefone(String value) {
        this.dddTelefone = value;
    }

    /**
     * Obtém o valor da propriedade telefone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o valor da propriedade telefone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * Obtém o valor da propriedade ddiCelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdiCelular() {
        return ddiCelular;
    }

    /**
     * Define o valor da propriedade ddiCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdiCelular(String value) {
        this.ddiCelular = value;
    }

    /**
     * Obtém o valor da propriedade dddCelular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddCelular() {
        return dddCelular;
    }

    /**
     * Define o valor da propriedade dddCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddCelular(String value) {
        this.dddCelular = value;
    }

    /**
     * Obtém o valor da propriedade celular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Define o valor da propriedade celular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCelular(String value) {
        this.celular = value;
    }

    /**
     * Obtém o valor da propriedade forcaAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForcaAtualizacao() {
        return forcaAtualizacao;
    }

    /**
     * Define o valor da propriedade forcaAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForcaAtualizacao(Boolean value) {
        this.forcaAtualizacao = value;
    }

}
