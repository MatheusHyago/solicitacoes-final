
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de passageiros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="passageiros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "passageiros", propOrder = {
    "passageiro"
})
public class Passageiros {

    @XmlElement(nillable = true)
    protected List<Passageiro> passageiro;

    /**
     * Gets the value of the passageiro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passageiro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassageiro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Passageiro }
     * 
     * 
     */
    public List<Passageiro> getPassageiro() {
        if (passageiro == null) {
            passageiro = new ArrayList<Passageiro>();
        }
        return this.passageiro;
    }

}
