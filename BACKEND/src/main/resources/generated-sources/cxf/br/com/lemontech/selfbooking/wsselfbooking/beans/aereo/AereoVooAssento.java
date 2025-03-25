
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de aereoVooAssento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="aereoVooAssento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="assento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aereoVooAssento", propOrder = {
    "passageiroRef",
    "assento"
})
public class AereoVooAssento {

    protected Integer passageiroRef;
    protected String assento;

    /**
     * Obtém o valor da propriedade passageiroRef.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPassageiroRef() {
        return passageiroRef;
    }

    /**
     * Define o valor da propriedade passageiroRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPassageiroRef(Integer value) {
        this.passageiroRef = value;
    }

    /**
     * Obtém o valor da propriedade assento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssento() {
        return assento;
    }

    /**
     * Define o valor da propriedade assento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssento(String value) {
        this.assento = value;
    }

}
