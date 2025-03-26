
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de atendimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="atendimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="posto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dddTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atendimento", propOrder = {
    "posto",
    "email",
    "telefone",
    "dddTel",
    "nomeAgencia"
})
public class Atendimento {

    protected String posto;
    protected String email;
    protected String telefone;
    protected String dddTel;
    protected String nomeAgencia;

    /**
     * Obtém o valor da propriedade posto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosto() {
        return posto;
    }

    /**
     * Define o valor da propriedade posto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosto(String value) {
        this.posto = value;
    }

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
     * Obtém o valor da propriedade dddTel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDddTel() {
        return dddTel;
    }

    /**
     * Define o valor da propriedade dddTel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDddTel(String value) {
        this.dddTel = value;
    }

    /**
     * Obtém o valor da propriedade nomeAgencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAgencia() {
        return nomeAgencia;
    }

    /**
     * Define o valor da propriedade nomeAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAgencia(String value) {
        this.nomeAgencia = value;
    }

}
