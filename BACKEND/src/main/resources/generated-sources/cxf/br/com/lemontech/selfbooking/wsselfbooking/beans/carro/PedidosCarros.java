
package br.com.lemontech.selfbooking.wsselfbooking.beans.carro;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pedidosCarros complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pedidosCarros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pedidoCarro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/carro}pedidoCarro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pedidosCarros", propOrder = {
    "pedidoCarro"
})
public class PedidosCarros {

    protected List<PedidoCarro> pedidoCarro;

    /**
     * Gets the value of the pedidoCarro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pedidoCarro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidoCarro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoCarro }
     * 
     * 
     */
    public List<PedidoCarro> getPedidoCarro() {
        if (pedidoCarro == null) {
            pedidoCarro = new ArrayList<PedidoCarro>();
        }
        return this.pedidoCarro;
    }

}
