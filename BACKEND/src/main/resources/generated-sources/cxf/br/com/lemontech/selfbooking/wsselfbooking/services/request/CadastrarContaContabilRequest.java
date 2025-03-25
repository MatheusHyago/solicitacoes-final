
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabil;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarContaContabilRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarContaContabilRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contaContabil" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contaContabil"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarContaContabilRequest", propOrder = {
    "contaContabil"
})
public class CadastrarContaContabilRequest {

    @XmlElement(required = true)
    protected ContaContabil contaContabil;

    /**
     * Obtém o valor da propriedade contaContabil.
     * 
     * @return
     *     possible object is
     *     {@link ContaContabil }
     *     
     */
    public ContaContabil getContaContabil() {
        return contaContabil;
    }

    /**
     * Define o valor da propriedade contaContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaContabil }
     *     
     */
    public void setContaContabil(ContaContabil value) {
        this.contaContabil = value;
    }

}
