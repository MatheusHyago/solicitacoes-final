
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioContaBancariaRef;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de pesquisarContaBancariaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="pesquisarContaBancariaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcionarioContaBancariaRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioContaBancariaRef"/&gt;
 *         &lt;element name="padrao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarContaBancariaRequest", propOrder = {
    "funcionarioContaBancariaRef",
    "padrao",
    "status"
})
public class PesquisarContaBancariaRequest {

    @XmlElement(required = true)
    protected FuncionarioContaBancariaRef funcionarioContaBancariaRef;
    protected Boolean padrao;
    protected Boolean status;

    /**
     * Obtém o valor da propriedade funcionarioContaBancariaRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioContaBancariaRef }
     *     
     */
    public FuncionarioContaBancariaRef getFuncionarioContaBancariaRef() {
        return funcionarioContaBancariaRef;
    }

    /**
     * Define o valor da propriedade funcionarioContaBancariaRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioContaBancariaRef }
     *     
     */
    public void setFuncionarioContaBancariaRef(FuncionarioContaBancariaRef value) {
        this.funcionarioContaBancariaRef = value;
    }

    /**
     * Obtém o valor da propriedade padrao.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPadrao() {
        return padrao;
    }

    /**
     * Define o valor da propriedade padrao.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPadrao(Boolean value) {
        this.padrao = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

}
