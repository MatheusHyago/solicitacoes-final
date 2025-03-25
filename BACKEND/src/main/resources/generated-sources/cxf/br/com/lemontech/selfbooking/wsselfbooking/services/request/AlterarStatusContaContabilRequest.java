
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabilRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarStatusContaContabilRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusContaContabilRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contaContabilRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contaContabilRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusContaContabilRequest", propOrder = {
    "ativo",
    "contaContabilRef"
})
public class AlterarStatusContaContabilRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected ContaContabilRef contaContabilRef;

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Obtém o valor da propriedade contaContabilRef.
     * 
     * @return
     *     possible object is
     *     {@link ContaContabilRef }
     *     
     */
    public ContaContabilRef getContaContabilRef() {
        return contaContabilRef;
    }

    /**
     * Define o valor da propriedade contaContabilRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaContabilRef }
     *     
     */
    public void setContaContabilRef(ContaContabilRef value) {
        this.contaContabilRef = value;
    }

}
