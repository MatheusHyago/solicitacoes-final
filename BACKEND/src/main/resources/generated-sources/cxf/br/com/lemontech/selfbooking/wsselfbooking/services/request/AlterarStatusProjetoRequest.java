
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.ProjetoRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de alterarStatusProjetoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusProjetoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="projetoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projetoRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusProjetoRequest", propOrder = {
    "ativo",
    "projetoRef"
})
public class AlterarStatusProjetoRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected ProjetoRef projetoRef;

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
     * Obtém o valor da propriedade projetoRef.
     * 
     * @return
     *     possible object is
     *     {@link ProjetoRef }
     *     
     */
    public ProjetoRef getProjetoRef() {
        return projetoRef;
    }

    /**
     * Define o valor da propriedade projetoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjetoRef }
     *     
     */
    public void setProjetoRef(ProjetoRef value) {
        this.projetoRef = value;
    }

}
