
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de inserirIdentificadorIntegracaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirIdentificadorIntegracaoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorIntegracaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}identificadorIntegracaoRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirIdentificadorIntegracaoRequest", propOrder = {
    "identificadorIntegracaoRef"
})
public class InserirIdentificadorIntegracaoRequest {

    @XmlElement(required = true)
    protected IdentificadorIntegracaoRef identificadorIntegracaoRef;

    /**
     * Obtém o valor da propriedade identificadorIntegracaoRef.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorIntegracaoRef }
     *     
     */
    public IdentificadorIntegracaoRef getIdentificadorIntegracaoRef() {
        return identificadorIntegracaoRef;
    }

    /**
     * Define o valor da propriedade identificadorIntegracaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorIntegracaoRef }
     *     
     */
    public void setIdentificadorIntegracaoRef(IdentificadorIntegracaoRef value) {
        this.identificadorIntegracaoRef = value;
    }

}
