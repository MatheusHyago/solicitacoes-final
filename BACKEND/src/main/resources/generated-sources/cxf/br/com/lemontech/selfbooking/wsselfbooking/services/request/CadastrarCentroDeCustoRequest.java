
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.CentroDeCusto;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCusto"/&gt;
 *         &lt;element name="idCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarCentroDeCustoRequest", propOrder = {
    "centroDeCusto",
    "idCliente"
})
public class CadastrarCentroDeCustoRequest {

    @XmlElement(required = true)
    protected CentroDeCusto centroDeCusto;
    protected Integer idCliente;

    /**
     * Obtém o valor da propriedade centroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCusto }
     *     
     */
    public CentroDeCusto getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Define o valor da propriedade centroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCusto }
     *     
     */
    public void setCentroDeCusto(CentroDeCusto value) {
        this.centroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define o valor da propriedade idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

}
