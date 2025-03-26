
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de rateios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="rateios"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rateio" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}rateio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rateios", propOrder = {
    "rateio"
})
public class Rateios {

    @XmlElement(nillable = true)
    protected List<Rateio> rateio;

    /**
     * Gets the value of the rateio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rateio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rateio }
     * 
     * 
     */
    public List<Rateio> getRateio() {
        if (rateio == null) {
            rateio = new ArrayList<Rateio>();
        }
        return this.rateio;
    }

}
