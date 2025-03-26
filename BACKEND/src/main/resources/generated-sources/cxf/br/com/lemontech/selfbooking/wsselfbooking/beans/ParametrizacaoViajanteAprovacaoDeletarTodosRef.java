
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacaoViajanteAprovacaoDeletarTodosRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoViajanteAprovacaoDeletarTodosRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="viajanteRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoViajanteAprovacaoDeletarTodosRef", propOrder = {
    "viajanteRef"
})
public class ParametrizacaoViajanteAprovacaoDeletarTodosRef {

    @XmlElement(required = true)
    protected FuncionarioRef viajanteRef;

    /**
     * Obtém o valor da propriedade viajanteRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getViajanteRef() {
        return viajanteRef;
    }

    /**
     * Define o valor da propriedade viajanteRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setViajanteRef(FuncionarioRef value) {
        this.viajanteRef = value;
    }

}
