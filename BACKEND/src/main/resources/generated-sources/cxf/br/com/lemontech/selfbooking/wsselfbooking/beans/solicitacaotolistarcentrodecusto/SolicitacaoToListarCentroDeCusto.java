
package br.com.lemontech.selfbooking.wsselfbooking.beans.solicitacaotolistarcentrodecusto;

import br.com.lemontech.selfbooking.wsselfbooking.beans.centrodecustotolistarcentrodecusto.CentroDeCustoToListarCentroDeCusto;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacaoToListarCentroDeCusto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacaoToListarCentroDeCusto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/centrodecustotolistarcentrodecusto}centroDeCustoToListarCentroDeCusto"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaoToListarCentroDeCusto", propOrder = {
    "centroDeCusto"
})
public class SolicitacaoToListarCentroDeCusto {

    @XmlElement(required = true)
    protected CentroDeCustoToListarCentroDeCusto centroDeCusto;

    /**
     * Obtém o valor da propriedade centroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoToListarCentroDeCusto }
     *     
     */
    public CentroDeCustoToListarCentroDeCusto getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Define o valor da propriedade centroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoToListarCentroDeCusto }
     *     
     */
    public void setCentroDeCusto(CentroDeCustoToListarCentroDeCusto value) {
        this.centroDeCusto = value;
    }

}
