
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de deletarTreinamentoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deletarTreinamentoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoTreinamento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarTreinamentoRequest", propOrder = {
    "codigoTreinamento"
})
public class DeletarTreinamentoRequest {

    @XmlElement(required = true)
    protected String codigoTreinamento;

    /**
     * Obtém o valor da propriedade codigoTreinamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTreinamento() {
        return codigoTreinamento;
    }

    /**
     * Define o valor da propriedade codigoTreinamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTreinamento(String value) {
        this.codigoTreinamento = value;
    }

}
