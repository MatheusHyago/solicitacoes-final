
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ConsultaBilheteCia;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consultaBilheteCiaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consultaBilheteCiaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consultaBilheteCia" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}consultaBilheteCia"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaBilheteCiaRequest", propOrder = {
    "consultaBilheteCia"
})
public class ConsultaBilheteCiaRequest {

    @XmlElement(required = true)
    protected ConsultaBilheteCia consultaBilheteCia;

    /**
     * Obtém o valor da propriedade consultaBilheteCia.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaBilheteCia }
     *     
     */
    public ConsultaBilheteCia getConsultaBilheteCia() {
        return consultaBilheteCia;
    }

    /**
     * Define o valor da propriedade consultaBilheteCia.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaBilheteCia }
     *     
     */
    public void setConsultaBilheteCia(ConsultaBilheteCia value) {
        this.consultaBilheteCia = value;
    }

}
