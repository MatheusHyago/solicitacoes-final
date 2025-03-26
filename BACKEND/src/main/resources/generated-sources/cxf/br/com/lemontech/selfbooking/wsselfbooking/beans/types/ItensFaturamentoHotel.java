
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de itensFaturamentoHotel complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="itensFaturamentoHotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itenFaturamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}itenFaturamento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itensFaturamentoHotel", propOrder = {
    "itenFaturamento"
})
public class ItensFaturamentoHotel {

    @XmlSchemaType(name = "string")
    protected List<ItenFaturamento> itenFaturamento;

    /**
     * Gets the value of the itenFaturamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itenFaturamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItenFaturamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItenFaturamento }
     * 
     * 
     */
    public List<ItenFaturamento> getItenFaturamento() {
        if (itenFaturamento == null) {
            itenFaturamento = new ArrayList<ItenFaturamento>();
        }
        return this.itenFaturamento;
    }

}
