
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.SubCentroDeCusto;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de cadastrarSubCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarSubCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subCentroDeCusto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCusto"/&gt;
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
@XmlType(name = "cadastrarSubCentroDeCustoRequest", propOrder = {
    "subCentroDeCusto",
    "idCliente"
})
public class CadastrarSubCentroDeCustoRequest {

    @XmlElement(required = true)
    protected SubCentroDeCusto subCentroDeCusto;
    protected Integer idCliente;

    /**
     * Obtém o valor da propriedade subCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCusto }
     *     
     */
    public SubCentroDeCusto getSubCentroDeCusto() {
        return subCentroDeCusto;
    }

    /**
     * Define o valor da propriedade subCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCusto }
     *     
     */
    public void setSubCentroDeCusto(SubCentroDeCusto value) {
        this.subCentroDeCusto = value;
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
