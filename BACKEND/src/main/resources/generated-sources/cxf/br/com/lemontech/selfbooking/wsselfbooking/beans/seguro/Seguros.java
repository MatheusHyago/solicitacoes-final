
package br.com.lemontech.selfbooking.wsselfbooking.beans.seguro;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de seguros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="seguros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="seguro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/seguro}seguro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seguros", propOrder = {
    "seguro"
})
public class Seguros {

    protected List<Seguro> seguro;

    /**
     * Gets the value of the seguro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the seguro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeguro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Seguro }
     * 
     * 
     */
    public List<Seguro> getSeguro() {
        if (seguro == null) {
            seguro = new ArrayList<Seguro>();
        }
        return this.seguro;
    }

}
