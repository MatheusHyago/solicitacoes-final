
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacaoCentroDeCustoDebito complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoCentroDeCustoDebito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoDebitoRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoCentroDeCustoDebito", propOrder = {
    "vencimento"
})
public class ParametrizacaoCentroDeCustoDebito
    extends ParametrizacaoCentroDeCustoDebitoRef
{

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

}
